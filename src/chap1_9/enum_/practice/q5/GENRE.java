package chap1_9.enum_.practice.q5;

public enum GENRE {
    FICTION("소설"),
    NONFICTION("실화"),
    SCIENCE("과학"),
    HISTORY("역사");

    private final String korean;

    GENRE(String korean) {
        this.korean = korean;
    }

    public String getKorean(){
        return korean;
    }
}
