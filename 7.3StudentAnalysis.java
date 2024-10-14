import java.util.Date;

public class StudentAnalysis {

    public static int findNumBirthdayPairs(Student[] studentArray) {
        int birthdayPairs = 0;
        for (Student s1: studentArray) { 
            for (Student s2: studentArray) {
                if ((!s2.name.equals(s1.name)) && s2.birthday.equals(s1.birthday))
                    birthdayPairs += 1;
            }
        }  

        return birthdayPairs;
    }    

    public static int findStudentByName(Student[] studentArray, String studentName) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentName.equals(studentArray[i].name)) {
                return i;
            }
        }
        return -1;
    }

    public static Student getFirstStudent(Student[] studentArray) {
        return studentArray[0];
    }

    public class Student {
        String name;
        Date birthday;
    }

}