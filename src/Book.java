import java.util.LinkedList;
import java.util.List;

public class Book implements Comparable {

    public Book() {
    }
    static Book book = new Book();

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int compareTo(Book o) {
        int priority = this.authorSurname.compareTo(o.authorSurname);

        if (priority<0) {
            return -1;
        }
        else if (priority==0) {
            return priority = this.authorFirstName.compareTo((o.authorFirstName));
        }
        else {
            return 1;
        }
    }

    public static void printBooks(Book[] books) {
        Book[] bookSorted = new Book[books.length];
        if(books==null){
            throw new RuntimeException("Input array should not be null");
        }else{
            if(books.length==0){
                throw new IllegalStateException("Bad array size");
            }else{
                for(int i=0;i<books.length;i++){
                    for(int j=i+1;j<books.length;j++){
                        Book book1 = books[i];
                        Book book2 = books[j];
                        if(book1.compareTo(book2)<0){
                            books[i] = book2;
                            books[j] = book1;
                        } else if (book1.compareTo(book2)>0) {
                            break;
                        }
                    }
                }

                for(int x=0;x<books.length;x++){
                    System.out.println(books[x].title);
                }
            }
        }



    }

    ////DO NOT MODIFY ANYTHING BELOW THIS LINE

    String title;
    String authorFirstName;
    String authorSurname;

    public Book(String title, String authorFirstName, String authorSurname) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.title;
    }

    public static void main(String[] args) {
        Book[] books = new Book[3];
        Book book = new Book("aaa Potter 1","aaa","aaa");
        Book book1 = new Book("bbb Potter 2","bbb","bbb");
        Book book2 = new Book("ccc Potter 3","ccc","ccc");
        books[0] = book;
        books[1] = book2;
        books[2] = book1;

        printBooks(books);
    }


}