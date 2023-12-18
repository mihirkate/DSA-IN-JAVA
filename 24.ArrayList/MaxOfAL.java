import java.util.*;
public class MaxOfAL {
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(0);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println("max element is "+max);
        System.out.println("min element is "+min);
    }
}
