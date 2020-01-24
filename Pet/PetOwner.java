public class PetOwner{
    private String name;
    private Pet[] pets; 

    public PetOwner(String name, Pet[] pets){
        this.name = name;
        this.pets = pets;
    }

    public void feed(){
        for (int i = 0; i < pets.length; i++){
            pets[i].setHunger(true);
        } 
    }


    public void pet(){
        for(int i = 0; i < pets.length; i++){
            pets[i].setCounter(pets[i].getCounter() + 1);
            pets[i].setPet(true);
        }
    }

    public void walk(){
        for(int i = 0; i < pets.length; i++){
            pets[i].setWalk(true);
        }
    }

    public boolean happy(){
        for(int i = 0; i < pets.length; i++){
            if(!pets[i].isHappy()){
                return false;
            }
        }
        return true; 
    }


}