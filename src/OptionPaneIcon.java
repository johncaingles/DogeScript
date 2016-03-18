import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.net.URL;

class OptionPaneIcon {

    public static void main(String[] args) throws Exception {
    	final ImageIcon icon1 = new ImageIcon("resources//sirpogi.jpg");
    	
    			JOptionPane.showMessageDialog(null,null,"Green Archer",
    			   JOptionPane.INFORMATION_MESSAGE,   icon1);
    }
}
