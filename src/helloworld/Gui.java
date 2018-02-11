/**
 * 
 */
package helloworld;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author ogran
 *
 */
public class Gui implements FirstInterface {

	/* (non-Javadoc)
	 * @see helloworld.FirstInterface#HelloWorld()
	 */
	@Override
	public void HelloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	/* (non-Javadoc)
	 * @see helloworld.FirstInterface#Message(java.lang.String)
	 */
	@Override
	public String Message(String msg) {
		// return message input
		return "Message: " + msg;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// First create a frame for GUI
		JFrame frame = new JFrame("Hello World with Interface.");
		
		//size the frame
		frame.setSize(500, 200);
		
		//What the frame will do when closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create text to be displayed 
		JLabel label = new JLabel("Please enter message:");
		
		JLabel output = new JLabel();
		output.setForeground(Color.blue);
		
		//Create text field
		JTextField textField = new JTextField();
		
		//A submit button
		JButton btn = new JButton("Submit Message");
				
		//add the text, button and text field to the frame
		frame.add(label, BorderLayout.WEST);
		frame.add(output, BorderLayout.CENTER);
		frame.add(textField, BorderLayout.NORTH);
		frame.add(btn, BorderLayout.SOUTH);
		
		//add an action listener to the button
		btn.addActionListener(new ActionListener(){
						
			@Override
			public void actionPerformed(ActionEvent e) {
				// What happens on button press
				Gui gui = new Gui();
				output.setText(gui.Message(textField.getText()));
			}
		});
		
		//show the frame
		frame.setVisible(true);
	}

}
