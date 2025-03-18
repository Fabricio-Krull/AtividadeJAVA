public class Produto {
    
    private float price = 0;
    private float weight = 0;
    private String name = "";
    // Não consegui criar um inicializador padrão para o ID, eu vou tentar fazer isso mais tarde
    private int ID = 1000;
    private String description = "";


    // Inicializando tudo

    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getID() {
        return ID;
    }


    public void setID(int id) {
        this.ID = id;
    }


    // Inicializando preço, nome e ID
    Produto(float price, String name, int id){

        this.price = price;
        this.name = name;
        this.ID = id;

    }


    // Inicializando só o nome

    Produto(String name){

        this.name = name;
        this.ID = ID;

    }

    // Inicializando nome e ID

    Produto(String name, int id){

        this.name = name;
        this.ID = id;

    }

    Produto(String name, float weight){

        this.name = name;
        this.weight = weight;
        this.ID = ID;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public float getWeight() {
        return weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }

}
