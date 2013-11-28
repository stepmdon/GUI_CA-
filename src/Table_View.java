
/**
 * This is the tables view
 * @author Stephen
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;

public class Table_View extends JPanel
{
    private Table_Controller controller;
    private Table_Model model = new Table_Model();//This added to get access to the data and coloumnNames
    
    public JTable table = new JTable(this.model.data, this.model.columnNames);
    private JScrollPane scrollPane = new JScrollPane();
    public JTextArea output = new JTextArea(5, 45);
    
   public MyInternalFrame internalFrame = new MyInternalFrame("An Internal Frame");
    
   //  private final MyInternalFrame internalFrame = new MyInternalFrame("An Internal Frame");

    public Table_View(Table_Controller controller)
    {
        super();

        this.controller = controller;

        //Set the scrollPane size
        scrollPane.setPreferredSize(new Dimension(400, 50));
        setColumnWidth(0, 120, 30);

        //Create GUI          
        add(new JScrollPane(table));
        add(output);
        add(internalFrame);
        
        output.setEditable(false);
      
       
    }

    /**
     * Sets one of the column widths larger than the rest
     *
     * @param columnNumber the column to be made larger than the other columns
     * @param largeSize size of the largest column
     * @param smallSize size of all the other columns
     */
    public void setColumnWidth(int columnNumber, int largeSize, int smallSize)
    {
        TableColumn column = null;
        TableRow row = null;
        for (int i = 0; i < this.model.columnNames.length; i++)
        {
            column = table.getColumnModel().getColumn(i);
            if (i == columnNumber)
            {
                column.setPreferredWidth(largeSize); //team column is bigger
            } else
            {
                column.setPreferredWidth(smallSize);
            }        
        }
    } 
    
     class MyInternalFrame extends JInternalFrame implements ActionListener
    {
        private JButton button1 = new JButton("Button 1");
        private JButton button2 = new JButton("Button 2");
        private JLabel message = new JLabel();

        public MyInternalFrame(String title)
        {
            super(title);

            // show the 'X' close icon and hide the internal frame on close
            this.setClosable(true);
            this.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.setLocation(0, 0);
            // do not show any icon
            this.setFrameIcon(null);
            this.setLayout(new GridLayout(1, 3));
            this.setSize(300, 100);

            this.add(this.button1);
            this.add(this.message);
            this.add(this.button2);

            this.button1.addActionListener(this);
            this.button2.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            final Object source = e.getSource();
            if (source == this.button1)
            {
                this.message.setText("Button 1 was hit.");
            }
            else if (source == this.button2)
            {
                this.message.setText("Button 2 was hit.");
            }
        }
    }
    
    
}

