package org.j8unit.repository.javax.print.attribute;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.attribute.HashPrintJobAttributeSet class
 * javax.print.attribute.HashPrintJobAttributeSet}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.print.attribute.HashPrintJobAttributeSetTests}.
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
 * @see org.j8unit.repository.javax.print.attribute.HashPrintJobAttributeSetTests
 */
@Category(J8UnitRepository.class)
public abstract interface HashPrintJobAttributeSetClassTests<SUT extends Class<? extends javax.print.attribute.HashPrintJobAttributeSet>>
extends org.j8unit.repository.javax.print.attribute.PrintJobAttributeSetClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.print.attribute.HashAttributeSetClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintJobAttributeSet#HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttributeSet)
     * public javax.print.attribute.HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttributeSet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintJobAttributeSet_PrintJobAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintJobAttributeSet sut = null; // = new
                                                                         // HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttributeSet);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintJobAttributeSet#HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute[])
     * public javax.print.attribute.HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintJobAttributeSet_PrintJobAttributeArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintJobAttributeSet sut = null; // = new
                                                                         // HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute[]);
    }

    /**
     * Test method for
     * {@link javax.print.attribute.HashPrintJobAttributeSet#HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute)
     * public javax.print.attribute.HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintJobAttributeSet_PrintJobAttribute()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintJobAttributeSet sut = null; // = new
                                                                         // HashPrintJobAttributeSet(javax.print.attribute.PrintJobAttribute);
    }

    /**
     * Test method for {@link javax.print.attribute.HashPrintJobAttributeSet#HashPrintJobAttributeSet() public
     * javax.print.attribute.HashPrintJobAttributeSet()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HashPrintJobAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.HashPrintJobAttributeSet sut = null; // = new HashPrintJobAttributeSet();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.print.attribute.HashPrintJobAttributeSet> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.HashPrintJobAttributeSet.class.isAssignableFrom(sut));
    }

}
