package AbstractionConcept;

public class TestCar {

    public static void main(String[] args) {

        //we cannot create object of interface.

        BMW b = new BMW();

        b.start();
        b.stop();
        b.refule();
        b.theftSafety();


// its all dynamic Polymorphysim or top cast (Child Class object can be refer by parents class reference veriable
        Car c = new BMW();
        c.start();
        c.stop();
        c.refule();


    }


}
