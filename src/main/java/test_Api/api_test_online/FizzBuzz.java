package test_Api.api_test_online;

public class FizzBuzz {
    //Inverti la parola usando un ciclo
    public static String inverti(String input){
        StringBuilder risultato = new StringBuilder();
        for(int i = input.length() -1; i >= 0; i--){
            risultato.append(input.charAt(i));
        }
        return risultato.toString();
    }
    //Oppure
    public static String inverti2(String input){
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {
        //Scrivi un semplice programma Java che stampa i numeri da 1 a 100, ma per i multipli di 3 stampa "Fizz",
        // per i multipli di 5 stampa "Buzz",
        // e per i multipli di entrambi stampa "FizzBuzz".
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println(inverti("Java"));
        System.out.println(inverti2("Inverti2Easy"));
    }
}
