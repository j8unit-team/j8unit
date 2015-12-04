package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.KeyboardFocusManager class java.awt.KeyboardFocusManager}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.KeyboardFocusManagerTests}.
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
 * @see org.j8unit.repository.java.awt.KeyboardFocusManagerTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyboardFocusManagerClassTests<SUT extends Class<? extends java.awt.KeyboardFocusManager>>
extends org.j8unit.repository.java.awt.KeyEventDispatcherClassTests<SUT>, org.j8unit.repository.java.awt.KeyEventPostProcessorClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.awt.KeyboardFocusManager#KeyboardFocusManager() public
     * java.awt.KeyboardFocusManager()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_KeyboardFocusManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.KeyboardFocusManager sut = null; // = new KeyboardFocusManager();
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getCurrentKeyboardFocusManager() public static
     * java.awt.KeyboardFocusManager java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentKeyboardFocusManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#setCurrentKeyboardFocusManager(java.awt.KeyboardFocusManager) public static
     * void java.awt.KeyboardFocusManager.setCurrentKeyboardFocusManager(java.awt.KeyboardFocusManager) throws
     * java.lang.SecurityException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCurrentKeyboardFocusManager_KeyboardFocusManager()
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
        final Class<? extends java.awt.KeyboardFocusManager> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.KeyboardFocusManager.class.isAssignableFrom(sut));
    }

}
