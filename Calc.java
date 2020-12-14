import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Calc extends Application {

    private DoubleProperty value = new SimpleDoubleProperty();

    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane layout = new BorderPane();
        GridPane num = new GridPane();
        num.setPadding(new Insets(0, 0, 0, 0));
        HBox evaluator = new HBox();
        evaluator.setPadding(new Insets(0, 0, 0, 0));
        VBox operator = new VBox();
        operator.setPadding(new Insets(0, 0, 0, 0));

        layout.setMinWidth(-10);
        layout.setPrefWidth(-10);
        layout.setMaxWidth(-10);

        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button zero = new Button("0");
        Button percent = new Button("%");
        Button stop = new Button(".");
        Button equal = new Button("=");
        Button opBracket = new Button("(");
        Button clBracket = new Button(")");
        Button clear = new Button("AC");
        Button multi = new Button("*");
        Button div = new Button("/");
        Button add = new Button("+");
        Button sub = new Button("-");
        TextField area = new TextField();

        area.setEditable(false);
        area.setAlignment(Pos.CENTER);
        area.setMinSize(336, 40);
        area.textProperty().bind(Bindings.format("%.0f" , value));
        area.setAlignment(Pos.CENTER_RIGHT);
        area.setText(String.valueOf(value));

        one.setMinSize(80, 80);
        one(one);
        two.setMinSize(80, 80);
        two(two);
        three.setMinSize(80, 80);
        three(three);
        four.setMinSize(80, 80);
        four(four);
        five.setMinSize(80, 80);
        five(five);
        six.setMinSize(80, 80);
        six(six);
        seven.setMinSize(80, 80);
        seven(seven);
        eight.setMinSize(80, 80);
        eight(eight);
        nine.setMinSize(80, 80);
        nine(nine);
        zero.setMinSize(80, 80);
        zero(zero);
        percent.setMinSize(80, 80);
        stop.setMinSize(80, 80);
        equal.setMinSize(80, 80);
        opBracket.setMinSize(80, 80);
        clBracket.setMinSize(80, 80);
        clear.setMinSize(80, 80);
        clear(clear);
        multi.setMinSize(80, 80);
        div.setMinSize(80, 80);
        add.setMinSize(80, 80);
        sub.setMinSize(80, 80);

        layout.setTop(area);
        layout.setCenter(num);
        layout.setBottom(evaluator);
        layout.setRight(operator);

        num.add(seven,0,0);
        num.add(eight,1,0);
        num.add(nine,2,0);
        num.add(four,0,1);
        num.add(five,1,1);
        num.add(six,2,1);
        num.add(three,0,2);
        num.add(two,1,2);
        num.add(one,2,2);
        num.add(zero,0,3);
        num.add(stop,1,3);
        num.add(percent,2,3);

        operator.getChildren().addAll(multi,div,add,sub);
        evaluator.getChildren().addAll(clear,opBracket,clBracket,equal);


        primaryStage.setTitle("Calculator");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(layout, 310, 425));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }

    private void clear (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.set(0));
    }

    private void one (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(1));
    }
    private void two (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(2));
    }
    private void three (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(3));
    }
    private void four (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(4));
    }
    private void five (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(5));
    }
    private void six (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(6));
    }
    private void seven (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(7));
    }
    private void eight (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(8));
    }
    private void nine (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(9));
    }
    private void zero (Button button) {
//        button.setStyle("-fx-base: mistyrose;");
        button.setOnAction(actionEvent -> value.add(0));
    }
}