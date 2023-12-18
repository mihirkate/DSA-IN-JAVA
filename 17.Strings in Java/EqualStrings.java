public class EqualStrings {
    public static void main(String[] args) {
        String s1="mihir";
        String s2="kate";
        String s3= new String("mihir  t");
        // if(s1==s2){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }

        // if(s1==s3){
        //     System.out.println("s1 and s3 are equals");
        // }
        // else{
        //     System.out.println("s1 s3 not equals ");
        // }
        // if( s1.equals(s3)){
        //     System.out.println("S1 and s3 are ewual bro ");
        // }
        // else{
        //     System.out.println("not ");
        // }
        System.out.println(s1.equals(s2)+" "+s1.equals(s3));
    }
}
