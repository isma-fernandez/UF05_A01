package circulo;

public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularPerimetro() {
        setPerimetro((this.radio * 2) * Math.PI);
    }

    public void calcularArea() {
        setArea((this.radio * this.radio) * Math.PI);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%.4f%n%s%.2f%n%s%.2f%n%s%n",
                "--------------------------------------------------",
                "Circulo:",
                "- Radio: ", getRadio(),
                "- Area: ", getArea(),
                "- Perimetro: ", getPerimetro(),
                "--------------------------------------------------");
    }

}
