package com.special.effect.javafxprojects.BinarySearchTreeApplication;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BSInterface extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BST<Integer> tree = new BST<>();

        BorderPane pane = new BorderPane();
        BSTbackend view = new BSTbackend(tree);
        pane.setCenter(view);

        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_RIGHT);
        Button btnInsert = new Button("INSERT");
        Button btnDelete = new Button("DELETE");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a key: "),
                tfKey, btnInsert, btnDelete);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);

        btnInsert.setOnAction(e->{
            int key = Integer.parseInt(tfKey.getText());
            if(!tree.search(key)){
                view.displayTree();
                view.setStatus(key + " is not in the tree");
            }else{
                tree.delete(key);
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");
            }
        });

        btnDelete.setOnAction(e->{
            int key = Integer.parseInt(tfKey.getText());
            if(!tree.search(key)){
                view.displayTree();
                view.setStatus(key + " is not in the tree");
            }else{
                tree.delete(key);
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");
            }
        });

        Scene scene = new Scene(pane, 450, 250);
        stage.setTitle("BST Animation");
        stage.setScene(scene);
        stage.show();
    }
}
