package ru.urfu.adapter;

import ru.urfu.adapter.firstOrmLibrary.IFirstOrm;
import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;
import ru.urfu.adapter.models.TDbEntity;

public class FirstOrmAdapter implements ITarget {

    private IFirstOrm<TDbEntity> iFirstOrm;

    @Override
    public void createElement(DbUserEntity entity) {
        iFirstOrm.Create(entity);
    }

    @Override
    public void createElement(DbUserInfoEntity entity) {
        iFirstOrm.Create(entity);
    }

    @Override
    public void DeleteElement(DbUserEntity entity) {
        iFirstOrm.Delete(entity);

    }

    @Override
    public void DeleteElement(DbUserInfoEntity entity) {
        iFirstOrm.Delete(entity);
    }

    @Override
    public DbUserEntity ReadDbUser(int id) {
        return (DbUserEntity)iFirstOrm.Read(id);
    }

    @Override
    public DbUserInfoEntity ReadDbUserInfo(int id) {
        return (DbUserInfoEntity)iFirstOrm.Read(id);
    }

    @Override
    public void UpdateElement(DbUserEntity entity) {
        iFirstOrm.Update(entity);
    }

    @Override
    public void UpdateElement(DbUserInfoEntity entity) {
        iFirstOrm.Update(entity);
    }

}
