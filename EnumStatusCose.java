package com.Enum;

public class EnumStatusCose {

    public static void main(String[] args) {
        OrderStatus status = OrderStatus.NEW;

        switch (status) {
            case NEW:
                System.err.println("Order Received. ");
                break;
            case PROCESSING:
                System.err.println("Order is Processing.");
                break;
            case COMPLETED:
                System.err.println("Order is complete");
                break;
            case CANCELED:
                System.err.println("Order us Cabceked.");
                break;
            default:
                throw new AssertionError();
        }
    }
}

enum OrderStatus {
    NEW, PROCESSING, COMPLETED, CANCELED

}
