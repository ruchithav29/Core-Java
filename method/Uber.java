class Uber {

    static void createAccount(String name, long phone,
                              String pickupLocation, String rideCategory, String paymentMode){

        System.out.println("UBER ACCOUNT CREATED");
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phone);
        System.out.println("PickupLocation : " + pickupLocation);
        System.out.println("RideCategory   : " + rideCategory);
        System.out.println("PaymentMode    : " + paymentMode);
    }
}