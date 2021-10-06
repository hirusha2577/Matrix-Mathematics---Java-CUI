package mc;

import java.util.Scanner;

public class DetermlnantOfMatrix {
    
    public static int DetermlnantOfMatrix22(int det[][]){
        return (det[0][0]*det[1][1])-(det[0][1]*det[1][0]);
    }
    public static int DetermlnantOfMatrix33(int det[][]){
        return (det[0][0]*CofactorOfMatrix.c11(det[1][1], det[2][2], det[1][2], det[2][1])) + (det[0][1]*CofactorOfMatrix.c12(det[1][0], det[2][2], det[1][2], det[2][0])) + (det[0][2]*CofactorOfMatrix.c13(det[1][0], det[2][1], det[1][1], det[2][0]));   
    }
    
    public static void main(String [] args){
        int size;        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size : ");
        size = s.nextInt();
        int Matrix[][] = new int [size][size];
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
            System.out.println("Determlnant is = "+ DetermlnantOfMatrix22(Matrix));
        else
            System.out.println("Determlnant is = "+ DetermlnantOfMatrix33(Matrix));
            
        
        
    }
}
