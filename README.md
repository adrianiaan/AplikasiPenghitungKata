# Aplikasi Penghitung Kata  
Tugas 5 - Adrian Akhmad Firdaus (2210010491)

---

## Deskripsi

Aplikasi ini digunakan untuk menghitung jumlah **kata**, **karakter**, **kalimat**, dan **paragraf** dalam sebuah teks. Selain itu, aplikasi ini menyediakan fitur pencarian kata dalam teks dan menghitung jumlah kemunculannya. Hasil analisis teks dapat disimpan ke dalam file `.txt`.

---

## Fitur Aplikasi

1. **Penghitungan Dinamis**:  
   - Menghitung jumlah kata, karakter, kalimat, dan paragraf dalam teks secara otomatis saat teks dimasukkan atau diubah.  
   - **Contoh Kode Implementasi**:  
     ```java
     private void hitungKomponenTeks() {
         String isiTeks = txtArea.getText();
         if (isiTeks.trim().isEmpty()) {
             labelKata.setText("Jumlah Kata: 0");
             labelKarakter.setText("Jumlah Karakter: 0");
             labelKalimat.setText("Jumlah Kalimat: 0");
             labelParagraf.setText("Jumlah Paragraf: 0");
             return;
         }

         int totalKarakter = isiTeks.length();
         int totalKata = isiTeks.trim().split("\\s+").length;
         int totalKalimat = isiTeks.split("[.!?]+").length;
         int totalParagraf = isiTeks.split("\\n+").length;

         labelKata.setText("Jumlah Kata: " + totalKata);
         labelKarakter.setText("Jumlah Karakter: " + totalKarakter);
         labelKalimat.setText("Jumlah Kalimat: " + totalKalimat);
         labelParagraf.setText("Jumlah Paragraf: " + totalParagraf);
     }
     ```

2. **Pencarian Kata**:  
   - Pengguna dapat mencari kata tertentu dalam teks, dan aplikasi akan menampilkan jumlah kemunculannya.  
   - **Contoh Kode Implementasi**:  
     ```java
     private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {                                        
         String kataDicari = fieldCari.getText().trim();
         String isiTeks = txtArea.getText();

         if (kataDicari.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari.", "Peringatan", JOptionPane.WARNING_MESSAGE);
             return;
         }

         if (isiTeks.trim().isEmpty()) {
             JOptionPane.showMessageDialog(this, "Teks tidak boleh kosong. Masukkan teks terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
             return;
         }

         int jumlahKemunculan = 0;
         for (String kata : isiTeks.split("\\s+")) {
             if (kata.equalsIgnoreCase(kataDicari)) {
                 jumlahKemunculan++;
             }
         }

         JOptionPane.showMessageDialog(this, "Kemunculan '" + kataDicari + "': " + jumlahKemunculan);
     }
     ```

3. **Penyimpanan Hasil Analisis ke File `.txt`**:  
   - Hasil analisis dapat disimpan ke file `.txt`. Jika pengguna tidak menambahkan ekstensi `.txt`, aplikasi akan menambahkannya secara otomatis.  
   - **Contoh Kode Implementasi**:  
     ```java
     private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
         if (txtArea.getText().trim().isEmpty()) {
             JOptionPane.showMessageDialog(this, "Teks tidak boleh kosong. Masukkan teks terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
         }

         JFileChooser fileChooser = new JFileChooser();
         int userSelection = fileChooser.showSaveDialog(this);

         if (userSelection == JFileChooser.APPROVE_OPTION) {
             File fileToSave = fileChooser.getSelectedFile();
             if (!fileToSave.getName().endsWith(".txt")) {
                 fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
             }

             try (PrintWriter writer = new PrintWriter(fileToSave)) {
                 writer.println("Isi Teks:");
                 writer.println(txtArea.getText());
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
     }
     ```

---

## Komponen GUI

Aplikasi ini menggunakan komponen berikut:
- **`JTextArea`**: Area input teks untuk memasukkan teks yang akan dianalisis.  
- **`JLabel`**: Label untuk menampilkan hasil analisis, seperti jumlah kata, karakter, kalimat, dan paragraf.  
- **`JTextField`**: Kolom input untuk mencari kata dalam teks.  
- **`JButton`**:  
   - **Hitung Kata**: Tombol untuk menghitung jumlah kata, karakter, kalimat, dan paragraf.  
   - **Cari**: Tombol untuk mencari kata tertentu dalam teks.  
   - **Simpan**: Tombol untuk menyimpan hasil analisis ke file `.txt`.  
- **`JFileChooser`**: Komponen untuk memilih lokasi penyimpanan file hasil analisis.  
- **`JScrollPane`**: Menampilkan teks pada area input dengan kemampuan scroll jika teks melebihi batas layar.  
- **`JPanel`**: Panel utama yang mengelompokkan elemen GUI.  

---

## Cara Menjalankan Aplikasi

1. Buka proyek di **NetBeans IDE 8.2**.  
2. Jalankan file `AplikasiPenghitungKata.java`.  
3. Masukkan teks pada area teks.  
4. Gunakan tombol berikut sesuai kebutuhan:  
   - **Hitung Kata**: Menghitung jumlah kata, karakter, kalimat, dan paragraf.  
   - **Cari**: Mencari kata tertentu dalam teks.  
   - **Simpan**: Menyimpan hasil analisis ke file `.txt`.

---

## Indikator Penilaian

| No  | Komponen           | Persentase |
|-----|---------------------|------------|
| 1   | Komponen GUI       | 10%        |
| 2   | Logika Program     | 20%        |
| 3   | Events             | 10%        |
| 4   | Kesesuaian UI      | 20%        |
| 5   | Penyimpanan Data   | 40%        |
| **TOTAL** |               | **100%**   |

---

## Pembuat

- **Nama**: Adrian Akhmad Firdaus  
- **NPM**: 2210010491  
- **Kelas**: 5A Reguler Pagi  
- **Tugas**: Tugas 5 - Aplikasi Penghitung Kata  
- **Fakultas**: Fakultas Teknologi Informasi (FTI)  
- **Universitas**: Universitas Islam Kalimantan Muhammad Arsyad Al Banjari Banjarmasin  

---
