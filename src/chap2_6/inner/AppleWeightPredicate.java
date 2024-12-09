package chap2_6.inner;

import chap2_7.lambda.Apple;
import chap2_7.lambda.ApplePredicate;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight()>15;
    }
}
