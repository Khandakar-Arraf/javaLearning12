package Java_4th_assignment;

class employee extends  person{
    private String id;
}


class person{
    public String name;
    public int age;
    private int nid;
    protected double salary;



    void talks(){ // default
        System.out.println("I can talk");
    }

    protected void job(){
        System.out.println("I perform the job");
    }



public class access_modifier {
    public static void main(String[] args) {
        // all access modifier public, private, default, protected

        person person1 = new person();

        person1.nid = 2452142;



        }

    }
}
