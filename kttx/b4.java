package kttx;
import java.util.*;
public class b4 {
    public static long tong(ArrayList<Long> array , int l, int r ){
        long result = 0 ;
        for(int i = l - 1; i < r ;i++){
            result += array.get(i) ;
        }
        return  result ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextLong());
        }
        int q = sc.nextInt();
        ArrayList<Long> result = new ArrayList<>();
        for(int i = 0 ; i < q ; i++){
            int left = sc.nextInt(); int right = sc.nextInt();
            result.add(tong(list,left,right));
        }
        System.out.println(result);
    }
}
