import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getActivityLevel());
  }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(true, myPet.isAlive());
  }

  @Test
  public void setFoodLevel_foodLevel_5() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.setFoodLevel(5);
    assertEquals(5, myPet.getFoodLevel());
  }

  @Test
  public void setSleepLevel_sleepLevel_9() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.setSleepLevel(9);
    assertEquals(9, myPet.getSleepLevel());
  }

  @Test
  public void setActivityLevel_activityLevel_7() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.setActivityLevel(7);
    assertEquals(7, myPet.getActivityLevel());
  }

  @Test
  public void increaseFoodLeveldecreasesOtherLevels() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.setFoodLevel(5);
    myPet.setSleepLevel(10);
    myPet.setActivityLevel(10);
    myPet.increaseFood();
    assertEquals(6, myPet.getFoodLevel());
    assertEquals(9, myPet.getSleepLevel());
    assertEquals(9, myPet.getActivityLevel());
  }

}
