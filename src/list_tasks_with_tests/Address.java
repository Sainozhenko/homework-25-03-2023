package list_tasks_with_tests;

import java.util.ArrayList;
import java.util.List;

public class Address {
    String street;
    int houseNumber;

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }
}
