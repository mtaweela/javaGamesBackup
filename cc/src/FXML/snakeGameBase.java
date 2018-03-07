package FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
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
    protected final Ellipse ellipse;
    protected final Line line;
    protected final Label label;
    protected final Rectangle rectangle;
    protected final ImageView imageView;
    protected final Text text2;
    protected final ImageView imageView0;
    protected final Text text3;
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
        ellipse = new Ellipse();
        line = new Line();
        label = new Label();
        rectangle = new Rectangle();
        imageView = new ImageView();
        text2 = new Text();
        imageView0 = new ImageView();
        text3 = new Text();
        colorAdjust1 = new ColorAdjust();

        setId("AnchorPane");
        setPrefHeight(473.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: black; -fx-background-radius: 25;");

        button.setLayoutX(544.0);
        button.setLayoutY(18.0);
        button.setMinWidth(34.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(22.0);
        button.setPrefWidth(33.0);
        button.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 100; -fx-background-color: yellow;");
        button.setText("X");

        button0.setLayoutX(14.0);
        button0.setLayoutY(433.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-background-color: yellow; -fx-background-radius: 100;");
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
        text0.setLayoutX(64.0);
        text0.setLayoutY(59.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("apples");
        text0.setFont(new Font("DejaVu Serif Bold", 23.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#f80707"));
        text1.setLayoutX(413.0);
        text1.setLayoutY(59.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("score");
        text1.setFont(new Font("DejaVu Serif Bold", 23.0));

        hBox.setLayoutX(55.0);
        hBox.setLayoutY(100.0);
        hBox.setPrefHeight(322.0);
        hBox.setPrefWidth(485.0);
        hBox.setStyle("-fx-background-color: yellow;");

        ellipse.setFill(javafx.scene.paint.Color.DODGERBLUE);
        ellipse.setRadiusX(11.0);
        ellipse.setRadiusY(7.0);
        ellipse.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        line.setEndX(100.0);
        line.setScaleY(10.0);
        line.setStartX(-100.0);

        label.setText("Label");

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.DODGERBLUE);
        rectangle.setHeight(5.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(9.0);

        imageView.setFitHeight(27.0);
        imageView.setFitWidth(28.0);
        imageView.setLayoutX(176.0);
        imageView.setLayoutY(38.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../images/apple.png").toExternalForm()));

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(155.0);
        text2.setLayoutY(56.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("0");
        text2.setWrappingWidth(27.000001072883606);

        imageView0.setFitHeight(27.0);
        imageView0.setFitWidth(28.0);
        imageView0.setLayoutX(509.0);
        imageView0.setLayoutY(38.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../images/trophy.png").toExternalForm()));

        text3.setFill(javafx.scene.paint.Color.WHITE);
        text3.setLayoutX(488.0);
        text3.setLayoutY(56.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("0");
        text3.setWrappingWidth(27.000001072883606);

        setEffect(colorAdjust1);

        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(separator);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        hBox.getChildren().add(ellipse);
        hBox.getChildren().add(line);
        hBox.getChildren().add(label);
        hBox.getChildren().add(rectangle);
        getChildren().add(hBox);
        getChildren().add(imageView);
        getChildren().add(text2);
        getChildren().add(imageView0);
        getChildren().add(text3);

    }
}
