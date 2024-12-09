package chap2_7.lambda.basic;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean filter(T t);
}
