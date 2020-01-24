public class Yorkie extends Pets{
    public Yorkie(String name){
        super(name);
    }

    public boolean isHappy(){
        if(this.getCounter() >= 10){
            return true;
        }
        return false;
    }
}