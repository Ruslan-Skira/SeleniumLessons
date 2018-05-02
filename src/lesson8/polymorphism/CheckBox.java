package lesson8.polymorphism;

public class CheckBox extends Button {
    private boolean checked;

    public CheckBox(boolean checked) {
        this.checked = checked;
    }

    @Override
    public void draw() {
        System.out.println("DRAW:Checkbox");
    }

    @Override
    public void click() {
        System.out.println("Checkbox click");
        checked = !checked;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public String toString() {
        return "CheckBox{" +
                "checked=" + checked +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                ", x=" + x +
                '}';
    }
}
