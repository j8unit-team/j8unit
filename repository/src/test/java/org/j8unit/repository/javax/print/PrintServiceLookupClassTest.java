package org.j8unit.repository.javax.print;

import static org.junit.Assert.fail;
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceLookupClassTest
implements org.j8unit.repository.javax.print.PrintServiceLookupClassTests<PrintServiceLookup> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.PrintServiceLookup]

    @Override
    public Class<PrintServiceLookup> createNewSUT() {
        return PrintServiceLookup.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrintServiceLookup#PrintServiceLookup() public
     * javax.print.PrintServiceLookup()}.
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
    public void create_PrintServiceLookup()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link PrintServiceLookup#lookupPrintServices(DocFlavor, AttributeSet) public static final
     * javax.print.PrintService[]
     * javax.print.PrintServiceLookup.lookupPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
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
    public void test_lookupPrintServices_DocFlavor_AttributeSet()
    throws Exception {
        // write some test for {@link PrintServiceLookup#lookupPrintServices(DocFlavor, AttributeSet)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link PrintServiceLookup#registerServiceProvider(PrintServiceLookup) public static boolean
     * javax.print.PrintServiceLookup.registerServiceProvider(javax.print.PrintServiceLookup)}.
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
    public void test_registerServiceProvider_PrintServiceLookup()
    throws Exception {
        // write some test for {@link PrintServiceLookup#registerServiceProvider(PrintServiceLookup)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link PrintServiceLookup#lookupDefaultPrintService()
     * public static final javax.print.PrintService javax.print.PrintServiceLookup.lookupDefaultPrintService()}.
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
    public void test_lookupDefaultPrintService()
    throws Exception {
        // write some test for {@link PrintServiceLookup#lookupDefaultPrintService()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link PrintServiceLookup#registerService(PrintService)
     * public static boolean javax.print.PrintServiceLookup.registerService(javax.print.PrintService)}.
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
    public void test_registerService_PrintService()
    throws Exception {
        // write some test for {@link PrintServiceLookup#registerService(PrintService)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link PrintServiceLookup#lookupMultiDocPrintServices(DocFlavor[], AttributeSet) public static final
     * javax.print.MultiDocPrintService[]
     * javax.print.PrintServiceLookup.lookupMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)}
     * .
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
    public void test_lookupMultiDocPrintServices_DocFlavorArray_AttributeSet()
    throws Exception {
        // write some test for {@link PrintServiceLookup#lookupMultiDocPrintServices(DocFlavor[], AttributeSet)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.PrintServiceLookup]

}
