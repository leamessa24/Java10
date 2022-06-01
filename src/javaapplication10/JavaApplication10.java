
package javaapplication10;






public class JavaApplication10 {

   
    public static void main(String[] args) {
        double[] A = new double[50];
       double[] B = new double[20];
        int aux = 0;
        for (int x=0;x<50;x++){
            A[x] = (int) (Math.random()*49+1); 
            System.out.println("Espacio "+ x + "----> "+ A[x]);
        }
        for(int j=0;j<49;j++){
         for (int i=0;i<49;i++){
            if (A[i]> A[i+1]){
             aux = (int) A[i];
             A[i] = A[i+1];
             A[i+1]= aux;
            }
         }
        } 
        int k=0;
        System.out.println("Numeros ordenados: ");
        while (k<50){
            System.out.println(A[k]);
            k++;
        } 
        System.arraycopy(A, 0, B, 0, 10);
        float num = (float) 0.5;
        for (int y=10;y<20;y++){
            B[y] = num;  
        }
        int h=0;
        System.out.println("Array A: ");
        while (h<50){
            System.out.println(A[h]);
            h++;}
       int p=0;
        System.out.println("Array B: ");
        while (p<20){
            System.out.println(B[p]);
            p++;
        } 
    }
    
}
    
