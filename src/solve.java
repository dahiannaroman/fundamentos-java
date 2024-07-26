import java.util.Scanner;
public class solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú de Operaciones");
            System.out.println("1. Casteo");
            System.out.println("2. Operadores de Asignación");
            System.out.println("3. Operadores de Incremento y Decremento");
            System.out.println("4. Ejercicios Combinados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacionesDeCasteo();
                    break;
                case 2:
                    realizarOperadoresDeAsignacion();
                    break;
                case 3:
                    realizarOperadoresDeIncrementoDecremento();
                    break;
                case 4:
                    realizarEjerciciosCombinados();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente");
            }
        }
        scanner.close();
    }

    //Métodos para cada sección de operaciones
    private static void realizarOperacionesDeCasteo() {
        //1
        System.out.println("1");
        int x = (int) 5.89 + (int) 3.45;
        System.out.println("Resultado de (int) 5.89 + (int) 3.45: " + x);

        //2
        System.out.println("2");
        char c = 'A';
        int ascii = (int) c;
        System.out.println("Valor ASCII de 'A': " + ascii);

        //3
        System.out.println("3");
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Valor de i después de casteo de double a long y luego a int: " + i);

        //4
        System.out.println("4");
        String numeroStr = "123";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Convertir String '123' a int: " + numeroInt);

        //5
        System.out.println("5");
        int castResult = (int) (char) (byte) -1;
        System.out.println("Resultado de (int) (char) (byte) -1: " + castResult);

        //6
        System.out.println("6");
        char charValue = (char) 65;
        System.out.println("Número 65 convertido a char: " + charValue);

        //7
        System.out.println("7");
        long longValue = 100L;
        int intValue = (int) longValue;
        System.out.println("El valor de intValue es: " + intValue);

        //8
        System.out.println("8");
        float floatValue = 3.14f;
        String stringValue = String.valueOf(floatValue);
        System.out.println("Valor de String: " + stringValue);

        //9
        System.out.println("9");
        double value = 3.7;
        int roundedValue = (int) Math.round(value);
        System.out.println("El valor redondeado es: " + roundedValue);

        //10
        System.out.println("10");
        byte b = 50;
        short s = (short) b;
        System.out.println("Valor de s: " + s);

    }
    private static void realizarOperadoresDeAsignacion() {
        //1
        System.out.println("1");
        int x = 10;
        x += 5;
        System.out.println("Valor de x es: " + x);

        //2
        System.out.println("2");
        int b = 2;
        int y = 3;

        y *= (b + 5);

        System.out.println("El valor de y es: " + y);

        //3
        System.out.println("3");
        int a = 15;
        a %= 4;
        System.out.println("El valor de a es: " + a);

        //4
        System.out.println("4");
        int X = 10;
        int Y = 5;

        X += Y;
        System.out.println("El valor de x es: " + X);

        //5
        System.out.println("5");
        int equis = 5;

        equis ^= 2;
        System.out.println("El valor de x es: " + equis);
    }

    private static void realizarOperadoresDeIncrementoDecremento() {
        //1
        System.out.println("1");
        int j = 5; //x
        int k = ++j; //y

        System.out.println("El valor de x es: " + j);
        System.out.println("El valor de y es: " + k);

        //2
        System.out.println("2");
        int A = 5;
        System.out.println("El valor antes del incremento es: " + A++);
        System.out.println("El valor después de incrementar es: " + A);

        //3
        System.out.println("3");
        int count = 10;
        System.out.println("Valor original de count: " + count);
        count--;
        System.out.println("Valor de count después del postdecremento: " + count);

        //4
        System.out.println("4");
        System.out.println("++i Preincremento");
        int m = 5;
        int result = ++m;
        System.out.println("Valor de i después de ++i: " + m);
        System.out.println("Valor de result: " + result);

        System.out.println("i++ Postincremento");
        int M = 5;
        int result2 = M++;
        System.out.println("Valor de i después de i++: " + M);
        System.out.println("Valor de result: " + result2);

        //5
        System.out.println("5");
        int h = 3; //x
        h = h++; //x
        System.out.println("El valor de x es: " + h);

    }

    private static void realizarEjerciciosCombinados() {
        //1
        System.out.println("1");
        int d = 5; //i
        d += ++d + d++ + ++d;
        System.out.println("El valor de i es: " + d);

        //2
        System.out.println("2");
        double doubleValue = 7.9;
        int intValue = (int) doubleValue;
        int incrementedValue = intValue++;

        System.out.println("Valor convertido a int: " + intValue);
        System.out.println("Valor incrementado (después del incremento): " + incrementedValue);
        System.out.println("Valor de intValue después del postincremento: " + intValue);

        //3
        System.out.println("3");
        double D = 5.7; //d
        int i = (int) D; //i
        D *= 2;
        System.out.println(i--);

        //4
        System.out.println("4");
        int IntValue = 7;
        double DoubleValue = 0;

        DoubleValue += (double) IntValue / 2.0;
        System.out.println("El resultado de la división es: " + DoubleValue);

        //5
        System.out.println("5");
        char C = 'X';
        C += 32;
        System.out.println(C);

        //6
        System.out.println("6");
        long longValue = 15000L;
        short shortValue = (short) longValue;
        shortValue *= 3;
        System.out.println("El valor de shortValue es: " + shortValue);

        //7
        System.out.println("7");
        int o = 10; //x
        o += (o++) + (++o);
        System.out.println("El valor de x es: " + o);

        //8
        System.out.println("8");
        float floatValue = 25.7f;
        byte byteValue = (byte) floatValue;
        byteValue = (byte) --byteValue;
        System.out.println("El valor de byteValue después del predecremento es: " + byteValue);

        //9
        System.out.println("9");
        int n = 257; //i
        byte w = (byte) n;
        System.out.println(w);

        //10
        System.out.println("10");
        double doubleValue2 = 7.8;
        int intValue2 = (int) doubleValue2;

        intValue2 += 5;
        intValue2++;
        System.out.println("El valor final es: " + intValue2);




    }
}