public class PetOwner{
    private String name;
    private Dog dog;
    private Cat cat; 

    public PetOwner(String name, Dog dog, Cat cat){
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public void feedDog(){
        dog.setHunger(true);
    }

    public void feedCat(){
        cat.setHunger(true);
    }

    public void petDog(){
        dog.setPet(true);
    }

    public void petCat(){
        cat.setPet(true);
    }

    public void walkDog(){
        dog.setWalk(true);
    }

    public void walkCat(){
        cat.setWalk(true);
    }

    public boolean happy(){
        if(cat.happiness() && dog.happiness()){
            return true;
        } else {
            return false;
        }
    }

    Pet[] pets = new Pets[2];
    pets = dog;
    pets = cat; 

    Pet p = new Dog ("Caleb");

    pets[1].talk();




}