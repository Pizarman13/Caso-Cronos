package org.example;

public class CronometroCosmico {

    private static final double EARTH_DAY_IN_SECONDS = 24 * 60 * 60; // 24 hours * 60 minutes * 60 seconds
    private static final double EARTH_YEAR_IN_SECONDS = 365 * EARTH_DAY_IN_SECONDS;

    private static final double X_DAY_IN_SECONDS = 20 * 60 * 60; // 20 hours * 60 minutes * 60 seconds
    private static final double X_YEAR_IN_SECONDS = 400 * X_DAY_IN_SECONDS;

    private long earthSeconds;

    public CronometroCosmico(long earthSeconds) {
        this.earthSeconds = earthSeconds;
    }

    public double[] convertToXPlanet() {
        double xYears = this.earthSeconds / X_YEAR_IN_SECONDS;
        double xDays = (this.earthSeconds % X_YEAR_IN_SECONDS) / X_DAY_IN_SECONDS;
        double xHours = ((this.earthSeconds % X_YEAR_IN_SECONDS) % X_DAY_IN_SECONDS) / 3600;
        double xMinutes = (((this.earthSeconds % X_YEAR_IN_SECONDS) % X_DAY_IN_SECONDS) % 3600) / 60;
        double xSeconds = (((this.earthSeconds % X_YEAR_IN_SECONDS) % X_DAY_IN_SECONDS) % 3600) % 60;

        return new double[]{xYears, xDays, xHours, xMinutes, xSeconds};
    }

    public void printXPlanetTime(double[] xTime) {
        System.out.println("Tiempo en el planeta X:");
        System.out.println("Años: " + xTime[0]);
        System.out.println("Días: " + xTime[1]);
        System.out.println("Horas: " + xTime[2]);
        System.out.println("Minutos: " + xTime[3]);
        System.out.println("Segundos: " + xTime[4]);
    }

}

