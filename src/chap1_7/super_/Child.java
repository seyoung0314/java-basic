package chap1_7.super_;

public class Child extends Parent{

    public int a;
    public boolean c;


    // 생성자 호출은 동기적으로 진행
    public Child(){
//        super();  // 작성하지않아도 자동으로 호출
        this(100);  // this()를 사용하면 super() 호출되지 않음
        System.out.println("Child의 첫번째 생성자 호출!");
    }

    public  Child(int x){
        // 여기에 super()가 있음 여기서 super()호출
        System.out.println("Child의 두번째 생성자 호출!");
    }

    public void subMethod() {
        // 부모 클래스에게 상속받은 값이라해도
        // 자식 클래스의 필드에 선언하면 this는 자식클래스의 필드
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}
