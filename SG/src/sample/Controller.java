package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField goldGr;
    public TextField goldGrW;
    double g,gw;
    public void onCalc(ActionEvent actionEvent) {
        g =  Double.parseDouble(goldGr.getText());
        gw =  Double.parseDouble(goldGrW.getText());
        double result = g / (g - gw);
        System.out.printf("SG = %.2f%n",result);
    }
}
