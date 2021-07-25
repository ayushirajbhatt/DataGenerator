package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;
import static Utility.FakerUtility.fakeValuesService;

public class Function {
    public String id;
    public String url;
    public String widget;
    Faker faker = FakerUtility.faker;

    public Function(){
        id = faker.number().digits(8);
        url = fakeValuesService.bothify("????##@company.com");
        widget = faker.commerce().productName();
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getWidget() {
        return widget;
    }

    @Override
    public String toString() {
        return getId() + "," + getUrl() + "," + getWidget();
    }


}
