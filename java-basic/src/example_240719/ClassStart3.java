package example_240719;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;   //첫번째 학생을 담아둘수 있는 변수를 선언
        student1 = new Student();   //이 변수를 통해서 학생의 정보를 담아둘수 있다
        student1.name = "학생1";   //클래스를 만든건 .(온점)을 통해 접근할수있다
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] student = new Student[2];
        student[0] = student1;
        student[1] = student2;

        System.out.println("이름: " + student[0].name + "나이: " + student[0].age + "성적: " + student[0].grade);
        System.out.println("이름: " + student[1].name + "나이: " + student[1].age + "성적: " + student[1].grade);

        /*클래스(=설계도)를 기반으로 실제 메모리에 만들어진 실체 = 객체 or 인스턴스*/
    }
}
