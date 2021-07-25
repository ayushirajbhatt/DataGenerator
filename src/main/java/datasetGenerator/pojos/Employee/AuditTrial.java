package datasetGenerator.pojos.Employee;

import com.github.javafaker.Faker;
import Utility.FakerUtility;

import java.util.Date;

import static Utility.FakerUtility.fakeValuesService;

public class AuditTrial {

    public String id;
    public String eventId;
    public Date occurredOn;
    public String entry;
    public String notes;
    public String triggerredBy;
    Faker faker = FakerUtility.faker;

    public AuditTrial(){
        id = faker.number().digits(8);
        eventId = faker.commerce().promotionCode();
        occurredOn = faker.date().birthday(9,16);
        entry = faker.lorem().fixedString(15);
        notes = faker.lorem().sentence();
        triggerredBy = faker.space().company();
    }

    public String getId() {
        return id;
    }

    public String getEventId() {
        return eventId;
    }

    public Date getOccurredOn() {
        return occurredOn;
    }

    public String getEntry() {
        return entry;
    }

    public String getNotes() {
        return notes;
    }

    public String getTriggerredBy() {
        return triggerredBy;
    }

    @Override
    public String toString() {
        return getId() + "," + getEventId() + "," +
                getOccurredOn() + "," + getEntry() + "," + getNotes()
                + getTriggerredBy();
    }
}
