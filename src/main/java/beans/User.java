package beans;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
//Table name in DB
@Table(name = "ACCOUNTS")
public class User implements Serializable
{
    @Id
    //Column name in DB
    @Column(name="ACCOUNTID")
    @Qualifier("accountId")
    int accountId;

    @Column(name="FIRSTNAME")
    @Qualifier("first")
    String first;

    @Column(name="LASTNAME")
    @Qualifier("last")
    String last;

    @Column(name="EMAIL")
    @Qualifier("email")
    String email;

    @Column(name="USERNAME")
    @Qualifier("username")
    String username;

    @Column(name="PASS")
    @Qualifier("password")
    String password;

    public User() {

    };

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String name) {
        this.last = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "[AccountID=" + accountId + ", FirstName=" + first + ", LastName=" + last
                + ", Email=" + email + ", Username=" + username + ", Password=" + password + "]\n";
    }
}
