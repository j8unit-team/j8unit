package org.j8unit.repository.javax.print.attribute.standard;

import java.util.Locale;
import javax.print.attribute.standard.PrinterLocation;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterLocationClassTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterLocationClassTests<PrinterLocation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrinterLocation]

    @Override
    public Class<PrinterLocation> createNewSUT() {
        return PrinterLocation.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrinterLocation#PrinterLocation(String, Locale)
     * public javax.print.attribute.standard.PrinterLocation(java.lang.String,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PrinterLocation_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrinterLocation sut = null; // = new PrinterLocation(String, Locale);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrinterLocation]

}
