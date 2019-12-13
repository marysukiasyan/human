package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        Human h1 = new Human();
        h1.firstName = "John";
        h1.lastName = "Miller";
        h1.gender = 'm';
        h1.bornYear = 1990;


        Human h2 = new Human();
        h2.firstName = "Ann";
        h2.gender = 'f';
        h2.bornYear = 1994;
        h2.lastName = "Smith";

        Human h3 = new Human();
        h3.firstName = "Ann";
        h3.gender = 'f';
        h3.bornYear = 1992;
        h3.lastName = "Smith";

        FunctionManager func= new FunctionManager();
        System.out.println(func.sum(4, 5));

        func.printIfGenderIsMale(h2);

        func.printLongestLastName(h1, h2, h3);

        func.printNamesNextToEachOther(h1, h2);

        func.printHumansName(true, h1);

        int[] arr={2, 3, 4};

        func.printMaxElement(arr);


        float[] arr10={1.5f, 2.15f, 0.5f};
        func.printMinElementIndex(arr10);

        Human[] humans = {h1, h2, h3};
        func.sortedHumansByAscending(humans);

    }
}
