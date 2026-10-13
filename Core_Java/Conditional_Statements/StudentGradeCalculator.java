// Student Grade Calculator — Intermediate
// Accept a student's marks out of 100 and assign a grade using these ranges:
// - 90–100: A
// - 80–89: B
// - 70–79: C
// - 60–69: D
// - Below 60: F
// Also handle marks outside the valid range.
public class StudentGradeCalculator {
    public static void main(String[] args) {
        int marks = 85;

        if(marks >=90 && marks <= 100){
            System.out.println("Grade A");
        }
        else if(marks >=80 && marks <= 89){
            System.out.println("Grade B");
        }
        else if(marks >=70 && marks <= 79){
            System.out.println("Grade B");
        }
        else if(marks >=60 && marks <= 69){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Fail");
        }
    }
}
