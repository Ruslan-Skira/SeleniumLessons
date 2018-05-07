package lesson9.test;

public class Button implements RichComponents {
    @Override
    public void colorDraw() {
        System.out.println("Button");
    }

    @Override
    public void draw() {
        System.out.println("Sound");

    }

    @Override
    public void sound() {
        System.out.println("Color Draw");

    }
}
