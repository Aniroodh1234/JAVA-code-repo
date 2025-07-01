class LibraryItem{
    public String title(){
        return "Title";
    }
    // public int pages; // Removed to avoid hiding the field in LibraryItem
}
class Book extends LibraryItem{
    public int pages;
    public String title(){
        return "contain book related information";
    }

}
class DVD extends LibraryItem{
    public int length;
    public String title(){
        return "contains DVD information";
    }
}
class Journal extends LibraryItem{
    public int pages;
    public String title(){
        return "contains some journals";
    }
}

public class LibrarySystem{
    public static void main(String[]args){
        Book b = new Book();
        DVD d = new DVD();
        Journal j = new Journal();
        System.out.println(b.title());
        System.out.println(d.title());
        System.out.println(j.title());
    }
}