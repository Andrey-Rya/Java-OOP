import java.util.ArrayList;

public class Container {

    enum Door {
        Open,
        Close;
    }
    protected Door state;

    protected ArrayList<String> items;

    /* Container -это полка с вещами. А вещи находятся в коллекции items*/
    public Container() {
        this.items = new ArrayList<>();
        this.state = Door.Close;
    }

    public Door getState() {
        return state;
    }

    protected void setState() {
        if (this.state == Door.Close) {this.state = Door.Open; return;}
        else {this.state = Door.Close; return;}
    }
}
