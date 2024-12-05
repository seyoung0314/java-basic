package chap2_3.generic;

// Fruit 클래스의 자식만 담게
// 바구니가 만들어 질 때 F가 결정됨
public class Basket<F extends Fruit> {

    // F : 제네릭 타입 - 설계 당시에는 정확한 타입이 없는 상태
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruit=" + fruit +
                '}';
    }
}
