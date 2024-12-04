package chap1_9.enum_.practice.q4;

public enum Weather {
    SUNNY("선크림을 바르세요"),
    CLOUDY("우산을 챙기세요"),
    RAINY("비가 오니 우산을 꼭 챙기세요"),
    SNOWY("따뜻하게 입으세요");

    private final String desc;

    Weather(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
