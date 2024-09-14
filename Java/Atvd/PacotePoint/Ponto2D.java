package PacotePoint;

public class Ponto2D {

    private double x;
    private double y;
    private boolean polar;
    private double raio;
    private double angulo;

    // Construtor padrão
    public Ponto2D() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
        this.angulo = 0;
        this.polar = false; // Indica que estamos usando coordenadas cartesianas por padrão
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        this.raio = Math.sqrt(x * x + y * y);
        this.angulo = Math.atan2(y, x);
        this.polar = false;
    }

    public Ponto2D(double raio, double angulo, boolean polar) {
        this.polar = polar;
        if (polar) {
            this.raio = raio;
            this.angulo = angulo;
            this.x = raio * Math.cos(angulo);
            this.y = raio * Math.sin(angulo);
        } else {
            this.x = raio;
            this.y = angulo;
            this.raio = Math.sqrt(x * x + y * y);
            this.angulo = Math.atan2(y, x);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    public double getAngulo() {
        return angulo;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setX(double x) {
        this.x = x;
        atualizarCoordenadas();
    }

    public void setY(double y) {
        this.y = y;
        atualizarCoordenadas();
    }

    public void setRaio(double raio) {
        this.raio = raio;
        atualizarCartesianas();
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
        atualizarCartesianas();
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
        atualizarCoordenadas();
    }

    private void atualizarCoordenadas() {
        if (polar) {
            this.raio = Math.sqrt(x * x + y * y);
            this.angulo = Math.atan2(y, x);
        } else {
            this.x = raio * Math.cos(angulo);
            this.y = raio * Math.sin(angulo);
        }
    }

    private void atualizarCartesianas() {
        if (!polar) {
            this.x = raio * Math.cos(angulo);
            this.y = raio * Math.sin(angulo);
        } else {
            this.raio = Math.sqrt(x * x + y * y);
            this.angulo = Math.atan2(y, x);
        }
    }

    public void espelhar(int i) {
        switch (i) {
            case 0 -> {
                this.x = -x;
                
            }
            case 1 -> {
                this.y = -y;
                
            }
            case 2 -> {
                this.x = -x;
                this.y = -y;
                
            }
            default -> {
            }
        }
        atualizarCoordenadas();
    }

    public void moveto(double dx, double dy) {        
        this.x = dx;
        this.y = dy;
        this.raio = Math.sqrt(dx * dx + dy * dy);  
        this.angulo = Math.atan2(dy, dx);  
    }

    public double distanceTo(Ponto2D ponto) {
        return Math.sqrt(Math.pow(this.x - ponto.getX(), 2) + Math.pow(this.y - ponto.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
