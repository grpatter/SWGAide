package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGGemstone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Crystalline Gemstone"
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
public class SWGCrystallineGemstone extends SWGGemstone {

  private static final long serialVersionUID = 585130L;

  private static final int[] minStats = {0, 1, 1, 500, 0, 700, 1, 1, 0, 300, 300};
  private static final int[] maxStats = {0, 1000, 1000, 1000, 0, 1000, 400, 1000, 0, 1000, 1000};

  private static final SWGCrystallineGemstone INSTANCE = new SWGCrystallineGemstone();

  SWGCrystallineGemstone() { super(); }

  public static SWGCrystallineGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 759; }
  public int rcID() { return 73; }
  public String rcName() { return "Crystalline Gemstone";}
  public String rcToken() { return "cry";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
