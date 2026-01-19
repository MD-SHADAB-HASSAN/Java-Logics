import java.util.Scanner;
import java.util.Stack;
public class BalancedBrakets {
    public static boolean isMatching(char open,char close){
        return(open=='(' && close==')')||
                    (open=='{' && close=='}')||
                    (open=='['&& close==']');
      }

      public static String makeBalanced(String s){
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        boolean[] remove = new boolean[s.length()];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch =='('|| ch=='{' || ch=='['){
                st.push(i);
            }

            else if(ch==')'|| ch=='}'||ch==']'){
                if(st.size()==0) {remove[i] = true;}
                else {char top = s.charAt(st.peek());
                    if(isMatching(top, ch)){
                        st.pop();
                    }
                    else{
                    remove[i] =true;
                }
                }
            }
        }
      

        while(st.size()!=0){
            remove[st.pop()] = true;
        }

        char[] result=new char[s.length()];
        int idx = 0;

        for(int i=0;i<s.length();i++){
            if(remove[i]==false){
                result[idx++] = s.charAt(i);
            }
        }
        return new String(result,0,idx);
    }

    public static void main(String[] args) {
        System.out.print("Eneter The String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(makeBalanced(s));
    }
}
