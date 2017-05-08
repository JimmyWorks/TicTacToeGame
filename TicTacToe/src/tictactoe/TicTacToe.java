
package tictactoe;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class TicTacToe extends JFrame{
        JPanel buttonPanel = new JPanel();
        XOButton buttons[] = new XOButton[9];
        
    public static void main(String[] args) {

        new TicTacToe();
    }
    public TicTacToe(){
        super("TicTacToe");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buttonPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i < 9; i++){
            buttons[i] = new XOButton();
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel);
        
        setVisible(true);
    }
}
