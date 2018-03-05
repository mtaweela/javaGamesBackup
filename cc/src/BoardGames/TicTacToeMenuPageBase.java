package BoardGames;

import java.io.File;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class TicTacToeMenuPageBase extends AnchorPane {

    protected final Button pcButton;
    protected final ColorAdjust colorAdjust;
    protected final ImageView imageView;
    protected final Button playerButton;
    protected final ColorAdjust colorAdjust0;
    protected final Button networkButton;
    protected final ColorAdjust colorAdjust1;
    protected final Button exitButton;
    protected final ColorAdjust colorAdjust2;
    protected final Button backButton;

    public TicTacToeMenuPageBase() {

        pcButton = new Button();
        colorAdjust = new ColorAdjust();
        imageView = new ImageView();
        playerButton = new Button();
        colorAdjust0 = new ColorAdjust();
        networkButton = new Button();
        colorAdjust1 = new ColorAdjust();
        exitButton = new Button();
        colorAdjust2 = new ColorAdjust();
        backButton = new Button();

        setId("AnchorPane");
        setPrefHeight(474.0);
        setPrefWidth(725.0);
        setStyle("-fx-background-color: black; -fx-background-radius: 25; -fx-padding: 10;");

        pcButton.setLayoutX(172.0);
        pcButton.setLayoutY(294.0);
        pcButton.setMnemonicParsing(false);
        pcButton.setPrefHeight(54.0);
        pcButton.setPrefWidth(441.0);
        pcButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305; -fx-background-color: yellow;");
        pcButton.setText("VS Computer");

        colorAdjust.setBrightness(-0.2);
        colorAdjust.setContrast(1.0);
        colorAdjust.setHue(-0.02);
        colorAdjust.setSaturation(1.0);
        pcButton.setEffect(colorAdjust);
        pcButton.setFont(new Font("DejaVu Serif Italic", 25.0));
        
        imageView.setFitHeight(200.0);
        imageView.setFitWidth(600.0);
        imageView.setLayoutX(56.0);
        imageView.setLayoutY(24.0);
        imageView.setPickOnBounds(true);
        File f = new File("./images/tttmarqlrg.gif");
        Image img = new Image(f.toURI().toString());

        imageView.setImage(img);

        playerButton.setLayoutX(172.0);
        playerButton.setLayoutY(371.0);
        playerButton.setMnemonicParsing(false);
        playerButton.setPrefHeight(54.0);
        playerButton.setPrefWidth(441.0);
        playerButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305; -fx-background-color: yellow;");
        playerButton.setText("VS Local Player");

        playerButton.setEffect(colorAdjust);
        playerButton.setFont(new Font("DejaVu Serif Italic", 25.0));

        networkButton.setLayoutX(172.0);
        networkButton.setLayoutY(448.0);
        networkButton.setMnemonicParsing(false);
        networkButton.setPrefHeight(54.0);
        networkButton.setPrefWidth(441.0);
        networkButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305;-fx-background-color: yellow;");
        networkButton.setText("VS Network Player");

        networkButton.setEffect(colorAdjust);
        networkButton.setFont(new Font("DejaVu Serif Italic", 25.0));

        exitButton.setLayoutX(698.0);
        exitButton.setLayoutY(14.0);
        exitButton.setMinWidth(34.0);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(22.0);
        exitButton.setPrefWidth(26.0);
        exitButton.setStyle("-fx-background-insets: 0,1,2,3,0; -fx-background-radius: 305; -fx-background-color: yellow;");

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

        getChildren().add(pcButton);
        getChildren().add(imageView);
        getChildren().add(playerButton);
        getChildren().add(networkButton);
        getChildren().add(exitButton);
        getChildren().add(backButton);


    }
}
