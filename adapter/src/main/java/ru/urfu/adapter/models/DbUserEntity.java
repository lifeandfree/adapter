package ru.urfu.adapter.models;

public class DbUserEntity extends TDbEntity {

    public int id;
    public String login;
    public String passwordHash;
    public int userInfoId;

    @Override
    public int getId() {
        return this.id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public int getUserInfoId() {
        return userInfoId;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

}
