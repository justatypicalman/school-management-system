package school.management.system;

//    This class is responsible for keeping track of
//    students' fees, name, grade and paid fees.

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30_000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade=grade;
    }


    /**
     *
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * Keep adding the fees to feesPaid field.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

    //return id of the student
    public int getId() {
        return id;
    }


    //return name of the student
    public String getName() {
        return name;
    }


    //return grade of the student
    public int getGrade() {
        return grade;
    }


    //return fees paid by the student
    public int getFeesPaid() {
        return feesPaid;
    }


    //return the total fees of the student
    public int getFeesTotal() {
        return feesTotal;
    }
}
