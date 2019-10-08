package lab1;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String n, String a, int p){
        name = n;
        author = a;
        pages = p;
    }

    public Book(String n, String a){
        name = n;
        author = a;
        pages = 0;
    }

    public Book(String n) {
        name = n;
        author = "Fio";
        pages = 0;
    }

    public Book() {
        name = "name";
        author = "author";
        pages = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    public String getName(String name){
        return name;
    }

    public  String getAuthor(String author){
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String toString(){
        return this.name + ", author " + this.author + ", pages" + this.pages;
    }
}

