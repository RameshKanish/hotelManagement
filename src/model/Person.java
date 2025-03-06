package model;

public class Person {

    public int id;
    public String name;
    public String email;
    public AccountType accountType;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Person(int id , String name , String email , AccountType accountType){
        this.name = name;
        this.email = email;
        this.id = id;
        this.accountType = accountType;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}