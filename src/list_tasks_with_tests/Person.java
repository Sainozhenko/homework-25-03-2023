package list_tasks_with_tests;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        for (Person person : persons) {
            addresses.add(person.getAddress());
        }
        return addresses;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", address=" + address;
    }
}
