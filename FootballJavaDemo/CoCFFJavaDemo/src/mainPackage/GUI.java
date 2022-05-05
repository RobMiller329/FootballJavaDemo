package mainPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class GUI implements ActionListener
{
	private JFrame frame;
	private JPanel containerPanel;
	
	private JPanel topPanel;
	private JComboBox positionBox;
	private JButton positionButton;
	private JLabel topLabel;
	
	private JPanel midPanel;
	private JTable midTable;
	
	private JPanel bottomPanel;
	private JLabel bottomLabel;
	
	private String positions[] = { "Quarterback", "Running Back" };
	
	private String tableColumns[] = { "Player Name", "Passing Yards", "Passing TDs" };
	private String tableData[][] = 
	{
			{ "Tom Brady", "5316", "43" },
			{ "Justin Herbert", "5014", "38" },
			{ "Matthew Stafford", "4886", "41" },
			{ "Patrick Mahomes", "4839", "37" },
			{ "Derek Carr", "4804", "23" },
			{ "Joe Burrow", "4611", "34" }
	};
	
	private String qbColumns[] = { "Player Name", "Passing Yards", "Passing TDs" };
	private String qbData[][] = 
	{
			{ "Tom Brady", "5316", "43" },
			{ "Justin Herbert", "5014", "38" },
			{ "Matthew Stafford", "4886", "41" },
			{ "Patrick Mahomes", "4839", "37" },
			{ "Derek Carr", "4804", "23" },
			{ "Joe Burrow", "4611", "34" }
	};
	
	private String rbColumns[] = { "Player Name", "Rushing Yards", "Rushing TDs" };
	private String rbData[][] = 
	{
			{ "Jonathon Taylor", "1811", "18" },
			{ "Nick Chubb", "1259", "8" },
			{ "Joe Mixon", "1205", "13" },
			{ "Najee Harris", "1200", "7" },
			{ "Dalvin Cook", "1159", "6" },
			{ "Antonio Gibson", "1037", "7" }
	};
	
	public void displayGUI()
	{
		frame = new JFrame();
		containerPanel = new JPanel();
		topPanel = new JPanel();
		midPanel = new JPanel();
		bottomPanel = new JPanel();
		
		containerPanel.setLayout(new GridLayout(3, 1));
		
		containerPanel.add(topPanel);
		containerPanel.add(midPanel);
		containerPanel.add(bottomPanel);
		
		frame.add(containerPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		topPanel.setLayout(new GridLayout(1, 3));
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		positionBox = new JComboBox(positions);
		positionButton = new JButton("view players");
		positionButton.setBounds(10, 10, 250, 100);
		positionButton.addActionListener(this);
		topLabel = new JLabel("Please select a position.");
		topPanel.add(positionBox);
		topPanel.add(positionButton);
		topPanel.add(topLabel);
		
		midPanel.setLayout(new BorderLayout());
		midPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		var tableModel = new DefaultTableModel(tableData, tableColumns);
		midTable = new JTable(tableModel);
		JScrollPane midTableScrollPane = new JScrollPane(midTable);
		midPanel.add(midTableScrollPane);
		
		bottomPanel.setLayout(new GridLayout(1, 1));
		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
		bottomLabel = new JLabel("This is the bottom panel.");
		bottomPanel.add(bottomLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == positionButton)
		{
			topLabel.setText(positionBox.getSelectedItem() + " selected");
			
			if(positionBox.getSelectedItem() == "Running Back")
			{
				var tableModel = new DefaultTableModel(rbData, rbColumns);
				midTable.setModel(tableModel);
			}else
			{
				var tableModel = new DefaultTableModel(qbData, qbColumns);
				midTable.setModel(tableModel);
			}
			
		}else
		{
			System.out.println("Your if statement doesn't work.");
		}
	}
}