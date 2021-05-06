package AbstractionConcept;

public class BMW implements Car {

    //Whenever we implements we have to @Override. by hover over implements logic.
    //We have to overide the methods from Car Class

    @Override
    public void start() {
        System.out.println("BMW ---Stars");

    }

    @Override
    public void stop() {
        System.out.println("BMW ---Stop");

    }

    @Override
    public void refule() {
        System.out.println("BMW --- refule ");

    }

    //Non over ridden method

    public void theftSafety(){

        System.out.println("BMW --- theftSafety");
    }

}
