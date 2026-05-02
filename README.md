# 🚀 Web to PDF Generator

This project is a full-stack solution that allows users to capture webpage content using a Chrome Extension and convert it into a clean, readable PDF using a Spring Boot backend.

I built this project to understand how browser extensions interact with backend services and how real-world tools like PDF generators work behind the scenes.

---

## 🔥 Features

* 📸 Capture full webpage content using a Chrome Extension
* 📄 Convert captured data into A4 formatted PDF
* 🧹 Clean and readable output by removing unnecessary UI elements
* ⚡ Fast and automated processing
* 🔗 Seamless integration between extension and backend API

---

## 🛠 Tech Stack

* **Frontend:** Chrome Extension (JavaScript, HTML, CSS)
* **Backend:** Java (Spring Boot)
* **PDF Generation:** iText Library

---

## ⚙️ How It Works

1. User clicks on the extension button
2. Extension captures visible webpage sections
3. Data is sent to the backend API
4. Backend processes and generates a structured PDF
5. PDF is automatically downloaded

---

## 🚀 How to Run

### 🔹 Backend

```bash
cd backend/pdfcaptureservice
mvnw spring-boot:run
```

Server runs at:
http://localhost:8080

---

### 🔹 Chrome Extension

1. Open Chrome
2. Go to: chrome://extensions/
3. Enable Developer Mode
4. Click Load Unpacked
5. Select the `extension` folder

---

## 🎥 Demo

👉 Watch Demo Video:
https://drive.google.com/file/d/1xfBExiLy7Dgt9AK5AHNTDsdHcJ1V8Y3Z/view?usp=sharing

---

## 💡 Future Improvements

* Smart content detection for better cropping
* Higher quality (HD) PDF export
* Improved UI/UX for extension
* Better handling of multi-page stitching

---

## 📌 Key Highlights

* Developed a full-stack application combining browser extension and backend API
* Implemented real-time screenshot capture and PDF conversion
* Focused on improving document readability and structure

---

## 👨‍💻 Author

Prashant
