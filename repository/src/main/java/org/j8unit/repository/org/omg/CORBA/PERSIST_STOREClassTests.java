package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.PERSIST_STORE class org.omg.CORBA.PERSIST_STORE},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.org.omg.CORBA.PERSIST_STORETests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.PERSIST_STORETests
 */
@Category(J8UnitRepository.class)
public abstract interface PERSIST_STOREClassTests<SUT extends Class<? extends org.omg.CORBA.PERSIST_STORE>>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests<SUT>
{

    /**
     * Test method for {@link org.omg.CORBA.PERSIST_STORE#PERSIST_STORE(java.lang.String,int,org.omg.CORBA.CompletionStatus) public org.omg.CORBA.PERSIST_STORE(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PERSIST_STORE_String_int_CompletionStatus() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.CORBA.PERSIST_STORE sut = null; // = new PERSIST_STORE(java.lang.String,int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.PERSIST_STORE#PERSIST_STORE(int,org.omg.CORBA.CompletionStatus) public org.omg.CORBA.PERSIST_STORE(int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PERSIST_STORE_int_CompletionStatus() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.CORBA.PERSIST_STORE sut = null; // = new PERSIST_STORE(int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.PERSIST_STORE#PERSIST_STORE(java.lang.String) public org.omg.CORBA.PERSIST_STORE(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PERSIST_STORE_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.CORBA.PERSIST_STORE sut = null; // = new PERSIST_STORE(java.lang.String);
    }

    /**
     * Test method for {@link org.omg.CORBA.PERSIST_STORE#PERSIST_STORE() public org.omg.CORBA.PERSIST_STORE()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PERSIST_STORE() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        org.omg.CORBA.PERSIST_STORE sut = null; // = new PERSIST_STORE();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends org.omg.CORBA.PERSIST_STORE> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.PERSIST_STORE.class.isAssignableFrom(sut));
    }

}
