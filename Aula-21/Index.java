import entities.enums.OrderStatus;
import utils.Order;

import java.util.Date;

public class Index {
    public static void main(String[] args) {

        Order prod = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(prod);


        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("OS1: " + os1);
        System.out.println("OS2: " + os2);
    }
}