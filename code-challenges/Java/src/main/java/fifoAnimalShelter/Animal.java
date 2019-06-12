package fifoAnimalShelter;

public class Animal{
    private String type;
    public Animal(String type)
    {
        this.type=type;
    }

    public String toString(){
        return this.type;
    }
}
