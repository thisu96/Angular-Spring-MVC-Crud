package lk.ijse.git.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String customerName;
    private String adress;
    private String contact;
    private String mail;

    public Customer() {
    }

    public Customer(String customerName, String adress, String contact, String mail) {
        this.customerName = customerName;
        this.adress = adress;
        this.contact = contact;
        this.mail = mail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", adress='" + adress + '\'' +
                ", contact='" + contact + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
