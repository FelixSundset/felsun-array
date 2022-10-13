import java.util.Arrays;

public class ArrayUppgifter {

//Uppgift 1 Arrays
/*
    public static void main(String[] args) {

        int[] num = {1948, 1111, 4523, 9823, 982, 8743};

        String[] name = {"Degerfors","Halmstad", "Stockholm", "Malmö", "Luleå", "Bajs"};

        System.out.println("Som vanligt "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("I ordning "+ Arrays.toString(num));

        System.out.println("Namn som vanligt "+ Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Namn i ordning "+ Arrays.toString(name));

    }
}
 */
//Uppgift 2 Arrays

    public static void main(String[] args) {
        int[] num = {10, 20, 10, 30, 10};
        System.out.println(Arrays.toString(num));
        System.out.println(num.length);
        System.out.println("Summan är: "+ Arrays.stream(num).sum());
    }
}


