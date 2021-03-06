/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HIEPATK
 */
public class FixWord extends javax.swing.JFrame {

    /**
     * Creates new form FixWord
     */
    public FixWord() {
        initComponents();
        Toolkit toolkit = this.getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setLocation(size.width/2 - this.getWidth()/2,
                size.height/2 - this.getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descreption1 = new java.awt.Label();
        descreption2 = new java.awt.Label();
        descreption3 = new java.awt.Label();
        descreption4 = new java.awt.Label();
        OkP = new javax.swing.JToggleButton();
        CancelP = new javax.swing.JToggleButton();
        word = new javax.swing.JTextField();
        wordFix = new javax.swing.JTextField();
        meanFix = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        descreption1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        descreption1.setText("FIXED WORD");

        descreption2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descreption2.setText("Word");

        descreption3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descreption3.setText("Word after fixed");

        descreption4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descreption4.setText("Meaning after fixed");

        OkP.setText("OK");
        OkP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkPActionPerformed(evt);
            }
        });

        CancelP.setText("Cancel");
        CancelP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descreption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descreption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descreption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(OkP)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(word)
                    .addComponent(wordFix)
                    .addComponent(meanFix, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelP)
                        .addGap(47, 47, 47)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descreption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descreption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(wordFix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(meanFix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelP)
                            .addComponent(OkP)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descreption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descreption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descreption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelPActionPerformed
        try {
            // TODO add your handling code here:
            DictionanryApplication DA = new DictionanryApplication();
            this.dispose();
            DA.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FixWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelPActionPerformed

    private void OkPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkPActionPerformed
        try {
            // TODO add your handling code here:
            DictionanryApplication DA = new DictionanryApplication();
            DictionanryApplication.hashMap.remove(word.getText());
            if("".equals(wordFix.getText())){
                DictionanryApplication.hashMap.put(word.getText(), meanFix.getText());
            }
            else{
                DictionanryApplication.hashMap.put(wordFix.getText(), meanFix.getText());
                DA.model.addElement(wordFix.getText());
                DA.model.removeElement(word.getText());
            }
            FileOutputStream fout = new FileOutputStream("dictionaries.txt");
                try (BufferedOutputStream bout = new BufferedOutputStream(fout)) {
                    Set set = DictionanryApplication.hashMap.entrySet();
                    Iterator iterator = set.iterator();
                    while(iterator.hasNext()) {
                        Map.Entry mentry = (Map.Entry)iterator.next();
                        String line = mentry.getKey() + "\t" + mentry.getValue();
                        bout.write(line.getBytes());
                        bout.write(System.lineSeparator().getBytes());
                    }
                }
            this.dispose();
            DA.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FixWord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(AddWord.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_OkPActionPerformed

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
            java.util.logging.Logger.getLogger(FixWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FixWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FixWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FixWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FixWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CancelP;
    private javax.swing.JToggleButton OkP;
    private java.awt.Label descreption1;
    private java.awt.Label descreption2;
    private java.awt.Label descreption3;
    private java.awt.Label descreption4;
    private javax.swing.JTextField meanFix;
    private javax.swing.JTextField word;
    private javax.swing.JTextField wordFix;
    // End of variables declaration//GEN-END:variables

}
