import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        
        try {
            System.out.print("Bir Sayi Girin:");
            x = sc.nextInt();
            sc.close();
            for (int i = 1; i < 11; i++) {
            System.out.println(x+" * "+i+" = "+(i*x));
        }
        } catch (Exception e) {
            System.out.println(e.toString());
            sc.close();
        }


    }
}