public class ObjectArray {
    static class Student{
        String name;
        int Rollno;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ram";

        Student s2 = new Student();
        s2.name = "Sita";
        
        Student s3 = new Student();
        s3.name = "Geeta";
 
        Student[] students = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student s : students){
            System.out.println(s.name + " ");
        }
    }
}
