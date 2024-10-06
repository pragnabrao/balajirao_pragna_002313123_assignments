/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pragna Balaji Rao
 */
public class Person {
    
    private String firstName; 
    private String lastName; 
    private String socialSecurityNumber;
    private int age; // Primitive datatype 
    private char gender; // Primitive datatype 
    private long phoneNumber; // Primitive datatype 
    private double height; // Primitive datatype
    private float weight; // Primitive datatype 
    
    private Address address;

    // Constructor to initialize Person with address 
    public Person() {
        this.address = new Address();
    }

    // Getter and Setters for the Person attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Getter for Address objects
    public Address getAddress() {
        return address;
    }
    
    // Setters for Address attributes via Person class 
    public void setHomeStreetAddress(String homeStreetAddress) {
        this.address.setHomstreetAddress(homeStreetAddress);
    }

    public void setWorkStreetAddress(String workStreetAddress) {
        this.address.setWorkStreetAddress(workStreetAddress);
    }

    public void setHomeCity(String homeCity) {
        this.address.setHomeCity(homeCity);
    }

    public void setWorkCity(String workCity) {
        this.address.setWorkCity(workCity);
    }

    public void setHomeState(String homeState) {
        this.address.setHomeState(homeState);
    }

    public void setWorkState(String workState) {
        this.address.setWorkState(workState);
    }
    public void setHomeUnitNumber(int homeUnitNumber) {
        this.address.setHomeUnitNumber(homeUnitNumber);
    }
    
    public void setWorkUnitNumer (int workUnitNumber) {
        this.address.setHomeUnitNumber(workUnitNumber);
    }

    public void setHomeZipCode(int homeZipCode) {
        this.address.setHomeZipCode(homeZipCode);
    }

    public void setWorkZipCode(int workZipCode) {
        this.address.setWorkZipCode(workZipCode);
    } 
    @Override
    public String toString(){
        return firstName;
    }
}
