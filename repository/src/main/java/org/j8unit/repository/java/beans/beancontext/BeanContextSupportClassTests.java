package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextSupport class java.beans.beancontext.BeanContextSupport},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.beans.beancontext.BeanContextSupportTests}.
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
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextSupportTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextSupportClassTests<SUT extends Class<? extends java.beans.beancontext.BeanContextSupport>>
extends org.j8unit.repository.java.beans.beancontext.BeanContextClassTests<SUT>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>,
        org.j8unit.repository.java.beans.VetoableChangeListenerClassTests<SUT>,
        org.j8unit.repository.java.beans.beancontext.BeanContextChildSupportClassTests<SUT>
{

    /**
     * Test method for {@link java.beans.beancontext.BeanContextSupport#BeanContextSupport() public java.beans.beancontext.BeanContextSupport()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextSupport() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.beancontext.BeanContextSupport sut = null; // = new BeanContextSupport();
    }

    /**
     * Test method for {@link java.beans.beancontext.BeanContextSupport#BeanContextSupport(java.beans.beancontext.BeanContext) public java.beans.beancontext.BeanContextSupport(java.beans.beancontext.BeanContext)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextSupport_BeanContext() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.beancontext.BeanContextSupport sut = null; // = new BeanContextSupport(java.beans.beancontext.BeanContext);
    }

    /**
     * Test method for {@link java.beans.beancontext.BeanContextSupport#BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale) public java.beans.beancontext.BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextSupport_BeanContext_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.beancontext.BeanContextSupport sut = null; // = new BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale);
    }

    /**
     * Test method for {@link java.beans.beancontext.BeanContextSupport#BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean) public java.beans.beancontext.BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextSupport_BeanContext_Locale_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.beancontext.BeanContextSupport sut = null; // = new BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean);
    }

    /**
     * Test method for {@link java.beans.beancontext.BeanContextSupport#BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean,boolean) public java.beans.beancontext.BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextSupport_BeanContext_Locale_boolean_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.beans.beancontext.BeanContextSupport sut = null; // = new BeanContextSupport(java.beans.beancontext.BeanContext,java.util.Locale,boolean,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.beans.beancontext.BeanContextSupport> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.beancontext.BeanContextSupport.class.isAssignableFrom(sut));
    }

}
