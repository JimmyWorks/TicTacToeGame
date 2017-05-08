package tictactoe;

/*
 * Project: 
 * Author: Jimmy Nguyen
 * Contact me: Jimmy@JimmyWorks.net
 */
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener{
    //Image Icon objects which holds the icon images of X and O
    ImageIcon X,O;
    
    //Static member that keeps track of previous turn
    //Initializes to false so X moves first
    static Boolean isX = false;
    
    public XOButton(){
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png")); 
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isX){
            isX = false;
            setIcon(O);
        }
        else{
            isX = true;
            setIcon(X);
        }
    }
}
