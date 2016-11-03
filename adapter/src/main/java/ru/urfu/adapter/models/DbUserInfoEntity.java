package ru.urfu.adapter.models;

import java.sql.Timestamp;

import ru.urfu.adapter.models.interfaces.IDbEntity;

public class DbUserInfoEntity implements IDbEntity {

    public Timestamp birthday;
    public int id;
    public String name;

    public Timestamp getBirthday() {
        return birthday;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Override
    public void setId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

}
