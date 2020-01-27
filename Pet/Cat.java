public class Cat extends Pet{


    public Cat(String name, String breed){
        super(name, breed);
    }

    public Cat(String breed){
        super(breed);
    }

    //OVERWRITING 
    public boolean isHappy(){
        if(this.getHunger() && !this.getPetted() && !this.getWalked()){
            return true;
        } else { 
            return false; 
        }
    }
    

    public String talk(){
        if(isHappy()){
            return "meow"
        } else {
            return "hiss" 
        }
    }
}
