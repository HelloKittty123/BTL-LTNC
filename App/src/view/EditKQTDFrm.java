/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClLBController;
import controller.KQTDcontroller;
import controller.TDController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.CLB;
import model.KQTD;
import model.TD;

/**
 *
 * @author Dell
 */
public class EditKQTDFrm extends javax.swing.JDialog {

    /**
     * Creates new form EditCauThuFrm
     */
    
    int makqtd = 0;
    List<CLB> ClbList;
    List<KQTD> KQTDList;
    HomeFrm homeFrm;
    
    public EditKQTDFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cập nhật kết quả trận đấu");
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
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jtfThoiGian = new javax.swing.JTextField();
        jtfSVD = new javax.swing.JTextField();
        cbTranDau = new javax.swing.JComboBox<>();
        jlbThoiGian = new javax.swing.JLabel();
        jlbSVD = new javax.swing.JLabel();
        jlbTranDau = new javax.swing.JLabel();
        jlbCLB1 = new javax.swing.JLabel();
        jlbCLB2 = new javax.swing.JLabel();
        cbCLB2 = new javax.swing.JComboBox<>();
        cbCLB1 = new javax.swing.JComboBox<>();
        jtfBanThang2 = new javax.swing.JTextField();
        jtfBanThang1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KẾT QUẢ TRẬN ĐẤU");

        btnSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbTranDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTranDauActionPerformed(evt);
            }
        });

        jlbThoiGian.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbThoiGian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThoiGian.setText("THỜI GIAN THI ĐẤU (DD/MM/YYYY)");

        jlbSVD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSVD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSVD.setText("SÂN VẬN ĐỘNG");

        jlbTranDau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTranDau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTranDau.setText("TRẬN ĐẤU");

        jlbCLB1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCLB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbCLB1.setText("Tên CLB 1");

        jlbCLB2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbCLB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCLB2.setText("Tên CLB 2");

        cbCLB2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCLB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCLB2ActionPerformed(evt);
            }
        });

        cbCLB1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbCLB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCLB1ActionPerformed(evt);
            }
        });

        jtfBanThang2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfBanThang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBanThang2ActionPerformed(evt);
            }
        });

        jtfBanThang1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfSVD)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbCLB1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbCLB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jlbSVD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlbTranDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfBanThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jtfBanThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbTranDau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfThoiGian)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbCLB2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(jlbCLB2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSVD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSVD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbCLB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCLB1)
                    .addComponent(jtfBanThang2)
                    .addComponent(jtfBanThang1))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        List<CLB> CLBLst = ClLBController.findAll();
        List<TD> TDList = TDController.findAllTD();
        
        boolean isOK = true;
        boolean checkdoi = false;
        boolean checktran = false;
        int matran = 0, tentran = 0, madoi1 = 0, madoi2 = 0, banthang1 = 0, banthang2 = 0;
        Date thoigian = null;
        String tendoi1 = null, tendoi2 = null, SVD = null;

        if (cbTranDau.getSelectedIndex() >= 0) {
            tentran = Integer.valueOf(cbTranDau.getSelectedItem().toString());
            for(TD td : TDList) {
                if (td.getTentran() == tentran && KQTDcontroller.checkTentran(tentran)) {
                    matran = td.getMatran();
                    checktran = true;
                }
            }
            if(!checktran) {
                JOptionPane.showMessageDialog(rootPane,
                    "Trận đấu này đã tồn tại");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn trận đấu");
            isOK = false;
        }
        
        if (cbCLB1.getSelectedIndex() >= 0) {
            tendoi1 = cbCLB1.getSelectedItem().toString();
            for(CLB clb : CLBLst) {
                if(clb.getTendoi().equals(tendoi1)) {
                    madoi1 = clb.getMadoi();
                    if(!KQTDcontroller.checkCLB(madoi1, matran)) {
                        JOptionPane.showMessageDialog(rootPane,
                            "Đã có kết quả của đội 1 trong cùng vòng đấu");
                        isOK = false;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn CLB 1");
            isOK = false;
        }
        
       if (cbCLB2.getSelectedIndex() >= 0) {
            tendoi2 = cbCLB2.getSelectedItem().toString();
            for(CLB clb : CLBLst) {
                if(clb.getTendoi().equals(tendoi2) && !tendoi2.equals(tendoi1)) {
                    madoi2 = clb.getMadoi();
                    checkdoi = true;
                }
            }
            if(!checkdoi) {
                JOptionPane.showMessageDialog(rootPane,
                    "2 đội phải khác nhau");
                isOK = false;
            } else if(!KQTDcontroller.checkCLB(madoi2, matran)) {
                JOptionPane.showMessageDialog(rootPane,
                    "Đã có kết quả của đội 2 trong cùng vòng đấu");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn CLB 2");
            isOK = false;
        }
        
        if (jtfSVD.getText().length() > 0 && jtfSVD.getText() != null) {
            SVD = jtfSVD.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập tên sân vận động");
            isOK = false;
        }

        if (jtfThoiGian.getText().length() > 0 && jtfThoiGian.getText() != null) {
            try {
                thoigian = new SimpleDateFormat("dd/MM/yyyy").parse(jtfThoiGian.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane,
                    "Bạn nhập sai định dạng, thời gian thi đấu phải có định dạng dd/MM/yyyy");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập thời gian thi đấu");
            isOK = false;
        }

        if (jtfBanThang1.getText().length() > 0 && jtfBanThang1.getText() != null) {
            try {
                banthang1 = Integer.parseInt(jtfBanThang1.getText());
            } catch(Exception e) {
                JOptionPane.showMessageDialog(rootPane,
                "Số bàn thắng của CLB 1 phải là số không thể chứa kí tự khác");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập số bàn thắng của CLB 1");
            isOK = false;
        }
        
        if (jtfBanThang2.getText().length() > 0 && jtfBanThang2.getText() != null) {
            try {
                banthang2 = Integer.parseInt(jtfBanThang2.getText());
            } catch(Exception e) {
                JOptionPane.showMessageDialog(rootPane,
                "Số bàn thắng của CLB 2 phải là số không thể chứa kí tự khác");
                isOK = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập số bàn thắng của CLB 2");
            isOK = false;
        }

        if (isOK) {
            KQTD kqtd = new KQTD(makqtd, matran, madoi1, madoi2, banthang1, banthang2, SVD, thoigian);
           
            KQTDcontroller.update(kqtd);
            
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã cập nhật thành công kết quả trận đấu");
            
            this.dispose();
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbCLB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCLB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCLB1ActionPerformed

    private void cbCLB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCLB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCLB2ActionPerformed

    private void jtfBanThang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBanThang2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBanThang2ActionPerformed

    private void cbTranDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTranDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTranDauActionPerformed

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
            java.util.logging.Logger.getLogger(EditKQTDFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditKQTDFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditKQTDFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditKQTDFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditKQTDFrm dialog = new EditKQTDFrm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCLB1;
    private javax.swing.JComboBox<String> cbCLB2;
    private javax.swing.JComboBox<String> cbTranDau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCLB1;
    private javax.swing.JLabel jlbCLB2;
    private javax.swing.JLabel jlbSVD;
    private javax.swing.JLabel jlbThoiGian;
    private javax.swing.JLabel jlbTranDau;
    private javax.swing.JTextField jtfBanThang1;
    private javax.swing.JTextField jtfBanThang2;
    private javax.swing.JTextField jtfSVD;
    private javax.swing.JTextField jtfThoiGian;
    // End of variables declaration//GEN-END:variables

    void editKQTDData(KQTD kqtd) {
        showConbo1Data();
        showConbo2Data();
        ShowComboTDData();
        makqtd = kqtd.getMakqtd();
        cbTranDau.setSelectedItem(kqtd.getTentran());
        cbCLB1.setSelectedItem(kqtd.getTendoi1());
        cbCLB2.setSelectedItem(kqtd.getTendoi2());
        jtfSVD.setText(kqtd.getSVD());
        jtfThoiGian.setText(new SimpleDateFormat("dd/MM/yyyy").format(kqtd.getThoigianthidau()));
        jtfBanThang1.setText(String.valueOf(kqtd.getSobanthang1()));
        jtfBanThang2.setText(String.valueOf(kqtd.getSobanthang2()));
    }
    
    
    public void showConbo1Data() {
        List<CLB> CLBLst = ClLBController.findAll();
        cbCLB1.removeAllItems();
        CLBLst.forEach(clb -> {
            cbCLB1.addItem(clb.getTendoi());
        });
    }
    
    public void showConbo2Data() {
        List<CLB> CLBLst = ClLBController.findAll();
        cbCLB2.removeAllItems();
        CLBLst.forEach(clb -> {
            cbCLB2.addItem(clb.getTendoi());
        });
    }
    
    private void ShowComboTDData() {
        List<TD> TDList = TDController.findAllTD();
        cbTranDau.removeAllItems();
        TDList.forEach(td -> {
            cbTranDau.addItem(String.valueOf(td.getTentran()));
        });
    }
}

