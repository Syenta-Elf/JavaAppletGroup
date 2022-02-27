import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir cumle girin:");
        String str = sc.nextLine();
        String vowelList = "aeiou";
        str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = 0; j < vowelList.length(); j++) {
                if(vowelList.charAt(j)==str.charAt(i))
                {
                    System.out.print(vowelList.charAt(j)+" ");
                }
            }
        }

    }
}