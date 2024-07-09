package week_10.day_2;

public class Animal {
    private String animalname;
    private  String cagetroy;

    public Animal(String animalname, String cagetroy) {
        setAnimalname(animalname);
        setCagetroy(cagetroy);
    }
//Consturtor


    public String getAnimalname(){return animalname;}
    public  String getCagetroy(){return  cagetroy;}

    private void setAnimalname(String animalname){this.animalname=animalname;}
    private void  setCagetroy(String cagetroy){this.cagetroy=cagetroy;}


    public void print(){
        System.out.println(animalname);
        System.out.println(cagetroy);

    }

}



