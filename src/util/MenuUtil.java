package util;

import main.Configuration;
import main.Student;

public class MenuUtil {
    public static void printallstudent() {
        if(Configuration.students==null){
            System.out.println("No registered student found");
            return;
        }
        System.out.println("student that you have registered: ");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            System.out.println((1 + i) + " .Student \n" + st.getInfo());
        }
    }

    public static void registerstudent() {
        int count = inputUtil.enterInteger("how many student will you register? ");
        Configuration.students = new Student[count];

        for (int i = 0; i < count; i++) {
            Student st = inputUtil.fill();
            Configuration.students[i] = st;
        }
    }
    public static void findstudent(){
        String find = inputUtil.enterString("Enter name or surname you want to find: ");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            if (st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)) {
                System.out.println(st.getInfo());
            }
        }
    }

    public static void updatestudent(){
        int student_place = inputUtil.enterInteger("select the student to update his/her info. ");
        System.out.println("Enter new information");
        Student st = inputUtil.fill();

        //Configuration.students[student_place-1] -- since array indexing starts from 0, so we need to decrease the value, else
        //it will direct us to wrong array value
        Configuration.students[student_place-1] = st;
        System.out.println(st.getInfo());
    }
}
