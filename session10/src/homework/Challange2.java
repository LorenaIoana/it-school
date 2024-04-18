package homework;

import java.util.ArrayList;

public class Challange2 {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("A mug");
        wishlist.add("Socks");
        wishlist.add("Books");
        wishlist.add("Candles");

        for (int i = 0; i < wishlist.size(); i++) {
            System.out.println(wishlist.get(i));
        }
    }
}
