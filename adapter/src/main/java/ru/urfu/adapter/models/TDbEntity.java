package ru.urfu.adapter.models;

public class TDbEntity implements IDbEntity {

    private int id;

    public TDbEntity() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
