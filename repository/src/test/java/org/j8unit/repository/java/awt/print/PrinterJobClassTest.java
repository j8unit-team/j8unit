package org.j8unit.repository.java.awt.print;

import static org.junit.Assert.fail;
import java.awt.print.PrinterJob;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrinterJobClassTest
implements org.j8unit.repository.java.awt.print.PrinterJobClassTests<PrinterJob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PrinterJob]

    @Override
    public Class<PrinterJob> createNewSUT() {
        return PrinterJob.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.print.PrinterJob#PrinterJob() public
     * java.awt.print.PrinterJob()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_PrinterJob()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.print.PrinterJob#lookupPrintServices()
     * public static javax.print.PrintService[] java.awt.print.PrinterJob.lookupPrintServices()}.
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
    public void test_lookupPrintServices()
    throws Exception {
        // write some test for {@link java.awt.print.PrinterJob#lookupPrintServices()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.print.PrinterJob#getPrinterJob() public
     * static java.awt.print.PrinterJob java.awt.print.PrinterJob.getPrinterJob()}.
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
    public void test_getPrinterJob()
    throws Exception {
        // write some test for {@link java.awt.print.PrinterJob#getPrinterJob()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.print.PrinterJob#lookupStreamPrintServices(String) public static
     * javax.print.StreamPrintServiceFactory[] java.awt.print.PrinterJob.lookupStreamPrintServices(java.lang.String)}.
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
    public void test_lookupStreamPrintServices_String()
    throws Exception {
        // write some test for {@link java.awt.print.PrinterJob#lookupStreamPrintServices(String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PrinterJob]

}
