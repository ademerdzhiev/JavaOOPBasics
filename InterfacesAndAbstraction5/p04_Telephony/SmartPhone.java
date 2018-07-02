package p04_Telephony;

public class SmartPhone implements ICalling, IBrowsing{

    @Override
    public String browsing(String webSite) {
        if (webSite.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        }

        return "Browsing: " + webSite + "!";
    }

    @Override
    public String call(String phoneNumber) {
        if (phoneNumber.matches(".*\\D.*")) {
            throw new IllegalArgumentException("Invalid number!");
        }

        return "Calling... " + phoneNumber;
    }


    private boolean checkURL (String url) {
        for (Character letter : url.toCharArray()) {
            if (Character.isDigit(letter)) {
                return false;
            }
        }

        return true;
    }

    private boolean checkPhoneNumber(String phoneNumber) {
        for (Character letter : phoneNumber.toCharArray()) {
            if (!Character.isDigit(letter)) {
                return false;
            }
        }
        return true;
    }
}
