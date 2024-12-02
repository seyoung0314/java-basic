package chap1_6.practice.q3;

public class MovieTicket {
    public String movieTitle;
    private String seatNumber;
    private boolean isBooked;

    public MovieTicket(String movieTitle, String seatNumber) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
    }

    public void bookSeat(String seatNumber){
        if(!isBooked){
            isBooked = true;
            System.out.println(seatNumber +"좌석이 예매되었습니다.");
        }else {
            System.out.println(seatNumber+ "좌석은 이미 예매되어있습니다.");
        }
    }
    public  void cancelBooking(){
        if(!isBooked){
            isBooked = true;
            System.out.println(seatNumber +"좌석이 예매되었습니다.");
        }else {
            System.out.println(seatNumber+ "좌석은 이미 예매되어있습니다.");
        }
    }
    public void displayTicketInfo(){
        System.out.println("movieTitle = " + movieTitle);
        System.out.println("seatNumber = " + seatNumber);
        System.out.println("isBooked = " + isBooked);
    }
}
