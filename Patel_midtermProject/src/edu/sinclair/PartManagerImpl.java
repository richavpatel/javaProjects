package edu.sinclair;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class PartManagerImpl implements PartManager{

	private List<Part> importedParts = new ArrayList<>();

	@Override
	public int importPartStore(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
		{
			stream.forEach(s -> contentBuilder.append(s));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		String jsonData = contentBuilder.toString();
		Gson gson = new Gson();
		Part[] parts = gson.fromJson(jsonData, Part[].class);
		for(Part part : parts) {
			if(!importedParts.contains(part)) {
				importedParts.add(part);
			}
		}
		return importedParts.size();
	}

	@Override
	public Part costPart(String partNumber) {
		Part part = retrievePart(partNumber);
		if(part == null) {
			return null;
		}
		part.setPrice(calculatePrice(part));
		return part;
	}

	private float calculatePrice(Part part) {
		if(part.getBillOfMaterial() == null) {
			return part.getPrice();
		}
		List<BomEntry> subParts = part.getBillOfMaterial();
		float total = 0;
		for(BomEntry bom : subParts) {
			Part subPart = retrievePart(bom.getPartNumber());
			float extendedPrice = roundForMoney(calculatePrice(subPart) * bom.getQuantity());
			total = roundForMoney(total + extendedPrice);
		}
		return roundForMoney(total);
	}

	/**
	 * Returns the supplied value rounded for money. *
	 * @param value the value to round.
	 * @return the rounded value.
	 */
	private float roundForMoney(final float value) {
		return new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue(); 
	}

	@Override
	public Part retrievePart(String partNumber) {
		Part toCheck = new Part();
		toCheck.setPartNumber(partNumber);
		int index = importedParts.indexOf(toCheck);	
		if(index < 0) {
			return null;
		}
		return importedParts.get(index);
	}

	@Override
	public List<Part> getFinalAssemblies() {
		List<Part> finalAssemblies = new ArrayList<>();
		for(Part part : importedParts) {
			if(part.getPartType().equals("ASSEMBLY")) {
				finalAssemblies.add(part);
			}
		}
		Collections.sort(finalAssemblies, new Comparator<Part>() {
			public int compare(Part o1, Part o2) {
				String part1 = o1.getPartNumber();
				String part2 = o2.getPartNumber();
				int compare = part1.compareToIgnoreCase(part2);

				if (compare < 0) {  
					return -1;
				}
				else if (compare > 0) {
					return 1;
				}
				else {  
					return 0;
				} 
			}
		});
		return finalAssemblies;
	}

	@Override
	public List<Part> getPurchasedPartsByPrice() {
		List<Part> purchased = new ArrayList<>();
		for(Part part : importedParts) {
			if(part.getPartType().equals("PURCHASE")) {
				purchased.add(part);
			}
		}
		Collections.sort(purchased, new Comparator<Part>() {
			public int compare(Part o1, Part o2) {
				float part1 = o1.getPrice();
				float part2 = o2.getPrice();
				if(part1 == part2) {
					return 0;
				} else if (part1 < part2) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		return purchased;
	}



}
