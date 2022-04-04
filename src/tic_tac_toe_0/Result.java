package tic_tac_toe_0;

import javax.swing.JButton;

public class Result {
    private String[] array;
    private int width,height;
    private int distance;
    
    public Result(int width,int height,int distance){  
        this.width = width;
        this.height = height;
        this.distance = distance;
    }
    
    public String process(String[] array){
        this.array = array;
        
        int i = 0;
        for(int x = 0;x<width;x++){
            for(int y = 0;y<height;y++){
                if(array[border(x,y)]!=null){ i++; }
                
                for(int a=-1;a<=1;a++){
                    for(int b=-1;b<=1;b++){
                        if(!(a==0&&b==0)){ 
                   
                            if(check(x,y,a,b,"X")){ return "X"; }
                            if(check(x,y,a,b,"0")){ return "0"; }
                            if(i==array.length)   { return "deadlock"; }
                            
                        }
                    }    
                }
                
            }
        }
        
        return "draw";
    }
    
    private boolean check(int x,int y,int a,int b,String symbol){
        for(int i = 0;i<distance;i++ ){
            int index = border(x+a*i,y+b*i); 
            if(index==-1){ return false; }
            else{ if(array[index]!=symbol){ return false; }  }
        }
        return true;
    }
    
    private int border(int x,int y){
        if(x>=0&&x<width&&y>=0&&y<height){
            return y*width + x;
        }
        return -1;
    }
}
