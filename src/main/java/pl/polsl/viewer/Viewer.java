package pl.polsl.viewer;

import javax.swing.*;

/**
 *
 * @author Kay Jay O'Nail
 */
public class Viewer
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> makeGUI());
    }
    
    public static void makeGUI()
    {
        JFrame frame = new JFrame();
        
        frame.setVisible(true);
    }
}
