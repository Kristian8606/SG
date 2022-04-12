package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField goldGr;
    public TextField goldGrW;
    public ListView<String> listView;
    public ChoiceBox<String> choiceBox;
    public ChoiceBox<String> choiceBoxG;
    double g,gw,tc,tv;
    Map<String,Double> map = new HashMap<>();
    private String [] strArr = {"18","19","20","21","22",
            "23","24","25","26","27","28","29","30"};
    private String [] strMaterial = {"Gold", "Silver"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBox.getItems().addAll(strArr);
        choiceBox.setValue("20");
        choiceBox.setOnAction(this::getTemperature);

        choiceBoxG.getItems().addAll(strMaterial);
        choiceBoxG.setValue("Gold");
        choiceBoxG.setOnAction(this::getMaterql);

    }
    public void getTemperature(ActionEvent event){
        calculate();
        System.out.println(choiceBox.getValue());
    }
    public void getMaterql(ActionEvent event){
        calculate();
        System.out.println(choiceBoxG.getValue());
    }
    public void onCalc(ActionEvent actionEvent) {
        calculate();
    }
    void calculate(){
        waterTemperature();
        g =  Double.parseDouble(goldGr.getText());
        gw =  Double.parseDouble(goldGrW.getText());
        tv = map.get(choiceBox.getValue());
        tc = (g - gw)/tv;
        double result = g / tc;
        Date date = new Date();

        DensityRange range = new DensityRange(result);
        String res = String.format("Density - %.2f%n Gold - %dK.%n SG - %.2f%n" +
                " Water temp. - %sC%n%dK. range %.2f - %.2f%n %s%n______________________________",result, range.getKarat(),tc, choiceBox.getValue(),range.getKarat(),range.getMinRange(),range.getMaxRange(),date);
        System.out.printf("Density - %.2f%n Gold - %dK.%n SG - %.2f%n" +
                " Water temp. - %s%n%dK. range %.2f - %.2f%n %s%n______________________________",result, range.getKarat(),tc, choiceBox.getValue(),range.getKarat(),range.getMinRange(),range.getMaxRange(),date);
        listView.getItems().add(res);
    }


    void waterTemperature(){

        map.put("18",0.99862);
        map.put("19",0.99843);
        map.put("20",0.99823);
        map.put("21",0.99803);
        map.put("22",0.99870);
        map.put("23",0.99757);
        map.put("24",0.99732);
        map.put("25",0.99707);
        map.put("26",0.99681);
        map.put("27",0.99654);
        map.put("28",0.99626);
        map.put("29",0.99597);
        map.put("30",0.99567);
        map.put("31",0.99537);
        map.put("32",0.99505);
        map.put("33",0.99472);
        map.put("34",0.99440);
        map.put("35",0.99406);



    }


    public void onClick(ActionEvent event) {
        System.out.println("Click");
    }
}
