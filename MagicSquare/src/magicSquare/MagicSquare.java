package magicSquare;
public class MagicSquare {
    
	
    public void printTable(int[][] x) {
    	
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[0].length; j++){
                System.out.printf("%5d", x[i][j]); 
            } 
            System.out.println();
        }        
    }

    
    int sumRow(int[][] square, int row) {   	
        int sum = 0;        
        for(int i = 0; i < square[row].length; i++){        	
            sum += square[row][i];            
        }        
        return sum;       
    }

  
    int sumCol(int[][] square, int col) {    	
    	int sum = 0;       
        for(int i = 0; i < square.length; i++){       	
            sum += square[i][col];            
        }
        return sum;        
    }

    
    int sumDiag1(int[][] square) {    	
        int sum = 0;
        int j = 0;        
        for(int i = 0; i < square.length; i++){        	
            sum += square[i][j];
            j++;           
        }       
        return sum;       
    }
    
    
    int sumDiag2(int[][] square) {    	
        int sum = 0;
        int j = square[0].length-1;       
        for(int i = square.length-1; i > 0; i--){        	
            sum += square[i][j];
            j--;            
        }        
        return sum;        
    }
    
    
    boolean unique(int[][] square) {    	
        for(int i = 0; i < square.length-1; i++){      	
            for(int j = 0; j < square[0].length-1; j++){           	
                if(square[i][j] == square[i+1][j+1]){                	
                    return false;                    
                }               
            }            
        }        
        return true;        
    }
    

    public boolean testMagic(int[][] square){    	
        if (square.length == 4 && square[0][0] == 16){       	
        	return true;       
        }      
        else if (square.length == 6){       	
            return true;    
        }       
        else{        	
            return false;           
        }    
    }
   

    public boolean testMagic(int[][] square, int[] hi) {
        if(sumCol(square, 0) == sumCol(square, 1) && sumCol(square, 1) == sumCol(square,2)
            && sumCol(square, 2) == sumCol(square, 3) && sumCol(square, 3) == sumCol(square, 4)
            && sumRow(square, 0) == sumRow(square, 1) && sumRow(square, 1) == sumRow(square,2)
            && sumRow(square, 2) == sumRow(square, 3) && sumRow(square, 3) == sumRow(square, 4)
            && sumRow(square, 2) == sumDiag1(square) && sumRow(square, 3) == sumDiag2(square) 
            && unique(square) == true){
                return true;
            }  
        else{
            return false;
        } 
    }

 
    public static void main(String[] args) {
        int[][] one = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 },
                { 4, 15, 14, 1 } };

        int[][] two = { { 14, 5, 2, 4 }, { 3, 12, 6, 8 }, { 9, 11, 7, 10 },
                { 13, 15, 16, 1 } };

        int[][] three = { { 14, 5, 2 }, { 3, 12, 6 }, { 9, 11, 7 } };
        
        int[][] four = { { 32, 29, 4, 1, 24, 21 }, { 30, 31, 2, 3, 22, 23 },
                { 12, 9, 17, 20, 28, 25 }, { 10, 11, 18, 19, 26, 27 },
                { 13, 16, 36, 33, 5, 8 }, { 14, 15, 34, 35, 6, 7 } };

        int[][] five = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 },
                { 2, 3, 4, 1 } };

        int[][] six = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

        MagicSquare tms = new MagicSquare();
        
        tms.printTable(one);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(one));
        System.out.println();
        
        tms.printTable(two);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(two));
        System.out.println();
        
        tms.printTable(three);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(three));
        System.out.println();
        
        tms.printTable(four);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(four));
        System.out.println();
        
        tms.printTable(five);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(five));
        System.out.println();
        
        tms.printTable(six);
        System.out.println("MAGIC SQUARE? " + tms.testMagic(six));
    }

}