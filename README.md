Character Manager — TP3 (Java Visual SIH-6406)
1. Deskripsi Proyek

Character Manager merupakan program berbasis Java yang digunakan untuk mengelola karakter dengan atribut dan perilaku tertentu. Proyek ini menerapkan konsep pemrograman berorientasi objek, seperti class, encapsulation, constructor, dan enum, untuk mengatur data serta perilaku karakter. Program dijalankan melalui terminal dan menampilkan informasi karakter, termasuk status hidup melalui method isAlive().

2. Screenshot Output Terminal

Screenshot berikut menunjukkan hasil eksekusi program Character Manager, termasuk informasi karakter dan hasil pemanggilan method isAlive().

![Output Terminal](Screenshot/output-character-basic.png)

3. Struktur Folder Project
```text
CharacterManager/
├── out/
│   ├── com/
│   └── Main.class
├── src/
│   ├── com/
│   │   └── unpri/
│   │       └── charactermanager/
│   │           ├── CharacterManager.java
│   │           └── model/
│   │               ├── Character.java
│   │               └── CharacterType.java
│   └── Main.java
├── screenshots/
│   └── output-terminal.png
├── Screenshot/
│   ├── output-character-basic.png
│   ├── output-crud.png
│   └── output-reference.png
└── README.md

4. Informasi Mahasiswa
Nama Lengkap: Ravita Marsanda
NIM: 253303621209
Mata Kuliah: Java Visual
Link Google Docs TP03: [Buka Dokumen TP03](https://docs.google.com/document/d/1vhce2Y4HyO6x0SCRgWV_Nax_UEtUrbtKarFv6Gh-N2Q/edit?usp=sharing)

---

Character Manager Sprint #2 — TP5 (Java Visual)
1. Deskripsi
TP5 mengembangkan aplikasi Character Manager dengan fitur
pengelolaan karakter, validasi nama duplikat, pencarian
karakter, analisis level, dan pengujian object reference.

2. Fitur yang Diimplementasikan
- `addCharacter()` — menambahkan karakter dan menolak nama duplikat.
- `findByName()` — mencari karakter berdasarkan nama.
- `removeCharacter()` — menghapus karakter berdasarkan nama.
- `getTotalCharacters()` — menghitung jumlah karakter.
- `getAllCharacters()` — mengembalikan salinan daftar karakter.
- `getAverageLevel()` — menghitung rata-rata level karakter.
- `findByType()` — mencari karakter berdasarkan tipe.
- `findStrongest()` — mencari karakter dengan level tertinggi.

3. Bukti Output Program
    Output CRUD dan Analistik
    ![Output CRUD](Screenshots/output-crud.png)

    Eksperimen Object Reference
    ![Output Reference](Screenshots/output-reference.png)

4. Analisis Object Reference
Method `getAllCharacters()` pada class `CharacterManager` mengembalikan salinan daftar karakter menggunakan `new ArrayList<>(characters)`. Tujuannya adalah agar perubahan pada struktur daftar salinan tidak memengaruhi daftar karakter internal.

Pengujian dilakukan dengan membuat salinan daftar karakter, kemudian mengosongkannya menggunakan method `clear()`. Hasil pengujian menunjukkan bahwa daftar salinan berisi 0 karakter, sedangkan daftar asli tetap berisi 3 karakter.

Hal ini membuktikan bahwa perubahan struktur pada daftar salinan tidak menghapus data dari daftar internal `CharacterManager`. Salinan tersebut termasuk *shallow copy*, karena daftar yang dibuat berbeda dari daftar asli, tetapi objek `Character` di dalam kedua daftar masih dapat merujuk pada objek yang sama.

Dengan demikian, penggunaan salinan daftar membantu menjaga enkapsulasi dan mencegah perubahan struktur daftar dari luar secara langsung memengaruhi data internal.

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
