import java.util.Random;

public class SadRaccoon extends Pet{ //Sad raccoon is depressed no matter what but it also eats trash
    Random rand = new Random();
    String[] depressionTalk = new String[4];


    public SadRaccoon(String name){
        super(name);
    }

    public boolean isHappy(){
        return false;
    }

    public String talk(){
        depressionTalk[0] = "I'm so sad";
        depressionTalk[1] = "Life is just a pathway towards death";
        depressionTalk[2] = "*sad screeching*";
        depressionTalk[3] = "13 Reasons Why is iconic";

        
        
        if (isHappy()){
            return "Wait how did you get here? Like yay I'm happy but like what?";
        }
        else{
            return depressionTalk[rand.nextInt(4)];
        }
    }


    public void eatGarbage(){
        setFed(true);
    }



}