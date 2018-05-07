package lesson10.test.api;

public interface AllTestsRunner {
     void testAll();
     default void testById(int id){
         System.out.println("run test by id " + id);
     }
}
