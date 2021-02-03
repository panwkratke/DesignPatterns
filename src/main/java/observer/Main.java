package observer;

import observer.notification.Email;
import observer.notification.MobileApp;
import observer.notification.TextMsg;
import observer.order.Order;
import observer.order.OrderStatus;

public class Main {

  public static void main(String[] args) {

    Order order = new Order(111L, OrderStatus.REGISTERED);
    TextMsg textMsg = new TextMsg();
    Email email = new Email();
    MobileApp mobileApp = new MobileApp();

    order.registerObserver(textMsg);
    order.registerObserver(email);
    order.registerObserver(mobileApp);

    order.notifyObservers();
    System.out.println("*************************");
    order.changeOrderStatus(OrderStatus.SENT);
  }
}
