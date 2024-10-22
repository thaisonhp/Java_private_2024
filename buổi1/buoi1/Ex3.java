package buoi1;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 5 ;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(3) + " " + list.get(4));
    }
}
