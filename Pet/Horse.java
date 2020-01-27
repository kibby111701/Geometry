public class Horse extends Pet{
    private boolean isBrushed;
    private boolean isRidden;
    
    
    public Horse(String name){
        super(name);
    }

    public void ride(){
        isRidden = true;
    }

    public void brush(){
        isBrushed = true;
    }

    public boolean isHappy(){
        if (getWalked() && getPetted() && getHunger() && isBrushed && isRidden){
            return true;
        }
        else{
            return false;
        }
    }

    public String talk(){
        if (isHappy()){
            return "Neigh";
        }
        else{
            return "Sad neigh";
        }
    }
}