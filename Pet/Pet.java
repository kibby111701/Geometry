public class Pet{
    private String name;
    private String breed; 
    
    private boolean walked;
    private boolean hunger;
    private boolean petted;

    public Pet(String name){
        this.name = name;
    }

    public boolean happiness(){
        if(walked && hunger && petted){
            return true;
        } else {
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public boolean getWalked(){
        return walked;
    }

    public boolean getHunger(){
        return hunger;
    }

    public boolean getPetted(){
        return petted;
    }

    public String talk(){
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