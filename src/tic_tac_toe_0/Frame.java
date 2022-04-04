package tic_tac_toe_0;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
    private Button[] buttons;
    public static int index = -1;
    
    public Frame(int side){ 
        this.setVisible(true);
        this.setSize(side*100+50,side*100+50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        buttons = new Button[side*side];
        
        int index = 0;
        for(int y=0;y<side;y++){
            for(int x=0;x<side;x++){
                panel.add(buttons[index] = new Button(x,y,index));
                index++;
            }
        } 
    }
    
    private void sleep(int value){
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cycle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pushReset(){ index = -1; }
    
    public int pushButton(){ 
        sleep(5);
        return index; 
    }
    
    public void update(String[] array){
        for(int i = 0;i<buttons.length;i++){
            buttons[i].setText(array[i]);
        }
    }
    
}
