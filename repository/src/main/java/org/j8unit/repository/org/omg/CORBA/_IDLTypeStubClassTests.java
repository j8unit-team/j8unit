package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA._IDLTypeStub class org.omg.CORBA._IDLTypeStub},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA._IDLTypeStubTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA._IDLTypeStubTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA._IDLTypeStub
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _IDLTypeStubClassTests<SUT extends org.omg.CORBA._IDLTypeStub>
extends org.j8unit.repository.org.omg.CORBA.IDLTypeClassTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.ObjectImplClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA._IDLTypeStub#_IDLTypeStub() public org.omg.CORBA._IDLTypeStub()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA._IDLTypeStub#_IDLTypeStub()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create__IDLTypeStub()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA._IDLTypeStub sut = null; // = new _IDLTypeStub();
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA._IDLTypeStub#_IDLTypeStub(org.omg.CORBA.portable.Delegate) public
     * org.omg.CORBA._IDLTypeStub(org.omg.CORBA.portable.Delegate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA._IDLTypeStub#_IDLTypeStub(org.omg.CORBA.portable.Delegate)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create__IDLTypeStub_Delegate()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA._IDLTypeStub sut = null; // = new _IDLTypeStub(org.omg.CORBA.portable.Delegate);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim org.omg.CORBA._IDLTypeStub#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA._IDLTypeStub.class.isAssignableFrom(sut));
    }

}
