public interface IEntityRepository<T extends IEntity > {
    void add(T entity);
    void read(T entity);
    void delete(T entity);
    void update(T entity);
}
