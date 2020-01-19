package dc.springh2;

import javax.persistence.*;

@Entity
public class PrivateAccount {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    public PrivateAccount() {
    }

    @Override
    public String toString() {
        return "name: " + name + ", " + String.format("%.2f zł", balance);
    }
}
