/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.employeeHistory;
import model.employeeinfo;


/**
 *
 * @author dhruvilsuthar
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    employeeHistory history;
    public UpdateJPanel(employeeHistory history) {
        initComponents();
         this.history = history;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblemp = new javax.swing.JTable();
        lblPosition = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        lblEID = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtSdate = new javax.swing.JTextField();
        lblSdate = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        lblTeam = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        btnl = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btndel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Phone no.", "Name", "Position"
            }
        ));
        tblemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblemp);

        lblPosition.setText("Position Title:");

        lblPhone.setText("Cell Phone Number:");

        lblEmail.setText("Email:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        lblEID.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblSdate.setText("Start Date:");

        lblLevel.setText("Level:");

        lblTeam.setText("Team Info:");

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        btnl.setText("Update ");
        btnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlActionPerformed(evt);
            }
        });

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPhone)
                                    .addComponent(lblPosition)
                                    .addComponent(lblTeam)
                                    .addComponent(lblLevel)
                                    .addComponent(lblSdate)
                                    .addComponent(lblGender)
                                    .addComponent(lblAge)
                                    .addComponent(lblEID)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtEID)
                                    .addComponent(txtAge)
                                    .addComponent(txtGender)
                                    .addComponent(txtSdate)
                                    .addComponent(txtLevel)
                                    .addComponent(txtTeam)
                                    .addComponent(txtPosition)
                                    .addComponent(txtPhone)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnl)
                                .addGap(18, 18, 18)
                                .addComponent(btndel)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndel)
                    .addComponent(btnl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEID)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSdate)
                            .addComponent(txtSdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeam)
                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempMouseClicked
        // TODO add your handling code here:
       int SelectedRowIndex = tblemp.getSelectedRow();
       if (SelectedRowIndex < 0){
           JOptionPane.showMessageDialog(this, "Please select a row to view");
           return;
           
       }
       DefaultTableModel model = (DefaultTableModel) tblemp.getModel();
               employeeinfo Selectedemployee = (employeeinfo)model.getValueAt(SelectedRowIndex, 0);
              
             txtName.setText(Selectedemployee.getName());
             txtEID.setText(String.valueOf(Selectedemployee.getE_id()));
             txtAge.setText(String.valueOf(Selectedemployee.getAge()));
             txtGender.setText(Selectedemployee.getGender());
             txtSdate.setText(Selectedemployee.getSdate());
             txtLevel.setText(String.valueOf(Selectedemployee.getLevel()));
             txtTeam.setText(Selectedemployee.getTeam());
             txtPosition.setText(Selectedemployee.getPosition());
             txtPhone.setText(Selectedemployee.getPhone());
             txtEmail.setText(Selectedemployee.getEmail());
             File f2 = CreateJPanel.f1;
             lblimg.setIcon(new ImageIcon(f2.toString()));
             
        
        
    
    
    
 
    
    
    


    }//GEN-LAST:event_tblempMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void btnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemp.getSelectedRow();
        DefaultTableModel tbl1 = (DefaultTableModel)tblemp.getModel();
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "select Row First");
            return;
        }
            
        String Phone = txtPhone.getText();
        String Name = txtName.getText();
        String Position = txtPosition.getText();
        
        tbl1.setValueAt(Phone, tblemp.getSelectedRow(), 0);
        tbl1.setValueAt(Name, tblemp.getSelectedRow(), 1);
        tbl1.setValueAt(Position, tblemp.getSelectedRow(), 2);
        

        JOptionPane.showMessageDialog(this, "updated");
        
        
        
        
        
    }//GEN-LAST:event_btnlActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        String query = txtsearch.getText().toLowerCase();
        filter(query);
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemp.getSelectedRow();
        DefaultTableModel tbl1 = (DefaultTableModel) tblemp.getModel();
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "select row");
            return;
            
            
        }
        employeeinfo selectedemp = (employeeinfo) tbl1.getValueAt(selectedRowIndex, 0);
        history.deleteemp(selectedemp);
        JOptionPane.showMessageDialog(this, "deleted");
        populateTable();
       
    }//GEN-LAST:event_btndelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSdate;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblimg;
    private javax.swing.JTable tblemp;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSdate;
    private javax.swing.JTextField txtTeam;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        
        DefaultTableModel tbl1 = (DefaultTableModel) tblemp.getModel();
        tbl1.setRowCount(0);
        for(employeeinfo ei : history.getHistory()){
            Object[] row = new Object[3];
            row[0] = ei;
            row[1] = ei.getName();
            row[2] = ei.getPosition();
            
            tbl1.addRow(row);
            
            
        }
      
    }

    private void filter(String query) {
        DefaultTableModel tbl1 = (DefaultTableModel) tblemp.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tbl1);
        tblemp.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}