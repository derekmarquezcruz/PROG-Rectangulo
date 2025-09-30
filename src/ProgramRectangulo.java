import java.util.Scanner;


public class ProgramRectangulo {
    public static void main(String[] args) {




                System.out.print("Introduce la base del rectángulo (En notación decimal): ");
                Scanner scanner = new Scanner(System.in);
                double base = scanner.nextDouble();

                System.out.print("Introduce la altura del rectángulo(En notación decimal): ");
                double altura = scanner.nextDouble();

                Rectangulo rectangulo = new Rectangulo(base ,altura);

                System.out.println("area del rectangulo: "+ rectangulo.CalcularArea());
                System.out.println("perimetro del rectangulo: "+ rectangulo.CalcularPerimetro());


            }
        }



