
/**
 *
 * @author Stephen
 */
import javax.swing.*;

public class Main extends JApplet
{
    @Override
    public void init()
    {
        final Table_Model model = new Table_Model();
        final Table_Controller controller = new Table_Controller(model);
        this.setContentPane(controller.view);
        this.setSize(520, 530);
    }
}
