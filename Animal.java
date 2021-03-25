package safari;
import java.util.Arrays;
// Mold - a blueprint
//Parent -
public abstract class Animal {
    private String breed; // ivar
    private String name;
    public Animal(String breed, String name){
        this.breed = breed;
        this.name = name;
    }
    //getter
    public String getBreed(){
        return this.breed;
    }
    //getter
    public String getName(){
        return this.name;
    }
    // method signature
    public abstract void  moveAnimal(int distance);
    //create a method that takes an array of Animals
    public static void printAnimals(Animal[] passMeAnArrayOfAnimals){
        for(Animal animal : passMeAnArrayOfAnimals){
            System.out.println("printing animal : " + animal);
        }
    }
    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }
//Create a static method that takes an Array Of Pets , loops through and prints each pet object

    public static void printsEachPetGreeting(IPet[] arrayOfPets){
       //for each Pet object in the pet array
        for(IPet pet : arrayOfPets){
            pet.greetOwner();
        }

    }

    public static void printsEachPetObject(IPet[] arrayOfPets){
        for(IPet pet : arrayOfPets){
            System.out.println("Printing Your Pet Object: "+ pet.getClass().getSimpleName());
        }

    }

    private static void arrayOfPets(String toString) {
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("corgi", "milly");
        Turtle turtle1 = new Turtle("spotted", "Emilio");
        DigitalSnail digitalSnail1 = new DigitalSnail();
        IPet[] array1 = {dog1, turtle1, digitalSnail1};

        printsEachPetObject(array1);
        //printsEachPetGreeting(array1);

    }

}
///Users/julianajones/IdeaProjects/employeepielab/src/main/java/safari