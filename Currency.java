import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Currency {
    private static final Map<String, String> CURRENCY_SYMBOLS = new HashMap<>();

    static {
   
        CURRENCY_SYMBOLS.put("USD", "$");
        CURRENCY_SYMBOLS.put("EUR", "€");
        CURRENCY_SYMBOLS.put("GBP", "£");
        CURRENCY_SYMBOLS.put("ALL","Lek");
        CURRENCY_SYMBOLS.put("ARS", "$");
        CURRENCY_SYMBOLS.put("AWG", "ƒ");
        CURRENCY_SYMBOLS.put("AUD", "$");
        CURRENCY_SYMBOLS.put("AZN", "₼");
        CURRENCY_SYMBOLS.put("BSD", "$");
        CURRENCY_SYMBOLS.put("BDT", "৳");
        CURRENCY_SYMBOLS.put("BBD", "$");
        CURRENCY_SYMBOLS.put("BYN", "Br");
        CURRENCY_SYMBOLS.put("BZD", "BZ$");
        CURRENCY_SYMBOLS.put("BMD", "$");
        CURRENCY_SYMBOLS.put("BOB", "$b");
        CURRENCY_SYMBOLS.put("BAM", "KM");
        CURRENCY_SYMBOLS.put("BWP", "P");
        CURRENCY_SYMBOLS.put("BGN", "лв");
        CURRENCY_SYMBOLS.put("BRL", "R$");
        CURRENCY_SYMBOLS.put("BND", "$");
        CURRENCY_SYMBOLS.put("KHR", "៛");
        CURRENCY_SYMBOLS.put("CAD", "$");
        CURRENCY_SYMBOLS.put("KYD", "$");
        CURRENCY_SYMBOLS.put("CLP", "$");
        CURRENCY_SYMBOLS.put("CNY", "¥");
        CURRENCY_SYMBOLS.put("COP", "$");
        CURRENCY_SYMBOLS.put("CRC", "₡");
        CURRENCY_SYMBOLS.put("HRK", "kn");
        CURRENCY_SYMBOLS.put("CUP", "₱");
        CURRENCY_SYMBOLS.put("CZK", "Kč");
        CURRENCY_SYMBOLS.put("DKK", "kr");
        CURRENCY_SYMBOLS.put("DOP", "RD$");
        CURRENCY_SYMBOLS.put("XCD", "$");
        CURRENCY_SYMBOLS.put("EGP", "£");
        CURRENCY_SYMBOLS.put("SVC", "$");
        CURRENCY_SYMBOLS.put("EUR", "€");
        CURRENCY_SYMBOLS.put("FKP", "£");
        CURRENCY_SYMBOLS.put("FJD", "$");
        CURRENCY_SYMBOLS.put("GHS", "¢");
        CURRENCY_SYMBOLS.put("GIP", "£");
        CURRENCY_SYMBOLS.put("GTQ", "Q");
        CURRENCY_SYMBOLS.put("GGP", "£");
        CURRENCY_SYMBOLS.put("GYD", "$");
        CURRENCY_SYMBOLS.put("HNL", "L");
        CURRENCY_SYMBOLS.put("HKD", "$");
        CURRENCY_SYMBOLS.put("HUF", "Ft");
        CURRENCY_SYMBOLS.put("ISK", "kr");
        CURRENCY_SYMBOLS.put("INR", "₹");
        CURRENCY_SYMBOLS.put("IDR", "Rp");
        CURRENCY_SYMBOLS.put("IRR", "﷼");
        CURRENCY_SYMBOLS.put("IMP", "£");
        CURRENCY_SYMBOLS.put("ILS", "₪");
        CURRENCY_SYMBOLS.put("JMD", "J$");
        CURRENCY_SYMBOLS.put("JPY", "¥");
        CURRENCY_SYMBOLS.put("JEP", "£");
        CURRENCY_SYMBOLS.put("KZT", "лв");
        CURRENCY_SYMBOLS.put("KPW", "₩");
        CURRENCY_SYMBOLS.put("KRW", "₩");
        CURRENCY_SYMBOLS.put("KGS", "лв");
        CURRENCY_SYMBOLS.put("LAK", "₭");
        CURRENCY_SYMBOLS.put("LBP", "£");
        CURRENCY_SYMBOLS.put("LRD", "$");
        CURRENCY_SYMBOLS.put("MKD", "ден");
        CURRENCY_SYMBOLS.put("MYR", "RM");
        CURRENCY_SYMBOLS.put("MUR", "₨");
        CURRENCY_SYMBOLS.put("MXN", "$");
        CURRENCY_SYMBOLS.put("MNT", "₮");
        CURRENCY_SYMBOLS.put("MNT", "د.إ");
        CURRENCY_SYMBOLS.put("MZN", "MT");
        CURRENCY_SYMBOLS.put("NAD", "$");
        CURRENCY_SYMBOLS.put("NPR", "₨");
        CURRENCY_SYMBOLS.put("ANG", "ƒ");
        CURRENCY_SYMBOLS.put("NZD", "$");
        CURRENCY_SYMBOLS.put("NIO", "C$");
        CURRENCY_SYMBOLS.put("NGN", "₦");
        CURRENCY_SYMBOLS.put("NOK", "kr");
        CURRENCY_SYMBOLS.put("OMR", "﷼");
        CURRENCY_SYMBOLS.put("PKR", "₨");
        CURRENCY_SYMBOLS.put("PAB", "B/.");
        CURRENCY_SYMBOLS.put("PYG", "Gs");
        CURRENCY_SYMBOLS.put("PEN", "S/.");
        CURRENCY_SYMBOLS.put("PHP", "₱");
        CURRENCY_SYMBOLS.put("PLN", "zł");
        CURRENCY_SYMBOLS.put("QAR", "﷼");
        CURRENCY_SYMBOLS.put("RON", "lei");
        CURRENCY_SYMBOLS.put("RUB", "₽");
        CURRENCY_SYMBOLS.put("SHP", "£");
        CURRENCY_SYMBOLS.put("SAR", "﷼");
        CURRENCY_SYMBOLS.put("RSD", "Дин.");
        CURRENCY_SYMBOLS.put("SCR", "₨");
        CURRENCY_SYMBOLS.put("SGD", "$");
        CURRENCY_SYMBOLS.put("SBD", "$");
        CURRENCY_SYMBOLS.put("SOS", "S");
        CURRENCY_SYMBOLS.put("KRW", "₩");
        CURRENCY_SYMBOLS.put("ZAR", "R");
        CURRENCY_SYMBOLS.put("LKR", "₨");
        CURRENCY_SYMBOLS.put("SEK", "kr");
        CURRENCY_SYMBOLS.put("CHF", "CHF");
        CURRENCY_SYMBOLS.put("SRD", "$");
        CURRENCY_SYMBOLS.put("SYP", "£");
        CURRENCY_SYMBOLS.put("TWD", "NT$");
        CURRENCY_SYMBOLS.put("THB", "฿");
        CURRENCY_SYMBOLS.put("TTD", "TT$");
        CURRENCY_SYMBOLS.put("TRY", "₺");
        CURRENCY_SYMBOLS.put("TVD", "$");
        CURRENCY_SYMBOLS.put("UAH", "₴");
        CURRENCY_SYMBOLS.put("AED", "د.إ");
        CURRENCY_SYMBOLS.put("GBP", "£");
        CURRENCY_SYMBOLS.put("USD", "$");
        CURRENCY_SYMBOLS.put("UYU", "$U");
        CURRENCY_SYMBOLS.put("UZS", "лв");
        CURRENCY_SYMBOLS.put("VEF", "Bs");
        CURRENCY_SYMBOLS.put("VND", "₫");
        CURRENCY_SYMBOLS.put("YER", "﷼");
        CURRENCY_SYMBOLS.put("XOF", "Franc");
        CURRENCY_SYMBOLS.put("ZWD", "Z$");
    }

    public static void main(String[] args) {
        
        String baseCurrency = getUserInput("Enter the base currency code: ").toUpperCase();
        String targetCurrency = getUserInput("Enter the target currency code: ").toUpperCase();


        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);


        double amount = getAmountToConvert();

        double convertedAmount = amount * exchangeRate;

        String targetCurrencySymbol = CURRENCY_SYMBOLS.get(targetCurrency);
        System.out.printf("%f %s is equal to %s %.2f%n", amount, baseCurrency, targetCurrencySymbol, convertedAmount);
    }
        

    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        String apiKey = "eb47b18330e8aacad377101dc528042d";
        String apiUrl = String.format("https://open.er-api.com/v6/latest/%s", baseCurrency);

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                in.close();

               
                String jsonResponse = response.toString();
                double rate = Double.parseDouble(jsonResponse.split("\"" + targetCurrency + "\":")[1].split(",")[0]);

                return rate;
            } else {
                System.out.println("Error: Unable to fetch exchange rate. Status code: " + responseCode);
                return 0.0;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    private static double getAmountToConvert() {
        String amountStr = getUserInput("Enter the amount to convert: ");
        try {
            return Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return 0.0;
        }
    }
}
