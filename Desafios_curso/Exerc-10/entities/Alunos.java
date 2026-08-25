package entities;

public class Alunos {
    private String name;
    private double noteFirst;
    private double noteSecond;
    private double avgNotes;

    public Alunos(String name, double noteFirst, double noteSecond) {
        this.name = name;
        this.noteFirst = noteFirst;
        this.noteSecond = noteSecond;
        this.avgNotes = calcAverageNotes(noteFirst, noteSecond);
    }

    public String getName() {
        return name;
    }

    public double getAvgNotes(){
        return avgNotes;
    }

    public double calcAverageNotes(double noteFirst, double noteSecond) {
        return ((noteFirst + noteSecond) / 2);
    }

}
