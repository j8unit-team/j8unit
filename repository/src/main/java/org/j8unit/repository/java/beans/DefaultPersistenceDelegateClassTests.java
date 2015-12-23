package org.j8unit.repository.java.beans;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.DefaultPersistenceDelegate class
 * java.beans.DefaultPersistenceDelegate}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.beans.DefaultPersistenceDelegateTests}.
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
 * @see org.j8unit.repository.java.beans.DefaultPersistenceDelegateTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.DefaultPersistenceDelegate
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultPersistenceDelegateClassTests<SUT extends java.beans.DefaultPersistenceDelegate>
extends org.j8unit.repository.java.beans.PersistenceDelegateClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate() public
     * java.beans.DefaultPersistenceDelegate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultPersistenceDelegate()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.DefaultPersistenceDelegate sut = null; // = new DefaultPersistenceDelegate();
    }

    /**
     * <p>
     * Test method for {@link java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate(java.lang.String[])
     * public java.beans.DefaultPersistenceDelegate(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate(java.lang.String[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultPersistenceDelegate_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.DefaultPersistenceDelegate sut = null; // = new DefaultPersistenceDelegate(java.lang.String[]);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.beans.DefaultPersistenceDelegate#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.DefaultPersistenceDelegate.class.isAssignableFrom(sut));
    }

}
