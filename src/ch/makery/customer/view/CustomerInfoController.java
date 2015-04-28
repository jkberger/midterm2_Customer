/**
 * 
 */
/**
 * @author jason
 *
 */


package ch.makery.customer.view;

import javafx.fxml.FXML;

import ch.makery.customer.model.Person;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerInfoController {
// trying to initiate the part of the fxml in and link them to the code
	@FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label MiddleInitialLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label AddressLabel;
    @FXML
    private Label ZipCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label StateLabel;
    @FXML
    private Label GenderLabel;
	
	@FXML
	private void initialize() {
	    //insert the person into the tableview based on their properties
	    firstnameColumn.setCellValueFactory(
	            cellData -> cellData.getValue().firstNameProperty());
	    lastnameColumn.setCellValueFactory(
	            cellData -> cellData.getValue().lastNameProperty());
	
	    // this should delete the person from the table view were they are saved into the system
	    @FXML
	    private void handleDeletePerson() {
	        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
	        personTable.getItems().remove(selectedIndex);

	    
	    }
	    
	    private void showPersonDetails(Person person) {
	        if (person != null) {
	            // Fill the labels with info from the person object.
	            firstNameLabel.setText(person.getFirstName());
	            lastNameLabel.setText(person.getLastName());
	            AddressLabel.setText(person.getAddress());
	            ZipCodeLabel.setText(Integer.toString(person.getZipCode()));
	            cityLabel.setText(person.getCity());
	            GenderLabel.setRadiobutton(person.getGender());
	            StateLabel.setMenuButton(person.getState());
	            
	            

	            
	        } else {
	            // Person is null, remove all the text.
	            firstNameLabel.setText("");
	            lastNameLabel.setText("");
	            AddressLabel.setText("");
	            ZipCodeLabel.setText("");
	            cityLabel.setText("");
	            GenderLabel.setRadioButton();
	            StateLabel.setMenuButton();
	            
	        }
	    
	}
}
	
