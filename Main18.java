class WebsiteValidator {
    String url = "https://www.google.com";

    void check() {
        if (url.startsWith("https://")) {
            System.out.println("Secure Website URL");
        } else {
            System.out.println("Invalid Website Protocol");
        }
    }
}

public class Main18 {
    public static void main(String[] args) {
        WebsiteValidator w = new WebsiteValidator();
        w.check();
    }
}