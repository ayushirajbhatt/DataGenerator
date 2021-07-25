package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

public class Resource {

    public String id;
    public String name;
    public String designation;
    public long minSalary;
    public long maxSalary;
    Faker faker = FakerUtility.faker;

    public Resource(){
        id = faker.number().digits(8);
        name = faker.commerce().productName();
        designation = faker.job().title();
        minSalary = faker.number().numberBetween(30000, 50000);
        maxSalary = faker.number().numberBetween(70000, 90000);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public long getMinSalary() {
        return minSalary;
    }

    public long getMaxSalary() {
        return maxSalary;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getDesignation() + "," +
                getMinSalary() + "," + getMaxSalary();
    }
}
