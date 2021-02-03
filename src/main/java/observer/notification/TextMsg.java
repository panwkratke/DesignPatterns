package observer.notification;

import observer.order.Order;

public class TextMsg implements Observer {

  public void update(Order order) {
    System.out.println(
        "SMS: Order number: "
            + order.getOrderNumber()
            + ", status changed to: "
            + order.getOrderStatus());
  }
}
