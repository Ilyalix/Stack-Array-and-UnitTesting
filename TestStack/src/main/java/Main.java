

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack(5);
        System.out.println(stack.getTop());
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(11);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
