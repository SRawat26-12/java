class StackStr {
     char[] stackArr;
     int top;

    public Stack(int size) {
        stackArray = new char[size];
        top = -1;
    }

    public void push(char c) {
    if(top==size-1)
     System.out.print(“stack is overflow”);
          top++;
        stackArr[top] = c;
    }

    public char pop() {
    if(top==-1)
{
System.out.println(“underflow”);
}
        return stackArr[top];
       top–;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Reverse {
    public static void main(String[] args) {
        String str = "axbycz";
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) {
            rev.append(stack.pop());
        }
        System.out.println(rev.toString());
    }
}


