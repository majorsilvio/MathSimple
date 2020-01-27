package SubMenus;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class Bhaskara {

    Double a;
    Double b;
    Double c;
    public Bhaskara() throws IOException{

        System.out.println("Informe os valores para A , B e C da equação");
        Scanner input= new Scanner(System.in);
		
		this.a = input.nextDouble();
		this.b = input.nextDouble();
		this.c = input.nextDouble();
        if (a == 0) {
            throw new IOException("\"A\" deve ser diferente de 0");
        }
        if (Double.isNaN(Math.sqrt(this.delta()))) {
                       
            throw new IOException("Não possui raiz real: Delta é igual à " + this.delta());
        }
        this.result();

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
    public void result(){
		System.out.println("As raizes da equação são : \n X'  = " + this.x1() + "\n X'' = " + this.x2());
	}
}