package domain;

public class ImcClaculator {
    private double heigth;
    private double weigth;

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getResultImc() {
        return weigth/(heigth*heigth);
    }
}
