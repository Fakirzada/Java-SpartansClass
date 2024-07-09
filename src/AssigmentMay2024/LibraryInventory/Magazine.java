package AssigmentMay2024.LibraryInventory;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public static void main(String[] args) {
        var objeMagazine=new Magazine("Love",2024,1005550);
        objeMagazine.printMagazineInfo();
    }
    public  Magazine(String title, int yearPublished, int issueNumber){
        super(title,yearPublished);
        this.issueNumber=issueNumber;
    }
    public int getIssueNumber() {return issueNumber;}
    public void setIssueNumber(int issueNumber) {this.issueNumber = issueNumber;}

    public void printMagazineInfo(){

        System.out.println("Title: "+getTitle());
        System.out.println("Year Of Published : "+getYearPublished());
        System.out.println("Issue Number : "+getIssueNumber());
    }
}
