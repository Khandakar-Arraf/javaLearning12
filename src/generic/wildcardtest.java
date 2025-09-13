package generic;

public class wildcardtest {
    public static void main(String[] args) {
        wildcard <Integer> num = new wildcard<>(33);
        System.out.println(num.getvalue());
    }
}
