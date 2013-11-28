
/**
 *
 * @author Stephen
 */
import java.util.Observable;
import javax.swing.table.AbstractTableModel;


public class Table_Model extends   Observable
{
    // The data used as the titles for the table.
    public String[] columnNames =
    {
        "Team",
        "GP",
        "W",
        "D",
        "L",
        "GD",
        "PTS"
    };
    // The data used in the table, placed as a multi-dimensional array.
    public Object[][] data =
    {
        {
            "Arsenal", new Integer(12), new Integer(9), new Integer(1),
            new Integer(2), new Integer(14), new Integer(28)
        },
        {
            "Liverpool", new Integer(12), new Integer(7), new Integer(3),
            new Integer(2), new Integer(11), new Integer(24)
        },
        {
            "Chelsea", new Integer(12), new Integer(7), new Integer(3),
            new Integer(2), new Integer(11), new Integer(24)
        },
        {
            "Manchester City", new Integer(12), new Integer(7), new Integer(1),
            new Integer(4), new Integer(22), new Integer(22)
        },
        {
            "Southampton", new Integer(12), new Integer(6), new Integer(4),
            new Integer(2), new Integer(8), new Integer(22)
        },
        {
            "Manchester United", new Integer(12), new Integer(6), new Integer(3),
            new Integer(3), new Integer(5), new Integer(21)
        },
        {
            "Everton", new Integer(12), new Integer(5), new Integer(6),
            new Integer(1), new Integer(4), new Integer(21)
        },
        {
            "Newcastle United", new Integer(12), new Integer(6), new Integer(2),
            new Integer(4), new Integer(0), new Integer(20)
        },
        {
            "Tottenham", new Integer(12), new Integer(6), new Integer(2),
            new Integer(4), new Integer(-3), new Integer(20)
        },
        {
            "Swansea City", new Integer(12), new Integer(4), new Integer(3),
            new Integer(5), new Integer(1), new Integer(15)
        },
        {
            "West Brom", new Integer(11), new Integer(3), new Integer(5),
            new Integer(3), new Integer(0), new Integer(14)
        },
        {
            "Aston Villa", new Integer(11), new Integer(4), new Integer(2),
            new Integer(5), new Integer(-1), new Integer(14)
        },
        {
            "Hull City", new Integer(12), new Integer(4), new Integer(2),
            new Integer(6), new Integer(-6), new Integer(14)
        },
        {
            "Stoke City", new Integer(12), new Integer(3), new Integer(4),
            new Integer(5), new Integer(-2), new Integer(13)
        },
        {
            "Cardiff City", new Integer(12), new Integer(3), new Integer(4),
            new Integer(5), new Integer(-6), new Integer(13)
        },
        {
            "Norwich City", new Integer(12), new Integer(3), new Integer(2),
            new Integer(7), new Integer(-13), new Integer(11)
        },
        {
            "West Ham United", new Integer(12), new Integer(2), new Integer(4),
            new Integer(6), new Integer(-5), new Integer(10)
        },
        {
            "Fulham", new Integer(12), new Integer(3), new Integer(1),
            new Integer(8), new Integer(-10), new Integer(10)
        },
        {
            "Crystal Palace", new Integer(12), new Integer(2), new Integer(1),
            new Integer(9), new Integer(-14), new Integer(7)
        },
        {
            "Sunderland", new Integer(12), new Integer(2), new Integer(1),
            new Integer(9), new Integer(-16), new Integer(7)
        }
    };

    public Table_Model()
    {
    }
      
    public int getColumnCount()
    {
        return columnNames.length;
    }

    public int getRowCount()
    {
        return data.length;
    }

    public String getColumnName(int col)
    {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col)
    {
        return data[row][col];
    }

    public Class getColumnClass(int c)
    {
        return getValueAt(0, c).getClass();
    }

    /*
     * You don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col)
    {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2)
        {
            return false;
        } else
        {
            return true;
        }
    }

    /*
     * You don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col)
    {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    private void fireTableCellUpdated(int row, int col)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
