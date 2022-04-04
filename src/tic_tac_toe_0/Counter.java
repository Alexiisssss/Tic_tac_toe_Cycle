package tic_tac_toe_0;

public class Counter {  
    private Result referee;
    private int index;
    
    public Counter(Result referee){ this.referee = referee; }
    
    public int process(String[] array){
        recursion("0",array,-1,5);
        return index;
    }
    
    private int recursion(String symbol,String[] arrayOut,int position,int depth){
        String[] array = arrayOut.clone();
        if(position>=0){ array[position] = symbol; }
        if(referee.process(array)==symbol){ return 2; }
        int score = 0,maxScore = -1,index = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==null&&depth>0){
                if(symbol=="0"){ score = recursion("X",array,i,depth-1); }
                if(symbol=="X"){ score = recursion("0",array,i,depth-1); }
                if(score>maxScore){ maxScore = score; index = i;}
            }
        }        
        this.index = index;
        if(maxScore == -1){ return 1; }
        else{ return 2 - maxScore; }
    }
    
}
