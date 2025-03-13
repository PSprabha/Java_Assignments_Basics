package class_and_objects;

public class FlightDto {
    private int id;
    private String airline;
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String status;
    private int price; 
    private int seatCapacity;

    public FlightDto()
    {
    	
    }

    public FlightDto(int id, String airline, String flightNumber, String departure, 
                     String destination, String departureTime, String arrivalTime, 
                     String status, int price, int seatCapacity)
    {
        this.id = id;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
        this.price = price;
        this.seatCapacity = seatCapacity;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getAirline() 
    {
        return airline;
    }

    public void setAirline(String airline) 
    {
        this.airline = airline;
    }

    public String getFlightNumber() 
    {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) 
    {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() 
    {
        return departure;
    }

    public void setDeparture(String departure) 
    {
        this.departure = departure;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    public String getDepartureTime() 
    {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) 
    {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() 
    {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) 
    {
        this.arrivalTime = arrivalTime;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getSeatCapacity() 
    {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity)
    {
        this.seatCapacity = seatCapacity;
    }
}

