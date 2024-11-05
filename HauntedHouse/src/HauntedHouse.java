import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions.*;
public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }


    public void refillCandyBowl(int amount) {
        // no negative candy allowed
        if(amount>=0) {
            candyCount += amount;
        }

        if(getCandyCount()<0){
            candyCount = Integer.MAX_VALUE;
        }
    }

    public void trickOrTreat(int people){

        if(people <= 0){
            return;
        }
        // only deduct if people is less than candyCount
        if(people<=candyCount) {
            candyCount = candyCount - people;

        }
        else{
            //more people than candy = candyCount = 0
            candyCount = 0;
        }
    }

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    public int RunningLow(){

        // make sure  amount refills after candy count is 0
        if(candyCount==0){
            refillCandyBowl(50);
        }
        return candyCount;

    }

    public void Haunting() {
        ghostPresent = true;
    }


    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}