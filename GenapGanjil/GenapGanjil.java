package GenapGanjil;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        int proses, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        n = input.nextInt();
        proses = n%2;
        
        if (proses == 0){
            System.out.println("Bilangan GENAP");
        }else{
            System.out.println("Bilangan GANJIL");
        }
    }
    
}
