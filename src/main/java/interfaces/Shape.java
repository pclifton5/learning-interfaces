package interfaces;

public interface Shape {

    //Implicitly public, static and final
    String LABEL = "Shape";

    //Interface method are implicit abstract and public by default\
    void draw();

    double getArea();

    //Default
    default void defaultTest() {
        System.out.println("Default Test");
    }

    default void defaultTest1(){
        System.out.println("Default Test 1");
    }
}
