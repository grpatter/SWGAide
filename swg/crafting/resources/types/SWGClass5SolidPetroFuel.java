package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownSolidPetrochemFuel;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Class 5 Solid Petro Fuel"
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
public final class SWGClass5SolidPetroFuel extends SWGKnownSolidPetrochemFuel {

  private static final long serialVersionUID = 1367923L;

  private static final int[] minStats = {0, 0, 423, 0, 0, 0, 0, 1, 670, 0, 0};
  private static final int[] maxStats = {0, 0, 606, 0, 0, 0, 0, 1000, 830, 0, 0};

  private static final SWGClass5SolidPetroFuel INSTANCE = new SWGClass5SolidPetroFuel();

  SWGClass5SolidPetroFuel() { super(); }

  public static SWGClass5SolidPetroFuel getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 622; }
  public int rcID() { return 172; }
  public String rcName() { return "Class 5 Solid Petro Fuel";}
  public String rcToken() { return "c5ksp";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}