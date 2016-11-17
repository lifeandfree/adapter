package ru.urfu.adapter;

import ru.urfu.adapter.firstOrmLibrary.IFirstOrm;

public class FirstOrmAdapter<TDbEntity> implements ITarget {

    private IFirstOrm<TDbEntity> firstOrm;

    public FirstOrmAdapter() {

        // TDbEntity entity;
        // firstOrm.Create(entity);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void targetMethod(Object entity) {
        firstOrm.Create((TDbEntity)entity);
    }

}
