/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import Index.index;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import loginPage.loginPage;

/**
 *
 * @author Atharva
 */
public class mngInv extends javax.swing.JFrame {

    /**
     * Creates new form mngInv
     */
    index ind = new index();
    private int prodID;
    private String prodName;
    private String deptName;
    private int qty;
    private Double basePr;
    private String dist;
    private String brand; 
    public mngInv() {
        this.setAlwaysOnTop(true);  //sets always on top
        this.setResizable(false);   //not resizable
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        fillTable();
    }
    public void fillTable(){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from inventoryview";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next()) {   
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    dist = rset.getString(6);
                    deptName = rset.getString(7);
                    m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,dist,deptName});
                }
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
    }
    public void fillWithQty(){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from orderview";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next()) {   
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    dist = rset.getString(6);
                    deptName = rset.getString(7);
                    m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,dist,deptName});
                }
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
    }
    public void fillWithID(String prodID){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from inventoryview where prodID = " + prodID;
                ResultSet rset = stmt.executeQuery(selectstmt);
                rset.next();
                prodName = rset.getString(2);
                deptName = rset.getString(7);
                qty = rset.getInt(4);
                basePr = rset.getDouble(5);
                dist = rset.getString(6);
                brand = rset.getString(3);
                m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,dist,deptName});
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
    }
    public void fillWithName(String prodName){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from inventoryview where lower(prodName) like '%" + prodName + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next())
                {
                    prodID = rset.getInt(1);
                    this.prodName = rset.getString(2);
                    deptName = rset.getString(7);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    dist = rset.getString(6);
                    brand = rset.getString(3);
                    m.addRow(new Object[]{prodID,this.prodName,brand,qty,basePr,dist,deptName});
                }
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
    }
    public void fillWithBrand(String brand){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from inventoryview where lower(brand) like '%" + brand + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next())
                {
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    this.brand = rset.getString(3);
                    deptName = rset.getString(7);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    dist = rset.getString(6);
                    m.addRow(new Object[]{prodID,prodName,this.brand,qty,basePr,dist,deptName});
                }
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
    }
    public void fillWithDept(String deptName){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select * from inventoryview where lower(deptName) like '%" + deptName + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next()) 
                {   
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    dist = rset.getString(6);
                    this.deptName = rset.getString(7);
                    m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,dist,this.deptName});
                }
        }
        catch(SQLException se)
        {
           System.out.println(se);
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

        search = new javax.swing.ButtonGroup();
        inID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        inDept = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inBrand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idBtn = new javax.swing.JRadioButton();
        nameBtn = new javax.swing.JRadioButton();
        brandBtn = new javax.swing.JRadioButton();
        deptBtn = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inQty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        invTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                int col = invTable.columnAtPoint(evt.getPoint());
                if(col==3){
                    fillWithQty();
                }
            }
        });
        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Brand", "Quantity", "Base Price", "Distributor", "Department Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(invTable);

        jLabel4.setText("Department:");

        inDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDeptActionPerformed(evt);
            }
        });

        jLabel3.setText("Brand:");

        jLabel1.setText("Product ID:");

        search.add(idBtn);
        idBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBtnActionPerformed(evt);
            }
        });

        search.add(nameBtn);
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });

        search.add(brandBtn);
        brandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandBtnActionPerformed(evt);
            }
        });

        search.add(deptBtn);
        deptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Quantity:");

        jButton3.setText("Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem2.setText("Sales");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Employees");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Logout");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(brandBtn)
                    .addComponent(idBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(nameBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inDept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(inQty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(inID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(nameBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(inBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(inDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addComponent(brandBtn)
                    .addComponent(deptBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Find Item:
        String prodID, prodName, brand, dept;
        prodID = inID.getText();
        prodName = inName.getText();
        brand = inBrand.getText();
        dept = inDept.getText();
        if(search.getSelection().getActionCommand()=="id")
        {
            fillWithID(prodID);
        }
        else if(search.getSelection().getActionCommand()=="brand")
        {
            fillWithBrand(brand);
        }
        else if(search.getSelection().getActionCommand()=="name")
        {
            fillWithName(prodName);
        }
        else if(search.getSelection().getActionCommand()=="dept")
        {
            fillWithDept(dept);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //to addEmp:
        JFrame frame = new addEmp();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //to managerPage:
        JFrame frame = new managerPage();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //to loginPage:
        JFrame frame = new loginPage();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void inDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inDeptActionPerformed

    private void idBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBtnActionPerformed
        //idBtn:
        idBtn.setActionCommand("id");
    }//GEN-LAST:event_idBtnActionPerformed

    private void nameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBtnActionPerformed
        //nameBtn:
        nameBtn.setActionCommand("name");
    }//GEN-LAST:event_nameBtnActionPerformed

    private void brandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandBtnActionPerformed
        //brandBtn:
        brandBtn.setActionCommand("brand");
    }//GEN-LAST:event_brandBtnActionPerformed

    private void deptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptBtnActionPerformed
        //deptBtn:
        deptBtn.setActionCommand("dept");
    }//GEN-LAST:event_deptBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //reset table:
        fillTable();
        inID.setText("");
        inBrand.setText("");
        inDept.setText("");
        inName.setText("");
        search.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Order:
        int qty;
        double basePr,amt;
        int prodId;
        String name;
        qty = Integer.parseInt((String)inQty.getText());
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        int row = invTable.getSelectedRow();
        prodId = (Integer)m.getValueAt(row,0);
        name = (String)m.getValueAt(row,1);
        name = name.toLowerCase();
        basePr = (Double)m.getValueAt(row,4);
        amt = basePr*qty;
        if(qty>100)
        {
            //discount 10%
            amt = amt-amt*0.1;
        }
        else if(qty>50)
        {
            //discount 5%
            amt = amt-amt*0.05;
        }
        else if(qty>30)
        {
            //discount 2%
            amt = amt-amt*0.02;
        }
        amt = -amt;
        try{
            String sQty="";
            name = (String)m.getValueAt(row,1);
            String temp = name.toLowerCase();
            Statement stmt = ind.getconn().createStatement();
            String selectstmt = "update inventory set quantity = quantity + "+qty+" where prodId = "+prodId;
            stmt.executeUpdate(selectstmt);
            fillTable();
            selectstmt = "select * from sales";
            ResultSet rset = stmt.executeQuery(selectstmt);
            while(rset.next()){
                String prodName = rset.getString(1).toLowerCase();
                if(rset.getString(2)==null)
                {
                    sQty = "";
                }
                else
                {
                    sQty = rset.getString(2);
                }
                if(prodName.equals(temp)&&sQty.equals(""))
                {
                    selectstmt = "update sales set rQty=rQty+"+qty+", amt=amt+"+amt+" where prodName = '"+name+"' and sQty is null";
                }
                else
                {
                    selectstmt = "insert into sales"+"(prodname,rqty,amt)"+" values('"+name+"',"+qty+","+amt+")";
                }
                stmt.executeUpdate(selectstmt);
            }
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
        inQty.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(mngInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mngInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mngInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mngInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mngInv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brandBtn;
    private javax.swing.JRadioButton deptBtn;
    private javax.swing.JRadioButton idBtn;
    private javax.swing.JTextField inBrand;
    private javax.swing.JTextField inDept;
    private javax.swing.JTextField inID;
    private javax.swing.JTextField inName;
    private javax.swing.JTextField inQty;
    private javax.swing.JTable invTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nameBtn;
    private javax.swing.ButtonGroup search;
    // End of variables declaration//GEN-END:variables
}
