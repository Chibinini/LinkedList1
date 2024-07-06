import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit frutta1 = new Fruit("Mela");
        Fruit frutta2 = new Fruit("Pera");
        Fruit frutta3 = new Fruit("Fragola");
        Fruit frutta4 = new Fruit("Kiwi");
        Fruit frutta5 = new Fruit("Arancia");

        LinkedList<Fruit> frutti = new LinkedList<Fruit>();
        frutti.add(frutta1);
        frutti.add(frutta2);
        frutti.add(frutta3);
        frutti.add(frutta4);
        frutti.add(frutta5);


        System.out.println(frutti);

        frutti.addFirst(frutta4);
        frutti.addLast(frutta1);

        System.out.println(frutti);
    }
}

//Creare una classe Fruit che accetti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
