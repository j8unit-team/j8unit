package org.j8unit.repository.javax.print.attribute;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.attribute.HashPrintRequestAttributeSet class
 * javax.print.attribute.HashPrintRequestAttributeSet}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.print.attribute.HashPrintRequestAttributeSetTests}.
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
 * @see org.j8unit.repository.javax.print.attribute.HashPrintRequestAttributeSetTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HashPrintRequestAttributeSetClassTests<SUT extends javax.print.attribute.HashPrintRequestAttributeSet>
extends org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.print.attribute.HashAttributeSetClassTests<SUT> {

    /**
     * Test method for {@link javax.print.attribute.HashPrintRequestAttributeSet#HashPrintRequestAttributeSet() public
     * javax.print.attribute.HashPrintRequestAttributeSet()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintRequestAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintRequestAttributeSet sut = null; // = new HashPrintRequestAttributeSet();
    }

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintRequestAttributeSet#HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute)
     * public javax.print.attribute.HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintRequestAttributeSet_PrintRequestAttribute()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintRequestAttributeSet sut = null; // = new
                                                                             // HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintRequestAttributeSet#HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute[])
     * public javax.print.attribute.HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintRequestAttributeSet_PrintRequestAttributeArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintRequestAttributeSet sut = null; // = new
                                                                             // HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttribute[]);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintRequestAttributeSet#HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttributeSet)
     * public javax.print.attribute.HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttributeSet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintRequestAttributeSet_PrintRequestAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintRequestAttributeSet sut = null; // = new
                                                                             // HashPrintRequestAttributeSet(javax.print.attribute.PrintRequestAttributeSet);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.HashPrintRequestAttributeSet.class.isAssignableFrom(sut));
    }

}
