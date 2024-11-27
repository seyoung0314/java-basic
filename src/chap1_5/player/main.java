package chap1_5.player;

public class main {
    public static void main(String[] args) {
        Player tokki = new Player("토끼공주");
        Player samchi = new Player("삼치");

        System.out.println("samchi = " + samchi);
        System.out.println("tokki = " + tokki);

        tokki.attack(samchi);
        tokki.attack(samchi);
        tokki.attack(samchi);
    }
}
