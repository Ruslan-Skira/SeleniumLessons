package lesson8.polymorphism;

import java.util.Objects;

public class Button extends Component implements Component3D {

    @Override
    public void draw() {
        System.out.println("draw:Button");
    }

    @Override
    public void draw3D() {
        System.out.println("draw3d:button");
    }

    @Override
    public String toString() {
        return "Button{}";
    }

    public void click() {
        System.out.println("Click button");
    }
}
