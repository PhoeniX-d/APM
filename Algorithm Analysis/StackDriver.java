import java.util.Scanner;

class StackDriver{

    public static final int MAX = 100;
    int top = -1;
    int[] theStack = new int[MAX];
    
    public boolean isStackEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return (top == (MAX - 1));
    }

    public void push(int data){
        if(isStackFull())
            return;
        theStack[++top] = data;
    }
    public int pop(){
        if(isStackEmpty())
            return top;
        return theStack[top--];
    }
    public int findMiddle(){
        if((top+1) % 2 == 0)
            return theStack[(int)top/2];
        else
            return theStack[(int)(top+1)/2];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackDriver stack = new StackDriver();
        
        System.out.println("Enter the number of elements to be pushed in the stack:");
        int n = sc.nextInt();
        if(n > 0){
            for(int i = 0; i < n; i++){
                System.out.println("Enter the element " +(i+1) + ":");
                stack.push(sc.nextInt());
            }
            System.out.print("The middle element is: " +stack.findMiddle());
            System.out.print("\nThe popped element is: " +stack.pop());
        }
        else
            System.out.println("Invalid Input");
        sc.close();
    }
}