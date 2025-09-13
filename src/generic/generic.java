package generic;

public class generic<T> {
    private T value;

    generic(T value){
        this.value = value;
    }

    public T getvalue(){
        return  value;
    }
}
