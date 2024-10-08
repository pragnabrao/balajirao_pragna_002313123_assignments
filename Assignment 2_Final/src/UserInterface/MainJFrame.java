/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import model.Person;
import model.PersonDirectory;
import ui.PersonProfileManagement.PersonProfileMngJPanel;
import java.util.List;
import java.util.ArrayList;
import model.Address;


/**
 *
 * @author Arathi Balaji Rao
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private PersonDirectory personDirectory;
   
    


    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        
        
        personManagementContainer.setLayout(new CardLayout());
        
        this.personDirectory = new PersonDirectory();
        generateDemoData();

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        topjPanel = new javax.swing.JPanel();
        btnPersonProfileManagment = new javax.swing.JButton();
        lblPersonProfileManagement = new javax.swing.JLabel();
        personManagementContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topjPanel.setBackground(new java.awt.Color(204, 255, 255));

        btnPersonProfileManagment.setBackground(new java.awt.Color(153, 153, 255));
        btnPersonProfileManagment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPersonProfileManagment.setText("Begin");
        btnPersonProfileManagment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonProfileManagmentActionPerformed(evt);
            }
        });

        lblPersonProfileManagement.setBackground(new java.awt.Color(0, 0, 255));
        lblPersonProfileManagement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPersonProfileManagement.setForeground(new java.awt.Color(0, 51, 255));
        lblPersonProfileManagement.setText("Person Profile Managment");

        javax.swing.GroupLayout topjPanelLayout = new javax.swing.GroupLayout(topjPanel);
        topjPanel.setLayout(topjPanelLayout);
        topjPanelLayout.setHorizontalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPersonProfileManagment)
                .addGap(18, 18, 18)
                .addComponent(lblPersonProfileManagement)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        topjPanelLayout.setVerticalGroup(
            topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(topjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonProfileManagment)
                    .addComponent(lblPersonProfileManagement))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(topjPanel);

        personManagementContainer.setBackground(new java.awt.Color(204, 255, 255));
        personManagementContainer.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(personManagementContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonProfileManagmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonProfileManagmentActionPerformed
        // TODO add your handling code here:
        PersonProfileMngJPanel panel = new PersonProfileMngJPanel(personManagementContainer, personDirectory);
        personManagementContainer.add("PersonProfileMngJPanel",panel);
        
        CardLayout layout = (CardLayout) personManagementContainer.getLayout();
        layout.next(personManagementContainer);
        

    }//GEN-LAST:event_btnPersonProfileManagmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnPersonProfileManagment;
    private javax.swing.JLabel lblPersonProfileManagement;
    private javax.swing.JPanel personManagementContainer;
    private javax.swing.JPanel topjPanel;
    // End of variables declaration//GEN-END:variables

    private void generateDemoData() {
        
        Person newPerson = personDirectory.addPerson();
        newPerson.setFirstName("Sara");
        newPerson.setLastName("Johnson");
        newPerson.setPhoneNumber(6174219266L);
        newPerson.setSocialSecurityNumber("NY12345");
        newPerson.setHeight(164.99);
        newPerson.setWeight(56);
        newPerson.setAge(24);
        newPerson.setGender('F');
        newPerson.setHomeStreetAddress("123 Main St");
        newPerson.setHomeCity("New York");
        newPerson.setHomeState("NY");
        newPerson.setHomeZipCode(10001);
        newPerson.setWorkStreetAddress("456 Corporate Ave");
        newPerson.setWorkCity("Manhattan");
        newPerson.setWorkState("NY");
        newPerson.setWorkZipCode(10002);
        newPerson.setHomeUnitNumber(2);
        newPerson.setWorkUnitNumer(8);
       
        Person newPersonone = personDirectory.addPerson();
        newPersonone.setFirstName("Alex");
        newPersonone.setLastName("Roy");
        newPersonone.setPhoneNumber(8174213366L);
        newPersonone.setSocialSecurityNumber("IL56789");
        newPersonone.setHeight(154.89);
        newPersonone.setWeight(66);
        newPersonone.setAge(25);
        newPersonone.setGender('M');
        newPersonone.setHomeStreetAddress("789 Elm St");
        newPersonone.setHomeCity("Chicago");
        newPersonone.setHomeState("IL");
        newPersonone.setHomeZipCode(60601);
        newPersonone.setWorkStreetAddress("101 Business Rd");
        newPersonone.setWorkCity("Chicago");
        newPersonone.setWorkState("IL");
        newPersonone.setWorkZipCode(60602);
        newPersonone.setHomeUnitNumber(4);
        newPersonone.setWorkUnitNumer(8);
        
        Person newPersontwo = personDirectory.addPerson();
        newPersontwo.setFirstName("Sejal");
        newPersontwo.setLastName("Sinha");
        newPersontwo.setPhoneNumber(3175218866L);
        newPersontwo.setSocialSecurityNumber("TX54321");
        newPersontwo.setHeight(134.68);
        newPersontwo.setWeight(66);
        newPersontwo.setAge(21);
        newPersontwo.setGender('F');
        newPersontwo.setHomeStreetAddress("321 Maple Ave");
        newPersontwo.setHomeCity("Austin");
        newPersontwo.setHomeState("TX");
        newPersontwo.setHomeZipCode(78701);
        newPersontwo.setWorkStreetAddress("654 Pine St");
        newPersontwo.setWorkCity("Dallas");
        newPersontwo.setWorkState("TX");
        newPersontwo.setWorkZipCode(75201);
        newPersontwo.setHomeUnitNumber(6);
        newPersontwo.setWorkUnitNumer(4);
        
        Person newPersonthree = personDirectory.addPerson();
        newPersonthree.setFirstName("Kim");
        newPersonthree.setLastName("Degaro");
        newPersonthree.setPhoneNumber(5175214566L);
        newPersonthree.setSocialSecurityNumber("OH98765");
        newPersonthree.setHeight(144.21);
        newPersonthree.setWeight(70);
        newPersonthree.setAge(61);
        newPersonthree.setGender('F');
        newPersonthree.setHomeStreetAddress("321 Maple Ave");
        newPersonthree.setHomeCity("Cincinnati");
        newPersonthree.setHomeState("OH");
        newPersonthree.setHomeZipCode(78701);
        newPersonthree.setWorkStreetAddress("654 Pine St");
        newPersonthree.setWorkCity("Columbus");
        newPersonthree.setWorkState("OH");
        newPersonthree.setWorkZipCode(75201);
        newPersonthree.setHomeUnitNumber(1);
        newPersonthree.setWorkUnitNumer(5);
           
        Person newPersonfour = personDirectory.addPerson();
        newPersonfour.setFirstName("Shaw");
        newPersonfour.setLastName("Frank");
        newPersonfour.setPhoneNumber(7178227975L);
        newPersonfour.setSocialSecurityNumber("CA98765");
        newPersonfour.setHeight(174.25);
        newPersonfour.setWeight(70);
        newPersonfour.setAge(65);
        newPersonfour.setGender('M');
        newPersonfour.setHomeStreetAddress("111 Cedar Rd");
        newPersonfour.setHomeCity("San Fransico");
        newPersonfour.setHomeState("CA");
        newPersonfour.setHomeZipCode(33101);
        newPersonfour.setWorkStreetAddress("222 Birch St");
        newPersonfour.setWorkCity("Los Angeles");
        newPersonfour.setWorkState("CA");
        newPersonfour.setWorkZipCode(32801);
        newPersonfour.setHomeUnitNumber(1);
        newPersonfour.setWorkUnitNumer(8);
       
        Person newPersonfive = personDirectory.addPerson();
        newPersonfive.setFirstName("Leelyn");
        newPersonfive.setLastName("McIntire");
        newPersonfive.setPhoneNumber(6513569760L);
        newPersonfive.setSocialSecurityNumber("AZ123466");
        newPersonfive.setHeight(164.25);
        newPersonfive.setWeight(55);
        newPersonfive.setAge(45);
        newPersonfive.setGender('F');
        newPersonfive.setHomeStreetAddress("333 Spruce St");
        newPersonfive.setHomeCity("Tuscon");
        newPersonfive.setHomeState("AZ");
        newPersonfive.setHomeZipCode(60601);
        newPersonfive.setWorkStreetAddress("444 Chestnut St");
        newPersonfive.setWorkCity("Malibu");
        newPersonfive.setWorkState("CA");
        newPersonfive.setWorkZipCode(60540);
        newPersonfive.setHomeUnitNumber(8);
        newPersonfive.setWorkUnitNumer(4);
        
        
        Person newPersonsix = personDirectory.addPerson();
        newPersonsix.setFirstName("Kim");
        newPersonsix.setLastName("Pearson");
        newPersonsix.setPhoneNumber(8089764532L);
        newPersonsix.setSocialSecurityNumber("NY789065");
        newPersonsix.setHeight(194.25);
        newPersonsix.setWeight(78);
        newPersonsix.setAge(89);
        newPersonsix.setGender('F');
        newPersonsix.setHomeStreetAddress("555 Ash Dr");
        newPersonsix.setHomeCity("New York");
        newPersonsix.setHomeState("NY");
        newPersonsix.setHomeZipCode(10001);
        newPersonsix.setWorkStreetAddress("666 Willow Ln");
        newPersonsix.setWorkCity("Brooklyn");
        newPersonsix.setWorkState("NY");
        newPersonsix.setWorkZipCode(11201);
        newPersonsix.setHomeUnitNumber(4);
        newPersonsix.setWorkUnitNumer(4);
        
        
        Person newPersonseven = personDirectory.addPerson();
        newPersonseven.setFirstName("Hui");
        newPersonseven.setLastName("Tung");
        newPersonseven.setPhoneNumber(5674321567L);
        newPersonseven.setSocialSecurityNumber("NV880070");
        newPersonseven.setHeight(164.25);
        newPersonseven.setWeight(68);
        newPersonseven.setAge(39);
        newPersonseven.setGender('M');
        newPersonseven.setHomeStreetAddress("555 Ash Dr");
        newPersonseven.setHomeCity("New York");
        newPersonseven.setHomeState("NY");
        newPersonseven.setHomeZipCode(10001);
        newPersonseven.setWorkStreetAddress("666 Willow Ln");
        newPersonseven.setWorkCity("Brooklyn");
        newPersonseven.setWorkState("NY");
        newPersonseven.setWorkZipCode(11201);
        newPersonseven.setHomeUnitNumber(6);
        newPersonseven.setWorkUnitNumer(4);
          
        
    }    
        
        
}



        
   
