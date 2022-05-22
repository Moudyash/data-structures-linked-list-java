package stack;


public class Stack{
    int size=5 ;
    int []a = new int[size];
    int top=-1;
   
    public  void push(int val){
      
       if(isfull()){
           System.out.println("Stack is Full.");
       }
       else{
           top=top+1;
           a[top]=val;

           System.out.println("The value is pushed in Stack = "+val);
       }
    }
    public  int pop(){
          
	    if(isempty()){
           	System.out.println("Empty!!");
                return 00;
            }else{
                    int x=a[top];
                     top=top-1;
                       return x;
                  }
    }
    
    public  boolean isempty(){
        if(top==-1){
            return true;
        }else 
            return false;
    }
    
    public  boolean isfull(){
        if(top==size-1){
            return true;
        }else 
            return false;
    }

    
    
    public static void main(String[] args) {
        Stack ss=new Stack();
         
        int sum =0;
        int i=0;
        while(!ss.isfull()){
            ss. push(i);
            i++;
        }
     int[] rev=new int[8];
        for (int j = 0; j < 5; j++) {
            rev[j]= ss.pop();
          System.out.print(rev[j]+" ");   
        }
        
          
    }
}

