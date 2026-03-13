# National ID (KTP) Data Management System 🪪


## 📖 Case Study

* **Problem:** Managing demographic and national ID (KTP) data using outdated or manual systems is highly prone to human error, data redundancy, and inefficient retrieval processes.
* **Goal:** To engineer a secure, efficient, and centralized web application capable of performing robust CRUD (Create, Read, Update, Delete) operations on citizen data with high accuracy.
* **Idea:** Developed a full-stack web application utilizing a Java Spring Boot backend for secure data processing and a responsive frontend using Ajax jQuery for seamless, asynchronous user interactions.
* **Process:** * Engineered a robust RESTful API with Java Spring Boot to handle core operations.
  * Designed a relational MySQL database schema to securely store structured KTP records.
  * Programmed a dynamic frontend interface integrating Ajax to manipulate data without triggering page reloads.
* **Result:** Successfully delivered a fully functional CRUD application that streamlines data management, improving data entry accuracy and accelerating retrieval speeds for end-users.

---

## 🛠️ Endpoint API Documentation (Backend)


### 1. Add New Record (POST)
* **Endpoint:** `/ktp`
* **Fungsi:** Inserts a new National ID record into the database.
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


### 2. Retrieve All Records (GET)
* **Endpoint:** `/ktp`
* **Fungsi:**Fetches all registered National ID records from the database.
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

### 3. Update Record (PUT)
* **Endpoint:** `/ktp/{id} (contoh: /ktp/1)`
* **Fungsi:** pdates an existing record's details based on the specified ID.
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

### 4. Delete Record (DELETE)
* **Endpoint:** `/ktp/{id} (contoh: /ktp/1)`
* **Fungsi:** Removes a specific National ID record from the database.
* **Request Body (JSON):**
```json
{
  "status": "success",
  "message": "Data KTP dengan id 1 berhasil dihapus"
}
s",
  "message": "Data KTP dengan id 1 berhasil dihapus"
}
```

## 📸 Dokumentasi Antarmuka (Frontend)

### 1. Main Page Preview (GET)
![Main Page Preview](assets/get.png)

### 2. POST Operation
![POST Operation](assets/post.png)

### 3. PUT Operation
![PUT Operation](assets/put.png)

### 4. DELETE Operation
![DELETE Operation](assets/delete.png)

### 5. Error Handling Operation
![Error Handling Operation](assets/errorhandling.png)
