public class Ticket{
    private int id;
    private String level; //High, normal
    private String desc;

    public Ticket(int par, String high, String falla_critica) {
    }

    public Ticket(String desc, int id, String level) {
        this.desc = desc;
        this.id = id;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket{");
        sb.append("id=").append(id);
        sb.append(", level=").append(level);
        sb.append(", desc=").append(desc);
        sb.append('}');
        return sb.toString();
    }


    


    
}