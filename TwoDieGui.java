import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDieGui extends JFrame implements ActionListener
{
	JLabel title = new JLabel("Lets roll");
	JLabel frist = new JLabel("");
	JTextField roll1 = new JTextField(15); 
	JLabel sec = new JLabel("");
	JTextField roll2 = new JTextField(15);
	JTextField winner = new JTextField(15);
	JButton button = new JButton("Roll");
	
	public TwoDieGui()
	{
		super("Two Die");
		setBounds(700, 450, 220, 180);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(title);
		add(frist);
		add(roll1);
		add(sec);
		add(roll2);
		add(button);
		
		button.addActionListener(this);
		
		add(winner);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Die();
	}
	public void Die()
    {
		// instance / vars / constants
		final int HIGHEST_DIE_VAL = 6;
		final int LOWEST_DIE_VAL = 1;
	    
		// logic
		int value = (int)(Math.random() * HIGHEST_DIE_VAL + LOWEST_DIE_VAL);
		int value2 = (int)(Math.random() * HIGHEST_DIE_VAL + LOWEST_DIE_VAL);
		
		// output
		roll1.setText("Frist roll: " + value);
		roll2.setText("Second roll: " + value2);
		if(value > value2)
		{
			winner.setText("Frist roll higher");
		}	
		else
		{
			winner.setText("Second roll is higher");
		}
		if(value == value2)
		{
			winner.setText("Tie!!!");
		}
	}
	public static void main(String[] args)
	{
		TwoDieGui rolls = new TwoDieGui();
		rolls.setVisible(true);
	}
	
	
	
	
}