package com.example.demo.book;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *  This file can be used to draw simple pictures.  Just fill in
 *  the definition of drawPicture with the code that draws your picture.
 */
public class GraphicsDemo extends Application {

    /**
     * Draws a picture.  The parameters width and height give the size
     * of the drawing area, in pixels.
     */
    public void drawPicture(GraphicsContext g, int width, int height) {
        g.fillRect(0, 0, 100, 100);
        g.setFill(Color.RED);
        g.fillText("Hola mundo", 200, 200);
        g.fillOval(150, 150, 300, 350);
        g.setStroke(Color.YELLOWGREEN);
        g.strokeLine(0, 0, width, height);

        g.setFill(Color.AZURE);
        g.fillPolygon(new double[]{
                0, (double)(width / 2), width
        }, new double[]{
            height, 0, height
        }, 3);

    } // end drawPicture()

    public void start(Stage stage) {
        int width = 800;   // The width of the image.  You can modify this value!
        int height = 600;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 10px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }

} // end SimpleGraphicsStarter