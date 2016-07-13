package supercsv;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.supercsv.cellprocessor.FmtBool;
import org.supercsv.cellprocessor.FmtDate;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.LMinMax;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class SuperCsvDemo {

    public static void main(String[] args) throws IOException {
        // create the customer beans
        final CustomerBean john = new CustomerBean("1", "John", "Dunbar", new GregorianCalendar(1945, Calendar.JUNE, 13).getTime(),
                "1600 Amphitheatre Parkway\nMountain View, CA 94043\nUnited States", null, null,
                "\"May the Force be with you.\" - Star Wars", "jdunbar@gmail.com", 0L);
        final CustomerBean bob = new CustomerBean("2", "Bob", "Down", new GregorianCalendar(1919, Calendar.FEBRUARY, 25).getTime(),
                "1601 Willow Rd.\nMenlo Park, CA 94025\nUnited States", true, 0,
                "\"Frankly, my dear, I don't give a damn.\" - Gone With The Wind", "bobdown@hotmail.com", 123456L);
        final List<CustomerBean> customers = Arrays.asList(john, bob);

        StringWriter stringWriter = new StringWriter();
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(stringWriter, CsvPreference.STANDARD_PREFERENCE)) {

            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[] { "customerNo", "firstName", "lastName", "birthDate", "mailingAddress", "married",
                    "numberOfKids", "favouriteQuote", "email", "loyaltyPoints" };
            final CellProcessor[] processors = getProcessors();

            // write the header
            beanWriter.writeHeader(header);

            // write the beans
            for (final CustomerBean customer : customers) {
                beanWriter.write(customer, header, processors);
            }
        }

        System.out.println(stringWriter);
    }

    private static CellProcessor[] getProcessors() {

        final CellProcessor[] processors = new CellProcessor[] { new UniqueHashCode(), // customerNo (must be unique)
                new NotNull(), // firstName
                new NotNull(), // lastName
                new FmtDate("dd/MM/yyyy"), // birthDate
                new NotNull(), // mailingAddress
                new Optional(new FmtBool("Y", "N")), // married
                new Optional(), // numberOfKids
                new NotNull(), // favouriteQuote
                new NotNull(), // email
                new LMinMax(0L, LMinMax.MAX_LONG) // loyaltyPoints
        };

        return processors;
    }

}
