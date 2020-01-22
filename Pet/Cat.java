public class Cat{
    private String name;
    private String breed;
    private boolean hunger;
    private boolean petted;
    private boolean walked;

    public Cat(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.hunger = false;
        this.petted = false;
        this.walked = false;
    }

    public Cat(String breed){
        this.breed = breed; 
        this.walked = false;
        this.hunger= false;
        this.petted = false; 
    }

    public boolean happiness(){
        if(!walked && hunger && !petted){
            return true;
        } else {
            return false;
        }
    }
    public String meow(){
        if(happiness){
            return "meow"
        } else {
            return "hiss" 
        }
    }

    public void setWalked(boolean walk){
        this.walked = walk;
    }

    public void setHunger(boolean fed){
        this.hunger = fed; 
    }

    public void setPet(boolean pet){
        this.petted = pet;
    }
}