
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Win
 */
public class ChooserKullanimi extends javax.swing.JFrame {

    /**
     * Creates new form ChooserKullanimi
     */
    public ChooserKullanimi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dosya = new javax.swing.JButton();
        renk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dosya.setText("Dosya");
        dosya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaActionPerformed(evt);
            }
        });

        renk.setText("Renk Değiştir");
        renk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkActionPerformed(evt);
            }
        });

        tArea.setColumns(20);
        tArea.setRows(5);
        jScrollPane1.setViewportView(tArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(dosya)
                        .addGap(82, 82, 82)
                        .addComponent(renk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosya)
                    .addComponent(renk))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaActionPerformed
        JFileChooser fc = new JFileChooser();
        int i = fc.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String icerik = "";
            try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
                while (scanner.hasNextLine()) {
                    icerik += scanner.nextLine() + "\n";

                }
                tArea.setText(icerik);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ChooserKullanimi.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_dosyaActionPerformed

    private void renkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkActionPerformed
        Color renk = JColorChooser.showDialog(this, "Lütfen renk seçin", Color.DARK_GRAY);
        tArea.setForeground(renk);

    }//GEN-LAST:event_renkActionPerformed

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
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserKullanimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dosya;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton renk;
    private javax.swing.JTextArea tArea;
    // End of variables declaration//GEN-END:variables
}
