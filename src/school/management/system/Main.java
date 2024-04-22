package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellissa = new Teacher(2, "Mellissa", 1000);
        Teacher eric = new Teacher(3, "Eric", 2000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellissa);
        teacherList.add(eric);

        Student debora = new Student(1, "Debora",4 );
        Student allaisah = new Student(2, "Allaisah", 12);
        Student sam = new Student(3, "Sam", 10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(debora);
        studentList.add(allaisah);
        studentList.add(sam);

        School jhs = new School(teacherList, studentList);
        debora.payFees(50000);

        allaisah.payFees(20000);
        System.out.println("JHS has earned P" + jhs.getTotalMoneyEarned());

        System.out.println("-----Making School Pay Salary-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("JHS has spent for salary to "+lizzy.getName());
        System.out.println("JHS now has " + jhs.getTotalMoneyEarned());

        eric.receiveSalary(eric.getSalary());
        System.out.println("JHS now has spent for salary to "+eric.getName());
        System.out.println("JHS now has " + jhs.getTotalMoneyEarned());

        System.out.println(allaisah);
        System.out.println(eric);
    }
}
