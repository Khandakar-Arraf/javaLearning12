package Java_4th_assignment;

public class loop_jumping {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            System.out.println("number:"+i);
        }

        //jumping example conitnue and break
        for(int i=15; i>2; i--){
            if (i==10)
                continue;
            if(i==5)
                break;
            System.out.println(i);

        }

        int i=0;
        do{
            System.out.println("hello");
            i++;
        }
        while (i<7);

        String[] lists ={"a","b","c","d"};
        for(String j:lists){
            System.out.println(j);
        }
    }
}
