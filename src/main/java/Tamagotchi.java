import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Tamagotchi {
  private String mName;
  private int mFoodLevel;
  private int mSleepLevel;
  private int mActivityLevel;

  public Tamagotchi(String name) {
    mName = name;
    // mFoodLevel = food;
    // mSleepLevel = sleep;
    // mActivityLevel = activity;
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
}
