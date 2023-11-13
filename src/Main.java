import java.util.Scanner;

class KonversiSuhu {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Konversi Suhu  ##");
        System.out.println("==================================");

        double celc, fahr, kelv, ream;

        System.out.print("Masukkan nilai suhu Celsius: ");
        celc = input.nextDouble();
        System.out.println("==================================");

        fahr = (9.0/5.0 * celc) + 32;
        kelv = celc + 273.15;
        ream = celc * (4.0/5.0) ;

        System.out.println(celc+" derajat Celcius = "+fahr+" derajat Fahrenheit");
        if(fahr%5==0)
        {
            System.out.println("Fahrenheit Kelipatan 5");
        }
        else
        {
            System.out.println("Fahrenheit Bukan Kelipatan 5");
        }

        if(fahr%2==0)
        {
            System.out.println("Fahrenheit Kelipatan 2");
        }
        else
        {
            System.out.println("Fahrenheit Bukan Kelipatan 2");
        }
        System.out.println("======================================");


        System.out.println("======================================");

        System.out.println(celc+" derajat Celcius = "+ream+" derajat Reamur");

        if(ream%5==0)
        {
            System.out.println("Kelipatan 5");
        }
        else
        {
            System.out.println("Reamur Bukan Kelipatan 5");
        }
        if(ream%2==0)
        {
            System.out.println("Reamur Kelipatan 2");
        }
        else
        {
            System.out.println("Reamur Bukan Kelipatan 2");
        }
        System.out.println("======================================");


    }
}