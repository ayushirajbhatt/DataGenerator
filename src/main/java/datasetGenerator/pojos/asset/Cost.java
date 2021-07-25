package datasetGenerator.pojos.asset;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

public class Cost {
    public String id;
    public String name;
    public String description;
    public String category;
    public String type;
    public String external;
    Faker faker = FakerUtility.faker;

    public Cost(){
        id = faker.number().digits(8);
        name = faker.commerce().productName();
        type = faker.commerce().material();
        category = faker.commerce().department();
        description = faker.gameOfThrones().quote();
        external = faker.commerce().material();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getExternal() {
        return external;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getType() + "," +
                getCategory() + "," + getDescription()
                + "," + getExternal();
    }


}
