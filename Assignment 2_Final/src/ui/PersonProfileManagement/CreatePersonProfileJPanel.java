/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonProfileManagement;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Person;
import model.PersonDirectory;
import javax.swing.JOptionPane;



/**
 *
 * @author Pragna Balaji Rao
 */
public class CreatePersonProfileJPanel extends javax.swing.JPanel {
    
        JPanel personManagementContainer;
        PersonDirectory personDirectory;


    /**
     * Creates new form CreateProfileJPanel
     */
    public CreatePersonProfileJPanel(JPanel container,PersonDirectory directory) {
        initComponents();
        
        personManagementContainer = container;
        personDirectory = directory;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTtitle = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblGenInfo = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        txtHStreetAddress = new javax.swing.JTextField();
        txtHUnitNumber = new javax.swing.JTextField();
        lblGenInfo2 = new javax.swing.JLabel();
        lblHStreetAddress = new javax.swing.JLabel();
        lblHUnitNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHCity = new javax.swing.JTextField();
        lblHState = new javax.swing.JLabel();
        txtHZipCode = new javax.swing.JTextField();
        lblHCity = new javax.swing.JLabel();
        txtHState = new javax.swing.JTextField();
        lblHZipCode = new javax.swing.JLabel();
        txtWStreet = new javax.swing.JTextField();
        txtWUnitNumber = new javax.swing.JTextField();
        txtWCity = new javax.swing.JTextField();
        txtWState = new javax.swing.JTextField();
        lblWorkAddress = new javax.swing.JLabel();
        lblWStreetAddress = new javax.swing.JLabel();
        lblWUnitNumber = new javax.swing.JLabel();
        lblWCity = new javax.swing.JLabel();
        llblWState = new javax.swing.JLabel();
        lblWZipCode = new javax.swing.JLabel();
        txtWZipCode1 = new javax.swing.JTextField();
        btnCreateProfile = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        lblTtitle.setBackground(new java.awt.Color(51, 0, 204));
        lblTtitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtitle.setText("Create Person Profile");
        lblTtitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName.setText("First Name");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName.setText("Last Name");

        lblSSN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSSN.setText("SSN");

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAge.setText("Age");

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGender.setText("Gender");

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber.setText("Phone Number");

        lblHeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHeight.setText("Height");

        lblWeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWeight.setText("Weight");

        lblGenInfo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblGenInfo.setForeground(new java.awt.Color(51, 51, 255));
        lblGenInfo.setText("General Information");

        lblHomeAddress.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblHomeAddress.setForeground(new java.awt.Color(51, 51, 255));
        lblHomeAddress.setText("Home Address");

        lblGenInfo2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblGenInfo2.setForeground(new java.awt.Color(51, 51, 255));

        lblHStreetAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHStreetAddress.setText("Street");

        lblHUnitNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHUnitNumber.setText("Unit Number");

        lblHState.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHState.setText("State");

        lblHCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHCity.setText("City");

        lblHZipCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHZipCode.setText("Zip Code");

        lblWorkAddress.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblWorkAddress.setForeground(new java.awt.Color(51, 51, 255));
        lblWorkAddress.setText("Work Address");

        lblWStreetAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWStreetAddress.setText("Street");

        lblWUnitNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWUnitNumber.setText("Unit Number");

        lblWCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWCity.setText("City");

        llblWState.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        llblWState.setText("State");

        lblWZipCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWZipCode.setText("Zip Code");

        btnCreateProfile.setBackground(new java.awt.Color(153, 153, 255));
        btnCreateProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateProfile.setText("Confirm & Create Profile");
        btnCreateProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGenInfo2)
                .addContainerGap(591, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTtitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenInfo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSSN)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHeight)
                                    .addComponent(lblGender)
                                    .addComponent(txtGender)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblWeight)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHomeAddress)
                                .addGap(86, 86, 86)
                                .addComponent(lblWorkAddress))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHUnitNumber)
                                    .addComponent(lblHState)
                                    .addComponent(lblHStreetAddress)
                                    .addComponent(lblHZipCode)
                                    .addComponent(lblHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHState)
                                    .addComponent(txtHCity)
                                    .addComponent(txtHUnitNumber)
                                    .addComponent(txtHStreetAddress)
                                    .addComponent(txtHZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(llblWState)
                                    .addComponent(lblWStreetAddress)
                                    .addComponent(lblWUnitNumber)
                                    .addComponent(txtWStreet)
                                    .addComponent(txtWUnitNumber)
                                    .addComponent(lblWCity)
                                    .addComponent(txtWCity)
                                    .addComponent(txtWZipCode1)
                                    .addComponent(lblWZipCode)
                                    .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTtitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGenInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSSN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhoneNumber)
                        .addGap(0, 0, 0)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAge)
                        .addGap(7, 7, 7)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblHeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeAddress)
                            .addComponent(lblWorkAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWStreetAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblWUnitNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(llblWState)
                                .addGap(0, 0, 0)
                                .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWZipCode))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHStreetAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHUnitNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHState)
                                .addGap(0, 0, 0)
                                .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblHZipCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWZipCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGenInfo2)
                .addGap(107, 107, 107)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        personManagementContainer.remove(this);
        CardLayout layout = (CardLayout) personManagementContainer.getLayout();
        layout.previous(personManagementContainer);                                      
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
        
        int age;
        int homeUnitNumber;
        int homeZipCode;
        int workUnitNumber;
        int workZipCode;
        
        char gender;
        
        long phoneNumber;
        double height;
        float weight;

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String socialSecurityNumber = txtSSN.getText();
        String homeCity = txtHCity.getText();
        String homeStreetAddress = txtHStreetAddress.getText();
        String homeState = txtHState.getText();
        String workCity = txtWCity.getText();
        String workStreetAddress = txtWStreet.getText();
        String workState = txtWState.getText();

        // Check for mandatory fields
        if (firstName.isBlank() || lastName.isBlank() || socialSecurityNumber.isBlank() || homeCity.isBlank() ||
            homeStreetAddress.isBlank() || homeState.isBlank() || workCity.isBlank() || workStreetAddress.isBlank() || workState.isBlank()) {   
            JOptionPane.showMessageDialog(this, "All fields are mandatory!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;  // Exit if any mandatory fields are empty 
        }


        // Check if first name and last name contain only letters
        if (!firstName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "First Name must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }


        if (!lastName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Last Name must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        if (!homeCity.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Home City must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }    
         if (!workCity.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Work City must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return; 
        }
         if (!homeState.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Home State must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if (!workState.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Work State must contain only letters!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;  
        }

        try {
             // Validate and parse numeric fields
            age = Integer.parseInt(txtAge.getText());
            if (age < 0 || age > 120) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age (0-120)!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                return;
            }
    

            homeUnitNumber = Integer.parseInt(txtHUnitNumber.getText());
            homeZipCode = Integer.parseInt(txtHZipCode.getText());
            workUnitNumber = Integer.parseInt(txtWUnitNumber.getText());
            workZipCode = Integer.parseInt(txtWZipCode1.getText());
            height = Double.parseDouble(txtHeight.getText());
            weight = Float.parseFloat(txtWeight.getText());

            // Validate gender
            String genderInput = txtGender.getText().toUpperCase();
            if (!genderInput.equals("M") && !genderInput.equals("F")) {
                JOptionPane.showMessageDialog(this, "Gender must be 'M' or 'F'!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            gender = genderInput.charAt(0);  // First character as gender ('M', 'F')

            // Validate phone number (should be a number and of reasonable length)
            phoneNumber = Long.parseLong(txtPhoneNumber.getText());
            if (!String.valueOf(phoneNumber).matches("\\d{10}")) { {
                JOptionPane.showMessageDialog(this, "Phone Number must be exactly 10 digits long and only contain numbers!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            }  
        
        }catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Age, Unit Numbers, Zip Codes, Phone Number, Height, and Weight!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;     
        } catch (Exception e) {
       
            JOptionPane.showMessageDialog(null, "Please check the inputs", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
   
        Person a = personDirectory.addPerson();
        
        a.setFirstName(firstName);
        a.setLastName(lastName);
        a.setSocialSecurityNumber(socialSecurityNumber);
        a.setPhoneNumber(phoneNumber);
        a.setAge(age);
        a.setGender(gender);
        a.setHeight(height);
        a.setWeight(weight);
        a.setHomeStreetAddress(homeStreetAddress);
        a.setHomeCity(homeCity);
        a.setHomeState(homeState);
        a.setHomeZipCode(homeZipCode);
        a.setWorkState(workState);
        a.setWorkCity(workCity);
        a.setWorkState(workState);
        a.setWorkZipCode(workZipCode);
        a.setHomeUnitNumber(homeUnitNumber);
        a.setWorkUnitNumer(workUnitNumber);
        
        
        JOptionPane.showMessageDialog(this, "Person Profile sucessfully created", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSSN.setText("");
        txtPhoneNumber.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtHStreetAddress.setText("");
        txtHUnitNumber.setText("");
        txtHCity.setText("");
        txtHState.setText("");
        txtHZipCode.setText("");
        txtWStreet.setText("");
        txtWUnitNumber.setText("");
        txtWCity.setText(workCity);
        txtWState.setText(workCity);
        txtWZipCode1.setText("");
        
    }//GEN-LAST:event_btnCreateProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGenInfo;
    private javax.swing.JLabel lblGenInfo2;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHState;
    private javax.swing.JLabel lblHStreetAddress;
    private javax.swing.JLabel lblHUnitNumber;
    private javax.swing.JLabel lblHZipCode;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTtitle;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWStreetAddress;
    private javax.swing.JLabel lblWUnitNumber;
    private javax.swing.JLabel lblWZipCode;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JLabel llblWState;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHState;
    private javax.swing.JTextField txtHStreetAddress;
    private javax.swing.JTextField txtHUnitNumber;
    private javax.swing.JTextField txtHZipCode;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWState;
    private javax.swing.JTextField txtWStreet;
    private javax.swing.JTextField txtWUnitNumber;
    private javax.swing.JTextField txtWZipCode1;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}