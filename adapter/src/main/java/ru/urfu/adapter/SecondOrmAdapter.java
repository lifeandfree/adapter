package ru.urfu.adapter;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;
import ru.urfu.adapter.secondOrmLibrary.ISecondOrm;

public class SecondOrmAdapter implements ITarget {

    private ISecondOrm secondOrm;

    @Override
    public void createElement(DbUserEntity entity) {
        secondOrm.getContext().getUsers().add(entity);

    }

    @Override
    public void createElement(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().add(entity);
    }

    @Override
    public void DeleteElement(DbUserEntity entity) {
        secondOrm.getContext().getUsers().remove(entity);
    }

    @Override
    public void DeleteElement(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().remove(entity);
    }

    @Override
    public DbUserEntity ReadDbUser(int id) {
        return secondOrm.getContext().getUsers().get(id);
    }

    @Override
    public DbUserInfoEntity ReadDbUserInfo(int id) {
        return secondOrm.getContext().getUserInfos().get(id);
    }

    @Override
    public void UpdateElement(DbUserEntity entity) {
        secondOrm.getContext().getUsers().set(entity.getId(), entity);
    }

    @Override
    public void UpdateElement(DbUserInfoEntity entity) {
        secondOrm.getContext().getUserInfos().set(entity.getId(), entity);
    }

}
