package is.vinnsla;

import javafx.beans.property.SimpleStringProperty;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Vinnsluklasi fyrir ferð sem hefur eiginleikana heiti, áfangastað
 *  og frá og til dagsetningar
 *
 *****************************************************************************/
public class Ferd {
    private final SimpleStringProperty heiti = new SimpleStringProperty();
    private final SimpleStringProperty afangastadur = new SimpleStringProperty();
    private final SimpleStringProperty fra = new SimpleStringProperty();
    private final SimpleStringProperty til = new SimpleStringProperty();
    private final SimpleStringProperty note = new  SimpleStringProperty("");
    private final SimpleStringProperty verd = new  SimpleStringProperty("");

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
    public SimpleStringProperty tilProperty() {return til;}
    public SimpleStringProperty noteProperty() { return note; }
    public SimpleStringProperty verdProperty() { return verd;}


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
        this.verd.set(gogn[5]);
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
