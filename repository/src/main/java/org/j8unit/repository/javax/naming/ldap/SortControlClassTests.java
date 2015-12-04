package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.naming.ldap.SortControl class javax.naming.ldap.SortControl},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.naming.ldap.SortControlTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.ldap.SortControlTests
 */
@Category(J8UnitRepository.class)
public abstract interface SortControlClassTests<SUT extends Class<? extends javax.naming.ldap.SortControl>>
extends org.j8unit.repository.javax.naming.ldap.BasicControlClassTests<SUT>
{

    /**
     * Test method for {@link javax.naming.ldap.SortControl#SortControl(javax.naming.ldap.SortKey[],boolean) public javax.naming.ldap.SortControl(javax.naming.ldap.SortKey[],boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SortControl_SortKeyArray_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.naming.ldap.SortControl sut = null; // = new SortControl(javax.naming.ldap.SortKey[],boolean);
    }

    /**
     * Test method for {@link javax.naming.ldap.SortControl#SortControl(java.lang.String[],boolean) public javax.naming.ldap.SortControl(java.lang.String[],boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SortControl_StringArray_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.naming.ldap.SortControl sut = null; // = new SortControl(java.lang.String[],boolean);
    }

    /**
     * Test method for {@link javax.naming.ldap.SortControl#SortControl(java.lang.String,boolean) public javax.naming.ldap.SortControl(java.lang.String,boolean) throws java.io.IOException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SortControl_String_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.naming.ldap.SortControl sut = null; // = new SortControl(java.lang.String,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.naming.ldap.SortControl> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.naming.ldap.SortControl.class.isAssignableFrom(sut));
    }

}
