import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Tamagotchi {
  private String mName = "";
  private int mFoodLevel = 10;
  private int mSleepLevel = 10;
  private int mActivityLevel = 10;

  public Tamagotchi(String name) {
    mName = name;
  }
  public Tamagotchi(int food, int sleep, int activity) {
    mFoodLevel = food;
    mSleepLevel = sleep;
    mActivityLevel = activity;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getActivityLevel() {
    return mActivityLevel;
  }

  public String getName() {
    return mName;
  }

  public void decreaseFood() {
    mFoodLevel--;
  }

  public void decreaseActivity() {
    mActivityLevel--;
  }

  public void decreaseSleep() {
    mSleepLevel--;
  }

  public void increaseSleep() {
    mSleepLevel++;
    mFoodLevel--;
    mActivityLevel--;
  }

  public void increaseFood() {
    mFoodLevel++;
    mSleepLevel--;
    mActivityLevel--;
  }

  public void increaseActivity() {
    mActivityLevel++;
    mFoodLevel--;
    mSleepLevel--;
  }

  public void setFoodLevel(int setFoodLevel) {
    mFoodLevel = setFoodLevel;
  }

  public void setSleepLevel(int setSleepLevel) {
    mSleepLevel = setSleepLevel;
  }

  public void setActivityLevel(int setActivityLevel) {
    mActivityLevel = setActivityLevel;
  }

  public boolean isAlive() {
    if (mFoodLevel > 0) {
      return true;
    } else {
      return false;
    }
  }



}
