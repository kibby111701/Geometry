public class Dog{
    private String name;
    private String breed; 
    private boolean walked;
    private boolean hunger;
    private boolean petted;
    
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.walked = false;
        this.hunger= false;
        this.petted = false;  
    }

    public Dog(String breed){
        this.breed = breed; 
        this.walked = false;
        this.hunger= false;
        this.petted = false; 
    }

    public boolean happiness(){
        if(walked && hunger && petted){
            return true;
        } else {
            return false;
        }
    }

    public String bark(){
        if(happiness){
            return "WOOF!";
        } else {
            return "woof";
        }
    }

    public void setWalk(boolean walk){
        this.walked = walk;
    }

    public void setHunger(boolean fed){
        this.hunger = fed;
    }

    public void setPet(boolean pet){
        this.petted = pet;
    }
}