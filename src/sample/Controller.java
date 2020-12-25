package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    public TextField imeText;
    public TextField prezimeText;
    public TextField korisnickoImeText;
    public PasswordField lozinkaText;
    public Button dodajBtn;
    public Button krajBtn;
    public ListView korisliciList;

    private ObservableList<Korisnik> listastudenti = FXCollections.observableArrayList();

}
