package spring_mvc;

import jakarta.validation.constraints.*;
import spring_mvc.validation.CheckEmail;

import java.util.HashMap;
import java.util.Map;


public class Employee {
    @Size(min = 2, message = " need min 2 symbol")
    private String name;
    @NotBlank(message = "required field")
    private String surname;

    @Min(value = 500, message="must be greater than 499")
    @Max(value = 1000,message="must be  less than 1001")
    private int salary;
    private String department;
    private Map<String,String>departments;
    private String carBrand;
    private Map<String,String>carBrands;
    private String languages;
    private Map<String,String>languageList;;

    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "XXX-XX-XX")
    private String phoneNumber;

    public  Employee(){
        departments=new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resourses");
        departments.put("Sales","Sales");

        carBrands= new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Mercedes-Benz","MB");

        languageList=new HashMap<>();
        languageList.put("English","EN");
        languageList.put("Deutch","DE");
        languageList.put("French","FR");
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surname + '\'' +
                ", depart='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

}



