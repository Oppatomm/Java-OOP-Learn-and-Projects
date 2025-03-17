import java.util.List;

class Book implements Promotable {
    private String title;
    private String author;
    private double price;

    Book (String title , String author , double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void applyPromotion(DiscountPolicy discountPolicy) {
        System.out.println(discountPolicy.calculateDiscount(getPrice()));
    };
    

    void displayInfo() {
        System.out.println("Title : " + getTitle() + "\n" +
                            "Author : " + getAuthor() + "\n" +
                            "Price : " + getPrice());
    }

    @Override
    public String toString() {
        return "Title : " + title + ", Author : " + author + ", Price : " + price;
    }
}

class EBook extends Book{
    private double fileSize;
    private String format;

    EBook (String title , String author , double price , double fileSize , String format) {
        super(title , author , price);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    void displayInfo() {
        System.out.println( "Title : " + getTitle() + "\n" + 
                            "Author : " + getAuthor() + "\n" +
                            "Price : " + getPrice() + "\n" + 
                            "FileSize : " + getFileSize() + " MB" + "\n" +
                            "Format  : " + getFormat());
    }

    @Override
    public String toString() {
        return super.toString() + ", FileSize : " + fileSize + ", Format : " + format;
    }

    @Override
    public void applyPromotion(DiscountPolicy discountPolicy) {
        System.out.println(discountPolicy.calculateDiscount(getPrice()));
    }
    
}


abstract class DiscountPolicy {
    abstract double calculateDiscount(double price);
}

class PercentageDiscount extends DiscountPolicy  {
    private int percentage;
    public PercentageDiscount (int percen) {
        this.percentage = percen;
    }
    @Override
    double calculateDiscount(double price) {
        double netprice = price - (price * (percentage / 100.0));
        return netprice;
    }
} 

class FlatDiscount extends DiscountPolicy {
    private int flatcount;
    public FlatDiscount (int flatcount) {
        this.flatcount = flatcount;
    }
    @Override
    double calculateDiscount(double price) {
        double netprice = price - flatcount;
        return netprice ;
    }
}

interface Promotable {
    public void applyPromotion(DiscountPolicy discountPolicy);
}

public class Bookstore_Management_System {
    public static void main (String [] args) {
        DiscountPolicy discountpolicy1 = new PercentageDiscount(12);
        DiscountPolicy discountpolicy2 = new FlatDiscount(50);

        Book b1 = new Book("Java Programming" , "Jame" , 700);
        System.out.println("----- Testing Book with Percentage Discount -----");
        b1.displayInfo();
        System.out.println("Price before discount (percentage) : " + b1.getPrice());
        System.out.print("Price after discount (percentage) : ");
        b1.applyPromotion(discountpolicy1);
        System.out.println("---------------------------------------------");


        EBook b2 = new EBook("Learning Java" , "Nine" , 450 , 14.50 , "PDF");
        System.out.println("----- Testing EBook with Flat Discount -----");
        b2.displayInfo();
        System.out.println("Price before discount (flat discount) : " + b2.getPrice());
        System.out.print("Price after discount (flat discount) : ");
        b2.applyPromotion(discountpolicy2);
        System.out.println("---------------------------------------------");


        System.out.println("----- Testing Book with Price < 500 -----");
        List <Book> list = List.of (
            new Book("Java Programming", "Jame", 700) ,
            new EBook("Learning Java", "Nine", 450, 14.50, "PDF")
        );
        list.stream()
            .filter(book -> book.getPrice() < 500)
            .forEach( (book) -> {
                System.out.println(book);
            });
    }
}