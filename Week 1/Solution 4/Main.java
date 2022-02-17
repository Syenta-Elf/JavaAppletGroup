import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double keep=0;

        try {
            System.out.print("Sayi girin:");
            x = sc.nextDouble();
            System.out.print("Sayi girin:");
            y = sc.nextDouble();
            sc.close();

            System.out.println("Degismeden once:  "+x);
            System.out.println("Degismeden once:  "+y);
            keep = x;
            x = y;
            y =keep;
    
            System.out.println("Degisimden sonra: "+x);
            System.out.println("Degisimden sonra: "+y);
            
        } catch (Exception e) {
            System.out.println(e.toString());
            sc.close();
        }

        
    }
}