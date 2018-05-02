package lesson8.test;

 public class BasketTest extends BaseTest {

     public BasketTest(String login, String password, String url) {
         super(login, password, url);
     }

     public void testBasketAdd() {
         System.out.println("start testBasketAdd");
         // проверка, если за логинен
         //boolean authorised = isAuthorised();
         if (!isAuthorised())
             authorise();
         System.out.println("Считываю, что хранится в корзине до добавления в список 'listBefore'");
         System.out.println("Добавляю в корзину новый товар");
         System.out.println("Считываю, что хранится в корзине после добавления в список 'listAfter'");
         System.out.println("Сравниваю два списка");
     }

     public void testBasketRemove() {
         //addToBasket();
     }

     @Override
     public String toString() {
         return "BasketTest{}";
     }
 }
