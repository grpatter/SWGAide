package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGNonSiteRestrictedRenewableEnergy;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Solar Energy"
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
public class SWGSolarEnergy extends SWGNonSiteRestrictedRenewableEnergy {

  private static final long serialVersionUID = 411176L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 200, 200, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 500, 600, 0, 0};

  private static final SWGSolarEnergy INSTANCE = new SWGSolarEnergy();

  SWGSolarEnergy() { super(); }

  public static SWGSolarEnergy getInstance() { return INSTANCE; }

  public int expectedStats() { return 2; }
  public int sortIndex() { return 4; }
  public int rcID() { return 51; }
  public String rcName() { return "Solar Energy";}
  public String rcToken() { return "seg";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
