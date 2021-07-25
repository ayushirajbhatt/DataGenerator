package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;
import static Utility.FakerUtility.fakeValuesService;

public class Utility {
    public String id;
    public String name;
    public String status;
    Faker faker = FakerUtility.faker;

    public Utility(){
        id = faker.number().digits(8);
        name = faker.commerce().productName();
        status = fakeValuesService.regexify("[a-z1-9]{5}");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getStatus();
    }

}
