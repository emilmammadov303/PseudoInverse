package nonsquarematrisreverse;

import java.text.DecimalFormat;

public class TersCevir {
    static int toplamaSayisi = 0;
    static int carpmaSayisi = 0;
    public static double[][] matris;
    public static int row, column;
    
    public static void yazdir(double matris[][]){
        int row = matris.length;
        int column = matris[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matris[i][j] + "   ");
            }
            System.out.println("\n");
        }
    }
    
    public static double[][] transpoz(double[][] matris){
        
        double temp[][] = new double[matris[0].length][matris.length];
        System.out.println("      ");
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[0].length;j++){
                temp[j][i] = matris[i][j];
            }
        }
        
        return temp;
        
    }
    
    public static double[][] matrisCarpim(double[][] ilkMatris, double[][] nextMatris) {
        double[][] product = new double[ilkMatris.length][nextMatris[0].length];
        for(int i = 0; i < ilkMatris.length; i++) {
            for (int j = 0; j < nextMatris[0].length; j++) {
                for (int k = 0; k < ilkMatris[0].length; k++) {
                    product[i][j] += ilkMatris[i][k] * nextMatris[k][j];
                    toplamaSayisi++;
                    carpmaSayisi++;
                }
            }
        }

        return product;
    }
    
    public TersCevir(){}
    
    public TersCevir(double[][] matris,int row, int column) {
        this.row = row;
        this.column = column;
        this.matris = matris;
        
        System.out.println("Giris Matrisi");
        yazdir(matris);
        
        double[][] matrisTranspoz = transpoz(matris);
        double[][] firstMult = matrisCarpim(matrisTranspoz, matris);
        double det = determinant(firstMult);
        if(det == 0.0){
            System.out.println("Determinant sifir oldu");
            firstMult = matrisCarpim(matris, matrisTranspoz);
            yazdir(firstMult);
            double[][] multTers = inverse(firstMult);
            double[][] son = matrisCarpim(matrisTranspoz, multTers);
            new Goster(matris, matrisTranspoz, firstMult, multTers, son, 0, carpmaSayisi, toplamaSayisi).setVisible(true);
        }else{
            System.out.println("Determinant sifir olmadi");
            double[][] multTers = inverse(firstMult);
            double[][] son = matrisCarpim(multTers, matrisTranspoz);
            new Goster(matris, matrisTranspoz, firstMult, multTers, son, 1, carpmaSayisi, toplamaSayisi).setVisible(true);
        }
        
        
        
    }
    
    
    public double determinant(double[][] matrix){
        double det = 0.0;
        int N = matrix.length;
        
        if (N == 1) {
            det = matrix[0][0];
            return det;
        }
        if (N == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            carpmaSayisi +=2;
            toplamaSayisi++;
            return det;
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               det += Math.pow(-1, j) * matrix[i][j] * determinant(minor(matrix, i, j));
               toplamaSayisi++;
               carpmaSayisi += 2;
            }
        }
        
        return det;
    }
    
    public double[][] minor(double[][] matrix,int row,int col){
        double[][] minor = new double[matrix.length-1][matrix.length-1];
        double[] temp = new double[minor.length*minor.length];
        int k = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i != row && j != col){
                    temp[k] = matrix[i][j];
                    k++;
                }
            }
        }
        k = 0;
        
        for(int i=0;i<minor.length;i++){
            for(int j=0;j<minor.length;j++){
                minor[i][j] = temp[k];
                k++;
            }
        }
        return minor;
    }
    
    public double[][] adjoint(double[][] matrix){
        int N = matrix.length;
        double[][] cofactor = new double[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                    cofactor[i][j] = Math.pow(-1, j+i)*determinant(minor(matrix, i, j));
                    carpmaSayisi++;
            }
        }
        return transpoz(cofactor);
    }
    
    public double[][] inverse(double[][] matrix){
        int N = matrix.length;
        double[][] inv = new double[N][N];
        double[][] adj = new double[N][N];
        adj = adjoint(matrix);
        double detTers = 1.0 / determinant(matrix);
        carpmaSayisi++;
        
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               inv[i][j] = detTers * adj[i][j];
               carpmaSayisi++;
            }
        }
        return inv;
    }
}