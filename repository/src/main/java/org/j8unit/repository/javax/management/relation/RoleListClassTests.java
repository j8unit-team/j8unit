package org.j8unit.repository.javax.management.relation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.relation.RoleList class javax.management.relation.RoleList}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.relation.RoleListTests}.
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
 * @see org.j8unit.repository.javax.management.relation.RoleListTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RoleListClassTests<SUT extends Class<? extends javax.management.relation.RoleList>>
extends org.j8unit.repository.java.util.ArrayListClassTests<SUT, java.lang.Object> {

    /**
     * Test method for {@link javax.management.relation.RoleList#RoleList() public javax.management.relation.RoleList()}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RoleList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.relation.RoleList sut = null; // = new RoleList();
    }

    /**
     * Test method for {@link javax.management.relation.RoleList#RoleList(int) public
     * javax.management.relation.RoleList(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RoleList_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.relation.RoleList sut = null; // = new RoleList(int);
    }

    /**
     * Test method for {@link javax.management.relation.RoleList#RoleList(java.util.List) public
     * javax.management.relation.RoleList(java.util.List) throws java.lang.IllegalArgumentException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RoleList_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.relation.RoleList sut = null; // = new RoleList(java.util.List);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.management.relation.RoleList> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.relation.RoleList.class.isAssignableFrom(sut));
    }

}
