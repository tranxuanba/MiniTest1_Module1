import abstractclass.Book;
import abstractclass.FictionBook;
import abstractclass.ProgrammingBook;

public class bookManager {
    public static void main(String[] args) {
        Book book[] = new Book[10];
        book[0] = new ProgrammingBook(111, "Viet Nam trong toi", 120, "ba tran", "java", "All");
        book[1] = new ProgrammingBook(222, "toi yeu Viet Nam", 102, "van cao", "java", "All");
        book[2] = new ProgrammingBook(333, "toi yeu em", 90, "nguyen trai", "Viet Nam", "All");
        book[3] = new ProgrammingBook(444, "con meo", 60, "chi pheo", "tieng Anh", "All");
        book[4] = new ProgrammingBook(555, "con tom", 110, "thi no", "java", "All");

        book[5] = new FictionBook(666, "con cua", 111, "nam cao", "kinh di");
        book[6] = new FictionBook(777, "con ech", 100, "codegym", "chien tranh");
        book[7] = new FictionBook(888, "5 anh em sieu nhan", 50, "to huu", "Viễn tưởng 1");
        book[8] = new FictionBook(999, "rong ran len may", 60, "nguyen nu", "Viễn tưởng 1");
        book[9] = new FictionBook(1000, "cuoc doi dep lam", 110, "dieu thuyen", "sieu nhan");

        System.out.println("tổng tiền của 10 cuốn sách la: " + sumOfPrice(book));

        System.out.println("số sách ProgrammingBook có language là \"Java\" la: " + countByLanguage(book, "java"));

        System.out.println("số sách Fiction có category là “Viễn tưởng 1” la: " + countByCategory(book, "Viễn tưởng 1"));

        System.out.println("số price Fiction có giá < 100 la: " + countByPrice(book));
    }

    public static double sumOfPrice(Book book[]){
        double sumPrice = 0;
        for (int i = 0; i < book.length; i++) {
            sumPrice += book[i].getPrice();
        }
        return sumPrice;
    }

    public static int countByLanguage(Book book[], String language) {
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBook) {
                String language1 = ((ProgrammingBook)book[i]).getLanguage();
                if (language1.equals("java")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countByCategory(Book book[], String category) {
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof FictionBook) {
                String category1 = ((FictionBook)book[i]).getCategory();
                if (category1.equals("Viễn tưởng 1")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countByPrice(Book book[]) {
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof FictionBook) {
               double countPrice = ((FictionBook)book[i]).getPrice();
               if (countPrice < 100) {
                   count++;
               }
            }
        }
        return count;
    }
}
