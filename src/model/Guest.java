package model;

public class Guest extends Person{

    public Guest(int id, String name, String email) {
        super(id, name, email , AccountType.GUEST);
    }
}