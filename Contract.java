import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract {
    //abstract static class Contract{


        LocalDate date = LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        protected String customerName;
        protected String customerEmail;
        protected String vehicleSold;
        protected double totalPrice;
        protected double monthlyPayment;



        public void contract(LocalDate date, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment){
            this.date = date;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.vehicleSold = vehicleSold;
            this.totalPrice = totalPrice;
            this.monthlyPayment = monthlyPayment;
        }

        public LocalDate getDate() {

            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String _customerName) {
            this.customerName = _customerName;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String _customerEmail) {
            this.customerEmail = _customerEmail;
        }

        public String getVehicleSold() {
            return vehicleSold;
        }

        public void setVehicleSold(String _vehicleSold) {
            this.vehicleSold = _vehicleSold;
        }

        public abstract void getTotalPrice();

        public abstract void getMonthlyPayments();


    //}
}
