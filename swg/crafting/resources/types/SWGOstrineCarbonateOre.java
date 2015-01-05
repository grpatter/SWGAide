package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCarbonateOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Ostrine Carbonate Ore"
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
public final class SWGOstrineCarbonateOre extends SWGCarbonateOre {

  private static final long serialVersionUID = 2103274L;

  private static final int[] minStats = {0, 711, 412, 0, 0, 753, 711, 1, 0, 412, 670};
  private static final int[] maxStats = {0, 851, 551, 0, 0, 873, 851, 1000, 0, 551, 830};

  private static final SWGOstrineCarbonateOre INSTANCE = new SWGOstrineCarbonateOre();

  SWGOstrineCarbonateOre() { super(); }

  public static SWGOstrineCarbonateOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 731; }
  public int rcID() { return 265; }
  public String rcName() { return "Ostrine Carbonate Ore";}
  public String rcToken() { return "oscrb";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}