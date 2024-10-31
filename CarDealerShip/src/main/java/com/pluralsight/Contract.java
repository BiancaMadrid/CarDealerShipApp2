package com.pluralsight;

    public class Contract {

        protected String buyerName;
        protected String buyerEmail;
        protected String vehicleId;

        public Contract(String buyerName, String buyerEmail, String vehicleId) {
            this.buyerName = buyerName;
            this.buyerEmail = buyerEmail;
            this.vehicleId = vehicleId;
        }

        public abstract double getTotalPrice();
        public abstract double getMonthlyPayment();

        @Override
        public String toString() {
            return "Buyer: " + buyerName + ", Email: " + buyerEmail + ", Vehicle ID: " + vehicleId;
        }
    }
}
