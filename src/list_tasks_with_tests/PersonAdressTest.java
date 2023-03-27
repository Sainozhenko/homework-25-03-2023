package list_tasks_with_tests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class PersonAdressTest {
    private Person pesons;
    private Address address;
    @DisplayName("Testing starting")
    @BeforeEach
    public void init(){
        Address address = new Address("Gorlitzer Platz",4 );
         Person persons = new Person("Dmytro",address);
    }
    @Test
    public void firstTest(){
        Address address1 = new Address("Bahnhofstr. ", 17);
        Address address2 = new Address("Gorlitzer Platz. ", 4);
        Person person1 = new Person("Iryna", address1);
        Person person2 = new Person("Dmytro", address2);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        List<Address> addresses = Person.getAddresses(persons);
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(address1);
        expectedAddresses.add(address2);
        assertEquals(expectedAddresses, addresses);
        assertEquals(expectedAddresses,addresses);
    }
    @Test
    public void emptyTest(){
        Address address1 = new Address(null, 0);
        Address address2 = new Address(null,0);
        Person person1 = new Person(null, address1);
        Person person2 = new Person(null, address2);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        List<Address> addresses = Person.getAddresses(persons);
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(address1);
        expectedAddresses.add(address2);
        assertEquals(expectedAddresses, addresses);
        assertEquals(expectedAddresses,addresses);
    }
    @Test
    public void negativeTest(){
        Address address1 = new Address(null, -3232);
        Address address2 = new Address(null,-3232);
        Person person1 = new Person(null, address1);
        Person person2 = new Person(null, address2);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        List<Address> addresses = Person.getAddresses(persons);
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(address1);
        expectedAddresses.add(address2);
        assertEquals(expectedAddresses, addresses);
        assertEquals(expectedAddresses,addresses);
    }
}
