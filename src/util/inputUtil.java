package util;

import main.Student;

import java.util.Scanner;

public class inputUtil {
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String enterString(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Student fill(){
        String name = inputUtil.enterString("Enter student name: ");
        String surname = inputUtil.enterString("Enter student surname: ");
        int age = inputUtil.enterInteger("Enter student age: ");
        String className = inputUtil.enterString("Enter student class name: ");
        return new Student(name,surname,age,className);
    }
    public static void main(String[] args) {

    }
}
