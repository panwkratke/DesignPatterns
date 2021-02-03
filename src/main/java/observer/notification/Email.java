package observer.notification;

import observer.order.Order;

public class Email implements Observer {

  public void update(Order order) {
    System.out.println(
        "Email: Order number: "
            + order.getOrderNumber()
            + ", status changed to: "
            + order.getOrderStatus());
  }
}
