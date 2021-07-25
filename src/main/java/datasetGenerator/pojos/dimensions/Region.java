package datasetGenerator.pojos.dimensions;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

public class Region {
	public String id;
	public String name;
	Faker faker = FakerUtility.faker;

	public Region(){
		id = faker.address().zipCode();
		name = faker.address().streetName();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {

		return getId() + "," + getName();
	}
}
