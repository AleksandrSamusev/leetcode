//1108. Defanging an IP Address

public class Solution {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
