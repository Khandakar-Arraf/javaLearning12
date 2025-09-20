package Java_4th_assignment;

public class method_object {
    public static void main(String[] args) {

        person arraf = new person();
        arraf.name = "arraf";
        //arraf.nid  nid is private
        arraf.age = 25;

        arraf.talks(); //default method accessible from same package

        employee emp1 = new employee();
        emp1.salary = 45.33;
        //emp1.nid nid id private


    }
}
