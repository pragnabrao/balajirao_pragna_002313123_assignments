/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Arathi Balaji Rao
 */
public class VitalSigns {
    String date;
    double bloodPressure;
    double temperature;
    int pusle;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPusle() {
        return pusle;
    }

    public void setPusle(int pusle) {
        this.pusle = pusle;
    }
    @Override
    public String toString(){
        return getDate();
    }
    
       
}
