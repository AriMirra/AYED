/**
 * Created by arimi on 04-Mar-17.
 */
public class App {

    public static void main (String[] args){
        Model model = new Model();
        View view = new View();
        Controller c = new Controller(model,view);
        view.setVisible(true);
    }

}
