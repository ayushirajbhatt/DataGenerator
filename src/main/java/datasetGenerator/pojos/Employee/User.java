package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;
import static Utility.FakerUtility.fakeValuesService;

public class User {
    public String id;
    public String userId;
    public String password;
    public String role;
    Faker faker = FakerUtility.faker;

    public User(){
        id = faker.number().digits(8);
        userId = faker.name().username();
        password = fakeValuesService.regexify("[a-z1-9]{7}");
        role = faker.job().position();
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getId() + "," + getUserId() + "," + getPassword() + "," +
                getRole();
    }

}
