public class BookingSystem {
	 public static void main(String[] args) {

	        Theater theater = new Theater();

	        BookingThread t1 = new BookingThread(theater, 2, "Thread1");
	        BookingThread t2 = new BookingThread(theater, 2, "Thread2");
	        BookingThread t3 = new BookingThread(theater, 2, "Thread3");

	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}


