package FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class snakeGameBase extends AnchorPane {

    protected final Button button;
    protected final Button button0;
    protected final Separator separator;
    protected final ColorAdjust colorAdjust;
    protected final Text text;
    protected final ColorAdjust colorAdjust0;
    protected final Text text0;
    protected final Text text1;
    protected final HBox hBox;
    protected final ColorAdjust colorAdjust1;

    public snakeGameBase() {

        button = new Button();
        button0 = new Button();
        separator = new Separator();
        colorAdjust = new ColorAdjust();
        text = new Text();
        colorAdjust0 = new ColorAdjust();
        text0 = new Text();
        text1 = new Text();
        hBox = new HBox();
        colorAdjust1 = new ColorAdjust();

        setId("AnchorPane");
        setPrefHeight(473.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: black; -fx-background-radius: 25;");

        button.setLayoutX(553.0);
        button.setLayoutY(18.0);
        button.setMnemonicParsing(false);

        button0.setLayoutX(52.0);
        button0.setLayoutY(420.0);
        button0.setMnemonicParsing(false);
        button0.setText("Back");

        separator.setLayoutX(55.0);
        separator.setLayoutY(79.0);
        separator.setPrefHeight(0.0);
        separator.setPrefWidth(485.0);
        separator.setStyle("-fx-background-radius: 25;");

        colorAdjust.setBrightness(-0.2);
        colorAdjust.setContrast(1.0);
        colorAdjust.setHue(0.32);
        colorAdjust.setSaturation(1.0);
        separator.setEffect(colorAdjust);

        text.setFill(javafx.scene.paint.Color.valueOf("#b8991d"));
        text.setLayoutX(227.0);
        text.setLayoutY(52.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Snake");
        text.setFont(new Font("DejaVu Serif Bold", 44.0));

        colorAdjust0.setBrightness(-0.2);
        colorAdjust0.setContrast(1.0);
        colorAdjust0.setSaturation(1.0);
        text.setEffect(colorAdjust0);

        text0.setFill(javafx.scene.paint.Color.valueOf("#1d3cb8"));
        text0.setLayoutX(65.0);
        text0.setLayoutY(59.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("apples");
        text0.setFont(new Font("DejaVu Serif Bold", 23.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#f80707"));
        text1.setLayoutX(444.0);
        text1.setLayoutY(59.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("score");
        text1.setFont(new Font("DejaVu Serif Bold", 23.0));

        hBox.setLayoutX(55.0);
        hBox.setLayoutY(93.0);
        hBox.setPrefHeight(322.0);
        hBox.setPrefWidth(485.0);
        hBox.setStyle("-fx-background-color: yellow;");

        setEffect(colorAdjust1);

        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(separator);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(hBox);

    }
}
