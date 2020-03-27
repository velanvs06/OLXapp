package com.atlas.mainclass;

import com.atlas.controller.UserController;
import com.atlas.utilities.ScannerClass;
import com.atlas.controller.admin;

public class MainClass {
    public static void main(String[] args) {
        ScannerClass scannerClass = ScannerClass.getInstance();
        System.out.println("Login Option:");
        System.out.printf("1: admin");
        System.out.printf("2: user");
        System.out.println("Press 0 to exit");
        boolean loop = true;
        while(loop = true) {
        switch (scannerClass.readInt())
        {
                case 1:
                    new admin().adminStart();
                    break;
                case 2:
                    UserController.getInstance().UserStart();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter correct option");
                    break;
            }
        }
    }

}
