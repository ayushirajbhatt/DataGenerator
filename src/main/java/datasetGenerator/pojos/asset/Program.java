package datasetGenerator.pojos.asset;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

import static Utility.FakerUtility.fakeValuesService;

public class Program {
    public String id;
    public String name;
    public String description;
    public String category;
    public String status;
    Faker faker = FakerUtility.faker;

    public Program(){
        id = faker.number().digits(8);
        name = faker.commerce().productName();
        category = faker.commerce().department();
        description = faker.gameOfThrones().quote();
        status = fakeValuesService.regexify("[a-z1-9]{5}");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getCategory() + ","
                + getDescription() + "," + getStatus();
    }
}
