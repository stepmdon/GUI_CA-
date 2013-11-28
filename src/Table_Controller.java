/**
 *
 * @author Stephen
 */

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Table_Controller 
{
    public Table_Model model;
    public Table_View view;
    
    public Table_Controller(Table_Model model)
    {
        this.model = model;
        this.view = new Table_View(this);
           
        //Return the TableColumnModel(this contains all column informamation)
        //ListSelectionModel(this maintains the row selection state)
     //  view.table.getColumnModel().getSelectionModel().
    //   addListSelectionListener(new ColumnListener());
        
       view.table.getSelectionModel().addListSelectionListener(new RowListener());
         
    }

   /* private class ColumnListener implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent event)
        {
            if (event.getValueIsAdjusting())
            {
                return;
            }
            for (int i = 0; i < view.table.getColumnCount(); i++)
            {
                view.output.append(view.table.getValueAt(view.table.getSelectedRow(), i) + " |");
            }
            view.output.append("\n");
        }
    } */
      private class RowListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
             for (int i = 0; i < view.table.getColumnCount(); i++)
            {
                view.output.append(view.table.getValueAt(view.table.getSelectedRow(), i) + " |");
            }
            view.output.append("\n");
            view.internalFrame.setVisible(true);
            
            
        }
    }
}
