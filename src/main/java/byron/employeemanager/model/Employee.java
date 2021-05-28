package byron.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private long id;
    private String name;
    @Column(nullable = false,updatable = false)
    private String dni;
    private String adrees;
    private String district;
    private String phone;
    private String email1;
    private String email2;
    private String jobtilte;
    private String imageUrl;

    public Employee() {
    }

    public Employee(String name, String dni, String adrees, String district, String phone, String email1, String email2, String jobtilte, String imageUrl) {
        this.name = name;
        this.dni = dni;
        this.adrees = adrees;
        this.district = district;
        this.phone = phone;
        this.email1 = email1;
        this.email2 = email2;
        this.jobtilte = jobtilte;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getJobtilte() {
        return jobtilte;
    }

    public void setJobtilte(String jobtilte) {
        this.jobtilte = jobtilte;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", adrees='" + adrees + '\'' +
                ", district='" + district + '\'' +
                ", phone='" + phone + '\'' +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                ", jobtilte='" + jobtilte + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
