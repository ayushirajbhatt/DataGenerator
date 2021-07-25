package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

import java.util.Date;

import static Utility.FakerUtility.fakeValuesService;

public class Allocation {

    public String id;
    public Date startDate;
    public Date endDate;
    public String type;
    public String remarks;
    public String status;
    public boolean approved;
    Faker faker = FakerUtility.faker;

    public Allocation(){
        id = faker.number().digits(8);
        startDate = faker.date().birthday(3,8);
        endDate = faker.date().birthday(9,16);
        type = faker.internet().emailAddress();
        remarks = faker.lorem().sentence();
        approved = faker.bool().bool();
        status = fakeValuesService.regexify("[1-9]{5}");
    }

    public String getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getType() {
        return type;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getStatus() {
        return status;
    }

    public boolean isApproved() {
        return approved;
    }

    @Override
    public String toString() {
        return getId() + "," + getStartDate() + "," +
                getEndDate() + "," + getType() + "," + getRemarks()
                + getStatus() + "," + isApproved();
    }

}
