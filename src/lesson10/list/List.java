package lesson10.list;

public interface List {
    int size(); //
    int get(int index, int element);
    int getFirst();
    int getLast();
    boolean contains(int element);
    boolean isEmpty();

}
