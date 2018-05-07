package lesson11.list;

public abstract class ListAbstract implements List{

    @Override
    public int getFirst() {
        return get(0);
    }

    @Override
    public int getLast() {
        return get(size()-1);
    }
}
