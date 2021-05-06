package AbstractionConcept;

public class TestBank {

    public static void main(String[] args) {

        CityBank cb = new CityBank();

        cb.credit();
        cb.loan();
        cb.debit();
        cb.funds();


        Bank b = new CityBank();

        b.credit();
        b.debit();
        b.loan();

        }


    }











