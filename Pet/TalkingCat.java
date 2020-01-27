import java.util.Random;

public class TalkingCat extends Cat{
    Random rand = new Random();
    String[] compliments = new String[4];     
    String[] insults = new String[4];
    
    public TalkingCat(String name){
        super(name);
    }
    public String talk(){
        compliments[0] = "I appreciate you";
        compliments[1] = "You have a nice ass";
        compliments[2] = "Thanos car";
        compliments[3] = "I would die for you";

        insults[0] = "Go fuck yourself";
        insults[1] = "You are not just a clown. You are the entire circus";
        insults[2] = "You're a simp";
        insults[3] = "I hope you get the coronavirus";

        if(isHappy()){
            return compliments[rand.nextInt(4)];
        }
        else{
            return insults[rand.nextInt(4)];
        }
    }

    
}