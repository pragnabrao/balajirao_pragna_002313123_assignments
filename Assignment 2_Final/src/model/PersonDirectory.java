/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import model.PersonDirectory;

/**
 *
 * @author Pragna Balaji Rao
 */
public class PersonDirectory {
    
    private ArrayList<Person> people;
    
    public PersonDirectory(){
        this.people = new ArrayList<>();
    }
    
    public ArrayList<Person> getPeople() {
        return people;
    }
    public void setPeople (ArrayList<Person> people)   {
        this.people = people;
    }
    public Person addPerson(){
        Person a = new Person();
        people.add(a);
        return a;
    
    }
    public void deletePeople (Person person){
        people.remove(person);
    }
    public List<Person> searchPerson(String searchTerm) {
    List<Person> matchingPersons = new ArrayList<>();  // Create a list to hold matching persons
    
    for (Person person : people) {
        // Check first name
        if (person.getFirstName() != null && person.getFirstName().equalsIgnoreCase(searchTerm)) {
            matchingPersons.add(person);
        }
        // Check last name
        if (person.getLastName() != null && person.getLastName().equalsIgnoreCase(searchTerm)) {
            matchingPersons.add(person);
        }
        // Check home street address
        if (person.getAddress() != null && 
            person.getAddress().getHomstreetAddress()!= null && 
            person.getAddress().getHomstreetAddress().equalsIgnoreCase(searchTerm)) {
            matchingPersons.add(person);
        }
        // Check work street address
        if (person.getAddress() != null && 
            person.getAddress().getWorkStreetAddress()!= null && 
            person.getAddress().getWorkStreetAddress().equalsIgnoreCase(searchTerm)) {
            matchingPersons.add(person);
        }
    
    }
    return matchingPersons;  // Return the list of matching persons
}
}   

