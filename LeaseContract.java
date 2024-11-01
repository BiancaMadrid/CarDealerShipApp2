public class LeaseContract {
    private double originalPrice;
    private static final double interestRate = 0.04;
    private static final int termMonths = 36;
    private static final double endingPercent = 0.50;
    private static final double leasePercent = 0.07;
    private String date;
    private String customerName;
    private String customerEmail;
    //private String make;
    // private String model;
    //private String type;
    // private String color;


    // Constructor
    public LeaseContract(String vin, double originalPrice) {
        this.vin = vin;
        this.originalPrice = originalPrice;
    }

    // Getters and setters
    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }
    public double getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(double originalPrice) { this.originalPrice = originalPrice; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
//    public String getMake() { return make; }
//    public void setMake(String make) { this.make = make; }
//    public String getModel() { return model; }
//    public void setModel(String model) { this.model = model; }
//    public String getType() { return type; }
//    public void setType(String type) { this.type = type; }
//    public String getColor() { return color; }
//    public void setColor(String color) { this.color = color; }


    // Computed methods
    public double getExpectedEndingValue() {
        return originalPrice * endingPercent;
    }

    public double getLeaseFee() {
        return originalPrice * leasePercent;
    }

    public double getTotalPrice() {
        return originalPrice - getExpectedEndingValue() + getLeaseFee();
    }

    public double getMonthlyPayment() {
        double principal = getTotalPrice();
        double monthlyRate = interestRate / 12;
        return principal * (monthlyRate * Math.pow(1 + monthlyRate, termMonths))
                / (Math.pow(1 + monthlyRate, termMonths) - 1);
    }    // Format contract data as string
    public String toContractString() {
        // Format: LEASE|date|name|email|vin|year|make|model|type|color|odometer|price|
        //         endingValue|leaseFee|totalPrice|monthlyPayment
        StringBuilder sb = new StringBuilder();
        sb.append("LEASE|")
                .append(date).append("|")
                .append(customerName).append("|")
                .append(customerEmail).append("|")
                .append(vin).append("|")
                .append(make).append("|")
                .append(model).append("|")
                .append(type).append("|")
                .append(color).append("|")
                .append(String.format("%.2f", originalPrice)).append("|")
                .append(String.format("%.2f", getExpectedEndingValue())).append("|")
                .append(String.format("%.2f", getLeaseFee())).append("|")
                .append(String.format("%.2f", getTotalPrice())).append("|")
                .append(String.format("%.2f", getMonthlyPayment()));

        return sb.toString();
    }

}




