package CodingTest;

public class Book {
    String title;
    String author;

    void show(){
        System.out.println(title + " " + author);
    }

    public Book(){
        System.out.println("생성자 호출 됨");
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }


    public static void main(String[] args) {
        Book littlePrince = new Book("어린 왕자", "생택 쥐페리");
        
        littlePrince.show();
    }
}
