/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import loginPage.loginPage;


public class empInv extends javax.swing.JFrame {

    /**
     * Creates new form empInv
     */
    loginPage ind = new loginPage();
    private int prodID;
    private String prodName;
    private String deptName;
    private int qty;
    private Double basePr;
    private String brand;    
    public empInv() {
        this.setAlwaysOnTop(true);  //sets always on top
        this.setResizable(false);   //not resizable
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fillTable();
    }
    
    public void fillTable(){
        DefaultTableModel m = (DefaultTableModel) invTable.getModel();
        m.setRowCount(0);
        try{
                Statement stmt = ind.getconn().createStatement();
                String selectstmt = "select prodid,prodname,brand,quantity,baseprice,deptname from inventoryview";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next()) {   
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    deptName = rset.getString(6);
                    m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,deptName});
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
                String selectstmt = "select prodid,prodname,brand,quantity,baseprice,deptname from inventoryview where prodID = " + prodID;
                ResultSet rset = stmt.executeQuery(selectstmt);
                rset.next();
                prodName = rset.getString(2);                
                brand = rset.getString(3);
                qty = rset.getInt(4);
                basePr = rset.getDouble(5);
                deptName = rset.getString(6);
                m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,deptName});
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
                String selectstmt = "select prodid,prodname,brand,quantity,baseprice,deptname from inventoryview where lower(prodName) like '%" + prodName + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next())
                {
                    prodID = rset.getInt(1);
                    this.prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    deptName = rset.getString(6);
                    m.addRow(new Object[]{prodID,this.prodName,brand,qty,basePr,deptName});
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
                String selectstmt = "select prodid,prodname,brand,quantity,baseprice,deptname from inventoryview where lower(brand) like '%" + brand + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next())
                {
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    this.brand = rset.getString(3);                    
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    deptName = rset.getString(6);
                    m.addRow(new Object[]{prodID,prodName,this.brand,qty,basePr,deptName});
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
                String selectstmt = "select prodid,prodname,brand,quantity,baseprice,deptname from inventoryview where lower(deptName) like '%" + deptName + "%'";
                ResultSet rset = stmt.executeQuery(selectstmt);
                while(rset.next()) 
                {   
                    prodID = rset.getInt(1);
                    prodName = rset.getString(2);
                    brand = rset.getString(3);
                    qty = rset.getInt(4);
                    basePr = rset.getDouble(5);
                    this.deptName = rset.getString(6);
                    m.addRow(new Object[]{prodID,prodName,brand,qty,basePr,this.deptName});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        inID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idBtn = new javax.swing.JRadioButton();
        inDept = new javax.swing.JTextField();
        nameBtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        brandBtn = new javax.swing.JRadioButton();
        inBrand = new javax.swing.JTextField();
        deptBtn = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        checkoutMenu = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Brand", "Quantity", "Base Price", "Department Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(invTable);

        jLabel1.setText("Product ID:");

        inID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Department:");

        search.add(idBtn);
        idBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBtnActionPerformed(evt);
            }
        });

        inDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDeptActionPerformed(evt);
            }
        });

        search.add(nameBtn);
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Brand:");

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

        jMenu1.setText("Menu");

        checkoutMenu.setText("Checkout");
        checkoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutMenuActionPerformed(evt);
            }
        });
        jMenu1.add(checkoutMenu);

        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inDept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutMenuActionPerformed
        //to checkout page:
        JFrame frame = new Checkout();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_checkoutMenuActionPerformed

    private void inIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //reset table:
        fillTable();
        inID.setText("");
        inBrand.setText("");
        inDept.setText("");
        inName.setText("");
        search.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Find Item:
        String prodID, prodName, brand, dept;
        prodID = inID.getText();
        prodName = inName.getText().toLowerCase();
        brand = inBrand.getText().toLowerCase();
        dept = inDept.getText().toLowerCase();
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
        inID.setText("");
        inBrand.setText("");            
        inName.setText("");
        inDept.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBtnActionPerformed
        //idBtn:
        idBtn.setActionCommand("id");
    }//GEN-LAST:event_idBtnActionPerformed

    private void inDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inDeptActionPerformed

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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //to loginPage:
        JFrame frame = new loginPage();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(empInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empInv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brandBtn;
    private javax.swing.JMenuItem checkoutMenu;
    private javax.swing.JRadioButton deptBtn;
    private javax.swing.JRadioButton idBtn;
    private javax.swing.JTextField inBrand;
    private javax.swing.JTextField inDept;
    private javax.swing.JTextField inID;
    private javax.swing.JTextField inName;
    private javax.swing.JTable invTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nameBtn;
    private javax.swing.ButtonGroup search;
    // End of variables declaration//GEN-END:variables
}
