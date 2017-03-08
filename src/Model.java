/**
 * Created by arimi on 04-Mar-17.
 */

/**
 * Mode class controls the logic of the system, and prints the changes in the settings
 */
public class Model {
    private boolean shadows = true;
    private boolean antiAliasing = false;
    private boolean sound = true;
    private boolean music = true;

    /**
     * prints the change in the shadow settings when they happen
     */
    public void shadowsChanged(){
        if (shadows) System.out.println("shadows turned off");
        else System.out.println("shadows turned on");
        shadows = !shadows;
    }

    /**
     * prints the change in the antiAliasing settings when they happen
     */
    public void antiAliasingChanged(){
        if (antiAliasing) System.out.println("antiAliasing turned off");
        else System.out.println("antiAliasing turned on");
        antiAliasing = !antiAliasing;
    }

    /**
     * prints the change in the sound settings when they happen
     */
    public void soundChanged(){
        if (sound) System.out.println("sound turned off");
        else System.out.println("sound turned on");
        sound = !sound;
    }

    /**
     * prints the change in the music settings when they happen
     */
    public void musicChanged(){
        if (music) System.out.println("music turned off");
        else System.out.println("music turned on");
        music = !music;
    }
}
