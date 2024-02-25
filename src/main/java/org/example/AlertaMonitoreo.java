package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlertaMonitoreo {

    private final List<Double> nivelRadiacion = new ArrayList<>();
    private final List<Double> temperatura = new ArrayList<>();
    private final List<Double> presion = new ArrayList<>();

    public void monitorVariables() {
        Random random = new Random();

        nivelRadiacion.add(random.nextDouble() * 100);
        temperatura.add(random.nextDouble() * 100);
        presion.add(random.nextDouble() * 100);

        System.out.println("Variables monitoreadas");
        System.out.println("Temperatura: " + temperatura.getLast());
        System.out.println("Presión: " + presion.getLast());
        System.out.println("Nivel de radiación: " + nivelRadiacion.getLast());
    }

    public void alerta() {
        System.out.println("Alerta: Posible problema de temperatura, presion y radiación, se recomienda revisar el sistema.");
    }


    public List<Integer> Eventos(int n) {
        try {
            List <Integer> eventos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                eventos.add(i);
            }
            return eventos;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public List<Integer> resolucionProblema(int problema) {
        try {
            List<Integer> resolucionProblema = new ArrayList<>();
            for (int i = 2; i <= problema; i++) {
                while (problema % i == 0) {
                    resolucionProblema.add(i);
                    problema /= i;
                }
            }
            return resolucionProblema;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
