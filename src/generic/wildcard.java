package generic;

public class wildcard <T extends Number> {
    private T value;
    wildcard(T value){
        this.value =value;
    }

    public T getvalue(){
        return value;
    }
    public static void main(String[] args) {

    }
}
