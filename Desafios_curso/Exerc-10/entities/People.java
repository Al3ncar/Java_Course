package entities;

public class People {
    private String name;
    private double heights;
    private int yearsold;

    public People(String name, double heights, int yearsold) {
        this.name = name;
        this.heights = heights;
        this.yearsold = yearsold;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return yearsold;
    }

    public double avgAllHeights(double heights, int qtdPerson) {
        return heights / qtdPerson;
    }

    public double avgSixteenPercent(int avgYears, int qtdPerson) {
        return (double) (avgYears * 100) / qtdPerson;
    }
}
