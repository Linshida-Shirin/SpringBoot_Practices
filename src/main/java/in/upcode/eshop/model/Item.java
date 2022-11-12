package in.upcode.eshop.model;

public class Item {
    private int id;
    private String name;
    private float quantity;

    public Item(int id, String name, float quantity) {
        super();
        this.id = id;
        this.name = name;
        this.quantity= quantity;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public float getquantity() {
        return quantity;
    }
    public void setquantity(float quantity) {
        this.quantity = quantity;
    }


}
