package com.library.domain.models;

public class Member {
    private final int id;
    private final String name;
    private final String email;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail(){return email; }
}
