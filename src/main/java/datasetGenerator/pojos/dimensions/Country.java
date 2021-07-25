package datasetGenerator.pojos.dimensions;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

public class Country {
    public String id;
    public String name;
    Faker faker = FakerUtility.faker;

    public Country(){
        id = faker.address().countryCode();
        name = faker.address().country();
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
