package lesson8.polymorphism;

public class Label extends Component {
    @Override
    public void draw() {
        System.out.println("Label");
    }

    @Override
    public String toString() {
        return "Label{}";
    }
}
