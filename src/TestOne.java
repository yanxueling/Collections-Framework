import java.util.*;

/**
 * 1.使用链表和映射存放多个图书信息，遍历并输出。
 * 其中商品属性：编号，名称，单价，出版社；
 * 使用商品编号作为映射中的key。
 */
public class TestOne {
    public static void main(String[] args) {
        //new几个Books对象
        Books books1 = new Books(1001, "Java", 88.0, "Java出版社");
        Books books2 = new Books(1002, "Python", 36.0, "Python出版社");
        Books books3 = new Books(1003, "C++", 35.0, "C++出版社");
        Books books4 = new Books(1004, "C语言", 30.0, "C语言出版社");
        
        //然后放进HashMap中,Key是图书的编号,value是图书对象
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        booksHashMap.put(books4.getNum(), books4);

        //不创建Books类,直接用集合存储图书的属性，然后放进list集合中
        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        //图书编号作为key
        System.out.println("编号\t名称\t单价\t出版社");
        for (HashMap<Integer, Books> h : booksList) {
            //获取key
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //再通过key找value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
    }
}

/**
 * Books(图书类)
 * 用于存放图书的属性
 */
class Books {
    /**
     * num 编号
     * name 名称
     * price 价格
     * press 出版社
     */
    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {

    }

    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }


}