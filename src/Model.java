/**
 * Created by arimi on 04-Mar-17.
 */

/**
 * Mode class controls the logic of the sistem, and prints the changes in the settings
 */
public class Model {
    private boolean shadows = true;
    private boolean antiAliasing = false;
    private boolean sound = true;
    private boolean music = true;

    /**
     * it's methods print the change in the settings when they happen
     */
    public void shadowsChanged(){
        if (shadows) System.out.println("shadows turned off");
        else System.out.println("shadows turned on");
        shadows = !shadows;
    }

    public void antiAliasingChanged(){
        if (antiAliasing) System.out.println("antiAliasing turned off");
        else System.out.println("antiAliasing turned on");
        antiAliasing = !antiAliasing;
    }

    public void soundChanged(){
        if (sound) System.out.println("sound turned off");
        else System.out.println("sound turned on");
        sound = !sound;
    }

    public void musicChanged(){
        if (music) System.out.println("music turned off");
        else System.out.println("music turned on");
        music = !music;
    }

}
