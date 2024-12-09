package chap2_7.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean filter(T t);
}
