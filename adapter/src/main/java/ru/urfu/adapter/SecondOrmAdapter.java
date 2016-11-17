package ru.urfu.adapter;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.secondOrmLibrary.ISecondOrm;

public class SecondOrmAdapter implements ITarget {

    private ISecondOrm secondOrm;

    public SecondOrmAdapter() {
        // TODO Auto-generated constructor stub
    }

    public void addE(DbUserEntity e) {

    }

    public void targetMethod(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(entity);
    }

}
