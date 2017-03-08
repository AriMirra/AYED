/**
 * Created by arimi on 04-Mar-17.
 */

/**
 * Mode class controls the logic of the system, and prints the changes in the settings
 */
public class Model {
    private boolean shadows = true;
    private boolean antiAliasing = false;

    /**
     * prints the change in the shadow settings when they happen
     */
    public void shadowsChanged(){
        if (shadows) System.out.println("Shadows: Off");
        else System.out.println("Shadows: On");
        shadows = !shadows;
    }

    /**
     * prints the change in the antiAliasing settings when they happen
     */
    public void antiAliasingChanged(){
        if (antiAliasing) System.out.println("Anti-aliasing: Off");
        else System.out.println("Anti-aliasing: On");
        antiAliasing = !antiAliasing;
    }

    /**
     * prints the change in the sound settings when they happen
     */
    public void soundChanged(boolean b){
        if (b) System.out.println("Sound: On");
        else System.out.println("Sound: Off");
    }

    /**
     * prints the change in the music settings when they happen
     */
    public void musicChanged(boolean b){
        if (b) System.out.println("Music: On");
        else System.out.println("Music: Off");
    }
}
