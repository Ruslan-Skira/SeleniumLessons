package lesson9.test;

public interface Component {
    int DEFAULT_WIDTH = 50;
    int DEFAULT_HEIGHT = 20;
    void draw();

    default void animation(){}
    static void printDoc() {
        System.out.println("Component");
    };
}
