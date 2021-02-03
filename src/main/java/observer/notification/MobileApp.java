package observer.notification;

import observer.order.Order;

public class MobileApp implements Observer {

  public void update(Order order) {
    System.out.println(
        "App: Order number: "
            + order.getOrderNumber()
            + ", status changed to: "
            + order.getOrderStatus());
  }
}
