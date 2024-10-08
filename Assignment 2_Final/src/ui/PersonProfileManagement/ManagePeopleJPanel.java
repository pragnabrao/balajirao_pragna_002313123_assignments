/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonProfileManagement;

import java.awt.CardLayout;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Person;
import model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ui.PersonProfileManagement.ListPeopleProfilesJPanel;
import model.Address;



/**
 *
 * @author Pragna Balaji Rao
 */
public class ManagePeopleJPanel extends javax.swing.JPanel {
    
    
    
        JPanel personManagementContainer;
        PersonDirectory personDirectory;
        List<Person> foundPersons;
        


    /**
     * Creates new form ListandMngPeopleJPanel
     */
    public ManagePeopleJPanel(JPanel container,PersonDirectory directory) {
        initComponents();
        
        this.personManagementContainer = container;
        this.personDirectory = directory;
        List<Person> foundPersons; // Added to store found persons
       
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        tblPeopleProfiles = new javax.swing.JTable();
        lblManageProfiles = new javax.swing.JLabel();
        lblListofProfiles = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();
        lblManageProfiles1 = new javax.swing.JLabel();
        lblTtitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        ScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblPeopleProfiles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblPeopleProfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "SSN", "Height", "Weight", "Gender", "Age", "Home Address", "Work Address", "Home State", "Work State"
            }
        ));
        ScrollPane.setViewportView(tblPeopleProfiles);

        lblManageProfiles.setBackground(new java.awt.Color(204, 204, 255));
        lblManageProfiles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManageProfiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProfiles.setText("Manage Profiles");

        lblListofProfiles.setBackground(new java.awt.Color(204, 204, 255));
        lblListofProfiles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblListofProfiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListofProfiles.setText(" People Basic Information");

        btnSearch.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("Search ");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblManageProfiles1.setBackground(new java.awt.Color(204, 204, 255));
        lblManageProfiles1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblManageProfiles1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProfiles1.setText("Search by First Name, Last Name, or Street Address");

        lblTtitle.setBackground(new java.awt.Color(51, 0, 204));
        lblTtitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtitle.setText("Manage People Profile");
        lblTtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewDetails.setBackground(new java.awt.Color(153, 153, 255));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewDetails.setText("View Person Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblListofProfiles)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(lblManageProfiles1)))
                                .addGap(0, 244, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(27, 27, 27)
                                .addComponent(lblTtitle))
                            .addComponent(lblManageProfiles)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTtitle))
                .addGap(18, 18, 18)
                .addComponent(lblListofProfiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblManageProfiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblManageProfiles1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        personManagementContainer.remove(this);
        CardLayout layout = (CardLayout) personManagementContainer.getLayout();
        layout.previous(personManagementContainer);                                  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
      int selectRow = tblPeopleProfiles.getSelectedRow();
        
        if(selectRow >= 0){
            
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected person profile?", "WARNING", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Person selectedPerson = (Person) tblPeopleProfiles.getValueAt(selectRow, 0);
                personDirectory.deletePeople(selectedPerson);
                populateTable(); 
                
                
        }else {
                JOptionPane.showMessageDialog(null, "Please select a person profile from the list", "Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        
    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        
    int selectedRow = tblPeopleProfiles.getSelectedRow();
    
    if (selectedRow >= 0) {
        // Retrieve the Person object from the first column
        Person selectedPerson = (Person) tblPeopleProfiles.getValueAt(selectedRow, 0); // Keep using the class Person here to avoid confusion
        
        viewPeopleProfilesJPanel panel = new viewPeopleProfilesJPanel(personManagementContainer, personDirectory, selectedPerson);
        personManagementContainer.add("viewPeopleProfilesJPanel", panel);
        CardLayout layout = (CardLayout) personManagementContainer.getLayout();
        layout.next(personManagementContainer);
    } else {
        JOptionPane.showMessageDialog(null, "Please select a person from the list to view", "Warning", JOptionPane.WARNING_MESSAGE);
    
    }   
    
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchTerm = txtSearchBox.getText();
        if (!searchTerm.isBlank()) {
            
            List<Person> foundPersons = personDirectory.searchPerson(searchTerm); // Search for multiple Persons

             if (!foundPersons.isEmpty()) {
                // Case when one person is found
                if (foundPersons.size() == 1) {
                Person foundPerson = foundPersons.get(0); // Get the first person from the list
                viewPeopleProfilesJPanel panel = new viewPeopleProfilesJPanel(personManagementContainer, personDirectory, foundPerson);
                personManagementContainer.add("viewPersonJPanel", panel);
                CardLayout layout = (CardLayout) personManagementContainer.getLayout();
                layout.next(personManagementContainer);
            } else {
                // Case when multiple persons are found
                ListPeopleProfilesJPanel listPanel = new ListPeopleProfilesJPanel(personManagementContainer, personDirectory, foundPersons);
                personManagementContainer.add("listPersonJPanel", listPanel);
                CardLayout layout = (CardLayout) personManagementContainer.getLayout();
                layout.next(personManagementContainer);
                }
            } else {
                // Case when no person is found
                JOptionPane.showMessageDialog(null, "Person not found. Please check the input and try again!", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
            } else {
            // Case when search box is blank
            JOptionPane.showMessageDialog(null, "Please type a first name, last name, or street address to view");

       }

                                                      
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel lblListofProfiles;
    private javax.swing.JLabel lblManageProfiles;
    private javax.swing.JLabel lblManageProfiles1;
    private javax.swing.JLabel lblTtitle;
    private javax.swing.JTable tblPeopleProfiles;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
    
    public void populateTable(){
        DefaultTableModel model  = (DefaultTableModel) tblPeopleProfiles.getModel();
        model.setRowCount(0);
        
        for (Person a : personDirectory.getPeople()) {
            
        Object[] row = new Object[12]; // 
        row[0] = a;
        row[1] = a.getLastName();
        row[2] = String.valueOf(a.getPhoneNumber());
        row[3] = a.getSocialSecurityNumber();
        row[4] = String.valueOf(a.getHeight());
        row[5] = String.valueOf(a.getWeight());
        row[6] = String.valueOf(a.getGender());
        row[7] = String.valueOf(a.getAge());
        
         // Accessing Address attributes through Person class
        Address personaddress = a.getAddress();
        
        // Ensure address is not null before accessing its fields
        if (personaddress != null) {
        row[8] = personaddress.getHomstreetAddress();   // Home Zip Code
        row[9] = personaddress.getWorkStreetAddress();
        row[10] = personaddress.getHomeCity();
        row[11] = personaddress.getWorkCity();
        }
        
        model.addRow(row);
        }
        
    }
}
