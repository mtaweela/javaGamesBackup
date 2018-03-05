package BoardGames;

import java.io.File;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TicTacToeGamePageBase extends AnchorPane {

    protected final Button exitButton;
    protected final Button backButton;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label cell0;
    protected final Label cell1;
    protected final Label cell2;
    protected final Label cell3;
    protected final Label cell4;
    protected final Label cell5;
    protected final Label cell6;
    protected final Label cell7;
    protected final Label cell8;
    protected final Separator separator;
    protected final ColorAdjust colorAdjust;
    protected final ColorAdjust colorAdjust2;
    protected final Text vsText;
    protected final ColorAdjust colorAdjust0;
    protected final Text player1Text;
    protected final Text player2Text;
    protected final ColorAdjust colorAdjust1;
    protected final ImageView imageView;
    protected final ImageView imageView2;


    public TicTacToeGamePageBase() {

        exitButton = new Button();
        backButton = new Button();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        cell0 = new Label();
        cell1 = new Label();
        cell2 = new Label();
        cell3 = new Label();
        cell4 = new Label();
        cell5 = new Label();
        cell6 = new Label();
        cell7 = new Label();
        cell8 = new Label();
        separator = new Separator();
        colorAdjust = new ColorAdjust();
        vsText = new Text();
        colorAdjust0 = new ColorAdjust();
        player1Text = new Text();
        player2Text = new Text();
        colorAdjust1 = new ColorAdjust();
        colorAdjust2 = new ColorAdjust();
        imageView = new ImageView();
        imageView2 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(474.0);
        setPrefWidth(725.0);
        setStyle("-fx-background-color: black; -fx-background-radius: 25; -fx-padding: 10;");
        
        
        exitButton.setLayoutX(698.0);
        exitButton.setLayoutY(14.0);
        exitButton.setMinWidth(34.0);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(22.0);
        exitButton.setPrefWidth(26.0);
        exitButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305; -fx-background-color: yellow;");

        colorAdjust.setBrightness(-0.2);
        colorAdjust.setContrast(1.0);
        colorAdjust.setHue(-0.02);
        colorAdjust.setSaturation(1.0);
        exitButton.setEffect(colorAdjust);
        exitButton.setOnAction(event -> {
            Platform.exit();
        });

        backButton.setLayoutX(20.0);
        backButton.setLayoutY(520.0);
        backButton.setMinWidth(34.0);
        backButton.setMnemonicParsing(false);
        backButton.setText("Back");

        backButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305; -fx-background-color: yellow;");
        backButton.setEffect(colorAdjust);

        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(10.0);
        gridPane.setLayoutX(127.0);
        gridPane.setLayoutY(158.0);
        gridPane.setPrefHeight(266.0);
        gridPane.setPrefWidth(485.0);
        gridPane.setVgap(10.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(235.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(160.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(349.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(168.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(349.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(160.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        gridPane.setCursor(Cursor.HAND);
        
        File fx = new File("./images/x.png");
        Image img = new Image(fx.toURI().toString());
        
        File fo = new File("./images/o.png");
        Image img2 = new Image(fo.toURI().toString());
        
        imageView.setFitHeight(80.0);
        imageView.setFitWidth(140.0);
        imageView.setImage(img);
        
        imageView2.setFitHeight(80.0);
        imageView2.setFitWidth(140.0);
        imageView2.setImage(img2);
        

        cell0.setPrefHeight(93.0);
        cell0.setPrefWidth(152.0);
        cell0.setId("cell0");
        cell0.applyCss();
        cell0.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell0.setGraphic(imageView);
        });
        

        GridPane.setRowIndex(cell1, 1);
        cell1.setPrefHeight(93.0);
        cell1.setId("cell1");
        cell1.applyCss();
        cell1.setPrefWidth(152.0);
        cell1.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell1.setGraphic(imageView2);
        });


        GridPane.setRowIndex(cell2, 2);
        cell2.setPrefHeight(93.0);
        cell2.setId("cell2");
        cell2.applyCss();
        cell2.setPrefWidth(152.0);
        cell2.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell2.setGraphic(imageView);
        });

        GridPane.setColumnIndex(cell3, 1);
        cell3.setPrefHeight(82.0);
        cell3.setId("cell3");
        cell3.applyCss();
        cell3.setPrefWidth(161.0);
        cell3.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell3.setGraphic(imageView2);
        });

        GridPane.setColumnIndex(cell4, 1);
        GridPane.setRowIndex(cell4, 1);
        cell4.setPrefHeight(93.0);
        cell4.setId("cell4");
        cell4.applyCss();
        cell4.setPrefWidth(152.0);
        cell4.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell4.setGraphic(imageView);
        });

        GridPane.setColumnIndex(cell5, 1);
        GridPane.setRowIndex(cell5, 2);
        cell5.setPrefHeight(93.0);
        cell5.setId("cell5");
        cell5.applyCss();
        cell5.setPrefWidth(152.0);
        cell5.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell5.setGraphic(imageView2);
        });

        GridPane.setColumnIndex(cell6, 2);
        cell6.setPrefHeight(93.0);
        cell6.setId("cell6");
        cell6.applyCss();
        cell6.setPrefWidth(152.0);
        cell6.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell6.setGraphic(imageView);
        });

        GridPane.setColumnIndex(cell7, 2);
        GridPane.setRowIndex(cell7, 1);
        cell7.setPrefHeight(93.0);
        cell7.setId("cell7");
        cell7.applyCss();
        cell7.setPrefWidth(152.0);
        cell7.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell7.setGraphic(imageView2);
        });
        
        GridPane.setColumnIndex(cell8, 2);
        GridPane.setRowIndex(cell8, 2);
        cell8.setPrefHeight(90.0);
        cell8.setId("cell8");
        cell8.applyCss();
        cell8.setPrefWidth(152.0);
        cell8.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
            cell8.setGraphic(imageView);
        });

        //65,41
        separator.setLayoutX(120.0);
        separator.setLayoutY(120.0);
        separator.setPrefHeight(0.0);
        separator.setPrefWidth(485.0);
        separator.setStyle("-fx-background-radius: 25;");

        colorAdjust2.setBrightness(-0.2);
        colorAdjust2.setContrast(1.0);
        colorAdjust2.setHue(0.32);
        colorAdjust2.setSaturation(1.0);
        separator.setEffect(colorAdjust2);

        vsText.setFill(javafx.scene.paint.Color.valueOf("yellow"));
        vsText.setLayoutX(342.0);
        vsText.setLayoutY(100.0);
        vsText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        vsText.setStrokeWidth(0.0);
        vsText.setText("VS");
        vsText.setFont(new Font("DejaVu Serif Bold", 44.0));
        vsText.setEffect(colorAdjust);

        player1Text.setFill(javafx.scene.paint.Color.valueOf("#1d3cb8"));
        player1Text.setLayoutX(130.0);
        player1Text.setLayoutY(100.0);
        player1Text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1Text.setStrokeWidth(0.0);
        player1Text.setText("player1");
        player1Text.setFont(new Font("DejaVu Serif Bold", 23.0));

        player2Text.setFill(javafx.scene.paint.Color.valueOf("#f80707"));
        player2Text.setLayoutX(509.0);
        player2Text.setLayoutY(100.0);
        player2Text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2Text.setStrokeWidth(0.0);
        player2Text.setText("player2");
        player2Text.setFont(new Font("DejaVu Serif Bold", 23.0));

        setEffect(colorAdjust1);
        
        

        getChildren().add(exitButton);
        getChildren().add(backButton);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(cell0);
        gridPane.getChildren().add(cell1);
        gridPane.getChildren().add(cell2);
        gridPane.getChildren().add(cell3);
        gridPane.getChildren().add(cell4);
        gridPane.getChildren().add(cell5);
        gridPane.getChildren().add(cell6);
        gridPane.getChildren().add(cell7);
        gridPane.getChildren().add(cell8);
        getChildren().add(gridPane);
        getChildren().add(separator);
        getChildren().add(vsText);
        getChildren().add(player1Text);
        getChildren().add(player2Text);
        
        
    }
    
}
