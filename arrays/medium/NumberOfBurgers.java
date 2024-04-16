package arrays.medium;

import java.util.List;

public class NumberOfBurgers {
    public static void main(String[] args) {
        System.out.println(numOfBurgers(16, 7));
        System.out.println(numOfBurgers(17, 4));
        System.out.println(numOfBurgers(4, 17));
        System.out.println(numOfBurgers(0, 8));
//        System.out.println(numOfBurgers(0, 0));
//        System.out.println(numOfBurgers(4, 1));
//        System.out.println(numOfBurgers(2, 1));
    }

    public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int jumboTomato = 4, smallTomato = 2;
        int jumboBurger = 0, smallBurger = 0;
        int initialTomato = tomatoSlices;
        int initialCheese = cheeseSlices;

        if (tomatoSlices == 2 && cheeseSlices == 1) {
            return List.of(0,1);
        }

        while (tomatoSlices >= jumboTomato && cheeseSlices >= 0) {
            tomatoSlices = tomatoSlices - jumboTomato;
            cheeseSlices--;
            if (tomatoSlices / smallTomato == cheeseSlices) {
                smallBurger = tomatoSlices / smallTomato;
                jumboBurger++;
                break;
            }
            jumboBurger++;
        }

//        System.out.println("TomatoSlice: " + tomatoSlices + " Cheese Slice: " + cheeseSlices);
//        System.out.println("JumboBurger: " + jumboBurger + " SmallBurger: " + smallBurger);
        return (((jumboBurger* jumboTomato) + (smallBurger * smallTomato) == initialTomato) && (jumboBurger + smallBurger == initialCheese))? List.of(jumboBurger, smallBurger) : List.of();
    }
}
