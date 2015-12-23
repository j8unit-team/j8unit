package org.j8unit.repository.java.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.text.Bidi class java.text.Bidi}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.text.BidiTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.text.BidiTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.text.Bidi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BidiClassTests<SUT extends java.text.Bidi>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.Bidi#Bidi(java.text.AttributedCharacterIterator) public
     * java.text.Bidi(java.text.AttributedCharacterIterator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Bidi#Bidi(java.text.AttributedCharacterIterator)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_AttributedCharacterIterator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.Bidi sut = null; // = new Bidi(java.text.AttributedCharacterIterator);
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#Bidi(char[], int, byte[], int, int, int) public
     * java.text.Bidi(char[],int,byte[],int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Bidi#Bidi(char[], int, byte[], int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_charArray_int_byteArray_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.Bidi sut = null; // = new Bidi(char[], int, byte[], int, int, int);
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#Bidi(java.lang.String, int) public java.text.Bidi(java.lang.String,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Bidi#Bidi(java.lang.String, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Bidi_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.Bidi sut = null; // = new Bidi(java.lang.String, int);
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#reorderVisually(byte[], int, java.lang.Object[], int, int) public static
     * void java.text.Bidi.reorderVisually(byte[],int,java.lang.Object[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Bidi#reorderVisually(byte[], int, java.lang.Object[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reorderVisually_byteArray_int_ObjectArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Bidi#requiresBidi(char[], int, int) public static boolean
     * java.text.Bidi.requiresBidi(char[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.Bidi#requiresBidi(char[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_requiresBidi_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.text.Bidi#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.Bidi.class.isAssignableFrom(sut));
    }

}
