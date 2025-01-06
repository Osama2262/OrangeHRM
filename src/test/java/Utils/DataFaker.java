package Utils;

import com.github.javafaker.Faker;

public class DataFaker {
    static Faker faker = new Faker();


    static String JobName = faker.job().title().toUpperCase();
    static String username = faker.name().fullName();
    static String city = faker.country().capital();
    static String zipcode = faker.address().zipCode();
    static String phone = faker.numerify("###########");
    static String password = faker.internet().password(18, 25, true, true, true);



    static String Id = faker.number().digits(2)+"GG";

    static String firstName =faker.name().firstName();
    static String middleName =faker.name().firstName();
    static String lastName =faker.name().lastName();


    static String Vacancy =faker.job().title();


    public static String getUsername() {
        return username;
    }
    public static String getPassword() {
        return password;
    }
    public static String getJobName() {
        return JobName;
    }
    public static String getZipcode() {
        return zipcode;
    }
    public static String getPhone() {
        return phone;
    }
    public static String getCity() {
        return city;
    }
    public static String getId() {
        return Id;
    }
    public static String getFirstName() {
        return firstName;
    }
    public static String getMiddleName() {
        return middleName;
    }
    public static String getLastName() {
        return lastName;
    }

    public static String getVacancy() {
        return Vacancy;
    }
}
