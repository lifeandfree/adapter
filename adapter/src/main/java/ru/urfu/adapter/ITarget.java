package ru.urfu.adapter;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;

public interface ITarget {

    void createElement(DbUserEntity entity);

    void createElement(DbUserInfoEntity entity);

    void DeleteElement(DbUserEntity entity);

    void DeleteElement(DbUserInfoEntity entity);

    DbUserEntity ReadDbUser(int id);

    DbUserInfoEntity ReadDbUserInfo(int id);

    void UpdateElement(DbUserEntity entity);

    void UpdateElement(DbUserInfoEntity entity);
}
