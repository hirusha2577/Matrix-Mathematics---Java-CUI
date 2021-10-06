package mc;

import java.util.Scanner;

public class InverseOfMatrix {
      public static int[][] InverseOfMatrix22(int Matrix[][]){
          int c[][] = new int [2][2];

        c[0][0] = CofactorOfMatrix.c11(Matrix[1][1]);
        c[0][1] = CofactorOfMatrix.c12(Matrix[1][0]);
        c[1][0] = CofactorOfMatrix.c21(Matrix[0][1]);
        c[1][1] = CofactorOfMatrix.c22(Matrix[0][0]);                  
        return c;        
    }
    public static int[][] InverseOfMatrix33(int Matrix[][]){
        int adjA[][] = new int [3][3];
        adjA = TranposeOfMatrix.TranposeOfMatrix33( CofactorOfMatrix.CofactorOfMatrix33(Matrix));
        
        return adjA;
    }
    
    public static void main(String [] args){
        int size;        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size : ");
        size = s.nextInt();
        int Matrix[][] = new int [size][size];
        int InverseMatrix[][] = new int [size][size];
      
        System.out.println("Enter matrix  : ");
        for(int i=0; i<Matrix.length; i++){
            for(int x=0; x<Matrix.length; x++){
                Matrix[i][x]= s.nextInt();
            }
            System.out.println("");
        }
        for(int i=0; i<Matrix.length; i++){
            for(int x=0; x<Matrix.length; x++){
                System.out.print(""+Matrix[i][x]);
            }
            System.out.println("");
        }
        
        if(size == 2)
            InverseMatrix =InverseOfMatrix22(Matrix);
        if(size == 3)
            InverseMatrix =InverseOfMatrix33(Matrix);
        
         System.out.println("Inverse Matrix is");
        if(size == 3){
            System.out.println("");
            System.out.println("1"+"/"+DetermlnantOfMatrix.DetermlnantOfMatrix33(Matrix));
        }    
         
         for(int i=0; i<InverseMatrix.length; i++){
            for(int x=0; x<InverseMatrix.length; x++){
                System.out.print(""+InverseMatrix[i][x]+" ");
            }
            System.out.println("");
        }   
        
        
    }
}
