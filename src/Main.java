public class Main {

    public static int LENGTH = 100000;

    public static int TIMES = 10;

    public static void main(String[] args) {


        Functions functions = new Functions();

        Quick quick = new Quick();
        quick.sort(functions.generate());

        Comb comb = new Comb();
        comb.sort(functions.generate());


    }

}


