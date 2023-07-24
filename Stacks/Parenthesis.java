import java.util.Stack;
import java.util.*;

public class Parenthesis {

public static boolean isParanthesis(String str){
    Stack <Character> s=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        //opening 
        if(ch=='('|| ch=='['|| ch=='{'){
            s.push(ch);
        }
        else{
            
        }
    }
}

    public static void main(String[] args) {
        String str = "(({}))";
        isParanthesis(str);

    }
}