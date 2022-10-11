package spring_mvc;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



public class Employee {
    @Size(min = 2, message = " need min 2 symbol")
    private String name;
    @NotBlank(message = "required field")
    private String surname;
    private String department;
    @Min(value = 500)
    private int salary;
    private String carBrand;
    private String[] languages;


    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "XXX-XX-XX")
    private String phoneNumber;
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String[] getLangs() {
        return languages;
    }

    public void setLangs(String[] langs) {
        this.languages = langs;
    }

    public Employee() {
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

    public String getDepart() {
        return department;
    }

    public void setDepart(String depart) {
        this.department = depart;
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}


