/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compiere.apps;

import java.util.Random;

/**
 *
 * @author Ghifari
 */
public class QuickGuide extends javax.swing.JFrame {

    private static int page;
    
    final int one = 1;
    
    final int maks = 17;
    
    final int min = 1;
    
    /**
     * Creates new form QuickGuide
     */
    public QuickGuide() {
        initComponents();
        setPage(one);
        setPageLabel(one);
        setLocationRelativeTo(null);
    }

    void setPageLabel(int page) {
        pageLabel.setText("Page : " + page);
    }
    
    int getPage(){
        return page;
    }
    
    void setPage(int page) {
        this.page = page;
    }
    
    void nextPage() {
        setPage(getPage() + 1);
    }
    
    void prevPage() {
        setPage(getPage() - 1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teksArea = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quick Guide");

        teksArea.setColumns(20);
        teksArea.setLineWrap(true);
        teksArea.setRows(5);
        teksArea.setText("ACCOUNT DIALOG\nThe Account Dialog provides a method to select an account from the Chart of Accounts and add Accounting Dimensions, effectively creating a \"combination\" of dimensions that can be used to filter and sort accounting data in useful ways. The combination is added to the list in the {{#if: Account Combination|Account Combination|AccountCombination }} Window.\n\nhttp://www.adempiere.com/Account_Dialog\n");
        teksArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(teksArea);

        nextButton.setText("Next >>");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("<< Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        pageLabel.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(pageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(prevButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (getPage() < maks) {
            Random rand = new Random();
            int n = rand.nextInt(16) + 1;
            nextPage();
            setTextArea(n);
            setPageLabel(getPage());
        }
    }                                          

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (getPage() > min) {
            Random rand = new Random();
            int n = rand.nextInt(16) + 1;
            prevPage();
            setTextArea(n);
            setPageLabel(getPage());
        }
    }                                          

    
    
    public void setTextArea(int page) {
        switch(page) {
            case 1 :
                teksArea.setText("[ACCOUNT DIALOG]\nThe Account Dialog provides a method to select an account from the Chart of Accounts and add Accounting Dimensions, effectively creating a \"combination\" of dimensions that can be used to filter and sort accounting data in useful ways. The combination is added to the list in the {{#if: Account Combination|Account Combination|AccountCombination }} Window.\n" +
"\nhttp://www.adempiere.com/Account_Dialog");
                break;
            case 2 :
                teksArea.setText("[ACCOUNT DIALOG]\nThe Account Info window allows you to explore details of the accounting postings that occur as a result of the normal operation of the ERP system. For every transaction, there are multiple posts into the accounting tables and these can be filtered and sorted in a variety of ways using the Accounting Dimensions, time, document types, etc...\n" +
"\nhttp://www.adempiere.com/Account_Info");
                break;
            case 3 :
                teksArea.setText("ADempiere has a function to archive documents and reports for historical purposes. This is a useful feature if you need to record the state of a record or report that changes over time.\n" +
"\nhttp://www.adempiere.com/Archived_Documents");
                break;
            case 4 :
                teksArea.setText("[ASSET INFO]\nThe Asset Info window displays basic information on Assets and provides a quick method to search for them.\n" +
"\nhttp://www.adempiere.com/Asset_Info");
                break;
            case 5 :
                teksArea.setText("Every record can have a file attachment and notes added to it.\n" +
"\nhttp://www.adempiere.com/Attachment");
                break;
            case 6 :
                teksArea.setText("[BUSINESS PARTNER DIALOG]\nThe Business Partner Dialog provides a quick way to update existing or add new business partners to the database. The Dialog is accessed from the pop-up menu of Business Partner fields (see ID Fields).\n" +
"\nhttp://www.adempiere.com/Business_Partner_Dialog");
                break;
            case 7 :
                teksArea.setText("The Business Partner Info dialog displays information about business partners.\n" +
"\nhttp://www.adempiere.com/Business_Partner_Info");
                break;
            case 8 :
                teksArea.setText("[CALCULATOR TOOL]\nThe Calculator Tool is a small and simple calculator that provides simple math support to data entry.\n" +
"\nhttp://www.adempiere.com/Calculator_Tool");
                break;
            case 9 :
                teksArea.setText("[SCHEDULE INFO]\nThe Schedule Info window displays a calendar that shows assignments for resources.\n" +
"\nhttp://www.adempiere.com/Schedule_Info");
                break;
            case 10 :
                teksArea.setText("[TEXT EDITOR TOOL]\nThe Text Editor Tool provides a way to enter text and see how the text appears as HTML.\n" +
"\nhttp://www.adempiere.com/Text_Editor_Tool");
                break;
            case 11 :
                teksArea.setText("[ZOOM FUNCTION]\nThe Zoom function appears in the pop-up menu of fields that have a key or link to another table. The Zoom function will open the window associated with that table and display the record.\n" +
"\nhttp://www.adempiere.com/Zoom");
                break;
            case 12 :
                teksArea.setText("[MRP FUNCTION]\nThe MRP Info window displays information related to material resource planning filtered by specific products, attributes, planners, warehouses, resources and date ranges.\n" +
"\nhttp://www.adempiere.com/MRP_Info");
                break;
            case 13 :
                teksArea.setText("[THE ORDER INFO]\nThe Order Info window displays information related to customer and vendor Orders.\n" +
"\nhttp://www.adempiere.com/Order_Info");
                break;
            case 14 :
                teksArea.setText("[PAYMENT DIALOG]\nThe Payment Dialog provides a convenient way to complete a payment from a sales order or invoice.\n" +
"\nhttp://www.adempiere.com/Payment_Dialog");
                break;
            case 15 :
                teksArea.setText("[PAYMENT INFO WINDOW]\nThe Payment Info window displays information related to customer and vendor payments.\n" +
"\nhttp://www.adempiere.com/Payment_Info");
                break;    
            case 16 :
                teksArea.setText("[PRINT AND REVIEW]\nThere are four ways to print information from ADempiere: \n" +
"•	Print ( )\n" +
"•	Print Preview ( )\n" +
"•	Report ( )\n" +
"•	Report Processes ( )\n" +
"\nhttp://www.adempiere.com/Printing_and_Print_Preview");
                break;
            case 17 :
                teksArea.setText("[RESOURCE INFO]\nThe Resource Info window displays information related to Resources and their assignments.\n" +
"\nhttp://www.adempiere.com/Resource_Info");
            default :
                
                break;
        }
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton prevButton;
    private javax.swing.JTextArea teksArea;
    // End of variables declaration                   
}
