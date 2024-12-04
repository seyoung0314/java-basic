//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.println("Hello 에");
    }

    class Components {
        String stringField;
        int intField;
        double doubleField;
        String[] arrayField;

        public Components() {
        }

        public Components(String stringField, int intField, double doubleField, String[] arrayField) {
            this.stringField = stringField;
            this.intField = intField;
            this.doubleField = doubleField;
            this.arrayField = arrayField;
        }

        public int methodEx(int number) {
            return number;
        }

    }

    public class Parent {
        int parentInt = 50;
    }

    public class Child extends Parent{
        int childInt = 30;
    }
    public class Main2{
        Child child = new Child();
    }


}
