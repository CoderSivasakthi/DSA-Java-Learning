import java.util.Stack;

public class Stackdemo {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        for(int i=0;i<10;i++){
            stack.push(i);
        }
        System.out.println(stack);

        for (int i=5;i>0;i--){
            stack.pop();
        }
        System.out.println(stack);

        Stack<String>stacks = new Stack<>();
        stacks.push("today i completed stack push and pop inbuild methods");

        System.out.println(stacks +" "+ stack);
    }
}
