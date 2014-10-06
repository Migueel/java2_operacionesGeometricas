import java.util.Scanner;

import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

public class OperacionesGeometria {

	public static void main(String[] args) {
	
	string opcion;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("\nIngresa la opción circulo o rectangulo");
	opcion = sc.next();

	if (opcion.eqaulsInoreCase(circulo)==true) {

		double radio, result;
		Circulo circulo = new Circulo();
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();
		
		circulo.setRadio(radio);

		result = circulo.circunferencia();
		System.out.println("La circunferencia es: " + result);

		result = circulo.area();
		System.out.println("El área es: " + result);
	}
		
	else {
		
		double base, altura;
		Rectangulo operaciones = new Rectangulo();
		
		System.out.print("\nIngresa la altura del rectángulo: ");
		altura = sc.nextDouble();
		
		System.out.print("\nIngresa la base del rectángulo: ");
		base = sc.nextDouble();


		operaciones.setBase(base);
		operaciones.setAltura(altura);

		System.out.println("\nEl perímetro es: " + operaciones.perimetro());
		System.out.println("\nEl área es: " + operaciones.area());
	}
    }
}

