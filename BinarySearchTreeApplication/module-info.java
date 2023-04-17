module com.special.effect.javafxprojects {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.special.effect.javafxprojects to javafx.fxml;
    exports com.special.effect.javafxprojects;
    exports com.special.effect.javafxprojects.SierpinskiTriangle;
    opens com.special.effect.javafxprojects.SierpinskiTriangle to javafx.fxml;
    exports com.special.effect.javafxprojects.BounceBall;
    opens com.special.effect.javafxprojects.BounceBall to javafx.fxml;
    exports com.special.effect.javafxprojects.BinarySearchTreeApplication to javafx.graphics;
}