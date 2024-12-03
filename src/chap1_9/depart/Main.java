package chap1_9.depart;

public class Main {
    public static void main(String[] args) {

        Department department1 = new Department("컴퓨터공학",200);
        Department department2 = new Department("생명공학",100);
        Department department3 = new Department("화학공학",120);
        Department department4 = new Department("전자공학",160);
    
        department2.addStudent(10);
        department3.addStudent(23);

        System.out.println("전체 학생 수 " + Department.getTotalStudentCount());
    }
}
