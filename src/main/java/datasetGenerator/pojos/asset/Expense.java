package datasetGenerator.pojos.asset;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

import static Utility.FakerUtility.fakeValuesService;

public class Expense {
    public String id;
    public String name;
    public String description;
    public String category;
    public String recurring;
    public String frequency;
    Faker faker = FakerUtility.faker;

    public Expense(){
        id = faker.number().digits(8);
        name = faker.commerce().productName();
        category = faker.commerce().department();
        description = faker.gameOfThrones().quote();
        recurring = fakeValuesService.regexify("[a-z1-9]{5}");
        frequency = fakeValuesService.regexify("[1-9]{4}");
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

    public String getRecurring() {
        return recurring;
    }

    public String getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getDescription() + "," +
                getCategory() + "," + getRecurring()
                + "," + getFrequency();
    }

}
