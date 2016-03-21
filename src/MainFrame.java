

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame{
	
	private JPanel currentPanel;
	
	public MainFrame(String frameTitle) {
		/** Frame setup */
		this.setTitle(frameTitle);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0, 0, 835, 460);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void renderView(String view){
		if(view.equals("Per Line")) {
			currentPanel = new DualTextAreaView(this, new PerLineParserController(this)); 
		} else
		if(view.equals("Source Code")) {
			currentPanel = new DualTextAreaView(this, new SourceCodeParserController(this));
		}
		this.setContentPane((JPanel) currentPanel);   
		frameRevalidate();     
    }
	
	private void frameRevalidate() {
		validate();
		repaint();
		setVisible(true);
	}
}
