package lesson9.test;

import lesson8.polymorphism.Component3D;

public class ButtonMulti implements RichComponents, Components3D{
    @Override
    public void drow3D() {

    }

    @Override
    public void colorDraw() {

    }

    @Override
    public void draw() {

    }

    @Override
    public void sound() {

    }
    public void collectComponent(Component component) {
        if (component instanceof Component3D){
            Component3D cmp = (Component3D)component;
        }
    }
}
