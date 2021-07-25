package datasetGenerator.pojos.dimensions;

import Utility.FakerUtility;
import com.github.javafaker.Faker;

public class Location {
    public String id;
    public String streetAddress;
    public String postalCode;
    public String city;
    public String stateProvince;
//    public String status;
    Faker faker = FakerUtility.faker;

    public Location(){
        id = faker.number().digits(8);
        streetAddress = faker.address().streetAddress();
        stateProvince = faker.address().cityName();
        city = faker.address().city();
        postalCode = faker.address().zipCode();
    }

    public String getId() {
        return id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getStateProvince() {
        return stateProvince;
    }
    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }


    @Override
    public String toString() {
        return getId() + "," + getStreetAddress() + "," + getStateProvince() + ","
                + getCity() + "," + getPostalCode();
    }
}
