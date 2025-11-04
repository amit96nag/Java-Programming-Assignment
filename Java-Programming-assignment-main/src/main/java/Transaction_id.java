public class Transaction_id {
    public static void main(String[] args) {
        String[] lines = {
                "<!DOCTYPE html>",
                "<html lang=\"en\">",
                "<head>",
                "<meta charset=\"UTF-8\">",
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">",
                "<title>Transactions</title>",
                "</head>",
                "<body>",
                "<div>",
                "<div class=\"button\">",
                "<p>Transaction Id: TXN1234</p>",
                "</div>",
                "</div>",
                "</body>",
                "</html>"
        };

        for (String line : lines) {
            if (line.contains("Transaction Id:")) {
                // HTML tag soranor jonno
                String html = line.replaceAll("<.*?>", "");

                // Colon diye split kore array te raklam
                String[] parts = html.split(":");

                // ID index trim korlam
                if (parts.length == 2) {
                    String txnId = parts[1].trim();
                    System.out.println("Transaction ID: " + txnId);
                } else {
                    System.out.println("Invalid format");
                }
            }
        }
    }
}
