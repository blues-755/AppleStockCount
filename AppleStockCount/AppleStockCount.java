public class AppleStockCount {
  public static void main(String[] args) {

    if (args.length == 0) {
        System.out.println("Please give me a qty!");
        return;
    }

    int qty = Integer.parseInt(args[0]);
    double cost = 4.50;
    double total;
    int dozen = 0;

    if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else if(qty % 12 == 0 ){
      total = qty * cost;

      if (qty >= 12) {

        dozen = qty / 12;
      }

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");
      message.append(dozen);
      message.append(" dozen");
      if(dozen > 1){
        message.append("s");
      }
      message.append(" of");
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of ");
      message.append(total);
      message.append(".");

      System.out.println(message.toString());
    }
    else{
      if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else {
      total = qty * cost;

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");
      message.append(qty);
      message.append(" apple");

      if (qty > 1) {
        message.append("s");
      }

      message.append(" for a total cost of ");
      message.append(total);
      message.append(".");
      System.out.println(message.toString());
    }
  }
 }
}
