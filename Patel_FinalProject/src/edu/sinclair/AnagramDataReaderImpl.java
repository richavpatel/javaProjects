package edu.sinclair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AnagramDataReaderImpl implements AnagramDataReader {

	@Override
	public Set<String> readData() {
		Set<String> set = new HashSet<>();
		File file = new File("anagram_data.txt");
		// Get each file contents and add to set.
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null) {
				set.add(line.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return set;
	}

}
