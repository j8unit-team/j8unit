package org.j8unit.repository.javax.print;

import javax.print.ServiceUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServiceUI} (by simply reusing the J8Unit
 * test interface {@link ServiceUIClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServiceUIClassTest
implements ServiceUIClassTests<ServiceUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.ServiceUI]

    @Override
    public Class<ServiceUI> createNewSUT() {
        return ServiceUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.print.ServiceUI#ServiceUI() public
     * javax.print.ServiceUI()}.
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
    public void create_ServiceUI()
    throws Exception {
        // create new instance
        final ServiceUI sut = new ServiceUI();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.print.ServiceUI#printDialog(java.awt.GraphicsConfiguration, int, int, javax.print.PrintService[], javax.print.PrintService, javax.print.DocFlavor, javax.print.attribute.PrintRequestAttributeSet)
     * public static javax.print.PrintService
     * javax.print.ServiceUI.printDialog(java.awt.GraphicsConfiguration,int,int,javax.print.PrintService[],javax.print.PrintService,javax.print.DocFlavor,javax.print.attribute.PrintRequestAttributeSet)
     * throws java.awt.HeadlessException}.
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
    public void test_printDialog_GraphicsConfiguration_int_int_PrintServiceArray_PrintService_DocFlavor_PrintRequestAttributeSet()
    throws Exception {
        // write some test for {@link javax.print.ServiceUI#printDialog(java.awt.GraphicsConfiguration, int, int,
        // javax.print.PrintService[], javax.print.PrintService, javax.print.DocFlavor,
        // javax.print.attribute.PrintRequestAttributeSet)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.ServiceUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.ServiceUI]

}
