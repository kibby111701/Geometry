public class Cat extends Pet{


    public Cat(String name, String breed){
        super(name);
        super(breed);
    }

    public Cat(String breed){
        super(breed);
    }

    //OVERWRITING 
    public boolean happiness(){
        if(this.getHunger() && !this.getPetted() && !this.getWalked()){
            return true;
        } else { 
            return false; 
        }
    }
    

    public String talk(){
        if(happiness){
            return "meow"
        } else {
            return "hiss" 
        }
    }
}
