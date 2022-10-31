import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,sayi,total=0,total2,j=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisinin basamak sayısını giriniz: ");
        sayi = input.nextInt();
     for( i = 2;i<=sayi ; i++){
         total2 = total + j;
         System.out.print(total + " + " +j + " = "+total2);
         total = j;
         j= total2;
         System.out.println();
     }


    }

}
