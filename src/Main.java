import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01t13:00:00Z");

        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("grandezza piccola: " + dateShort);

        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("grandezza media: " +dateMedium);

        String dateFull  = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Grandezza grande: " + dateFull);

        }
    }
