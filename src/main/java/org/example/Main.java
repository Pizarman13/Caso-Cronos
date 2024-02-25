package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // CronometroCosmico

        System.out.println("Cronómetro Cósmico");

        CronometroCosmico cronometro = new CronometroCosmico(1000000000);
        double[] xTime = cronometro.convertToXPlanet();
        cronometro.printXPlanetTime(xTime);

        System.out.println();

        // RecursosSuministros

        System.out.println("Recursos y Suministros");

        RecursosSuministros recursos = new RecursosSuministros();

        recursos.registrarConsumo(10);
        recursos.registrarConsumo(15);
        recursos.registrarConsumo(20);
        recursos.registrarConsumo(12);
        recursos.registrarConsumo(18);

        System.out.println("Cantidad total de recursos consumidos: " + recursos.calcularCantidadTotal());
        System.out.println("Ritmo de consumo de recursos por día: " + recursos.calcularRitmoConsumo(5));
        System.out.println("Media de recursos consumidos por día: " + recursos.calcularMedia());
        System.out.println("Mínimo de recursos consumidos por día: " + recursos.calcularMinimo());
        System.out.println("Máximo de recursos consumidos por día: " + recursos.calcularMaximo());

        System.out.println();

        // AlertaMonitoreo

        System.out.println("Alerta de Monitoreo");

        AlertaMonitoreo alertaMonitoreo = new AlertaMonitoreo();

        alertaMonitoreo.monitorVariables();
        alertaMonitoreo.alerta();

        System.out.println(alertaMonitoreo.Eventos(5));
        System.out.println(alertaMonitoreo.resolucionProblema(10));

        System.out.println();

        // PlanificadorDeTareas

        System.out.println("Planificador de Tareas");

        PlanificadorDeTareas.Tarea tarea1 = new PlanificadorDeTareas.Tarea("Limpiar", 10);
        PlanificadorDeTareas.Tarea tarea2 = new PlanificadorDeTareas.Tarea("Cocinar", 20);
        PlanificadorDeTareas.Tarea tarea3 = new PlanificadorDeTareas.Tarea("Recolectar Recursos", 30);
        PlanificadorDeTareas.Tarea tarea4 = new PlanificadorDeTareas.Tarea("Revisar Fallos", 40);

        PlanificadorDeTareas.Tripulante tripulante1 = new PlanificadorDeTareas.Tripulante("Juan");
        PlanificadorDeTareas.Tripulante tripulante2 = new PlanificadorDeTareas.Tripulante("Pedro");
        PlanificadorDeTareas.Tripulante tripulante3 = new PlanificadorDeTareas.Tripulante("Luis");

        PlanificadorDeTareas planificador = new PlanificadorDeTareas(List.of(tarea1, tarea2, tarea3, tarea4), List.of(tripulante1, tripulante2, tripulante3));
        planificador.distribuirTareas();

        planificador.visualizarHorarios();

        planificador.ajustarTareas(tripulante1, tarea1);
        planificador.visualizarHorarios();

        System.out.println();

        // NavegadorEstelar

        System.out.println("Navegador Estelar");

        double[][] terreno = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        NavegadorEstelar.calcularRutas(terreno);

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};
        NavegadorEstelar.multiplicarMatrices(matriz1, matriz2);

        System.out.println();

        // ComunicacionInterplanetaria

        System.out.println("Comunicación Interplanetaria");

        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();

        String mensaje = "Chipi chipi chapa chapa dubi dubi daba daba";
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Cantidad de vocales: " + comunicador.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + comunicador.invertirMensaje(mensaje));
        System.out.println("¿Es un palíndromo?: " + comunicador.esPalindromo(mensaje));


    }
}