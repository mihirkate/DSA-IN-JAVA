import java.util.Vector;

public class SumSubset {
    public static boolean helprt(Vector a ,int sum,int tempsum,int i){
        
if(sum==tempsum){
    return true;
}
if(i>=a.size()){
    return false;
}
int rec1=helprt(a, sum, tempsum+a[i], i+1);
int rec2=helprt(a, sum, tempsum, i+1);



        return rec1||rec2   ;
    }
    public static void printSubset(Vector <Integer>v[]){
        for (int i = 0; i < v.size(); i++) 
{
    System.out.println(v.get(i));
}
    }
    public static void main(String[] args) {

    }
}