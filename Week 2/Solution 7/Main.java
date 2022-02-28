import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir metin girin:");
        String metin = sc.nextLine();


        System.out.println("Bir sayi girin");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(i+". "+metin);
        }
    }
}