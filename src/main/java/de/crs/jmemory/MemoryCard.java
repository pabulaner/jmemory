package de.crs.jmemory;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class MemoryCard extends Button {

    private static final String PUBLIC_TEXT = "Click Me!";

    private boolean open;

    private final String privateText;

    public MemoryCard(String privateText) {
        this.open = false;
        this.privateText = privateText;

        setFont(new Font(20));
        setText(PUBLIC_TEXT);
        setOnAction(event -> {
            open = !open;
            setText(open ? privateText : PUBLIC_TEXT);
        });
    }
}
