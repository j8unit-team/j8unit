package org.j8unit.repository.javax.security.auth.callback;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.callback.ConfirmationCallback class
 * javax.security.auth.callback.ConfirmationCallback}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.callback.ConfirmationCallbackTests}.
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
 * @see org.j8unit.repository.javax.security.auth.callback.ConfirmationCallbackTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConfirmationCallbackClassTests<SUT extends javax.security.auth.callback.ConfirmationCallback>
extends org.j8unit.repository.javax.security.auth.callback.CallbackClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.security.auth.callback.ConfirmationCallback#ConfirmationCallback(int,int,int) public
     * javax.security.auth.callback.ConfirmationCallback(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConfirmationCallback_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.callback.ConfirmationCallback sut = null; // = new ConfirmationCallback(int,int,int);
    }

    /**
     * Test method for
     * {@link javax.security.auth.callback.ConfirmationCallback#ConfirmationCallback(int,java.lang.String[],int) public
     * javax.security.auth.callback.ConfirmationCallback(int,java.lang.String[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConfirmationCallback_int_StringArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.callback.ConfirmationCallback sut = null; // = new
                                                                            // ConfirmationCallback(int,java.lang.String[],int);
    }

    /**
     * Test method for
     * {@link javax.security.auth.callback.ConfirmationCallback#ConfirmationCallback(java.lang.String,int,int,int)
     * public javax.security.auth.callback.ConfirmationCallback(java.lang.String,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConfirmationCallback_String_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.callback.ConfirmationCallback sut = null; // = new
                                                                            // ConfirmationCallback(java.lang.String,int,int,int);
    }

    /**
     * Test method for
     * {@link javax.security.auth.callback.ConfirmationCallback#ConfirmationCallback(java.lang.String,int,java.lang.String[],int)
     * public javax.security.auth.callback.ConfirmationCallback(java.lang.String,int,java.lang.String[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConfirmationCallback_String_int_StringArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.callback.ConfirmationCallback sut = null; // = new
                                                                            // ConfirmationCallback(java.lang.String,int,java.lang.String[],int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.security.auth.callback.ConfirmationCallback.class.isAssignableFrom(sut));
    }

}
