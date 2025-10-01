class CourierDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Sent with Courier 6, " + order.getItems().size() + " items on board.");
    }
}
class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Sent with Post(al), " + order.getItems().size() + " items on board.");
    }
}
class PickUpPointDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Get on point, " + order.getItems().size() + " items awaits you.");
    }
}