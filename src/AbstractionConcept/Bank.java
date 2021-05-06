package AbstractionConcept;

public abstract class Bank {

    //STEP 2
    //you  have can also any type of veritable static or non static.

    int amt = 100;
    final int rate = 10;
    static int loanRate = 5;



//STEP 1
//    Partial abstraction
//    hiding the implementation logic -- is called Abstraction
//    Abstract  class can have abs methods and non abs methods.
//    CANNOT CREATE the object of abstract classes.
//     */

    public abstract void loan();// Abstract method --no method body


    //non abstract methods
    public void credit() {
        System.out.println("Bank -- Credit");


    }

    public void debit() {

        System.out.println("Bank -- Credit");

    }


}









