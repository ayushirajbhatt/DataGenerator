package datasetGenerator.pojos.Employee;

import java.util.Date;

import static Utility.FakerUtility.fakeValuesService;
import static Utility.FakerUtility.faker;

public class Employee {
    public String id;
    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;
    public Date hireDate;
    public long salary;
    public long commissionPct;
    public String status;

    public Employee(){
        id = faker.number().digits(8);
        name = faker.name().firstName();
        lastName = faker.name().lastName();
        email = faker.internet().emailAddress();
        phoneNumber = faker.phoneNumber().cellPhone();
        hireDate = faker.date().birthday();
        salary = faker.number().randomNumber();
        commissionPct = faker.number().randomNumber();
        status = fakeValuesService.regexify("[1-9]{5}");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public long getSalary() {
        return salary;
    }

    public long getCommissionPct() {
        return commissionPct;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getLastName() + "," +
                getEmail() + "," + getSalary() + "," +
                getPhoneNumber() + "," + getHireDate()
                + "," + getCommissionPct() + "," + getStatus();
    }

}
