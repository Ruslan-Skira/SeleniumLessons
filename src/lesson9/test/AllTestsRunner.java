package lesson9.test;

public interface AllTestsRunner {
     void testAll();
     default void testById(int id){
         System.out.println("run test by id " + id);
     }
}
