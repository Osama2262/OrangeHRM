
# OrangeHRM Automation Testing

This project is a complete **Automation Testing** implementation for the **OrangeHRM (Human Resource Management System)** platform. The automation framework has been built using **Selenium**, **Java**, and **TestNG** with the **Page Object Model (POM)** design pattern, making the testing process efficient and scalable.

---

## 🚀 Project Overview

The goal of this project is to automate various functional tests for different pages of the **OrangeHRM** platform, including the **Admin**, **PIM**, **Recruitment**, and **Vacancies** pages.

### Pages Tested:
- **Admin Page**
- **PIM (Personal Information Management) Page**
- **Recruitment Page**
- **Vacancies Page**

---

## 🛠 Tools and Technologies Used

- **Selenium** with **Java** (OOP)
- **TestNG** for testing framework
- **Page Object Model (POM)** and **Builder Pattern** for test organization
- **JavaFaker** for test data generation
- **Allure Report** for generating detailed test reports
- **Screenshots** for debugging and error identification
- **Maven** for build and dependency management

---

## 📂 Project Structure

```plaintext
.  
├── src
│   ├── main
│   │   └── java
│   │       ├── Pages              # Page Object Model Classes
│   │       ├── Base               # Base classes for initialization
│   │       ├── Utils              # Utilities like data generation
│   └── test
│       └── java
│           ├── TestCases           # Test cases for each feature
│           ├── TestNGConfig        # TestNG configuration files
│           └── Resources           # Test data files (e.g., CSV, Excel)
├── .gitignore
├── pom.xml                        # Maven dependencies and configurations
└── README.md                      # Project documentation
```

---

## 🔹 Test Case Details

### Admin Page:
- Add a New User  
- Search for a User  
- Edit a User  
- Delete a User  
- Add a New Job  
- Edit an Existing Job  
- Add a New Organization Location  

### PIM Page:
- Add a New Employee  
- Search for an Employee  
- Verify Employee in the Employee List  
- Assign Employee to a Job  
- Assign Employee to a New Location  
- Verify Employee Counter in Location  
- Delete an Employee  

### Recruitment Page:
- Add a New Candidate  
- Search for a Candidate  
- Shortlist a Candidate  
- Schedule an Interview  
- Mark Interview as Passed  
- Make a Job Offer  
- Hire a Candidate  
- Confirm Deleting a Candidate  
- Reject a Candidate  
- Mark the Interview as Failed  
- Cancel Job Offer  

### Vacancies Page:
- Add a New Vacancy  
- Search for a Vacancy  
- Mark Vacancy as Closed  
- Delete a Closed Vacancy  

---

## 🚀 How to Run the Project

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/Osama2262/OrangeHRM.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd OrangeHRM
   ```

3. **Install Maven Dependencies:**

   ```bash
   mvn clean install
   ```

4. **Run the Tests:**

   ```bash
   mvn test
   ```

5. **Generate Allure Reports (optional):**

   If you have Allure installed, you can generate detailed test reports by running:

   ```bash
   mvn allure:serve
   ```

---

## 📈 Test Reporting

- Allure Reports are used to generate detailed reports of the test execution with graphical views and detailed logs.
- Screenshots are captured on test failure for easier debugging.

---

## 📑 Contributing

Feel free to fork this repository, contribute with issues or pull requests. Any suggestions or improvements are welcome!

---

## 📧 Contact

If you have any questions or would like to discuss this project further, feel free to reach out:

- GitHub: [@Osama2262](https://github.com/Osama2262)
- Email: [kandel.2262@gmail.com](kandel.2262@gmail.com)

---

Happy testing! 🚀
