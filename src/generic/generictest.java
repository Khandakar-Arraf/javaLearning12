package generic;

public class generictest {
    public static void main(String[] args) {
        generic <Integer> g = new generic<>(11);
        generic <String> st = new generic<String>("hello");
        generic <longtest> lt = new generic<>(new longtest());
        System.out.println(g.getvalue());
        System.out.println(st.getvalue());
        System.out.println(lt.getvalue());
    }
}
