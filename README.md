# Web Testing Framework

Proyek ini adalah implementasi pengujian Automation Testing dengan menggunakan Cucumber, Java, Gradle, dan Selenium WebDriver. Framework ini menggunakan pendekatan Page Object Model (POM) dan file Gherkin untuk mendefinisikan test case.

URL : https://www.saucedemo.com/

Jenis pengujian : 
Positive Test :	Menguji alur login yang berhasil saat input username dan password valid.
Negative Test : Menguji alur login yang gagal, misalnya: username salah, password salah, dan kosong.
Boundary Test :	Menguji batas minimal/maksimal panjang karakter, misalnya login dengan username 1 huruf atau 29 huruf.

Konfigurasi
- Java 17
- Gradle 7.0
- Chrome WebDriver

Teknologi
- Java
- Gradle
- Selenium WebDriver
- Cucumber
- JUnit
- WebDriverManager

#Start Test
Untuk menjalankan pengujian otomatis pada framework ini, pastikan terlebih dahulu semua dependensi telah terinstal dan konfigurasi lingkungan sudah sesuai.

Command terminal : gradle test

@danesdeova
