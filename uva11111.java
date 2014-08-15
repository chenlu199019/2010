import java.util.*;
public class uva11111{
        public static void main(String[] args){
                boolean test=true;
                Scanner sc = new Scanner(System.in);
                String result="yes";
        //      ArrayList al=new ArrayList();
                // sc.useDelimiter(System.getProperty("line.separator"));
                String temp=sc.nextLine();
                String[] str = temp.split(" ");

                int[] intSet = new int[str.length];
                for(int m=0;m<str.length;m++)
                        intSet[m]=Integer.parseInt(str[m]);
        //      al.add(intSet);
                //if(test)System.out.println(Arrays.toString(intSet));

//              if(test)
//                      System.out.println(al);

                Stack<Integer> st1 = new Stack<Integer>();
                Stack<Integer> st2 = new Stack<Integer>();

                for(int i=0;i<intSet.length;i++){
                        int cur = intSet[i];

                        if(st1.search(-cur)==-1)////// does not find oppo of cur
                                st1.push(cur);
                        else
                                st2.push(cur);
                }
                
                Stack<Integer> st3 = new Stack<Integer>();
                while(!st1.isEmpty()){
                  st3.push(st1.pop());
                }
                if(test){
                        System.out.println(st3);
                        System.out.println(st2);
                }
                
                int len=st2.size();
                if(test)System.out.println("len is "+len);
                for(int i=1;i<len;i++){
                int bigSum=st2.pop();
                st3.pop();
                int curSum=st2.peek();
                int targetFig =curSum;
                int curFig = -st3.peek();
                if(test)System.out.println("bigsum and cur sum and curfig is "+bigSum+", "+curSum+", "+curFig);
                 
                while(curFig!=targetFig){
                  if(!st3.isEmpty()){
                    result="no";
                    break;
                  }           
                    if(test)System.out.println("current fig !=target Fig");
                   int incre = st2.get(0);
                   len+=-1;
                   if(test)System.out.println("st2 after remove the frist is "+st2);
                    curSum+=incre;
                    if(test)System.out.println("curSum is "+curSum);
                    st3.pop();
                    if(test)System.out.println("st3 now is "+st3);
                    curFig=-st3.peek();
                    if(test)System.out.println("next cur fig is "+curFig);
                  }        
                 if(curSum>=bigSum){
                   result="no";
                   break;                
                 }
                 
                 if(test)System.out.println("i is "+i);
            }                                 
                System.out.println(result);
        }

}
                                  
        

