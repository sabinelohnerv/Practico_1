package paquete;

public class Sumatorias {

	public int Ejercicio2(int n) {
		int total = 0;
		int nro1 = 4;
		int nro2 = 0;
		int nro3 = 1;
		System.out.println("\nEjercicio 2");
		for (int i = 1; i <= n; i++) {
			nro2 = nro3;
			total += nro3;
			nro3 = nro1;
			nro1 = nro3 + nro2;
		}
		return total;
	}

	public int Ejercicio4(int n) {
		System.out.println("\nEjercicio 4");
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += (2 * i - 1) * (2 * i);
		}
		return suma;

	}

	public int Ejercicio6(int n) {
		int suma = 0;
		System.out.println("\nEjercio 6");
		for (int i = 1; i <= n; i++) {
			suma = suma + (i * (i + (1 * (i - 1))));
		}
		return suma;
	}

	public int Ejercicio8(int n) {
		int total = 1;
		int nro1 = 1;
		int nro2 = 2;
		int nro3 = 0;
		System.out.println("\nEjercicio 8");
		for (int i = 1; i <= n; i++) {
			nro1 += nro2;
			total += nro3;
			nro3 = nro1 * nro1;
		}
		return total;
	}

	public int Ejercicio10(int n) {

		System.out.println("\nEjercicio 10");

		int suma = 0;
		int num = 1;
		for (int i = 0; i < n - 1; i++) {
			suma += num;
			if (i % 2 == 0) {
				num *= 2;
			}
		}
		return suma + 1;

	}

	public int Ejercicio12(int n) {
		int suma = 0;
		System.out.println("\nEjercio 12");
		for (int i = 0; i < n; i++) {
			suma = suma + (11 * (i + 1));
		}
		return suma;
	}

	public int Ejercicio14(int n) {

		System.out.println("\nEjercicio 14");

		int suma = 0;
		int num = 6;
		for (int i = 0; i < n; i++) {
			suma += num;
			num *= 2;

		}
		return suma;

	}

	public float Ejercicio16() {
		float suma = 0;
		System.out.println("\nEjercio 16");
		for (int i = 0; i < 9; i++) {
			float f = i;
			suma = suma + ((9 - f) / (f + 1));
		}
		return suma;
	}
}
