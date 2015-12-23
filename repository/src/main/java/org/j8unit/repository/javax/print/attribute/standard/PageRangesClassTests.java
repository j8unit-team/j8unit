package org.j8unit.repository.javax.print.attribute.standard;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.PageRanges class
 * javax.print.attribute.standard.PageRanges}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.print.attribute.standard.PageRangesTests}.
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
 * @see org.j8unit.repository.javax.print.attribute.standard.PageRangesTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.standard.PageRanges
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PageRangesClassTests<SUT extends javax.print.attribute.standard.PageRanges>
extends org.j8unit.repository.javax.print.attribute.DocAttributeClassTests<SUT>,
org.j8unit.repository.javax.print.attribute.PrintRequestAttributeClassTests<SUT>, org.j8unit.repository.javax.print.attribute.PrintJobAttributeClassTests<SUT>,
org.j8unit.repository.javax.print.attribute.SetOfIntegerSyntaxClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int) public
     * javax.print.attribute.standard.PageRanges(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PageRanges#PageRanges(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int, int) public
     * javax.print.attribute.standard.PageRanges(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PageRanges#PageRanges(int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int, int);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(int[][]) public
     * javax.print.attribute.standard.PageRanges(int[][])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PageRanges#PageRanges(int[][])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_intArrayArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(int[][]);
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PageRanges#PageRanges(java.lang.String) public
     * javax.print.attribute.standard.PageRanges(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PageRanges#PageRanges(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PageRanges_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.print.attribute.standard.PageRanges sut = null; // = new PageRanges(java.lang.String);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.print.attribute.standard.PageRanges#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.standard.PageRanges.class.isAssignableFrom(sut));
    }

}
