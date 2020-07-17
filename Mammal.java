package farm;


import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight,String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {
        boolean isValid = true;
        if (food.getClass().getSimpleName().equals("Vegetable")){
            if (this.getClass().getSimpleName().equals("Tiger")){
                isValid = false;
            }
        }
        else if (food.getClass().getSimpleName().equals("Meat")){
            if (this.getClass().getSimpleName().equals("Zebra")||
                    this.getClass().getSimpleName().equals("Mouse")){
                isValid = false;
            }

        }
        if (!isValid){
            if (super.getClass().getSimpleName().equals("Mouse")){
                System.out.println("Mice are not eating that type of food!");
            }
            else {
                System.out.println(String.format("%ss are not eating that type of food!",super.getClass().getSimpleName()));

            }
        }else {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        }

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",this.getAnimalType(),
                this.getAnimalName(),df.format(this.getAnimalWeight()),this.getLivingRegion(),
                this.getFoodEaten());
    }

}
