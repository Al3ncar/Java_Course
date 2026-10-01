package utils;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    public Integer id;
    public Date moment;
    public OrderStatus status;

    public Order(int id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public String toString() {
        return "Order: [id: " + id + ", moment: " + moment + ", status: " + status + "]";
    }


}