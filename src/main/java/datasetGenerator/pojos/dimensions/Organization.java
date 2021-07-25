package datasetGenerator.pojos.dimensions;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

public class Organization {
    public String id;
    public String name;
    Faker faker = FakerUtility.faker;

    public Organization(){
        id = faker.number().digits(8);
        name = faker.company().name();
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
