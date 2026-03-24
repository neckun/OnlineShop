import java.util.ArrayList;
import java.util.HashMap;

public abstract class Catalog {
    protected int id;
    protected String title;
    protected HashMap<String, ArrayList<Product>> list;

    public Catalog (){};

    public Catalog(int id, String title){
        this.id = id;
        this.title = title;

    }

    public abstract double calculatePrice(int count);

    public int getId() {
        return this.id;
    }


    public String getTitle() {
        return this.title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
