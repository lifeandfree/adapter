package ru.urfu.adapter;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;

public class Application {

    public static void main(String[] args) {

        FirstOrmAdapter firstOrmAdapter = new FirstOrmAdapter();
        DbUserEntity entity = new DbUserEntity();
        firstOrmAdapter.createElement(entity);

        DbUserInfoEntity dbUserInfoEntity = new DbUserInfoEntity();
        firstOrmAdapter.createElement(dbUserInfoEntity);

        SecondOrmAdapter secondOrmAdapter = new SecondOrmAdapter();
        secondOrmAdapter.createElement(entity);

        secondOrmAdapter.createElement(dbUserInfoEntity);

    }

}
