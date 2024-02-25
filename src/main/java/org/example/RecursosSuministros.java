package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class RecursosSuministros {
    private ArrayList<Integer> registros;

    public RecursosSuministros() {
        registros = new ArrayList<>();
    }

    // Método para registrar el consumo de recursos en un día
    public void registrarConsumo(int consumo) {
        registros.add(consumo);
    }

    // Método para calcular la cantidad total de recursos consumidos
    public int calcularCantidadTotal() {
        int total = 0;
        for (int consumo : registros) {
            total += consumo;
        }
        return total;
    }

    // Método para calcular el ritmo de consumo de recursos
    public double calcularRitmoConsumo(int periodo) {
        if (registros.isEmpty()) {
            return 0.0;
        }
        int cantidadTotal = calcularCantidadTotal();
        return (double) cantidadTotal / periodo;
    }

    // Método para calcular la media de recursos consumidos
    public double calcularMedia() {
        if (registros.isEmpty()) {
            return 0.0;
        }
        int cantidadTotal = calcularCantidadTotal();
        return (double) cantidadTotal / registros.size();
    }

    // Método para calcular el mínimo de recursos consumidos
    public int calcularMinimo() {
        if (registros.isEmpty()) {
            return 0;
        }
        return Collections.min(registros);
    }

    // Método para calcular el máximo de recursos consumidos
    public int calcularMaximo() {
        if (registros.isEmpty()) {
            return 0;
        }
        return Collections.max(registros);
    }

}
