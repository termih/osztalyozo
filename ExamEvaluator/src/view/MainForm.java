/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author resahh
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form RMainForm
     */
    public MainForm() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FMainPnl = new javax.swing.JTabbedPane();
        FGroupPnl = new javax.swing.JPanel();
        FGroupNorthPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FGroupEastPnl = new javax.swing.JPanel();
        FGroupSouthPnl = new javax.swing.JPanel();
        FGroupAddBtn = new javax.swing.JButton();
        FGroupEditBtn = new javax.swing.JButton();
        FGroupModifyBtn = new javax.swing.JButton();
        FGroupDeleteBtn = new javax.swing.JButton();
        FGroupWestPnl = new javax.swing.JPanel();
        FGroupCenterPnl = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        FGroupTf = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FGroupTbl = new javax.swing.JTable();
        FStudentPnl = new javax.swing.JPanel();
        FEvaluatePnl = new javax.swing.JPanel();
        FResultPnl = new javax.swing.JPanel();
        FSummaPnl = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        FGroupPnl.setLayout(new java.awt.BorderLayout());

        FGroupNorthPnl.setPreferredSize(new java.awt.Dimension(400, 40));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Csoportkezelés");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));
        FGroupNorthPnl.add(jLabel1);

        FGroupPnl.add(FGroupNorthPnl, java.awt.BorderLayout.NORTH);

        FGroupEastPnl.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout FGroupEastPnlLayout = new javax.swing.GroupLayout(FGroupEastPnl);
        FGroupEastPnl.setLayout(FGroupEastPnlLayout);
        FGroupEastPnlLayout.setHorizontalGroup(
            FGroupEastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        FGroupEastPnlLayout.setVerticalGroup(
            FGroupEastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        FGroupPnl.add(FGroupEastPnl, java.awt.BorderLayout.EAST);

        FGroupSouthPnl.setPreferredSize(new java.awt.Dimension(400, 60));

        FGroupAddBtn.setText("Hozzáadás");
        FGroupAddBtn.setPreferredSize(new java.awt.Dimension(105, 30));
        FGroupSouthPnl.add(FGroupAddBtn);

        FGroupEditBtn.setText("Szerkesztés");
        FGroupEditBtn.setPreferredSize(new java.awt.Dimension(105, 30));
        FGroupSouthPnl.add(FGroupEditBtn);

        FGroupModifyBtn.setText("Módosítás");
        FGroupModifyBtn.setPreferredSize(new java.awt.Dimension(105, 30));
        FGroupSouthPnl.add(FGroupModifyBtn);

        FGroupDeleteBtn.setText("Törlés");
        FGroupDeleteBtn.setPreferredSize(new java.awt.Dimension(105, 30));
        FGroupSouthPnl.add(FGroupDeleteBtn);

        FGroupPnl.add(FGroupSouthPnl, java.awt.BorderLayout.SOUTH);

        FGroupWestPnl.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout FGroupWestPnlLayout = new javax.swing.GroupLayout(FGroupWestPnl);
        FGroupWestPnl.setLayout(FGroupWestPnlLayout);
        FGroupWestPnlLayout.setHorizontalGroup(
            FGroupWestPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        FGroupWestPnlLayout.setVerticalGroup(
            FGroupWestPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        FGroupPnl.add(FGroupWestPnl, java.awt.BorderLayout.WEST);

        FGroupCenterPnl.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(762, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        FGroupCenterPnl.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel5.setPreferredSize(new java.awt.Dimension(70, 290));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        FGroupCenterPnl.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel6.setPreferredSize(new java.awt.Dimension(762, 60));

        FGroupTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FGroupTf.setPreferredSize(new java.awt.Dimension(500, 30));
        jPanel6.add(FGroupTf);

        FGroupCenterPnl.add(jPanel6, java.awt.BorderLayout.SOUTH);

        jPanel7.setPreferredSize(new java.awt.Dimension(90, 290));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        FGroupCenterPnl.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel8.setLayout(new java.awt.GridLayout(1, 1));

        FGroupTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(FGroupTbl);

        jPanel8.add(jScrollPane1);

        FGroupCenterPnl.add(jPanel8, java.awt.BorderLayout.CENTER);

        FGroupPnl.add(FGroupCenterPnl, java.awt.BorderLayout.CENTER);

        FMainPnl.addTab("Csoportok", FGroupPnl);

        javax.swing.GroupLayout FStudentPnlLayout = new javax.swing.GroupLayout(FStudentPnl);
        FStudentPnl.setLayout(FStudentPnlLayout);
        FStudentPnlLayout.setHorizontalGroup(
            FStudentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        FStudentPnlLayout.setVerticalGroup(
            FStudentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FMainPnl.addTab("Tanulók", FStudentPnl);

        javax.swing.GroupLayout FEvaluatePnlLayout = new javax.swing.GroupLayout(FEvaluatePnl);
        FEvaluatePnl.setLayout(FEvaluatePnlLayout);
        FEvaluatePnlLayout.setHorizontalGroup(
            FEvaluatePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        FEvaluatePnlLayout.setVerticalGroup(
            FEvaluatePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FMainPnl.addTab("Pontozás", FEvaluatePnl);

        javax.swing.GroupLayout FResultPnlLayout = new javax.swing.GroupLayout(FResultPnl);
        FResultPnl.setLayout(FResultPnlLayout);
        FResultPnlLayout.setHorizontalGroup(
            FResultPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        FResultPnlLayout.setVerticalGroup(
            FResultPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FMainPnl.addTab("Értékelés", FResultPnl);

        javax.swing.GroupLayout FSummaPnlLayout = new javax.swing.GroupLayout(FSummaPnl);
        FSummaPnl.setLayout(FSummaPnlLayout);
        FSummaPnlLayout.setHorizontalGroup(
            FSummaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        FSummaPnlLayout.setVerticalGroup(
            FSummaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        FMainPnl.addTab("Összesítés", FSummaPnl);

        getContentPane().add(FMainPnl);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FEvaluatePnl;
    private javax.swing.JButton FGroupAddBtn;
    private javax.swing.JPanel FGroupCenterPnl;
    private javax.swing.JButton FGroupDeleteBtn;
    private javax.swing.JPanel FGroupEastPnl;
    private javax.swing.JButton FGroupEditBtn;
    private javax.swing.JButton FGroupModifyBtn;
    private javax.swing.JPanel FGroupNorthPnl;
    private javax.swing.JPanel FGroupPnl;
    private javax.swing.JPanel FGroupSouthPnl;
    private javax.swing.JTable FGroupTbl;
    private javax.swing.JTextField FGroupTf;
    private javax.swing.JPanel FGroupWestPnl;
    private javax.swing.JTabbedPane FMainPnl;
    private javax.swing.JPanel FResultPnl;
    private javax.swing.JPanel FStudentPnl;
    private javax.swing.JPanel FSummaPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
