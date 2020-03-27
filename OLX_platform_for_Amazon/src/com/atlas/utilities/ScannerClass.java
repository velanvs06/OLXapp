package com.atlas.utilities;

import java.util.Scanner;

public class ScannerClass {

    private static ScannerClass scannerClass;
    Scanner sc;
    private ScannerClass()
    {
        sc = new Scanner(System.in);
    }
    public static ScannerClass getInstance()
    {
        if (scannerClass == null)
        {
            scannerClass = new ScannerClass();
            return scannerClass;
        }
        else {
            return scannerClass;
        }
    }

    public int readInt()
    {
        int val = sc.nextInt();
        return val;
    }
    public String readLine()
    {
        return sc.nextLine();
    }

}
