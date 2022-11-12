package main;

import util.MenuUtil;
import util.inputUtil;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To School Management System");
        while (true) {
            int operation = inputUtil.enterInteger("""
                    Please choose the option
                    1:Register Student
                    2:Show All Student
                    3:Find Student
                    4:Update Student
                    0:Quit""");

            if (operation == 1) {
                MenuUtil.registerstudent();
            } else if (operation == 2) {
                MenuUtil.printallstudent();
            } else if (operation == 3) {
MenuUtil.findstudent();
            }
            else if(operation==4){
                MenuUtil.updatestudent();


            }
            else if(operation==0){
                System.out.println("Quitting from system");
                break;
            }
            else{
                System.out.println("Invalid operation!");
            }
        }
    }
}



