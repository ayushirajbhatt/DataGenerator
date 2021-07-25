package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

import java.util.Date;

import static Utility.FakerUtility.fakeValuesService;

public class Transaction {

    public String id;
    public String name;
    public String amount;
    public Date date;
    public String category;
    Faker faker = FakerUtility.faker;

    public Transaction(){
        id = faker.number().digits(8);
        name = faker.name().fullName();
        amount = faker.commerce().price();
        category = faker.commerce().department();
        date = faker.date().birthday();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getAmount() + "," +
                getDate() + "," + getCategory();
    }
}
