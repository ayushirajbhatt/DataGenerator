package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

import java.util.Date;

import static Utility.FakerUtility.fakeValuesService;

public class EntityHistory {
    public String id;
    public Date startDate;
    public Date endDate;
    public String entityType;
    public String remarks;
    public String status;
    public String data;
    Faker faker = FakerUtility.faker;

    public EntityHistory(){
        id = faker.number().digits(8);
        startDate = faker.date().birthday(3,8);
        endDate = faker.date().birthday(9,16);
        entityType = faker.commerce().material();
        remarks = faker.lorem().sentence();
        data = faker.lorem().paragraph();
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

    public String getEntityType() {
        return entityType;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return getId() + "," + getStartDate() + "," +
                getEndDate() + "," + getEntityType() + "," + getRemarks()
                + getStatus() + "," + getData();
    }


}
