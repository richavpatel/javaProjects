/* Richa Patel   
 * Final Project
 *  
 */
package edu.sinclair;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Anagrammer {
	 
	public static void main(String[] args) {
		AnagramEvaluatorImpl anagramEvaluator = new AnagramEvaluatorImpl();
		Options options = getOptions();
		CommandLineParser commandLineParser = new DefaultParser();
		try {
			CommandLine commandLine = commandLineParser.parse(options, args);
			
			if(commandLine.hasOption("h")) {
				helpPrint(options);
			} else {
				List<String> words = null;
				String anagram = commandLine.getOptionValue("a").trim();
				if(commandLine.hasOption("nf")) {
					 words = anagramEvaluator.evaluate(anagram, "nf");
				} else if (commandLine.hasOption("words")) {
					words = anagramEvaluator.evaluate(anagram, "words");
				} else {
					System.out.println("Must provide either of nf or words option.");
				}
				if(words != null) {
					for(String word : words) {
						System.out.println(word);
					}
					System.out.println("-- " + words.size() + " value(s) found");
				}
			}
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static Options getOptions() {
		Options options = new Options();
		options.addOption("h", "help", false, "displays the help for this program")
		.addRequiredOption("a", "anagram", true, "Supplies the anagram to evaluate")
		.addOption("nf", "no-filter", false, "output all anagram values with no filter")
		.addOption("words", "filter-words", false, "output only values that are known words");
		return options;
	}
	
	private static void helpPrint(Options options) {
	   HelpFormatter helpFormatter = new HelpFormatter();
	   String header = "Options";
	   String footer = "";
	   helpFormatter.printHelp("anagrammer", header, options, footer);
	}
}
