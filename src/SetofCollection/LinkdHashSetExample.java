package SetofCollection;

import java.util.Formattable;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkdHashSetExample {

    public static void main(String[] args) {
        LinkedList<String> linklistOfname=new LinkedList<>();
        linklistOfname.add("Khna");
        linklistOfname.add("Jan");

        System.out.println(linklistOfname);

        String name="Babhhh";

        // add String Value aribale to LinkedHashSet
        linklistOfname.add(name);
        System.out.println(linklistOfname);
        String[] names={"KHAB","WW","GG"};

        for (String nam:names){
            linklistOfname.add(nam);
        }
        System.out.println(linklistOfname);
        linklistOfname.add("kabul");
        System.out.println(linklistOfname);
        linklistOfname.removeFirst();
        System.out.println(linklistOfname);
       linklistOfname.removeLast();
        System.out.println(linklistOfname);
        linklistOfname.remove("KHAB");
        linklistOfname.remove("hhh");
        System.out.println(linklistOfname);
        System.out.println(linklistOfname.get(2));
       linklistOfname.remove(1);
        System.out.println(linklistOfname);
        System.out.println(linklistOfname.size());




    }
}
