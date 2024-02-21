module de.crs.jmemory {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.crs.jmemory to javafx.fxml;
    exports de.crs.jmemory;
}