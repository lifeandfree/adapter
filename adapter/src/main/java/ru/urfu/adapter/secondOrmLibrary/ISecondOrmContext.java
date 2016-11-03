package ru.urfu.adapter.secondOrmLibrary;

import java.util.HashSet;

import ru.urfu.adapter.models.DbUserEntity;
import ru.urfu.adapter.models.DbUserInfoEntity;

public interface ISecondOrmContext {

    HashSet<DbUserInfoEntity> getUserInfos();

    HashSet<DbUserEntity> getUsers();
}
