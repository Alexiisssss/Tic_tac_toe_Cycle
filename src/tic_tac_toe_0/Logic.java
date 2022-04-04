package tic_tac_toe_0;

import javax.swing.JOptionPane;

public class Logic {
    //// параметры
    private int side = 3;
    private int length = side*side;
    //// игровая платформа
    private String[] array = new String[length];
    private Result result = new Result(side,side,3); 
    private boolean next;
    //// счётчик
    private Counter counter = new Counter(result);
  
    //// геттеры 
    public String result(){ return result.process(array); }
    public int getSide(){ return side; }
    
    private boolean write(int index,String symbol){
        if(index>=0&&array[index]==null){
            array[index] = symbol;
        }else{ return false; }
        return true;
    }
    
    public String[] resetPosition(){
        for(int i = 0;i<length;i++){ array[i] = null; }
        next = true;
        return array.clone();
    }
    
    public String[] process(int indexUser){
        if(next){
            int indexPC = counter.process(array);
            if(write(indexPC,"X"))   { next = !next; }
        }else{
            if(write(indexUser,"O")) { next = !next; }
        } 
        return array.clone();
    }
}
