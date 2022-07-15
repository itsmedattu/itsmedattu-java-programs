
public class MyExceptions {

  /**
   * @param args
   * @throws RailwayException
   */
  public static void main(String[] args) throws RailwayException {
    // TODO Auto-generated method stub
    try {
      int number = 0;
      System.out.println("value of number is " + number);
    }
    // catch (Exception e) {
    // TODO: handle exception
    // }
    finally {
      System.out.println("from finally");
    }
    try {
      String travel_date = "21/12/2012";
      TicketBooker ticketBooker = new TicketBooker();
      ticketBooker.bookTicket(17023, travel_date, 3, 1);
      System.out.println("Tickets booked successfully.");
    } catch (SeatsNotAvailableException sna) {
      System.out.println("Seats not available exception" + sna.getErrorMessage());
    } catch (ServiceCancelledException sce) {
      System.out.println("service cancelled exception" + sce.getErrorMessage());
    } catch (CounterClosedException cce) {
      System.out.println("Counter closed exception" + cce.getErrorMessage());
    } catch (RailwayException re) {
      System.out.println("Railway booking failed. Reason : " + re.getErrorMessage());
    } finally {
      System.out.println("Excecution complete , finally block");
    }
  }
}

class RailwayException extends Exception {
  int trainNo;
  String errorMessage;

  RailwayException(int trainNo, String errorMessage) {
    this.trainNo = trainNo;
    this.errorMessage = errorMessage;
  }

  String getErrorMessage() {
    return errorMessage;
  }
}

class ServiceCancelledException extends RailwayException {
  String date;

  ServiceCancelledException(int trainNo, String date) {
    super(trainNo, "The service of train " + trainNo + " is cancelled on " + date);
    this.date = date;
  }
}

class SeatsNotAvailableException extends RailwayException {
  String date;

  SeatsNotAvailableException(int trainNo, String date) {
    super(trainNo, "There are no seats available for the train " + trainNo + " on " + date);
    this.date = date;
  }
}

class CounterClosedException extends RailwayException {
  String date;

  CounterClosedException(int trainNO, String date) {
    super(trainNO, "Counter closed for the train " + trainNO + " on " + date);
  }
}

class TicketBooker {
  public void bookTicket(int trainNo, String date, int adults, int children) throws RailwayException // LINE A
  {

    if (isServiceCancelled(trainNo, date)) {
      throw new ServiceCancelledException(trainNo, date); // LINE B
    }
    if (iscounterClosed(trainNo, date, adults, children)) {
      throw new CounterClosedException(trainNo, date);
    } else if (areSeatsAvailable(trainNo, date, adults, children)) {
      confirmBooking(trainNo, date, adults, children);
    } else {
      throw new SeatsNotAvailableException(trainNo, date); // LINE C
    }

  }

  private boolean isServiceCancelled(int trainNo, String date) {
    // Code for checking if the service is cancelled
    return false; // LINE D
    // return true;
  }

  private boolean areSeatsAvailable(int trainNo, String date, int adults, int children) {
    // Code here for checking if the seats are available
    return false; // LINE E
    // return true;
  }

  private void confirmBooking(int trainNo, String date, int adults, int children) {
    // code here to confirm the booking
  }

  private boolean iscounterClosed(int trainNo, String date, int adults, int children) {
    return true;
  }
}
