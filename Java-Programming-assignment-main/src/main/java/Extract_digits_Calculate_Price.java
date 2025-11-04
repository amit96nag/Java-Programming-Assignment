public class Extract_digits_Calculate_Price {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^0-9 ]", " ");
        str=str.trim();
        String arr[]= str.split("\\s+");

        double lqptop_price=Double.parseDouble(arr[1]);
        double mouse_price =Double.parseDouble(arr[2]);
        double discountpercent=Double.parseDouble(arr[4]);
//mot dam
        double total=lqptop_price+mouse_price;
//koto sar
        double discount=(total*discountpercent)/100;
//mot koto ase
        double totalcost=total-discount;
        System.out.println("Total Cost:"+totalcost+" tk");

    }

}
