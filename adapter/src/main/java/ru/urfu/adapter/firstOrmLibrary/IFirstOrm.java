package ru.urfu.adapter.firstOrmLibrary;

public interface IFirstOrm<TDbEntity> {

    void Create(TDbEntity entity);

    void Delete(TDbEntity entity);

    TDbEntity Read(int id);

    void Update(TDbEntity entity);

}
