package is.vinnsla;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Vinnsluklasi fyrir ferð sem hefur eiginleikana heiti, áfangastað
 *  og frá og til dagsetningar
 *
 *****************************************************************************/
public class Ferd {
    private SimpleStringProperty heiti = new SimpleStringProperty();
    private SimpleStringProperty afangastadur = new SimpleStringProperty();
    private SimpleStringProperty fra = new SimpleStringProperty();
    private SimpleStringProperty til = new SimpleStringProperty();
    private SimpleIntegerProperty fjoldi = new SimpleIntegerProperty(0);
    private SimpleStringProperty heildarverd = new SimpleStringProperty("0kr");

    private SimpleStringProperty note = new  SimpleStringProperty("");

    // get aðferðir
    public SimpleStringProperty heitiProperty() {
        return heiti;
    }
    public SimpleStringProperty afangastadurProperty() {
        return afangastadur;
    }
    public SimpleStringProperty fraProperty() {
        return fra;
    }

    public SimpleStringProperty tilProperty() {
        return til;
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public SimpleIntegerProperty fjoldiProperty() { return fjoldi; }
    public SimpleStringProperty heildarverdProperty() { return heildarverd; }


    /**
     * Smíðar ferðina sem lýst er í strengnum ferd með eiginleikum aðgreind með ;
     * @param ferd
     */
    public Ferd(String ferd) {
        String[] gogn = ferd.split(";");
        this.heiti.set(gogn[0]);
        this.afangastadur.set(gogn[1]);
        this.fra.set(gogn[2]);
        this.til.set(gogn[3]);
        this.note.set(gogn[4]);
        }

    public Ferd () {

    }

    /**
     * skilar hvernig ferð birtist í lista
     * @return
     */
    @Override
    public String toString() {
        return  heiti.get();
    }
}
