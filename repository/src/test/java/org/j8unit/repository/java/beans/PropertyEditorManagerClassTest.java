package org.j8unit.repository.java.beans;

import java.beans.PropertyEditorManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyEditorManager} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.PropertyEditorManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyEditorManagerClassTest
implements PropertyEditorManagerClassTests<PropertyEditorManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyEditorManager]

    @Override
    public Class<PropertyEditorManager> createNewSUT() {
        return PropertyEditorManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyEditorManager#PropertyEditorManager() public java.beans.PropertyEditorManager()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PropertyEditorManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyEditorManager sut = new PropertyEditorManager();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.PropertyEditorManager#getEditorSearchPath() public static java.lang.String[]
     * java.beans.PropertyEditorManager.getEditorSearchPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getEditorSearchPath()
    throws Exception {
        // write some test for {@link java.beans.PropertyEditorManager#getEditorSearchPath()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.PropertyEditorManager#findEditor(Class)
     * public static java.beans.PropertyEditor java.beans.PropertyEditorManager.findEditor(java.lang.Class<?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_findEditor_Class()
    throws Exception {
        // write some test for {@link java.beans.PropertyEditorManager#findEditor(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.PropertyEditorManager#setEditorSearchPath(String[]) public static void
     * java.beans.PropertyEditorManager.setEditorSearchPath(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setEditorSearchPath_StringArray()
    throws Exception {
        // write some test for {@link java.beans.PropertyEditorManager#setEditorSearchPath(String[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.PropertyEditorManager#registerEditor(Class, Class) public static void
     * java.beans.PropertyEditorManager.registerEditor(java.lang.Class<?>,java.lang.Class<?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_registerEditor_Class_Class()
    throws Exception {
        // write some test for {@link java.beans.PropertyEditorManager#registerEditor(Class, Class)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.PropertyEditorManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyEditorManager]

}
