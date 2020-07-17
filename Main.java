package farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Animal>animals = new ArrayList<>();


        while  (!line.equals("End")){

                String [] input = line.split("\\s+");

            Animal animal = createAnimal(input);

                line = scanner.nextLine();

                 input = line.split("\\s+");
                 Food food = null;
                 switch (input[0]){
                     case "Vegetable":
                         food = new Vegetable(Integer.parseInt(input[1]));
                         break;
                     case "Meat":
                         food = new Meat(Integer.parseInt(input[1]));
                         break;
                 }


            assert animal != null;
            animal.makeSound();
                 animal.eat(food);
                 animals.add(animal);

            line = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    private static Animal createAnimal(String[] input) {
        switch (input[0]) {
            case "Mouse":
                return new Mouse(input[0], input[1], Double.parseDouble(input[2]),
                        input[3]);

            case "Zebra":
                return new Zebra(input[0], input[1], Double.parseDouble(input[2]),
                        input[3]);

            case "Cat":
                return new Cat(input[0], input[1], Double.parseDouble(input[2]),
                        input[3], input[4]);


            case "Tiger":
                return new Tiger(input[0], input[1], Double.parseDouble(input[2]),
                        input[3]);


        }
        return null;


    }


}
