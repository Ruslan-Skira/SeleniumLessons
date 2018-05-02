package lesson8.polymorphism;

public abstract class Component {
    protected int width;
    protected int height;
    protected String text;
    protected int x;
    private int y;

    public abstract void draw();

    @Override
    public String toString() {
        return "Component{" +
                "width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
