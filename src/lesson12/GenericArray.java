package lesson12;

public class GenericArray <T> {


    private  T [] array;
    public GenericArray(T... values) {// ... any amount of the arguments
        this.array = values;
    }

    public T get(int index){
        return array[index];
    }
     public void set (T value, int index){
        array[index] = value;

    }

}
