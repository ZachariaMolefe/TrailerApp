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
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author DefaultAccount
 */
public class BookingAdmin extends javax.swing.JFrame {

    /**
     * Creates new form BookingAdmin
     */
    public BookingAdmin() {
        
        initComponents();
        //jButton3.setVisible(true); 
     //   SimpleDateFormat sdf = new SimpleDateFormat();
       // sdf.toString();
        REdate();
        COLdate();
        cmb1.enable(false);
        cmb2.enable(false);
        cmb3.enable(false);
        cmb4.enable(false);
        choose();
      
        
    }
    /**Methods
     
     
     
     */
    
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
        double calPrice = 0.00;
        double usagefee = 30.00;
        int feenum = cmbdate.getSelectedIndex() - cmbdate1.getSelectedIndex();
        if(cmbnum.getSelectedItem() == "1")
            calPrice = calPrice + price()+usagefee;
        if(cmbnum.getSelectedItem()== "2")
            calPrice = calPrice + (price()*2) + usagefee;
        if(cmbnum.getSelectedItem()== "3")
            calPrice = calPrice + (price()*3) + usagefee;
        if(cmbnum.getSelectedItem()== "4")
            calPrice = calPrice + (price()*4) + usagefee;
        if(cmbnum.getSelectedItem()== "5")
            calPrice = calPrice + (price()*5) + usagefee;
        if(feenum >=3 &&feenum < 10)
            calPrice = calPrice+20;
        if(feenum >=10 && feenum < 20)
            calPrice = calPrice + 50;
        if(feenum >=20)
            calPrice = calPrice + 100;
        return calPrice;
    }
    
    public void PicChange(){
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel6.setText("");
                break;
        }
        
    }
    public void PicChange2(){
        switch (cmb1.getSelectedIndex()) {
            case 1:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel6.setText("");
                break;
        }
        
    }
    public void PicChange3(){
        switch (cmb2.getSelectedIndex()) {
            case 1:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel6.setText("");
                break;
        }
        
    }
    public void PicChange4(){
        switch (cmb3.getSelectedIndex()) {
            case 1:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel6.setText("");
                break;
        }
        
    }
    public void PicChange5(){
        switch (cmb4.getSelectedIndex()) {
            case 1:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_car_transporter.jpg")));
                break;
            case 2:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_ton_trailer_mesh.jpg")));
                break;
            case 3:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_live_stock.jpg")));
                break;
            case 4:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_ton_trailer_mesh1.jpg")));
                break;
            case 5:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_quarter_ton_trailer.jpg")));
                break;
            case 6:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closedtrailer.jpg")));
                break;
            case 7:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horse_box_trailer.jpg")));
                break;
            case 8:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/luggage_trailer.jpg")));
                break;
            case 9:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipper_trailer.jpg")));
                break;
            case 10:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_doublebike.jpg")));
                break;
            case 11:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_halfton.jpg")));
                break;
            case 12:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_singlebike.jpg")));
                break;
            case 13:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_superbike.jpg")));
                break;
            case 14:
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trailer_lrg_twotone_trailercar-1.jpg")));
                break;
            default:
                jLabel6.setText("");
                break;
        }
        
    }
            
    
    public void choose(){
        switch (cmbnum.getSelectedIndex()) {
            case 1:
                cmb1.enable(false);
                cmb2.enable(false);
                cmb3.enable(false);
                cmb4.enable(false);
                break;
            case 2:
                cmb1.enable(true);
                //lbl1.setVisible(true);
                cmb2.enable(false);
                cmb3.enable(false);
                cmb4.enable(false);
                break;
            case 3:
                cmb1.enable(true);
                cmb2.enable(true);
                //lbl1.setVisible(true);
                //lbl2.setVisible(true);
                cmb3.enable(false);
                cmb4.enable(false);
                break;
            case 4:
                cmb1.enable(true);
                cmb2.enable(true);
                cmb3.enable(true);
                //lbl1.setVisible(true);
                //lbl2.setVisible(true);
                //lbl3.setVisible(true);
                cmb4.enable(false);
                
                break;
            case 5:
                cmb1.enable(true);
                cmb2.enable(true);
                cmb3.enable(true);
                cmb4.enable(true);
                //lbl1.setVisible(true);
                //lbl2.setVisible(true);
                //lbl3.setVisible(true);
                //lbl4.setVisible(true);
                break;
            default:
                break;
        }
    }
    
    public void COLdate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int month2 = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        for(int k = 0; k<= 30; k++){
            cmbdate1.addItem(year+"-"+(month2)+"-"+(day+k));
        }
    }
    
    public void REdate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        for(int k = 0; k<= 30; k++){
            cmbdate.addItem(year+"-"+(+month)+"-"+(day+k));
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
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        cmb3 = new javax.swing.JComboBox<>();
        cmb2 = new javax.swing.JComboBox<>();
        lbl2 = new javax.swing.JLabel();
        cmb4 = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbnum = new javax.swing.JComboBox<>();
        cmbdate = new javax.swing.JComboBox<>();
        cmbdate1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("MAKE BOOKINGS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setText("CONTACT NUMBERS OF CLIENT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 89, 164, -1));

        jLabel4.setText("CHOOSE A TRAILER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 165, 164, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 236, 330));

        jLabel6.setText(".");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 60, 600, 353));

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, -1, -1));

        jLabel5.setText("NUMBER OF TRAILERS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 203, 164, -1));

        lbl1.setText("CHOOSE A TRAILER");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 206, -1, -1));

        lbl3.setText("CHOOSE A TRAILER");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 282, -1, -1));

        cmb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        cmb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 279, 164, -1));

        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 241, 164, -1));

        lbl2.setText("CHOOSE A TRAILER");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, -1, -1));

        cmb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a trailer--", "1 Ton Car Trailer", "1 Ton Trailer Mesh", "2 Ton Trailer Livestock", "2 Ton Trailer Mesh", "3/4 Ton Trailer", "Closed Trailer", "Horse Trailer", "Luggage Trailer", "Tipper Trailer", "Large Doublebike Trailer", "Large Halfton Trailer", "Large Singlebike Trailer", "Large Superbike Trailer", "Large Twotone Trailer" }));
        cmb4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb4ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 317, 164, -1));

        lbl4.setText("CHOOSE A TRAILER");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setText("RETURN DATE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 396, -1, -1));

        cmbnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Number of trailers--", "1", "2", "3", "4", "5" }));
        cmbnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnumActionPerformed(evt);
            }
        });
        jPanel1.add(cmbnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 127, -1, -1));

        cmbdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY-M-D" }));
        jPanel1.add(cmbdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 393, 164, -1));

        cmbdate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY-M-D" }));
        jPanel1.add(cmbdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 355, 164, -1));

        jLabel2.setText("COLLECTION DATE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 358, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, -1, -1));

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Book");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1060, 470));

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("-");
        jButton2.setToolTipText("Minimize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**free space
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
    
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
       
        String messag = cmb1.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String messag1 = cmb2.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String messag2 = cmb3.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String messag3 = cmb4.getSelectedItem().toString() + "\n" + "Price :R " + price()+"\n";
        String message = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
             //   + messag
                +"Admin Fee : R30.00" + "\n"
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
                +"Admin Fee : R30.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
                jTextArea1.setText(message1 + message2);
        }else if(cmbnum.getSelectedIndex() == 3){
            String message1 = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
                + messag
                + messag1
                +"Admin Fee : R30.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
                jTextArea1.setText(message1 + message2);
        }else if(cmbnum.getSelectedIndex() == 4){
            String message1 = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
                + messag
                + messag1
                + messag2
                +"Admin Fee : R30.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
                jTextArea1.setText(message1 + message2);
        }else if(cmbnum.getSelectedIndex() == 5){
            String message1 = "Thank you for your order" + "\n" +date + "\n"  +"Your Number : " + number+ "\n"+ "**********************************"+"\nYour Bookings"
                   +"\n\n" + jComboBox1.getSelectedItem().toString() +"\n"+"Price :R" + price() + "\n" 
                + messag
                + messag1
                + messag2
                +messag3
                +"Admin Fee : R30.00" + "\n"
                + "Total Price : R" + calPrice() + "\n\n"
                + "Collection date : " + cmbdate1.getSelectedItem()+ "\n"
                + "Return date : " + cmbdate.getSelectedItem() + "\n"
                + "Pay at the receptionist at " + cmbdate1.getSelectedItem() +"\n"
                + "******************************************" + "\n\n"
                ;
                jTextArea1.setText(message1 + message2);
        }else if(cmbnum.getSelectedIndex() == 3){
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "LogoutSucessful");
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnumActionPerformed
        // TODO add your handling code here:
        choose();
    }//GEN-LAST:event_cmbnumActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        PicChange();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        // TODO add your handling code here:
        PicChange2();
    }//GEN-LAST:event_cmb1ActionPerformed

    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed
        // TODO add your handling code here:
        PicChange3();
    }//GEN-LAST:event_cmb2ActionPerformed

    private void cmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb3ActionPerformed
        // TODO add your handling code here:
        PicChange4();
    }//GEN-LAST:event_cmb3ActionPerformed

    private void cmb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb4ActionPerformed
        // TODO add your handling code here:
        PicChange5();
    }//GEN-LAST:event_cmb4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        cmb1.setSelectedIndex(0);
        cmb2.setSelectedIndex(0);
        cmb3.setSelectedIndex(0);
        cmb4.setSelectedIndex(0);
        cmbdate.setSelectedIndex(0);
        cmbdate1.setSelectedIndex(0);
        cmbnum.setSelectedIndex(0);
        jTextArea1.setText("");
        jComboBox1.setSelectedIndex(0);
        jLabel6.setText(".");
    }//GEN-LAST:event_jButton5ActionPerformed

    public void write2(){
        try
        {
            FileWriter writer = new FileWriter(new File("C:\\Users\\NWUUSER\\Desktop\\Ra Vaya\\Trailer System\\src\\trailer\\system\\Process.txt"),true);
            writer.write("\n"+jTextField1.getText()+","+"AD");
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
            if(cmbnum.getSelectedItem()=="1")
                writer.write("\n"+jTextField1.getText() +"\t\t" +"AD102" +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem());
            if(cmbnum.getSelectedItem()=="2")
                writer.write("\n"+jTextField1.getText() +"\t\t" +"AD102" +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+cmb1.getSelectedItem());
            if(cmbnum.getSelectedItem()=="3")
                writer.write("\n"+jTextField1.getText() +"\t\t" +"AD102" +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+cmb1.getSelectedItem()+" & "+cmb2.getSelectedItem());
            if(cmbnum.getSelectedItem()=="4")
                writer.write("\n"+jTextField1.getText() +"\t\t" +"AD102" +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+cmb1.getSelectedItem()+" & "+cmb2.getSelectedItem()+" & "+cmb3.getSelectedItem());
            if(cmbnum.getSelectedItem()=="5")
                writer.write("\n"+jTextField1.getText() +"\t\t" +"AD102" +"\t\t" +"R"+calPrice()+"\t\t"+ cmbdate1.getSelectedItem().toString()+"\t\t"+cmbdate.getSelectedItem().toString()+"\t\t"+jComboBox1.getSelectedItem()+" & "+cmb1.getSelectedItem()+" & "+cmb2.getSelectedItem()+" & "+cmb3.getSelectedItem()+" & "+cmb4.getSelectedItem());
            writer.close();
            
        }catch(IOException exc)
        {
            JOptionPane.showMessageDialog(null,"Error creating the file");
        }
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        write();
        write2();
        JOptionPane.showMessageDialog(null,"Trailer(s) booked");
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        cmb1.setSelectedIndex(0);
        cmb2.setSelectedIndex(0);
        cmb3.setSelectedIndex(0);
        cmb4.setSelectedIndex(0);
        cmbdate.setSelectedIndex(0);
        cmbdate1.setSelectedIndex(0);
        cmbnum.setSelectedIndex(0);
        jTextArea1.setText("");
        jComboBox1.setSelectedIndex(0);
        jLabel6.setText(".");
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
            java.util.logging.Logger.getLogger(BookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JComboBox<String> cmb3;
    private javax.swing.JComboBox<String> cmb4;
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
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    // End of variables declaration//GEN-END:variables
}
