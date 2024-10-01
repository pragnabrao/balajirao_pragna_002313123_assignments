/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

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
    public void setAccounts (ArrayList<Person> people)   {
        this.people = people;
    }
    public Person addPerson(){
        Person a = new Person();
        people.add(a);
        return a;
    
    }
    public void deleteAccount (Person person){
        people.remove(person);
    }
   
}
