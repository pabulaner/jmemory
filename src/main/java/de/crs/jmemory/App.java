package de.crs.jmemory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 1000, 500);

        for (int i = 0; i < MemoryCardContent.CONTENTS.length; i++) {
            int x = i % 4;
            int y = i / 4;

            gridPane.add(new MemoryCard(MemoryCardContent.CONTENTS[i]), x, y);
        }

        stage.setTitle("Memory");
        stage.setScene(scene);
        stage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }
}
