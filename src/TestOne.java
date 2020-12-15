import java.util.*;

/**
 * 1.ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������
 * ������Ʒ���ԣ���ţ����ƣ����ۣ������磻
 * ʹ����Ʒ�����Ϊӳ���е�key��
 */
public class TestOne {
    public static void main(String[] args) {
        //new����Books����
        Books books1 = new Books(1001, "Java", 88.0, "Java������");
        Books books2 = new Books(1002, "Python", 36.0, "Python������");
        Books books3 = new Books(1003, "C++", 35.0, "C++������");
        Books books4 = new Books(1004, "C����", 30.0, "C���Գ�����");
        
        //Ȼ��Ž�HashMap��,Key��ͼ��ı��,value��ͼ�����
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        booksHashMap.put(books4.getNum(), books4);

        //������Books��,ֱ���ü��ϴ洢ͼ������ԣ�Ȼ��Ž�list������
        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        //ͼ������Ϊkey
        System.out.println("���\t����\t����\t������");
        for (HashMap<Integer, Books> h : booksList) {
            //��ȡkey
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //��ͨ��key��value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
    }
}

/**
 * Books(ͼ����)
 * ���ڴ��ͼ�������
 */
class Books {
    /**
     * num ���
     * name ����
     * price �۸�
     * press ������
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