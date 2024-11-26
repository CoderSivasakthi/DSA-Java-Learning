import java.util.Stack;

public class OwnStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public OwnStack(int size){
        maxSize = size;
        top=-1;
        stackArray= new int[maxSize];
    }

    public void push(int value){
        if(top== maxSize-1){
            System.out.println("stack is overflow");
            return;
        }
        stackArray[++top] = value;
        System.out.println(" stack pushed "+value);
    }

    public int pop(){
        if(top==-1){
            System.out.println("stack is on underflow");
            return -1;
        }
        int popvalue = stackArray[top--];
        System.out.println("this value is popped "+ popvalue);
        return popvalue;
    }

    public int top(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public static void main(String args[]){
        OwnStack st = new OwnStack(5);
        st.push(19);
        st.push(22);
        st.push(10);
        st.push(44);
        st.push(99);

        System.out.println(st.top);
        System.out.println(st);

        st.pop();
        System.out.println(st);
    }
}
