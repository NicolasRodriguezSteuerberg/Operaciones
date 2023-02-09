import com.nico.io.EntradaSalida;

public class Main {

    public static void main(String[] args) {
        int opcion;
        do{
            Float resultado;
            opcion = EntradaSalida.entradaInt("1 --> Hacer suma\n2 --> Hacer resta\n3 --> Hacer multiplicación\n4 --> Hacer división\n5 --> Saír do programa");
            if(opcion > 0 && opcion < 5) {
                resultado = OperacionesBasicas.realizar(opcion, EntradaSalida.entradaFloat("Teclee o primer número da operación"), EntradaSalida.entradaFloat("Teclee o segundo número da operación"));
                EntradaSalida.salida(("O resultado da operación é " + resultado), EntradaSalida.SALIDA_WINDOW);
            }
        }while (opcion > 0 && opcion < 5);
        EntradaSalida.salida("Saíndo do programa", EntradaSalida.SALIDA_WINDOW);
    }
}