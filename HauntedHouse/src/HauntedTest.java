
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Assertions.*;

public class HauntedTest {


    static HauntedHouse house;

   @BeforeEach

    public void setup(){
        house = new HauntedHouse();
    }


    @Test
    public void ghostPresenceTest(){

           Assertions.assertEquals(true, house.isGhostPresent());

    }

    @Test
    public void scareGhostTest(){
        house.scareAwayGhost();
        Assertions.assertEquals(false, house.isGhostPresent() );
    }

    @Test
    public void RefillCandyBowlTest(){
       house.refillCandyBowl(20);
       Assertions.assertEquals(30, house.getCandyCount());
    }

    @Test
    public void SpookySoundTest(){
       Assertions.assertEquals("Boo!", house.spookySound());
    }
    @Test()
    public void NegativeCandyTest(){
       house.refillCandyBowl( -5);
       Assertions.assertEquals(10,house.getCandyCount());
    }


    @Test
    public void TooManyPeopleTest(){
       house.trickOrTreat(1000);
       Assertions.assertEquals(0,house.getCandyCount());
 }
   @Test
    public void RunningLowTest(){

       house.trickOrTreat(house.getCandyCount());

       Assertions.assertEquals(50, house.RunningLow());
   }

   @Test
    public void HauntingTest(){
       house.Haunting();
       Assertions.assertEquals(true,house.isGhostPresent());
   }



}
