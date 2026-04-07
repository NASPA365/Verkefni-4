package is.vidmot.controller;

import is.vidmot.switcher.View;
import is.vinnsla.Ferd;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.stage.Window;
import javafx.util.Callback;

import java.io.IOException;
import java.util.Optional;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Eins konar wrapper klasi fyrir Dialoginn fyrir ferð
 *  Ferðaplan, verkefni 3, 2026
 *
 *
 *****************************************************************************/
public class FerdDialogWrapper {

    private static final String NY_FERD = "Ný ferð";
    private static final String BREYTA_FERD = "Breyta ferð";

    public static Optional<Ferd> birtaDialog(Window owner) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    FerdDialogWrapper.class.getResource(View.FERDDIALOG.getFileName()));

            DialogPane pane = loader.load();
            FerdDialogController controller = loader.getController();
            controller.setGogn(new Ferd());

            Dialog<Ferd> dialog = new Dialog<>();
            dialog.setTitle(NY_FERD);
            dialog.initOwner(owner);
            dialog.setDialogPane(pane);

            Callback<ButtonType, Ferd> ferdResultConverter = param -> {
                if (param.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                    return controller.getFerd().get();
                } else {
                    return null;
                }
            };

            dialog.setResultConverter(ferdResultConverter);
            return dialog.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public static Optional<Ferd> birtaDialog(Window owner, Ferd ferd) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    FerdDialogWrapper.class.getResource(View.FERDDIALOG.getFileName()));

            DialogPane pane = loader.load();
            FerdDialogController controller = loader.getController();
            controller.setGogn(ferd);

            Dialog<Ferd> dialog = new Dialog<>();
            dialog.setTitle(BREYTA_FERD);
            dialog.initOwner(owner);
            dialog.setDialogPane(pane);

            Callback<ButtonType, Ferd> ferdResultConverter = param -> {
                if (param.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                    return controller.getFerd().get();
                } else {
                    return null;
                }
            };

            dialog.setResultConverter(ferdResultConverter);
            return dialog.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
