package model;

public interface Specification<T> {
   boolean isSatisfiedBy(T entity);
}
