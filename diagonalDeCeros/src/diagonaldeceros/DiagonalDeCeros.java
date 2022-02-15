package diagonaldeceros;

public class DiagonalDeCeros {

    /* Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4
    a excepción de su diagonal principal, la cual debe ser rellenada con números 0. 
    Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla. 
    Tener como ejemplo la matriz que se presenta a continuación. 
     */
    public static void main(String[] args) {
       
        int matriz[][] = new int[4][4];
        
        for( int fila = 0; fila < 4; fila ++){
            for ( int col = 0; col < 4; col ++){
                if( fila == col){
                    matriz[fila][col] = 0;
                } 
                else{
                    matriz[fila][col] = 1;
                }
                System.out.print(matriz[fila][col]);
            }
            System.out.println("");
        }
    }
    
}
