# Character Manager — TP3 (Java Visual SIH-6406)
1. Deskripsi Proyek

   Character Manager merupakan program berbasis Java yang digunakan untuk mengelola karakter dengan atribut dan perilaku        tertentu. Proyek ini menerapkan konsep pemrograman berorientasi objek, seperti class, encapsulation, constructor, dan        enum, untuk mengatur data serta perilaku karakter. Program dijalankan melalui terminal dan menampilkan informasi             karakter, termasuk status hidup melalui method isAlive().

3. Screenshot Output Terminal

   Screenshot berikut menunjukkan hasil eksekusi program Character Manager, termasuk informasi karakter dan hasil               pemanggilan method isAlive().

   ![Output Terminal](Screenshot/output-character-basic.png)

5. Struktur Folder Project
```text

CharacterManager/
├── out/
│   └── Main.class
├── Screenshot/
│   ├── Screenshots output-crud tp05.png
│   ├── Screenshots output-reference tp05.png
│   ├── Screenshots output-terminal.png
│   ├── Screenshots sebelum tp08.png
│   ├── Screenshots sebelum tp10.png
│   ├── Screenshots sesudah tp08.png
│   └── Screenshots sesudah tp10.png
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── CharacterManager.java
│               ├── controller/
│               │   └── CharacterController.java
│               ├── model/
│               │   ├── Character.java
│               │   └── CharacterType.java
│               └── view/
│                   ├── AppTheme.java
│                   └── MainWindow.java
└── README.md


```
4. Informasi Mahasiswa
   
   Nama Lengkap: Ravita Marsanda

   NIM: 253303621209

   Mata Kuliah: Java Visual

   Link Google Docs TP03: [Buka Dokumen TP03](https://docs.google.com/document/d/1vhce2Y4HyO6x0SCRgWV_Nax_UEtUrbtKarFv6Gh-N2Q/edit?usp=sharing)

---

# Character Manager Sprint #2 — TP5 (Java Visual)
1. Deskripsi

   TP5 mengembangkan aplikasi Character Manager dengan fitur
   pengelolaan karakter, validasi nama duplikat, pencarian
   karakter, analisis level, dan pengujian object reference.

3. Fitur yang Diimplementasikan
    - `addCharacter()` — menambahkan karakter dan menolak nama duplikat.
    - `findByName()` — mencari karakter berdasarkan nama.
    - `removeCharacter()` — menghapus karakter berdasarkan nama.
    - `getTotalCharacters()` — menghitung jumlah karakter.
    - `getAllCharacters()` — mengembalikan salinan daftar karakter.
    - `getAverageLevel()` — menghitung rata-rata level karakter.
    - `findByType()` — mencari karakter berdasarkan tipe.
    - `findStrongest()` — mencari karakter dengan level tertinggi.

4. Bukti Output Program

   Output CRUD dan Analistik
    ![Output CRUD](Screenshots/output-crud.png)

   Eksperimen Object Reference
    ![Output Reference](Screenshots/output-reference.png)

5. Analisis Object Reference
   Method `getAllCharacters()` pada class `CharacterManager` mengembalikan salinan daftar karakter menggunakan `new             ArrayList<>(characters)`. Tujuannya adalah agar perubahan pada struktur daftar salinan tidak memengaruhi daftar karakter     internal.

   Pengujian dilakukan dengan membuat salinan daftar karakter, kemudian mengosongkannya menggunakan method `clear()`. Hasil     pengujian menunjukkan bahwa daftar salinan berisi 0 karakter, sedangkan daftar asli tetap berisi 3 karakter.

   Hal ini membuktikan bahwa perubahan struktur pada daftar salinan tidak menghapus data dari daftar internal                   `CharacterManager`. Salinan tersebut termasuk *shallow copy*, karena daftar yang dibuat berbeda dari daftar asli, tetapi     objek `Character` di dalam kedua daftar masih dapat merujuk pada objek yang sama.

   Dengan demikian, penggunaan salinan daftar membantu menjaga enkapsulasi dan mencegah perubahan struktur daftar dari luar     secara langsung memengaruhi data internal.

5. Hasil Pengujian
    - Tiga karakter berhasil ditambahkan.
    - Penambahan nama Arjuna yang duplikat ditolak.
    - Karakter Merlin berhasil ditemukan.
    - Rata-rata level awal adalah 4.0.
    - Karakter dengan level tertinggi adalah Arjuna.
    - Penghapusan Athena berhasil.
    - Rata-rata level daftar kosong adalah 0.0.

6. Analisis dan Rancangan
   Dokumen analisis reference, primitive value, static,
   equals(), dan encapsulation dapat dibaca melalui tautan berikut:
   Link Google Docs TP05: [Buka Dokumen Analisis TP05](https://docs.google.com/document/d/1GzebjEp3sTkrF4PuDUfzQFZfKf8m9ZaMpIXgwOyeQ6A/edit?usp=sharing)



---

# Character Manager Sprint #3 — TP8 (Java Visual)
1. Deskripsi
   TP8 mengembangkan aplikasi Character Manager dari program berbasis terminal menjadi aplikasi GUI (Graphical User             Interface) menggunakan Java Swing. Aplikasi ini menerapkan konsep event-driven programming dan arsitektur Model-View-        Controller (MVC). Pengguna dapat melihat daftar karakter, menambahkan karakter baru, menghapus karakter, serta melihat       statistik jumlah karakter, rata-rata level, dan karakter dengan level tertinggi.

2. Screenshot MainWindow

   Sebelum Perubahan Data
   ![Screenshot sebelum perubahan](Screenshots/sebelum.png)

   Screenshot ini menunjukkan lima karakter awal, yaitu Arjuna, Merlin, Athena, Hector, dan Luna. Total karakter adalah 5,      rata-rata level 4.00, dan karakter dengan level tertinggi adalah Hector pada level 6.

   Sesudah Perubahan Data
   ![Screenshot sesudah perubahan](Screenshots/sesudah.png)

   Setelah menambahkan Thor dengan tipe WARRIOR level 8 dan Ravita dengan tipe WARRIOR level 7, jumlah karakter menjadi 7.      Rata-rata level berubah menjadi 5.00, sedangkan Thor menjadi karakter dengan level tertinggi pada level 8.

   Perubahan tersebut membuktikan bahwa tabel dan statistik diperbarui secara dinamis ketika data karakter berubah.

3. Aliran Data dan Hubungannya dengan MVC
   Program dimulai dari `Main.java`, yang membuat objek `CharacterManager` dan menambahkan lima karakter awal. Selanjutnya,     `Main.java` membuat objek `CharacterController` dan mengirimkannya ke `MainWindow` untuk menampilkan antarmuka pengguna.

   `CharacterManager` bertanggung jawab mengelola kumpulan karakter, seperti menambah, mencari, menghapus, dan menghitung        statistik. `CharacterController` menjadi penghubung antara tampilan dan pengelolaan data dengan meneruskan permintaan        pengguna kepada `CharacterManager`.

   `MainWindow` berfungsi sebagai View yang menampilkan data dalam JTable, menyediakan tombol tambah dan hapus, serta            memperbarui statistik setelah perubahan data. Pemisahan tanggung jawab tersebut mencerminkan prinsip MVC, yaitu Model        mengelola data, View menampilkan antarmuka, dan Controller mengatur komunikasi antara keduanya.

4. Karakter Baru dan Alasan Pemilihan Tipe/Level

   Dua karakter tambahan yang digunakan dalam pengembangan TP8 adalah:

    - **Thor** — tipe WARRIOR, level 8. Karakter ini dipilih sebagai contoh karakter dengan level tinggi untuk membuktikan         bahwa statistik karakter terkuat diperbarui secara otomatis.
    - **Ravita** — tipe WARRIOR, level 7. Karakter ini ditambahkan untuk menambah variasi data dan membuktikan bahwa jumlah         karakter serta rata-rata level berubah setelah penambahan data.

    Kedua karakter tersebut digunakan untuk memperlihatkan bahwa aplikasi mampu menampilkan data baru tanpa perlu menuliskan     setiap baris karakter secara manual di tabel.

6. Penerapan Event-Driven Programming

   Aplikasi menggunakan `ActionListener` melalui lambda expression pada tombol Tambah dan Hapus Terpilih. Ketika pengguna       menekan tombol Tambah, program membaca nama, tipe, dan level dari komponen input, kemudian meminta Controller menambahkan    karakter.

   Ketika tombol Hapus Terpilih ditekan, aplikasi memeriksa baris yang dipilih dan meminta konfirmasi sebelum menghapus         karakter. Setelah operasi berhasil, tabel dan statistik diperbarui melalui method `refreshCharacters()`.

   Pendekatan ini berbeda dari program sekuensial berbasis terminal karena alur tindakan GUI ditentukan oleh interaksi          pengguna terhadap komponen antarmuka.

8. Penerapan MVC dan SwingUtilities

   `MainWindow` menggunakan `JFrame` sebagai jendela utama, `JTable` untuk menampilkan data karakter, serta `JLabel` untuk       menampilkan statistik. Data tabel diperbarui menggunakan `DefaultTableModel`, sehingga perubahan daftar karakter dapat       ditampilkan kembali tanpa membuat tabel baru.

    Pada `Main.java`, `SwingUtilities.invokeLater()` digunakan untuk menjalankan pembuatan dan penampilan GUI melalui Event      Dispatch Thread (EDT). Hal ini mengikuti praktik Swing agar pembuatan dan pembaruan komponen antarmuka dilakukan pada        thread yang sesuai.

10. Link Google Docs Bagian D

    Link Google Docs Analisis GUI & MVC TP8:                                                                                     [https://docs.google.com/document/d/1xaVNnBSSAwupSRytRFSCggkXEiObcNUqvgPgy6Qzllo/edit?usp=sharing]


---


# TP10 — Theming, Properti Komponen & Analisis MVC

1. Screenshot Sebelum dan Sesudah

   **Sebelum (v0.3)**

   ![Screenshot sebelum TP10](Screenshot/sebelumtp10.png)

   **Sesudah (v0.4)**

   ![Screenshot sesudah TP10](Screenshot/sesudahtp10.png)

2. Pemisahan Warna pada AppTheme dan Character
   Warna tampilan aplikasi disimpan di kelas `AppTheme` yang berada pada package `view` agar pengaturan visual terpusat dan     konsisten. Kelas `Character` pada package `model` bertanggung jawab menyimpan data karakter, seperti nama, role, level,      HP, dan Attack, bukan mengatur warna tampilannya. Pemisahan ini membuat perubahan tema tidak mengharuskan perubahan pada     model karakter. Pendekatan tersebut juga mendukung pola MVC dan mempermudah pemeliharaan aplikasi.

3. Dua Properti Tambahan

   **Tooltip HP/Attack:** menampilkan informasi HP dan Attack ketika kursor diarahkan ke kartu karakter. Tujuannya agar         pengguna dapat melihat detail karakter dengan mudah tanpa memenuhi tampilan kartu.
   **Border berdasarkan role:** garis tepi kartu mengikuti warna role karakter. Tujuannya agar perbedaan role lebih mudah       dikenali dan tampilan antarkartu lebih konsisten.

4. Google Docs Bagian D

   **Tautan analisis:** [https://docs.google.com/document/d/1MfQJ8VF39tAgRKz8frrUosh0cDtyTOBKGv4JTDBQ_AA/edit?usp=sharing]