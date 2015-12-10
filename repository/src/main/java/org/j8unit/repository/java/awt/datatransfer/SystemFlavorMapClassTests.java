package org.j8unit.repository.java.awt.datatransfer;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.SystemFlavorMap class java.awt.datatransfer.SystemFlavorMap}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.datatransfer.SystemFlavorMapTests}.
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
 * @see org.j8unit.repository.java.awt.datatransfer.SystemFlavorMapTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SystemFlavorMapClassTests<SUT extends java.awt.datatransfer.SystemFlavorMap>
extends org.j8unit.repository.java.awt.datatransfer.FlavorMapClassTests<SUT>, org.j8unit.repository.java.awt.datatransfer.FlavorTableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#decodeDataFlavor(java.lang.String) public static
     * java.awt.datatransfer.DataFlavor java.awt.datatransfer.SystemFlavorMap.decodeDataFlavor(java.lang.String) throws
     * java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decodeDataFlavor_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#decodeJavaMIMEType(java.lang.String) public static
     * java.lang.String java.awt.datatransfer.SystemFlavorMap.decodeJavaMIMEType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decodeJavaMIMEType_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#encodeDataFlavor(java.awt.datatransfer.DataFlavor)
     * public static java.lang.String
     * java.awt.datatransfer.SystemFlavorMap.encodeDataFlavor(java.awt.datatransfer.DataFlavor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encodeDataFlavor_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#encodeJavaMIMEType(java.lang.String) public static
     * java.lang.String java.awt.datatransfer.SystemFlavorMap.encodeJavaMIMEType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encodeJavaMIMEType_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#getDefaultFlavorMap() public static
     * java.awt.datatransfer.FlavorMap java.awt.datatransfer.SystemFlavorMap.getDefaultFlavorMap()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultFlavorMap()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#isJavaMIMEType(java.lang.String) public static
     * boolean java.awt.datatransfer.SystemFlavorMap.isJavaMIMEType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isJavaMIMEType_String()
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
        assertTrue(java.awt.datatransfer.SystemFlavorMap.class.isAssignableFrom(sut));
    }

}
