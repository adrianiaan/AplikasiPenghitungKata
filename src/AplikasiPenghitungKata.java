
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADRIAN WIN
 */
public class AplikasiPenghitungKata extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenghitungKata
     */
    public AplikasiPenghitungKata() {
        initComponents();

        txtArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                hitungKomponenTeks();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                hitungKomponenTeks();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                hitungKomponenTeks();
            }
        });

        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        // Set nilai default pada label
        labelKata.setText("Jumlah Kata: 0");
        labelKarakter.setText("Jumlah Karakter: 0");
        labelKalimat.setText("Jumlah Kalimat: 0");
        labelParagraf.setText("Jumlah Paragraf: 0");
    }

    // Metode untuk menghitung kata, karakter, kalimat, dan paragraf
    private void hitungKomponenTeks() {
        String isiTeks = txtArea.getText();

        if (isiTeks.trim().isEmpty()) {
            // Set nilai default pada label jika teks kosong
            labelKata.setText("Jumlah Kata: 0");
            labelKarakter.setText("Jumlah Karakter: 0");
            labelKalimat.setText("Jumlah Kalimat: 0");
            labelParagraf.setText("Jumlah Paragraf: 0");
            return;  // Tidak perlu menghitung jika teks kosong
        }

        // Menghitung jumlah karakter
        int totalKarakter = isiTeks.length();

        // Menghitung jumlah kata
        String[] kataArray = isiTeks.trim().split("\\s+");
        int totalKata = kataArray.length;

        // Menghitung jumlah kalimat
        String[] kalimatArray = isiTeks.split("[.!?]+");
        int totalKalimat = kalimatArray.length;

        // Menghitung jumlah paragraf
        String[] paragrafArray = isiTeks.split("\\n+");
        int totalParagraf = paragrafArray.length;

        // Tampilkan hasil pada JLabel
        labelKata.setText("Jumlah Kata: " + totalKata);
        labelKarakter.setText("Jumlah Karakter: " + totalKarakter);
        labelKalimat.setText("Jumlah Kalimat: " + totalKalimat);
        labelParagraf.setText("Jumlah Paragraf: " + totalParagraf);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        labelKata = new javax.swing.JLabel();
        labelKarakter = new javax.swing.JLabel();
        labelKalimat = new javax.swing.JLabel();
        labelParagraf = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        fieldCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Kata");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitungan Kata", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 24), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        labelKata.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(labelKata, gridBagConstraints);

        labelKarakter.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(labelKarakter, gridBagConstraints);

        labelKalimat.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(labelKalimat, gridBagConstraints);

        labelParagraf.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(labelParagraf, gridBagConstraints);

        btnHitung.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnHitung.setText("Hitung Kata");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnHitung, gridBagConstraints);

        fieldCari.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(fieldCari, gridBagConstraints);

        btnCari.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnCari, gridBagConstraints);

        btnSimpan.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(btnSimpan, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungKomponenTeks();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String kataDicari = fieldCari.getText().trim();
        String isiTeks = txtArea.getText();

        // Mengecek apakah input kata dan teks tidak kosong
        if (kataDicari.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (isiTeks.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Teks tidak boleh kosong. Masukkan teks terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Menghitung jumlah kemunculan kata
        String[] kataArray = isiTeks.split("\\s+");
        int jumlahKemunculan = 0;
        for (String kata : kataArray) {
            if (kata.equalsIgnoreCase(kataDicari)) {
                jumlahKemunculan++;
            }
        }

        // Menampilkan hasil
        JOptionPane.showMessageDialog(this, "Kemunculan '" + kataDicari + "': " + jumlahKemunculan);
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // Cek apakah txtArea kosong
        if (txtArea.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Teks tidak boleh kosong. Masukkan teks terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Batalkan proses penyimpanan
        }

        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Tambahkan ekstensi .txt jika pengguna tidak menambahkan ekstensi
            if (!fileToSave.getName().endsWith(".txt")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
            }

            try (PrintWriter writer = new PrintWriter(fileToSave)) {
                // Menulis isi teks
                writer.println("Isi Teks:");
                writer.println(txtArea.getText());

                // Menulis hasil perhitungan
                writer.println("\nHasil Perhitungan:");
                writer.println(labelKata.getText());
                writer.println(labelKarakter.getText());
                writer.println(labelKalimat.getText());
                writer.println(labelParagraf.getText());

                JOptionPane.showMessageDialog(this, "File berhasil disimpan di " + fileToSave.getAbsolutePath(), "Simpan Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Penyimpanan file dibatalkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenghitungKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelKalimat;
    private javax.swing.JLabel labelKarakter;
    private javax.swing.JLabel labelKata;
    private javax.swing.JLabel labelParagraf;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
