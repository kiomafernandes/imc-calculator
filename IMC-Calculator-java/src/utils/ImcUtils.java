package utils;

import domain.ImcClaculator;

public class ImcUtils {
    ImcClaculator imc = new ImcClaculator();

    public void setValuesImc(double heigth, double weigth) {
        imc.setHeigth(heigth);
        imc.setWeigth(weigth);
    }

    public String getValuesImc(){
        return "Valores informados: Altura: "
                + imc.getHeigth()+
                "m | Peso: "
                +imc.getWeigth()+
                "kg ";
    }

    public Double getValueResultImc(){
        return imc.getResultImc();
    }
}
