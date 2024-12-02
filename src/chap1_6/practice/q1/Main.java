package chap1_6.practice.q1;

public class Main {
    public static void main(String[] args) {
        LibraryMember member1 = new LibraryMember("M0001", "김영희");

        member1.borrowedBook();
        member1.borrowedBook();
        member1.borrowedBook();
        member1.borrowedBook();

        member1.displayMemberInfo();
    }
}
