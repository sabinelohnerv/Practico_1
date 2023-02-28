package paquete;

public class Series {

	public void Ejercicio2(int n) {
		int nro = 1;
		int number = 60;
		System.out.println("Ejercicio 2");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(number + " ");
				number = number - 2;
			} else {
				System.out.print(nro + " ");
				nro = nro + 2;
			}
		}
	}

	public void Ejercicio4(int n) {
		int x = 2;
		int y = 1;

		System.out.println("\n\nEjercicio 4");

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(x + " ");
				x += 2;
			} else {
				System.out.print(y + " ");
				y += 2;
			}
		}

	}

	public void Ejercicio6(int n) {
		System.out.println("\n\nEjercicio 6");
		for (int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}
	}

	public void Ejercicio8(int n) {
		int number, nro;
		System.out.println("\n\nEjercicio 8");
		number = 1;
		nro = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(number + " ");
			} else {
				System.out.print(nro + " ");
			}
		}
	}

	public void Ejercicio10(int n) {

		System.out.println("\n\nEjercicio 10");
		int counter = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
				counter++;
				if (counter == n) {
					break;
				}
			}
			if (counter == n) {
				break;
			}

		}

	}

	public void Ejercicio12(int n) {
		System.out.println("\n\nEjercicio 12");
		for (int i = 0; i < n; i++) {
			System.out.print(1 + (3 * i) + " ");
		}
	}

	public void Ejercicio14(int times_repeated) {
		System.out.println("\n\nEjercicio 14");
		int number = 1;
		for (int i = 1; i <= times_repeated; i++) {
			System.out.print(number * 3 + " ");
			number = number * 3;
		}
	}

	public void Ejercicio16(int n) {

		System.out.println("\n\nEjercicio 16");

		double x = 8;

		for (int i = 0; i < n; i++) {

			System.out.print(x / 2 + " ");

			x = x / 2;

		}

	}

	public void Ejercicio18() {
		int decreciente = 7;
		int creciente = 1;
		System.out.println("\n\nEjercicio 18");
		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				System.out.print(decreciente + " ");
				decreciente--;
			} else {
				System.out.print(creciente + " ");
				creciente++;
			}
		}
	}

	public void Ejercicio20(int times_repeated) {
		System.out.println("\n\nEjercicio 20");
		int number = 1;
		for (int i = 1; i <= times_repeated; i++) {
			System.out.print(number + " ");
			number += number;
		}
	}

	public void Ejercicio22(int n) {

		System.out.println("\n\nEjercicio 22");
		int a = -1;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				a += b;
				System.out.print(a + " ");
			} else {
				b += a;
				System.out.print(-b + " ");
			}
		}

	}

	public void Ejercicio24(int n) {
		int x = 2;
		int anterior;
		int mult = 2;
		int acc = 3;
		System.out.println("\n\nEjercicio 24");
		for (int i = 0; i <= n; i++) {
			if (i == 1) {
				System.out.print(1 + " ");
			}
			if (i > 1 && i % 2 != 0) {
				System.out.print(x + " ");
				anterior = x;
				x = anterior * mult;
				mult++;
			}
			if (i > 1 && i % 2 == 0) {
				System.out.print(acc + " ");
				acc = acc + 3;
			}
		}
	}

	public void Ejercicio26(int n) {
		int x = 1; int y; int z = 0; int c = 2;
		System.out.println("\n\nEjercicio 26");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				z = x * x;
				System.out.print(z + " ");
				x += 2;
			} else {
				y = z + c;
				System.out.print(-y + " ");
				c+=2;
			}
		}
	}

	public void Ejercicio28(int n) {

		System.out.println("\n\nEjercicio 28");

		int x = 4;

		for (int i = 0; i < n; i++) {

			System.out.print(x + " ");

			x += 3;

		}

	}

	public void Ejercicio30(int n) {
		int anterior = 4;
		int actual = 4;
		System.out.println("\n\nEjercicio 30");
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(actual + " ");
			} else {
				System.out.print(actual + " ");
				actual = anterior * i;
				anterior = actual;

			}
		}
	}

	public void Ejercicio32(int times_repeated) {
		System.out.println("\n\nEjercicio 32");
		int number = 1;
		int total;
		for (int i = 1; i <= times_repeated + 1; i++) {
			if (number == 1) {
				System.out.print(number + " ");
			}
			total = number;
			number = total + total;
			if (total > 2) {
				System.out.print(total + " ");
			}

		}
	}

	public void Ejercicio34(int n) {

		System.out.println("\n\nEjercicio 34");

		int x = 6;
		int y = 2;

		for (int i = 0; i < n; i++) {

			System.out.print(x + " ");

			int temp = x + y;
			y = x;
			x = temp;

		}

	}

	public void Ejercicio36() {
		int serie1 = 100;
		int serie2 = 50;
		System.out.println("\n\nEjercicio 36");
		for (int i = 1; i <= 12; i++) {
			if (i < 7) {
				System.out.print(serie1 + " ");
				serie1 -= 3;
			} else {
				System.out.print(serie2 + " ");
				serie2 *= 2;
			}
		}
	}
}
