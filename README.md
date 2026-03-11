# 🚀 Sistem Manajemen KTP (REST API & AJAX Frontend)


* **Base URL API:** `http://localhost:8080/ktp`

---

## 📸 Dokumentasi Antarmuka (Frontend)

### 1. Tampilan Utama Halaman Web (GET)
![Tampilan Halaman Web](assets/get.png)

### 2. Operasi POST
![Tampilan Halaman Web](assets/post.png)

### 3. Operasi PUT
![Tampilan Halaman Web](assets/put.png)

### 4. Operasi DELETE
![Tampilan Halaman Web](assets/delete.png)

### 5. Error Handling
![Tampilan Halaman Web](assets/error handling.png)
---

## 🛠️ Dokumentasi Endpoint API (Backend)

### 1. ➕ Tambah KTP Baru (POST)
* **Endpoint:** `/ktp`
* **Fungsi:** Menambahkan data KTP baru ke database.
* **Request Body (JSON):**
  ```json
  {
    "nomorKtp": "3201012345678901",
    "namaLengkap": "Farhat",
    "alamat": "Bogor, Jawa Barat",
    "tanggalLahir": "2004-05-10",
    "jenisKelamin": "Laki-laki"
  }
  Respon Sukses (201 Created):
  {
  "status": "success",
  "data": {
    "id": 1,
    "nomorKtp": "3201012345678901",
    "namaLengkap": "Farhat",
    "alamat": "Bogor, Jawa Barat",
    "tanggalLahir": "2004-05-10",
    "jenisKelamin": "Laki-laki"
  }


### 2. ➕ Melihat semua Data KTP (GET)
* **Endpoint:** `/ktp`
* **Fungsi:** Mengambil dan melihat seluruh list data KTP yang terdaftar di database.
* **Request Body (JSON):**
```json
{
  "status": "success",
  "data": [
    {
      "id": 1,
      "nomorKtp": "3201012345678901",
      "namaLengkap": "Farhat",
      "alamat": "Bogor, Jawa Barat",
      "tanggalLahir": "2004-05-10",
      "jenisKelamin": "Laki-laki"
    }
  ]
}
```

### 3. 📝 Edit Data KTP (PUT)
* **Endpoint:** `/ktp/{id} (contoh: /ktp/1)`
* **Fungsi:** Memperbarui detail data KTP yang sudah ada berdasarkan ID yang dipilih.
* **Request Body (JSON):**
```json
{
  "nomorKtp": "3201012345678901",
  "namaLengkap": "Farhat Diperbarui",
  "alamat": "Bogor Tengah, Jawa Barat",
  "tanggalLahir": "2004-05-10",
  "jenisKelamin": "Laki-laki"
}
  Respon Sukses (200 OK):
{
  "status": "success",
  "data": {
    "id": 1,
    "nomorKtp": "3201012345678901",
    "namaLengkap": "Farhat Diperbarui",
    "alamat": "Bogor Tengah, Jawa Barat",
    "tanggalLahir": "2004-05-10",
    "jenisKelamin": "Laki-laki"
}
```

### 4.🗑️ Delete Data KTP (DELETE)
* **Endpoint:** `/ktp/{id} (contoh: /ktp/1)`
* **Fungsi:** Menghapus data KTP dari database berdasarkan ID spesifik.
* **Request Body (JSON):**
```json
{
  "status": "success",
  "message": "Data KTP dengan id 1 berhasil dihapus"
}



