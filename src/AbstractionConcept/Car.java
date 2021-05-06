package AbstractionConcept;
//Step 2
// Interface final and static vars


public interface Car {
    //Step 2
    //Only final and static variable;

    int wheels = 4;

    //Step 1
// 100% abs methods (In interface we can have only abs methods, which is created by default.
// Interface mean no method body.
//Only methods declaration.
//CANNOT CREATE the object of interface classes.
// They are all abstract methods.
    public void start();

    public void stop();

    public void refule();

    //in the interface level you are not going to see any implementation logic. Thats why it call 100%
    //abstraction.


}
