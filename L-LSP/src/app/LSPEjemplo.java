class Rectangulo {
    protected int ancho;
    protected int alto;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

class Cuadrado extends Rectangulo {

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho; // fuerza igualdad
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
        this.ancho = alto; // fuerza igualdad
    }
}