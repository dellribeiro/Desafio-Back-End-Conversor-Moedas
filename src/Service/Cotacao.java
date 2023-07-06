package Service;

public class Cotacao {
    private String name;
    private String bid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", bid='" + bid + '\'' +
                '}';
    }
}
