package views;

import utils.ImcUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImcViews {
    ImcUtils util = new ImcUtils();
    Scanner scanner = new Scanner(System.in);
    public void panel(){
        try {
           do{
               System.out.println("CALCULADORA IMC");
               System.out.println("Insira os os valores de altura e peso!");
               System.out.println("Altura: ");
               Double heigth = scanner.nextDouble();
               System.out.println("Peso: ");
               double weigth = scanner.nextDouble();

               System.out.println("Os valore Altura - " + heigth +
                       "m e Peso - " + weigth + "kg estão corretos (S ou N)?");
               String confirm = scanner.next();

               if (confirm.equalsIgnoreCase("s")) {
                   util.setValuesImc(heigth, weigth);
                   panelResults();
                   break;
               }else{
                   System.out.println("Inválido!");
               }

           }while (true);
        } catch (InputMismatchException e){
            System.out.println(e + " Valor inválido. Use numeros com casa decimal separado por virgula");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    private void panelResults(){
        double resultImc = util.getValueResultImc();
        String resultFormated = String.format("%.2f", resultImc);
        String resultAnalize = resultAnalizy(resultImc);

        System.out.println(util.getValuesImc());
        System.out.println("IMC: "+resultFormated+ " | "+ resultAnalize);
    }

    private String resultAnalizy(double result){
        if(result < 18.5){
            return "Magreza";
        } else if (result >= 18.5 && result <= 24.9) {
            return "Peso normal";
        } else if (result >= 25.0 && result <= 29.9) {
            return "Sobrepeso";
        }else if (result >= 30.0 && result <= 39.9) {
            return "Obesidade";
        }else{
            return "Obesidade Grave";
        }
    }
}
