import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String readString(String message) {
        System.out.println(message);
        String entrada = null;
        try {
            entrada = bufferedReader.readLine();
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    private void salir() {
        System.out.println("ERROR de entrada/salida");
        System.exit(0);
    }

}
