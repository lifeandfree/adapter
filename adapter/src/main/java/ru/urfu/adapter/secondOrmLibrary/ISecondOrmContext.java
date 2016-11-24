package ru.urfu.adapter.secondOrmLibrary;

import java.util.ArrayList;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;

public interface ISecondOrmContext {

    ArrayList<DbUserInfoEntity> getUserInfos();

    ArrayList<DbUserEntity> getUsers();

}
