package org.j8unit.repository.javax.activity;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.activity.ActivityCompletedException class
 * javax.activity.ActivityCompletedException}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.activity.ActivityCompletedExceptionTests}.
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
 * @see org.j8unit.repository.javax.activity.ActivityCompletedExceptionTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.activity.ActivityCompletedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivityCompletedExceptionClassTests<SUT extends javax.activity.ActivityCompletedException>
extends org.j8unit.repository.java.rmi.RemoteExceptionClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activity.ActivityCompletedException#ActivityCompletedException() public
     * javax.activity.ActivityCompletedException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activity.ActivityCompletedException#ActivityCompletedException()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivityCompletedException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activity.ActivityCompletedException sut = null; // = new ActivityCompletedException();
    }

    /**
     * <p>
     * Test method for {@link javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.String)
     * public javax.activity.ActivityCompletedException(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivityCompletedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activity.ActivityCompletedException sut = null; // = new
                                                                    // ActivityCompletedException(java.lang.String);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.String, java.lang.Throwable)
     * public javax.activity.ActivityCompletedException(java.lang.String,java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.String,
     *             java.lang.Throwable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivityCompletedException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activity.ActivityCompletedException sut = null; // = new
                                                                    // ActivityCompletedException(java.lang.String,
                                                                    // java.lang.Throwable);
    }

    /**
     * <p>
     * Test method for {@link javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.Throwable)
     * public javax.activity.ActivityCompletedException(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activity.ActivityCompletedException#ActivityCompletedException(java.lang.Throwable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivityCompletedException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activity.ActivityCompletedException sut = null; // = new
                                                                    // ActivityCompletedException(java.lang.Throwable);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.activity.ActivityCompletedException#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.activity.ActivityCompletedException.class.isAssignableFrom(sut));
    }

}
