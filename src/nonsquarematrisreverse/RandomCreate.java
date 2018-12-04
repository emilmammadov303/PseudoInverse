package nonsquarematrisreverse;

import java.util.Random;

public class RandomCreate {
    
    public static void randomOlustur(){
        Random rand = new Random();
        int row = 0;
        int column = 0;
        while(row == column){
            row = rand.nextInt(100)%5 + 1;
            column = rand.nextInt(100)%5 + 1;
        }
        
        double[][] matris = new double[row][column];
        
        for(int j=0;j<row;j++){
            for(int k=0;k<column;k++){
                matris[j][k] = rand.nextInt(100)%9 + 1;
            }
        }
        
        new TersCevir().yazdir(matris);
        
        new TersCevir(matris, row, column);
        
    }
}
