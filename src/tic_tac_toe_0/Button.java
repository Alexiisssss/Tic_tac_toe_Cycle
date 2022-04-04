package tic_tac_toe_0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Button extends JButton{
    private int index;
    
    public Button(int x,int y,int index){
        this.index = index; 
        this.setBounds(x*100,y*100,100,100);
        this.addActionListener(new MyKeyAdapter());
    }
     
    private class MyKeyAdapter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) { 
            Frame.index = index;
        }
    }
}
