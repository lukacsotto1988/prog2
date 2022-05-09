package Tv;

public interface IFilter<T> {
    boolean isSelected(T object);
}
