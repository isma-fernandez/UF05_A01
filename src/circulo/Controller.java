package circulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private List<Circulo> circulos = new ArrayList<>();
    private List<Double> radios = new ArrayList<Double>();
    
    public Controller() {
    }

    public void start() throws Exception  {
        generarRadios();
        ordenamiento();
        generarCirculos();
        imprimirCirculos();
    }
    
    
    private void generarRadios() {
        double radio;
        do {
            radio = Math.random();
            radios.add(radio);
        } while (radio > 0.01);
        System.out.println(radios);
    }
    
    private void ordenamiento() throws Exception {
        Scanner userChoice = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n",
                "Selecciona el método de ordenamiento:",
                "1 - Por orden ascendente",
                "2 - Por orden descendente"
        );

        int menuOption = userChoice.nextInt();


        switch (menuOption) {
            case 1:
                Collections.sort(radios);
                break;
            case 2:
                Collections.sort(radios, Collections.reverseOrder());
                break;
            default:
                throw new Exception("Esa opción no existe.");
        }
    }

    private void generarCirculos() {
        
        int i = 0;
        for (var radio : radios) {
            circulos.add(new Circulo(radio));
        }
    }

    
    
    private void imprimirCirculos() {
        for(var circulo : circulos) {
            circulo.calcularArea();
            circulo.calcularPerimetro();
            System.out.println(circulo.toString());
        }
    }
    
    
}
