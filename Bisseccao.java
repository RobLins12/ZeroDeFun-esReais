public class Bisseccao {

    //Escreve sua função aqui
    //Utilize Math.* para as funções
    public static double f(double x) {
        return Math.pow(x,2) - 4;
    }
    public static void main(String[] args) {
        //Escreva os intervalos e o E 
        double A = 2.3;
        double B = 1.4;
        double E = 0.0;
        
        //Não altere
        double x = 0;
        int i = 0;

        if (f(A) * f(B) < 0) {
            x = (double)(A+B) / 2.0;
            while(Math.abs(f(x)) > E){
                if (f(A) * f(x) > 0) {
                    A = x;
                }
                else {
                    B = x;
                }
                x = (double)(A+B) / 2.0;
                i++;
            }
            System.out.println("A raiz é " + x);  
            System.out.println("Número de iterações " + i);
        } 
        else{
            System.out.println("Não há raiz nesse intervalo");
        }
    }
}
