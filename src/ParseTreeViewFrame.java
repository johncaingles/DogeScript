import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class ParseTreeViewFrame extends JFrame implements KeyListener {

	private JPanel contentPane;
	private TreeViewer treeViewer;
	/**
	 * Create the frame.
	 * @param treeViewer 
	 */
	public ParseTreeViewFrame(TreeViewer treeViewer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
//        setVisible(true);
        addKeyListener(this);
//		contentPane = new JPanel();
//		setContentPane(contentPane);
		
		
		
        this.treeViewer = treeViewer;
//        this.treeViewer.setScale(0.5);//scale a little
        

        
        JScrollPane jscrllpnlOutput=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		jscrllpnlOutput.setBounds(424, 87, 401, 338);
		jscrllpnlOutput.setVisible(true);
		jscrllpnlOutput.setViewportView(treeViewer);
		
//        contentPane.add(jscrllpnlOutput);
//        contentPane.setAutoscrolls(true);
		setContentPane(jscrllpnlOutput);
		
//        this.setExtendedState(Frame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
			this.dispose();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
