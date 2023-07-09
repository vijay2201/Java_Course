
class Student {
    int rollNo;
    String name;
    int marks;
}

public class arryAdvance {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.marks = 44;
        s1.name = "Vijay";

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.marks = 45;
        s2.name = "Harsh";

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.marks = 46;
        s3.name = "Harshad";

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for(int i = 0 ;i < student.length;i++)
        // {
        // System.out.println("Name : "+student[i].name +" , Roll No :
        // "+student[i].rollNo +" , Marks : "+student[i].marks);
        // }

        // Getting values by For Each loop Or enhanced For Loop : this is used to neglet
        // the error as the for each just go one by one up to the last element whereas
        // array goes length wise where if you provide wrong legnth then the complier
        // will throw an error

        for (Student stud : student) {
            System.out.println(stud.name);
        }

    }

}
