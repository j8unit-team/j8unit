package org.j8unit.repository.javax.print;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.PrintServiceLookup class javax.print.PrintServiceLookup}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.print.PrintServiceLookupTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.PrintServiceLookupTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceLookupClassTests<SUT extends javax.print.PrintServiceLookup>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.print.PrintServiceLookup#PrintServiceLookup() public
     * javax.print.PrintServiceLookup()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrintServiceLookup()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.PrintServiceLookup sut = null; // = new PrintServiceLookup();
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#lookupDefaultPrintService() public static final
     * javax.print.PrintService javax.print.PrintServiceLookup.lookupDefaultPrintService()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupDefaultPrintService()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#lookupMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)
     * public static final javax.print.MultiDocPrintService[]
     * javax.print.PrintServiceLookup.lookupMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupMultiDocPrintServices_DocFlavorArray_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#lookupPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)
     * public static final javax.print.PrintService[]
     * javax.print.PrintServiceLookup.lookupPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPrintServices_DocFlavor_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#registerService(javax.print.PrintService) public static
     * boolean javax.print.PrintServiceLookup.registerService(javax.print.PrintService)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerService_PrintService()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#registerServiceProvider(javax.print.PrintServiceLookup)
     * public static boolean javax.print.PrintServiceLookup.registerServiceProvider(javax.print.PrintServiceLookup)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_registerServiceProvider_PrintServiceLookup()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.PrintServiceLookup.class.isAssignableFrom(sut));
    }

}
