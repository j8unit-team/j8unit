package org.j8unit.repository.javax.script;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.script.ScriptException class javax.script.ScriptException}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.script.ScriptExceptionTests}.
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
 * @see org.j8unit.repository.javax.script.ScriptExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface ScriptExceptionClassTests<SUT extends Class<? extends javax.script.ScriptException>>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * Test method for {@link javax.script.ScriptException#ScriptException(java.lang.String,java.lang.String,int,int)
     * public javax.script.ScriptException(java.lang.String,java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ScriptException_String_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.script.ScriptException sut = null; // = new
                                                       // ScriptException(java.lang.String,java.lang.String,int,int);
    }

    /**
     * Test method for {@link javax.script.ScriptException#ScriptException(java.lang.String,java.lang.String,int) public
     * javax.script.ScriptException(java.lang.String,java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ScriptException_String_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.script.ScriptException sut = null; // = new ScriptException(java.lang.String,java.lang.String,int);
    }

    /**
     * Test method for {@link javax.script.ScriptException#ScriptException(java.lang.Exception) public
     * javax.script.ScriptException(java.lang.Exception)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ScriptException_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.script.ScriptException sut = null; // = new ScriptException(java.lang.Exception);
    }

    /**
     * Test method for {@link javax.script.ScriptException#ScriptException(java.lang.String) public
     * javax.script.ScriptException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ScriptException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.script.ScriptException sut = null; // = new ScriptException(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.script.ScriptException> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.script.ScriptException.class.isAssignableFrom(sut));
    }

}
