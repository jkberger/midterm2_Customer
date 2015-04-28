/**
 * 
 */
/**
 * @author jason
 *
 */



package ch.makery.customer.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;


public class Person {

    private final StringProperty firstName;
    private final StringProperty MiddleInitial;
    private final StringProperty lastName;
    private final StringProperty Address;
    private final IntegerProperty ZipCode;
    private final StringProperty city;
    private final RadioButton Gender;
    private final MenuButton State;
    

    
    public Person() {
        this(null, null);
    }

    
    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        //setting and getting the values that each person has as their attributes
        
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    
    public String getMiddleInitial() {
        return MiddleInitial.get();
    }

    public void setMiddleInitial(String MiddleInitial) {
        this.MiddleInitial.set(MiddleInitial);
    }

    public StringProperty MiddleInitialProperty() {
        return MiddleInitial;
    }
    
    
    

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getAddress() {
        return Address.get();
    }

    public void setStreet(String Address) {
        this.Address.set(Address);
    }

    public StringProperty streetProperty() {
        return Address;
    }

    public int getPostalCode() {
        return ZipCode.get();
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode.set(ZipCode);
    }

    public IntegerProperty ZipCodeProperty() {
        return ZipCode;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }
    
    public RadioButton getGender() {
        return Gender.get();
    }

    public void setGender(RadioButton Gender) {
        this.Gender.set(Gender);
    }

    public RadioButton GenderProperty() {
        return Gender;
    }
    
    
    public MenuButton getState() {
        return State.get();
    }

    public void setState(MenuButton State) {
        this.State.set(State);
    }

    public MenuButton StateProperty() {
        return State;
    }
    
    
    
    
}