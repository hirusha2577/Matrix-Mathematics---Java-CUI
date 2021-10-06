package mc;

public class CofactorOfMatrix {
    
  
    public static int[][] CofactorOfMatrix33(int Matrix[][]){
        int c[][] = {{c11(Matrix[1][1],Matrix[2][2],Matrix[1][2],Matrix[2][1]), c12(Matrix[1][0],Matrix[2][2],Matrix[1][2],Matrix[2][0]) ,c13(Matrix[1][0],Matrix[2][1],Matrix[1][1],Matrix[2][0])},
                     {c21(Matrix[0][1],Matrix[2][2],Matrix[0][2],Matrix[2][1]), c22(Matrix[0][0],Matrix[2][2],Matrix[0][2],Matrix[2][0]) ,c23(Matrix[0][0],Matrix[2][1],Matrix[0][1],Matrix[2][0])},
                     {c31(Matrix[0][1],Matrix[1][2],Matrix[0][2],Matrix[1][1]), c32(Matrix[0][0],Matrix[1][2],Matrix[0][2],Matrix[1][0]) ,c33(Matrix[0][0],Matrix[1][1],Matrix[0][1],Matrix[1][0])}};
        return c;
    }
    
 public static int c11(int a, int aa, int b, int bb){
     return 1*((a*aa)-(b*bb));
 }
 public static int c12(int a, int aa, int b, int bb){
     return -1*((a*aa)-(b*bb));
 }
 public static int c13(int a, int aa, int b, int bb){
     return 1*((a*aa)-(b*bb));
 }
 public static int c21(int a, int aa, int b, int bb){
     return -1*((a*aa)-(b*bb));
 }
 public static int c22(int a, int aa, int b, int bb){
     return 1*((a*aa)-(b*bb));
 }
 public static int c23(int a, int aa, int b, int bb){
     return -1*((a*aa)-(b*bb));
 }
 public static int c31(int a, int aa, int b, int bb){
     return 1*((a*aa)-(b*bb));
 }
 public static int c32(int a, int aa, int b, int bb){
     return -1*((a*aa)-(b*bb));
 }
 public static int c33(int a, int aa, int b, int bb){
     return 1*((a*aa)-(b*bb));
 }
 
 public static int c11(int a){
     return a;
 }
 public static int c12(int a){
     return -a;
 }
 public static int c21(int a){
     return -a;
 }
 public static int c22(int a){
     return a;
 }
    
}
