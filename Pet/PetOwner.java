public class PetOwner{
    private String name;
    private Pet[] pets; 

    public PetOwner(String name, Pet[] pets){
        this.name = name;
        this.pets = pets;
    }

    public void feed(int x){
        pets[x].setHunger(true);
    }


    public void pet(int x){
        pets[x].setPet(true);
        pets[x].setCounter(pets[x].getCounter()+1);
    }

    public void walk(int x){
        pets[x].setWalk(true);
    }

    public void ride(int x){
        if (pets[x] instanceof Horse){
            pets[x].ride();
        }
    }

    public void brush(int x){
        if (pets[x] instanceof Horse){
            pets[x].brush();
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