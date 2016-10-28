package org.j8unit.repository.javax.print;

import java.awt.GraphicsConfiguration;
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.ServiceUI;
import javax.print.attribute.PrintRequestAttributeSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUIClassTest
implements org.j8unit.repository.javax.print.ServiceUIClassTests<ServiceUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.ServiceUI]

    @Override
    public Class<ServiceUI> createNewSUT() {
        return ServiceUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ServiceUI#ServiceUI() public
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
     * {@link ServiceUI#printDialog(GraphicsConfiguration, int, int, PrintService[], PrintService, DocFlavor, PrintRequestAttributeSet)
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
        // write some test for {@link ServiceUI#printDialog(GraphicsConfiguration, int, int, PrintService[],
        // PrintService, DocFlavor, PrintRequestAttributeSet)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.ServiceUI]

}
