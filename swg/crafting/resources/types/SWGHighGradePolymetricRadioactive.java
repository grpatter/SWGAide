package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownRadioactive;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "High Grade Polymetric Radioactive"
 *
 * <b>WARNING:</b>
 * This class is generated by SWGResourceClassGenerator.
 * Do not manually modify this class as your changes are
 * erased when the classes are re-generated.
 *
 * @author Steven M. Doyle <shadow@triwizard.net>
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a>
 * aka Chimaera.Zimoon
 */
@SuppressWarnings("all")
public final class SWGHighGradePolymetricRadioactive extends SWGKnownRadioactive {

  private static final long serialVersionUID = 1352109L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGHighGradePolymetricRadioactive INSTANCE = new SWGHighGradePolymetricRadioactive();

  SWGHighGradePolymetricRadioactive() { super(); }

  public static SWGHighGradePolymetricRadioactive getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 638; }
  public int rcID() { return 170; }
  public String rcName() { return "High Grade Polymetric Radioactive";}
  public String rcToken() { return "hpkrd";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public boolean  isJTL() { return true; }

  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}