package list_tasks_with_tests;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//
//        Address address1 = new Address("Main St.", 123);
//        Person person1 = new Person("John Doe", address1);
//
//        Address address2 = new Address("Park Ave.", 456);
//        Person person2 = new Person("Jane Smith", address2);
//
//        List<Person> persons = new ArrayList<>();
//        persons.add(person1);
//        persons.add(person2);
//
//        List<Address> addresses = Person.getAddresses(persons);
//        for (Address address : addresses) {
//            List<Person> persons11 = new ArrayList<>();
//            for(Person person:persons11){
//                System.out.print(person.getName());
//            }
//            System.out.println( address.getStreet() + " " + address.getHouseNumber());
//        }
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Address address1 = new Address("Main St.", 123);
//        Person person1 = new Person("John Doe", address1);
//
//        Address address2 = new Address("Park Ave.", 456);
//        Person person2 = new Person("Jane Smith", address2);
//
//        List<Person> persons = new ArrayList<>();
//        persons.add(person1);
//        persons.add(person2);
//
//        List<Address> addresses = Person.getAddresses(persons);
//        for (Address address : addresses) {
//            System.out.println(address.getStreet() + " " + address.getHouseNumber());
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Bahnhofstr. ", 17);
        Address address2 = new Address("Gorlitzer Platz. ", 4);

        Person person1 = new Person("Iryna", address1);
        Person person2 = new Person("Dmytro", address2);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        List<Address> addresses = Person.getAddresses(persons);
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            Address address = addresses.get(i);
            System.out.println(person.getName() + " live in: " + address.getStreet() +address.getHouseNumber());
        }
    }
}
