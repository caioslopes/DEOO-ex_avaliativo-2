package infra.repository;

import java.util.Collection;

public interface IRepository<T, I> {

    public void save(T t);

    public void saveAll(Collection<T> collection);

    public T find(I identifier);

    public Collection<T> findAll();

    public void delete(I identifier);

}
