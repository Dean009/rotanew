import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JButton;
import javax.swing.JComponent;

public class ui {

    public void createGui() {
        JFrame frame = new JFrame("Rota");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = { "First Name", "Last Name", "Contract Hours", "Role" };
        Object[][] data = { { "Kathy", "Smith", "20", "CSA" } };

        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setVisible(true);

    }

}
