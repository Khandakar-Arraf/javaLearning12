public class operator {
    public static void main(String[] args) {
        int a=55;
        if(a>55){
            System.out.println("Grade:C");
        }

        int b=33;
        if(b!=33){
            System.out.println("Fail");
        }

        boolean x = true, y = false;

        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR

        int c=100;
        System.out.println(c);
        System.out.println("<:"+(c<100));
        System.out.println(">"+(c>100));
        System.out.println("<="+(c<=100));

        // ternary operator
        int d = 85;
        int e=66;
        int max = (d>e)?d:e;
        System.out.println("max:"+max);

        // assignment operator
        int f=42;
        f+=44; //f==86
        f-=22; //f=64
        f*=2; // f=128
        System.out.println("f:"+f);
    }
}
