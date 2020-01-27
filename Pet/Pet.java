public class Pet{
    private String name;
    private String breed; 

    private int petCounter = 0;
    
    private boolean walked;
    private boolean hunger;
    private boolean petted;
    private boolean isHappy;

    public Pet(String name){
        this.name = name;
    }

    public boolean isHappy(){
        if(walked && hunger && petted){
            return true;
        } else {
            return false;
        }
    }

    public String getName(){
        return name;
    }
    
    public int getCounter(){
        return petCounter;
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
        if(isHappy){
            return "WOOF!";
        } else {
            return "woof";
        }
    }

    public void setWalk(boolean walk){
        this.walked = walk;
    }

    public void setCounter(int petCounter){
        this.petCounter= petCounter;
    }
    
    public void setFed(boolean fed){
        this.hunger = fed;
    }

    public void setPet(boolean pet){
        this.petted = pet;
    }
}