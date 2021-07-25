package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;
import static Utility.FakerUtility.fakeValuesService;

public class Url {

    public String id;
    public String context;
    public String url;
    public String path;
    Faker faker = FakerUtility.faker;

    public Url() {
        id = faker.number().digits(8);
        context = faker.internet().domainName();
        url = faker.internet().url();
        path = faker.internet().domainSuffix();
    }

    public String getId() {
        return id;
    }

    public String getContext() {
        return context;
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return getId() + "," + getContext() + "," + getUrl() + "," +
                getPath();
    }
}
