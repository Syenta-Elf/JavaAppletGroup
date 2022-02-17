import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Bir sayi girin:");
            double x = sc.nextDouble();
            System.out.print("Bir sayi girin:");
            double y = sc.nextDouble();
            sc.close();
            System.out.println(x*y);
        } catch (Exception e) {
            System.out.println(e.toString());
            sc.close();
        }
    }
}