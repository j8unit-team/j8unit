package org.j8unit.repository.org.omg.PortableInterceptor;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.InvalidSlot class org.omg.PortableInterceptor.InvalidSlot},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotTests}.
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
 * @see org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotTests
 */
@Category(J8UnitRepository.class)
public abstract interface InvalidSlotClassTests<SUT extends Class<? extends org.omg.PortableInterceptor.InvalidSlot>>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableInterceptor.InvalidSlot#InvalidSlot() public
     * org.omg.PortableInterceptor.InvalidSlot()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidSlot()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableInterceptor.InvalidSlot sut = null; // = new InvalidSlot();
    }

    /**
     * Test method for {@link org.omg.PortableInterceptor.InvalidSlot#InvalidSlot(java.lang.String) public
     * org.omg.PortableInterceptor.InvalidSlot(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InvalidSlot_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableInterceptor.InvalidSlot sut = null; // = new InvalidSlot(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableInterceptor.InvalidSlot> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableInterceptor.InvalidSlot.class.isAssignableFrom(sut));
    }

}
