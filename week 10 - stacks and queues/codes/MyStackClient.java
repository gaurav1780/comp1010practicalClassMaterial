public class MyStackClient {
    public static void main(String[] args) {
        MyStack stk = new MyStack();
        stk.push("my young padawan");
        stk.push("you must have");
        stk.push("patience");
        System.out.println(stk);

        stk.pop();
        stk.push("something to eat");
        System.out.println(stk);
    }
}
