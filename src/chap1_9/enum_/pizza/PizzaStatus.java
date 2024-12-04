package chap1_9.enum_.pizza;

public enum PizzaStatus {
    ORDERED("Order received",10),   // 각 상수에 문자열 값을 추가
    READY("Ready for delivery",20),
    DELIVERED("Order delivered",30);

    private final String description;  // 추가 정보 (필드)
    private final int timeSetUp;

    // 생성자
    PizzaStatus(String description, int timeSetUp) {
        this.description = description;
        this.timeSetUp = timeSetUp;
    }

    // getter 메소드
    public String getDescription() {
        return description;
    }

    public int getTimeSetUp() {
        return timeSetUp;
    }
}
