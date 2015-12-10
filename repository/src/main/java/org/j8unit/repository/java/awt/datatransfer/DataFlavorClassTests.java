package org.j8unit.repository.java.awt.datatransfer;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.DataFlavor class java.awt.datatransfer.DataFlavor}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.datatransfer.DataFlavorTests}.
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
 * @see org.j8unit.repository.java.awt.datatransfer.DataFlavorTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataFlavorClassTests<SUT extends java.awt.datatransfer.DataFlavor>
extends org.j8unit.repository.java.io.ExternalizableClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.datatransfer.DataFlavor#DataFlavor() public java.awt.datatransfer.DataFlavor()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataFlavor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.datatransfer.DataFlavor sut = null; // = new DataFlavor();
    }

    /**
     * Test method for {@link java.awt.datatransfer.DataFlavor#DataFlavor(java.lang.Class,java.lang.String) public
     * java.awt.datatransfer.DataFlavor(java.lang.Class,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataFlavor_Class_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.datatransfer.DataFlavor sut = null; // = new DataFlavor(java.lang.Class,java.lang.String);
    }

    /**
     * Test method for {@link java.awt.datatransfer.DataFlavor#DataFlavor(java.lang.String) public
     * java.awt.datatransfer.DataFlavor(java.lang.String) throws java.lang.ClassNotFoundException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataFlavor_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.datatransfer.DataFlavor sut = null; // = new DataFlavor(java.lang.String);
    }

    /**
     * Test method for {@link java.awt.datatransfer.DataFlavor#DataFlavor(java.lang.String,java.lang.String) public
     * java.awt.datatransfer.DataFlavor(java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataFlavor_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.datatransfer.DataFlavor sut = null; // = new DataFlavor(java.lang.String,java.lang.String);
    }

    /**
     * Test method for
     * {@link java.awt.datatransfer.DataFlavor#DataFlavor(java.lang.String,java.lang.String,java.lang.ClassLoader)
     * public java.awt.datatransfer.DataFlavor(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     * java.lang.ClassNotFoundException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataFlavor_String_String_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.datatransfer.DataFlavor sut = null; // = new
                                                           // DataFlavor(java.lang.String,java.lang.String,java.lang.ClassLoader);
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.DataFlavor#getTextPlainUnicodeFlavor() public static final
     * java.awt.datatransfer.DataFlavor java.awt.datatransfer.DataFlavor.getTextPlainUnicodeFlavor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTextPlainUnicodeFlavor()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.DataFlavor#selectBestTextFlavor(java.awt.datatransfer.DataFlavor[])
     * public static final java.awt.datatransfer.DataFlavor
     * java.awt.datatransfer.DataFlavor.selectBestTextFlavor(java.awt.datatransfer.DataFlavor[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_selectBestTextFlavor_DataFlavorArray()
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
        assertTrue(java.awt.datatransfer.DataFlavor.class.isAssignableFrom(sut));
    }

}
