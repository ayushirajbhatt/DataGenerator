package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;
import static Utility.FakerUtility.fakeValuesService;

public class Access {

    public String id;
    public String role;
    public String function;
    public boolean allow;
    public boolean deny;
    Faker faker = FakerUtility.faker;

    public Access() {
        id = faker.number().digits(8);
        role = faker.job().position();
        function = fakeValuesService.regexify("[a-z1-9]{7}");
        allow = faker.bool().bool();
        deny = faker.bool().bool();
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getFunction() {
        return function;
    }

    public boolean isAllow() {
        return allow;
    }

    public boolean isDeny() {
        return deny;
    }

    @Override
    public String toString() {
        return getId() + "," + getFunction() + "," +
                getRole() + "," + isAllow() + "," + isDeny();
    }

}


