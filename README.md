# CRUD & LOGIN PADA CODDEIGNITER
Folder CI.3.E411630_P3 ini berisi hasil kegiatan praktikum CodeIgniter 3 terkait cara membuat CRUD data dan Login.


A.	CRUD
CRUD (Create Read Update Delete)merupakan fungsi yang sering digunakan dalam aplikasi untuk pengolahan data, seperti menambahkan data, menghapus data, dan meng-update data.

Dalam membuat CRUD data, saya mengikuti petunjuk pada beberapa link berikut:
1. Memahami konsep dasar CRUD ->  https://www.codepolitan.com/belajar-codeigniter-3-crud-1-57a7f9f5bde51-17045
2. Membuat CRUD: menampilkan data dari database ->  https://www.malasngoding.com/membuat-crud-dengan-codeigniter-menampilkan-data-dari-database/
3. Membuat CRUD: menambahkan data baru ke database ->  https://www.malasngoding.com/membuat-crud-dengan-codeigniter-input-data-ke-database/
4. Membuat CRUD: menghapus data dari database ->  https://www.malasngoding.com/membuat-crud-dengan-codeigniter-hapus-data/
5. Membuat CRUD: meng-update data yang sudah ada pada database ->  https://www.malasngoding.com/membuat-crud-dengan-codeigniter-update-data/


B.	LOGIN
Petunjuk yang saya gunakan ketika membuat sistem login terdapat dalam link berikut:
https://www.malasngoding.com/membuat-login-dengan-codeigniter/

Dalam membuat sistem login, diperlukan adanya sebuah session. Session merupakan cara yang digunakan untuk menyimpan informasi variabel session yang akan digunakan pada halaman lain.
Salah satu contoh penggunaan session adalah dalam sistem login. Misalnya, session dimulai dari halaman login dan dilanjutkan ke halaman admin. Maka user diharuskan melakukan login terlebih dahulu karena user tidak akan bisa membuka halaman admin jika belum melakukan login.

Berikut syntax yang digunakan dalam membuat session:
```
<?php

//memulai session
session_start(); 

//menyimpan informasi session
$_SESSION["nama_session"]="value";				//contoh: $_SESSION["nama"]="tika";

//memanggil informasi variabel session yang telah disimpan
echo "nama saya adalah" . $_SESSION["nama_session"]. ".";	//contoh: echo "nama saya adalah" . $_SESSION["nama"].".";

// menghapus variabel session    
session_unset($_SESSION["nama_session"]);			//contoh: session_unset($_SESSION["nama"]);
  
// menghapus semua session;     
session_destroy();

?>
```
