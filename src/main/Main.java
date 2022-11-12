package main;

import util.MenuUtil;
import util.inputUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To School Management System");
        while (true) {
            int operation = inputUtil.enterInteger("Please choose the option" +
                    "\n1:Register Student" +
                    "\n2:Show All Student" +
                    "\n3:Find Student" +
                    "\n4:Update Student" +
                    "\n0:Quit");

            if (operation == 1) {
                MenuUtil.registerstudent();
                ;
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



