package model;

import java.util.Date;
import java.util.UUID;

public class Contact {

    private UUID id;
    private String name;
    private String phone;
    private String phoneHome;
    private String email;
    private String date;

    public Contact(String name, String phone, String phoneHome, String email, String date) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phone = phone;
        this.phoneHome = phoneHome;
        this.email = email;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
