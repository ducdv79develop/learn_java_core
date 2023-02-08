package day3;

import java.util.*;

public class HandleArray {

    public HandleArray() {
        this.forArray();
        this.forDictionary();
        this.forList();
    }

    public void forArray() {
        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9}
        };
        for (int i = 0; i< myNumbers.length; i++) {
            String str = "";
            for (int j = 0; j< myNumbers[i].length; j++) {
                str += (j != 0 ? ", " : "") + myNumbers[i][j];
            }
            System.out.println(str);
        }
    }

    public void forDictionary() {
        Dictionary<String, String> dict = new Hashtable<>();
        System.out.println(dict.isEmpty());
        dict.put("1", "macbook");
        dict.put("2", "apple");
        System.out.println(dict);
    }

    public void forList() {
        List<Book> list= new ArrayList<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

    static class Book {
        int id;
        String name,author,publisher;
        int quantity;
        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }
    }
}
