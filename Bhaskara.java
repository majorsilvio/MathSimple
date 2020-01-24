import java.io.IOException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bhaskara {

    private double a ;
    private double b ;
    private double c ;

    public Bhaskara(double a, double b , double c) throws IOException{
        this.a = a;
        this.b = b;
        this.c = c;
        if (this.a == 0) {
            throw new IOException("A = 0");
        }
        if (Double.isNaN(Math.sqrt(this.delta()))) {
            throw new IOException("Não possui raiz real");
        }
    }

    public double delta(){
        return (this.b*this.b)-4*this.a*this.c;
    }

    public double x1(){
        return (-this.b+Math.sqrt(this.delta()))/(2*this.a);
    }
    public double x2(){
        return (-this.b-Math.sqrt(this.delta()))/(2*this.a);
    }

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

       Bhaskara mascara = new Bhaskara(a,b,c);

       System.out.println(mascara.delta());
       System.out.println(mascara.x1());
       System.out.println(mascara.x2());

    }

}