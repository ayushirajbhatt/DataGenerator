package Runner;

import java.util.Iterator;

import datasetGenerator.pojos.dimensions.Region;

public class DatasetBuilder {
	
	static int numberOfObjects = 10;
	
	public static void main(String[] args) {
		for (int i = 0; i < numberOfObjects; i++) {
			System.out.println(new Region());
		}
	}
}
