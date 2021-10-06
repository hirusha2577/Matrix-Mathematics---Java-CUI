package mc;

public class TranposeOfMatrix {
    
    public static int[][] TranposeOfMatrix22(int a[][]){
        int aT[][] = new int [2][2];
        for(int i=0; i<2; i++){
         for(int x=0; x<2; x++){
            aT[x][i] = a[i][x];
         }
        }       
        return aT;
    }
    
    public static int[][] TranposeOfMatrix33(int a[][]){
        int aT[][] = new int [3][3];
        for(int i=0; i<3; i++){
         for(int x=0; x<3; x++){
            aT[x][i] = a[i][x];
         }
        }        
        return aT;
    }
}
