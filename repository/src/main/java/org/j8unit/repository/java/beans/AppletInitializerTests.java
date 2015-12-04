package org.j8unit.repository.java.beans;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.AppletInitializer interface java.beans.AppletInitializer}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.AppletInitializerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AppletInitializerTests<SUT extends java.beans.AppletInitializer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.AppletInitializer#activate(java.applet.Applet) public abstract void
     * java.beans.AppletInitializer.activate(java.applet.Applet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_Applet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.AppletInitializer#initialize(java.applet.Applet,java.beans.beancontext.BeanContext) public
     * abstract void java.beans.AppletInitializer.initialize(java.applet.Applet,java.beans.beancontext.BeanContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_Applet_BeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
