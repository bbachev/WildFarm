package farm;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();
   public  abstract void eat(Food food);

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %d]",this.getAnimalType(),
                this.getAnimalName(),this.getAnimalWeight().toString(),this.getFoodEaten());
    }
}
