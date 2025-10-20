//Representa un pedido dentro de la tienda en línea
public class Order {

    private int id;
    private String category; // URGENT o STANDARD
    private String description;

    public Order(int id, String category, String description){
        this.id = id;
        this.category = category;
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "[ID=" + id + ", Tipo=" + category + ", Descripción=" + description + "]";
    }
}
