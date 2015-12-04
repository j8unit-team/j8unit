package org.j8unit.repository.java.beans;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.EventHandler class java.beans.EventHandler}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.beans.EventHandlerTests}.
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
 * @see org.j8unit.repository.java.beans.EventHandlerTests
 */
@Category(J8UnitRepository.class)
public abstract interface EventHandlerClassTests<SUT extends Class<? extends java.beans.EventHandler>>
extends org.j8unit.repository.java.lang.reflect.InvocationHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for
     * {@link java.beans.EventHandler#EventHandler(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)
     * public java.beans.EventHandler(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_EventHandler_Object_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.EventHandler sut = null; // = new
                                                  // EventHandler(java.lang.Object,java.lang.String,java.lang.String,java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.beans.EventHandler#create(java.lang.Class,java.lang.Object,java.lang.String) public
     * static java.lang.Object java.beans.EventHandler.create(java.lang.Class,java.lang.Object,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Class_Object_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.EventHandler#create(java.lang.Class,java.lang.Object,java.lang.String,java.lang.String) public
     * static java.lang.Object
     * java.beans.EventHandler.create(java.lang.Class,java.lang.Object,java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Class_Object_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.EventHandler#create(java.lang.Class,java.lang.Object,java.lang.String,java.lang.String,java.lang.String)
     * public static java.lang.Object
     * java.beans.EventHandler.create(java.lang.Class,java.lang.Object,java.lang.String,java.lang.String,java.lang.String)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Class_Object_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.beans.EventHandler> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.EventHandler.class.isAssignableFrom(sut));
    }

}
