package com.pluralsight;

    public class SalesContract extends Contract {
        private double price;
        private double downPayment;
        private double salesTax;

        public SalesContract(String buyerName, String buyerEmail, String vehicleId, double price, double downPayment, double salesTax) {
            super(buyerName, buyerEmail, vehicleId);
            this.price = price;
            this.downPayment = downPayment;
            this.salesTax = salesTax;
        }

        @Override
        public double getTotalPrice() {
            return price + (price * salesTax) - downPayment;
        }

        @Override
        public String toString() {
            return super.toString() + ", Type: Sale, Total Price: " + getTotalPrice() + ", Monthly Payment: " + getMonthlyPayment();
        }
    }

}
