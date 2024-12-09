package chap2_7.lambda;

@FunctionalInterface
public interface ApplePredicate {
    //사과를 전달받아 특정 조건에 의해 사과를 필터링
    public boolean filter(Apple apple);
}
