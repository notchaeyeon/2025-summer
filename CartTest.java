package ch09;

import java.util.ArrayList;  

public class CartTest {
    public static void main(String[] args) {
        Item shirt = new Item("스트라이프 셔츠", 49900);
        Item pants = new Item("슬림 면바지", 58900);
        Item sneakers = new Item("스니커즈", 46900);

        ArrayList<Item> cart = new ArrayList<Item>();
        cart.add(shirt); 
        cart.add(pants);
        cart.add(sneakers);
        
        for(int i = 0; i<3;i++) {
        System.out.println(cart.get(i).toStr());
        }
        System.out.println("==========================================");
        System.out.printf("총합: %d원", shirt.getPrice() + pants.getPrice() + sneakers.getPrice());
    }
}

class Item {
    private String name;
    private int price;
    
    public Item(String _name, int _price) {
        name = _name;
        price = _price;
    }
    
    public int getPrice() {
    	return price;
    }    
    String toStr() {
    	return String.format("Item { name: %s, price: %d}", name, price);
    }

}
