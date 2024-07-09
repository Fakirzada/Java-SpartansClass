package AssigmentMay2024.DigitalLibrary;

public class Ebook  extends Book{
    public static void main(String[] args) {
      //var bookobjec=new Book("SQL","Ali");
      var ebook=new Ebook("sql","Ali",100);
      ebook.printBookInfo();
    }
    double filesize;
    public  Ebook(String title, String author, double filesize) {
        super(title, author);
        this.filesize = filesize;
    }
    public  double getFilesize() {return filesize;}
    public void setFilesize(double filesize) {this.filesize = filesize;}
    public  void printBookInfo(){
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getFilesize()+" Mb");
    }
}
