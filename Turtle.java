package safari;

// subclass
public class Turtle extends Reptile implements IPet{
    public Turtle(String breed, String name){
        super(breed, name);
    }
    //inherits behavior and properties from the parent
    @Override
    public void moveAnimal(int distance){
        System.out.println("moving " + getBreed() + " by " + distance);
    }
    @Override
    public void greetOwner() {
        System.out.println("turtle greets you");
    }
}