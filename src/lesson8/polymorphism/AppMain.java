package lesson8.polymorphism;

public class AppMain {
    public static void main(String[] args) {
        Object btn = new Button();
        btn.toString();
        ((Button)btn).draw();

        Object btn1 = new String("stroka");
        //Button button = (Button)btn1;
        //button.draw();

//        Object obj = new Object();
//        System.out.println(obj.toString());

        Object[] arrBtn = new Object[3];
        arrBtn[0] = new Button();
        arrBtn[1] = new CheckBox(true);
        arrBtn[2] = new Label();

        for (int i = 0; i < arrBtn.length; i++) {
            System.out.println(arrBtn[i]);
            ((Component)arrBtn[i]).draw();
        }

}
}
