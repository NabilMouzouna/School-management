public class Professor extends Person {
    private int profId;
    private String profType;

    public Professor(String name, int age, String profType) {
        super(name, age);
        this.profType = profType;
        profId++;
    }

    public int getProfId() {return profId;}

    public void setProfId(int profId) {this.profId = profId;}

    public String getProfType() {return profType;}

    public void setProfType(String profType) {this.profType = profType;}
    

}
