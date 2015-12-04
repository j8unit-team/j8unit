package org.j8unit.repository.javax.print;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.ServiceUI class javax.print.ServiceUI}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.javax.print.ServiceUITests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.ServiceUITests
 */
@Category(J8UnitRepository.class)
public abstract interface ServiceUIClassTests<SUT extends Class<? extends javax.print.ServiceUI>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.print.ServiceUI#ServiceUI() public javax.print.ServiceUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServiceUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.ServiceUI sut = null; // = new ServiceUI();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.print.ServiceUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.ServiceUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.ServiceUI#printDialog(java.awt.GraphicsConfiguration,int,int,javax.print.PrintService[],javax.print.PrintService,javax.print.DocFlavor,javax.print.attribute.PrintRequestAttributeSet)
     * public static javax.print.PrintService
     * javax.print.ServiceUI.printDialog(java.awt.GraphicsConfiguration,int,int,javax.print.PrintService[],javax.print.PrintService,javax.print.DocFlavor,javax.print.attribute.PrintRequestAttributeSet)
     * throws java.awt.HeadlessException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printDialog_GraphicsConfiguration_int_int_PrintServiceArray_PrintService_DocFlavor_PrintRequestAttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
