

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class DualTextAreaView extends JPanel implements ActionListener, KeyListener, MouseListener, IParserView {

	/** Panel Components */
	private JFrame mainFrame;
	private JTextField txtfldFilepath;
	private JButton btnBrowse;
	private JTextArea txtarInput; 
	private JScrollPane jscrllpnlInput;
	private JTextArea txtarOutput;
	private JScrollPane jscrllpnlOutput;
	private JLabel lblInput;
	private JLabel lblOutput;
	private JButton btnShowParseTree;
	
	private IParserController controller; 
	
	public DualTextAreaView(MainFrame mainFrame, IParserController controller) {
		this.mainFrame = mainFrame;
		this.setBounds(0, 0, 835, 436);
		setLayout(null);
		
		this.controller = controller;
		controller.setView(this);
		
		txtfldFilepath = new JTextField();
		txtfldFilepath.setBounds(10, 11, 510, 27);
		add(txtfldFilepath);
		txtfldFilepath.setColumns(10);
		
		btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(530, 11, 89, 27);
		btnBrowse.addActionListener(this);
		add(btnBrowse);
		
		txtarInput = new JTextArea();
		txtarInput.addMouseListener(this);
//		add(txtarInput);
		
		jscrllpnlInput = new JScrollPane(txtarInput, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jscrllpnlInput.setBounds(10, 87, 404, 338);
        jscrllpnlInput.setVisible(true);
        add(jscrllpnlInput);
		
		txtarOutput = new JTextArea();
//		add(txtarOutput);
		
		jscrllpnlOutput=new JScrollPane(txtarOutput, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscrllpnlOutput.setBounds(424, 87, 401, 338);
		jscrllpnlOutput.setVisible(true);
        add(jscrllpnlOutput);
		
		lblInput = new JLabel("Input");
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(10, 49, 404, 27);
		lblInput.addMouseListener(this);
		add(lblInput);
		
		lblOutput = new JLabel("Output");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(424, 49, 401, 27);
		add(lblOutput);
		
		btnShowParseTree = new JButton("Show Parse Tree");
		btnShowParseTree.setBounds(633, 11, 192, 27);
		btnShowParseTree.addActionListener(this);
		add(btnShowParseTree);
	}

	@Override
	public void keyPressed(KeyEvent ae) {
		
	}

	public void setTxtFldFilePathText(String filepath) {
		txtfldFilepath.setText(filepath);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if((ae.getSource() == btnBrowse)) {
			/** Get FilePath */
			 String filepath = "sup nigguh";
				try
			{
				JFileChooser fileOpen = new JFileChooser("C:\\Users\\John Israel\\Documents\\CMPILER");
				/*String[] suffices = ImageIO.getReaderFileSuffixes();
				for (int i = 0; i < suffices.length; i++)
				{
					FileFilter filter = new FileNameExtensionFilter(
							suffices[i] + " files", suffices[i]);
					fileOpen.addChoosableFileFilter(filter);
				}*/
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
				fileOpen.setFileFilter(filter);
				int ret = fileOpen.showDialog(null, "Open file");
				filepath = fileOpen.getSelectedFile().getAbsolutePath();
			} 
				
			catch (Exception exc)
			{
				
			}
			
			setTxtFldFilePathText(filepath);
			
			/** Read File */
			String parsedInput = controller.readInputFile(filepath);
			txtarInput.setText(parsedInput);
			
			/** Get result  */
			String results = controller.getOutput();
			txtarOutput.setText(results);
			
			controller.reinitializeLists();
		} else
			if((ae.getSource() == btnShowParseTree)) {
				JFrame frame = new ParseTreeViewFrame(controller.getParseTree());
				frame.setExtendedState(Frame.MAXIMIZED_BOTH);
				frame.setUndecorated(true);
				frame.setVisible(true);
			} 
		
	}

	@Override
	public void mouseClicked(MouseEvent ae) {
		// TODO Auto-generated method stub
		if((ae.getSource() == lblInput)) {
			
			Timer timer = null;
			
			
			JFrame frame = new JFrame("Green Archer");
			
			JLabel label;
			URL url = DualTextAreaView.class.getResource("/sirpogi.jpg");
			ImageIcon icon1 = new ImageIcon(url);
			label = new JLabel(icon1);
			frame.setBounds(0, 0, icon1.getIconWidth(), icon1.getIconHeight());
			frame.setLocationRelativeTo(null);
			frame.getContentPane().add(label);
			
			frame.setVisible(true);
			
			timer = new Timer(750, new ActionListener(){      // Timer 4 seconds
	            public void actionPerformed(ActionEvent e) {
	            	frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));                         // after 4 seconds change back to red
	                repaint();
	            }
	        });
			
			timer.start();
//			try {
//			    Thread.sleep(1000);                 //1000 milliseconds is one second.
//			} catch(InterruptedException ex) {
//			    Thread.currentThread().interrupt();
//			}
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTreeView(TreeViewer viewr) {
		
        viewr.setScale(1.5);//scale a little
        this.add(viewr);
        System.out.println("hi jaylica");        
	}
}
