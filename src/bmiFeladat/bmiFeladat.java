package bmiFeladat;

import java.util.Scanner;

public class bmiFeladat {

    static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        bmiFeladat();
    }
    
    public static void bmiFeladat() {
        kiir("BMI kiszámítása\n");
        kiir("-------------------------\n");
        int m = beker("Testmagasság (cm)");
        int t = beker("Testtömeg (kg)");
        double bmi = bmiSzamit(t, m);
        kiir("-------------------------\n");
        ertekeles(bmi);
    }
    
    public static void kiir(String szoveg){
        System.out.print(szoveg);
    }
    
    public static double bmiSzamit(int t, int m){
        return t / Math.pow(m / 100.0, 2);
    }
    
    public static int beker(String kerdes){
        kiir(kerdes + ": ");
        return scn.nextInt();
    }
    
    public static void ertekeles(double bmi){
        kiir("Az Ön BMI értéke: " + bmi + "\n");
        if (bmi < 20) {
            System.out.println("- Sovány");
        }
        else if (bmi < 25) {
            System.out.println("- Normál");
        }
        else if (bmi < 30) {
            System.out.println("- Túlsúlyos");
        }
        else if (bmi < 40) {
            System.out.println("- Elhízott");
        }
        else {
            System.out.println("- Kórosan elhízott");
        }
    }
}
