import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Main{
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> cift = new ArrayList<>();
        List<Integer> tek = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(0,100);
            
            if(n%2==0)
            {
                cift.add(n);
            }else{
                tek.add(n);
            }
        }
        System.out.println("Cift Sayilar");
        for (Integer integer : cift) {
            System.out.print("["+integer+"] ");
        }
        System.out.println("\n\nTek Sayilar");
        for (Integer integer : tek) {
            System.out.print("["+integer+"] ");
        }
        
    }
}