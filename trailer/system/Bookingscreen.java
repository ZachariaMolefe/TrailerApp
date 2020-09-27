/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailer.system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DefaultAccount
 */
public class Bookingscreen extends javax.swing.JFrame {

    /**
     * Creates new form Bookingscreen
     */
    public Bookingscreen() {
        
        initComponents();
         
       
        cmbChoose.enable(false);
            
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
       
       
        REdate();
        COLdate();
        cmbnum.addActionListener(cmbChoose);
    }
    
    public double price(){
        double price = 0.00;
        
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                price = 200.00;
                break;
            case 2:
                price = 200.00;
                break;
            case 3:
                price = 200.00;
                break;
            case 4:
                price = 200.00;
                break;
            case 5:
                price = 200.00;
                break;
            case 6:
                price = 200.00;
                break;
            case 7:
                price = 200.00;
                break;
            case 8:
                price = 200.00;
                break;
            case 9:
                price = 200.00;
                break;
            case 10:
                price = 200.00;
                break;
            case 11:
                price = 200.00;
                break;
            case 12:
                price = 200.00;
                break;
            case 13:
                price = 200.00;
                break;
            case 14:
                price = 200.00;
                break;
            default:
                break;
        }
        return price;
    }
    
    public double price2(){
        double price = 0.00;
        
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                price = 200.00;
                break;
            case 2:
                price = 200.00;
                break;
            case 3:
                price = 200.00;
                break;
            case 4:
                price = 200.00;
                break;
            case 5:
                price = 200.00;
                break;
            case 6:
                price = 200.00;
                break;
            case 7:
                price = 200.00;
                break;
            case 8:
                price = 200.00;
                break;
            case 9:
                price = 200.00;
                break;
            case 10:
                price = 200.00;
                break;
            case 11:
                price = 200.00;
                break;
            case 12:
                price = 200.00;
                break;
            case 13:
                price = 200.00;
                break;
            case 14:
                price = 200.00;
                break;
            default:
                break;
        }
        return price;
    }
    
    public double calPrice(){
        int feenum = cmbdate.getSelectedIndex() - cmbdate1.getSelectedIndex();
        double calPrice = 0.00;
        double usagefee = 15.00;
        if(cmbnum.getSelectedItem() == "1")
            calPrice = calPrice + price()+usagefee;
        if(cmbnum.getSelectedItem()== "2")
            calPrice = calPrice + (price()*2) + usagefee;
        if(feenum >=3 &&feenum < 10)
            calPrice = calPrice+20;
        if(feenum >=10)
            calPrice = calPrice + 50;
        return calPrice;
    }
    
    
    public void PicChange(){
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel2.setText("");
                break;
        }
        
    }
    public void PicChange2(){
        switch (cmbChoose.getSelectedIndex()) {
            case 1:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel2.setText("");
                break;
        }
        
    }
    
    public void COLdate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        for(int k = 0; k<= 15; k++){
            cmbdate1.addItem(year+"-"+(month)+"-"+(day+k));
        }
        
    }
    
    public void REdate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        for(int k = 0; k<= 15; k++){
            cmbdate.addItem(year+"-"+(month)+"-"+(day+k));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbChoose = new javax.swing.JComboBox<>();
        lblChoose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbdate = new javax.swing.JComboBox<>();
        cmbnum = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbdate1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("MAKE BOOKINGS");

        jLabel3.setText("CONTACT NUMBERS");

        jLabel4.setText("CHOOSE A TRAILER");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 236, 330));

        jLabel2.setText(".");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("NUMBER OF TRAILERS");

        cmbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        cmbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseActionPerformed(evt);
            }
        });

        lblChoose.setText("CHOOSE A TRAILER");

        jLabel6.setText("RETURN DATE");

        cmbdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY-M-D" }));
        cmbdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdateActionPerformed(evt);
            }
        });

        cmbnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Number of Trailers--", "1", "2" }));
        cmbnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnumActionPerformed(evt);
            }
        });

        jLabel7.setText("COLLECTION DATE");

        cmbdate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY-M-D" }));
        cmbdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdate1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Book");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(lblChoose)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbnum, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoose)
                            .addComponent(cmbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton3)
                            .addComponent(jButton6))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1010, 470));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.setToolTipText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("-");
        jButton2.setToolTipText("Minimize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String number = jTextField1.getText();
        String trailer;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        
        //SimpleDateFormat datefor = new SimpleDateFormat("yyyy-MM-dd");
        //String date = datefor.format(dateChooserCombo1.getDateFormat());
       
        String messag = cmbChoose.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String message = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
             //   + messag
                +"Usage Fee : R15.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
        
        String message2 = "Please call again";
        
         if(cmbnum.getSelectedIndex() == 1){
            jTextArea1.setText(message + message2);
        }else if(cmbnum.getSelectedIndex() == 2){
            
        //String messag = cmbChoose.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String message1 = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
                + messag
                +"Usage Fee : R15.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
                jTextArea1.setText(message1 + message2);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "LogoutSucessful");
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseActionPerformed
        // TODO add your handling code here:
        PicChange2();
    }//GEN-LAST:event_cmbChooseActionPerformed

    private void cmbnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnumActionPerformed
        // TODO add your handling code here:
        if(cmbnum.getSelectedIndex()==2)
            cmbChoose.enable(true);
    }//GEN-LAST:event_cmbnumActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        PicChange();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cmbdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdateActionPerformed

    private void cmbdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdate1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        cmbChoose.setSelectedIndex(0);
        cmbdate.setSelectedIndex(0);
        cmbdate1.setSelectedIndex(0);
        cmbnum.setSelectedIndex(0);
        jTextArea1.setText("");
        jComboBox1.setSelectedIndex(0);
        jLabel2.setText(".");
    }//GEN-LAST:event_jButton5ActionPerformed

    public void write2(){
        try
        {
            FileWriter writer = new FileWriter(new File("C:\\Users\\NWUUSER\\Desktop\\Ra Vaya\\Trailer System\\src\\trailer\\system\\Process.txt"),true);
            writer.write("\n"+jTextField1.getText()+","+"CT");
            writer.close();
        }catch(IOException exc)
        {
            JOptionPane.showMessageDialog(null,"Error creating the file");
        }
    }
    
    public void write(){
        try
        {
            
            FileWriter writer = new FileWriter(new File("C:\\Users\\NWUUSER\\Desktop\\Ra Vaya\\Trailer System\\src\\trailer\\system\\Orders.txt"),true);
            int k = 1;
            String client = "CT";
            while(k==1){
                client = client + k;
                if(cmbnum.getSelectedItem()=="1")
                    writer.write("\n"+jTextField1.getText() +"\t\t" +client +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+"N/A");
                if(cmbnum.getSelectedItem()=="2")
                    writer.write("\n"+jTextField1.getText() +"\t\t" +client +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+cmbChoose.getSelectedItem());
           
                k++;
             }
             writer.close();
        }catch(IOException exc)
        {
            JOptionPane.showMessageDialog(null,"Error creating the file");
        }
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        write();
        write2();
        
        JOptionPane.showMessageDialog(null, "Trailer(s) booked");
        jTextField1.setText("");
        cmbChoose.setSelectedIndex(0);
        cmbdate.setSelectedIndex(0);
        cmbdate1.setSelectedIndex(0);
        cmbnum.setSelectedIndex(0);
        jTextArea1.setText("");
        jComboBox1.setSelectedIndex(0);
        jLabel2.setText(".");
    }//GEN-LAST:event_jButton6ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookingscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbChoose;
    private javax.swing.JComboBox<String> cmbdate;
    private javax.swing.JComboBox<String> cmbdate1;
    private javax.swing.JComboBox<String> cmbnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblChoose;
    // End of variables declaration//GEN-END:variables
}
