import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        int lado_A, lado_B, lado_C, perimetro;
        Scanner sd = new Scanner(System.in);
        System.out.println("introduzca la longitud del lado A");
        lado_A = sd.nextInt();
        System.out.println("introduzca la longitud del lado B");
        lado_B = sd.nextInt();
        System.out.println("introduzca la longitud del lado C");
        lado_C = sd.nextInt();
        perimetro = lado_A + lado_B + lado_C;
        System.out.println("el perimetro es" + perimetro);
    }
}
