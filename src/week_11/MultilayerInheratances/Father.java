package week_11.MultilayerInheratances;

public class Father extends GrandFather {
    String fatherName;
    public Father(String gandfathername, String fatherName) {
        super(gandfathername);
        this.fatherName = fatherName;
    }
    public String getFatherName() {return fatherName;}
    public void setFatherName(String fatherName) {this.fatherName = fatherName;}
}
