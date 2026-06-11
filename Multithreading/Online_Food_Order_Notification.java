public class Message {
	public static void main(String[] args) {

	    // Constructor Injection with EmailNotification
	    NotificationService email = new EmailNotification();
	    OrderService order1 = new OrderService(email);
	    order1.placeOrder();

	    System.out.println();

	    // Constructor Injection with SMSNotification
	    NotificationService sms = new SMSNotification();
	    OrderService order2 = new OrderService(sms);
	    order2.placeOrder();
	}
	}

