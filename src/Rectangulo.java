class Rectangulo {
    // atributos
    private double base;
    private double altura;

    // constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double CalcularArea() {
        return this.base * this.altura;
    }

    public double CalcularPerimetro() {
        return this.base * 2 + this.altura * 2;
    }
}

