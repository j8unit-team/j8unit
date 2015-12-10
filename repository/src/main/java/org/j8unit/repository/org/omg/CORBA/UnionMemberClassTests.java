package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.UnionMember class org.omg.CORBA.UnionMember}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.UnionMemberTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.UnionMemberTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnionMemberClassTests<SUT extends org.omg.CORBA.UnionMember>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.UnionMember#UnionMember() public org.omg.CORBA.UnionMember()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UnionMember()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.UnionMember sut = null; // = new UnionMember();
    }

    /**
     * Test method for
     * {@link org.omg.CORBA.UnionMember#UnionMember(java.lang.String,org.omg.CORBA.Any,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType)
     * public
     * org.omg.CORBA.UnionMember(java.lang.String,org.omg.CORBA.Any,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UnionMember_String_Any_TypeCode_IDLType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.UnionMember sut = null; // = new
                                                    // UnionMember(java.lang.String,org.omg.CORBA.Any,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.UnionMember.class.isAssignableFrom(sut));
    }

}
