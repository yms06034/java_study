package chap_06;

public class _03_Return {
    public static String getPhoneNumer() {
        String phoneNumber = "010-1234-5678";
        return phoneNumber;
    }
    
    public static String getAddress() {
        return "충청남도 공주시 어딘가";
    }
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumer();
        String address = getAddress();


        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(getActivities());
    }
}
