package org.j8unit.repository.javax.swing;

import javax.swing.UIDefaults;
import javax.swing.UIDefaults.ActiveValue;
import javax.swing.UIDefaults.LazyInputMap;
import javax.swing.UIDefaults.LazyValue;
import javax.swing.UIDefaults.ProxyLazyValue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UIDefaults} (by simply reusing the J8Unit
 * test interface {@link UIDefaultsClassTests}).
 */

@RunWith(J8Unit4.class)
public class UIDefaultsClassTest
implements UIDefaultsClassTests<UIDefaults> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.UIDefaults]

    @Override
    public Class<UIDefaults> createNewSUT() {
        return UIDefaults.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.UIDefaults#UIDefaults() public
     * javax.swing.UIDefaults()}.
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
    public void create_UIDefaults()
    throws Exception {
        // create new instance
        final UIDefaults sut = new UIDefaults();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.UIDefaults#UIDefaults(int, float)
     * public javax.swing.UIDefaults(int,float)}.
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
    public void create_UIDefaults_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UIDefaults sut = null; // = new UIDefaults(int, float);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.UIDefaults#UIDefaults(Object[])
     * public javax.swing.UIDefaults(java.lang.Object[])}.
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
    public void create_UIDefaults_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UIDefaults sut = null; // = new UIDefaults(Object[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.UIDefaults]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.UIDefaults]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link LazyInputMap} (by simply reusing the
     * J8Unit test interface {@link LazyInputMapClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LazyInputMapClassTest
    implements LazyInputMapClassTests<LazyInputMap> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.UIDefaults$LazyInputMap]

        @Override
        public Class<LazyInputMap> createNewSUT() {
            return LazyInputMap.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.UIDefaults.LazyInputMap#LazyInputMap(Object[]) public
         * javax.swing.UIDefaults$LazyInputMap(java.lang.Object[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_LazyInputMap_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final LazyInputMap sut = null; // = new LazyInputMap(Object[]);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.UIDefaults$LazyInputMap]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.UIDefaults$LazyInputMap]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ActiveValue} (by simply reusing the
     * J8Unit test interface {@link ActiveValueClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ActiveValueClassTest
    implements ActiveValueClassTests<ActiveValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.UIDefaults$ActiveValue]

        @Override
        public Class<ActiveValue> createNewSUT() {
            return ActiveValue.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.UIDefaults$ActiveValue]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.UIDefaults$ActiveValue]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link LazyValue} (by simply reusing the
     * J8Unit test interface {@link LazyValueClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LazyValueClassTest
    implements LazyValueClassTests<LazyValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.UIDefaults$LazyValue]

        @Override
        public Class<LazyValue> createNewSUT() {
            return LazyValue.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.UIDefaults$LazyValue]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.UIDefaults$LazyValue]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ProxyLazyValue} (by simply reusing
     * the J8Unit test interface {@link ProxyLazyValueClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ProxyLazyValueClassTest
    implements ProxyLazyValueClassTests<ProxyLazyValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.UIDefaults$ProxyLazyValue]

        @Override
        public Class<ProxyLazyValue> createNewSUT() {
            return ProxyLazyValue.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(String) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ProxyLazyValue_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ProxyLazyValue sut = null; // = new ProxyLazyValue(String);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(String, String) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ProxyLazyValue_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ProxyLazyValue sut = null; // = new ProxyLazyValue(String, String);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(String, Object[]) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.Object[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ProxyLazyValue_String_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ProxyLazyValue sut = null; // = new ProxyLazyValue(String, Object[]);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.UIDefaults.ProxyLazyValue#ProxyLazyValue(String, String, Object[]) public
         * javax.swing.UIDefaults$ProxyLazyValue(java.lang.String,java.lang.String,java.lang.Object[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_ProxyLazyValue_String_String_ObjectArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ProxyLazyValue sut = null; // = new ProxyLazyValue(String, String, Object[]);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.UIDefaults$ProxyLazyValue]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.UIDefaults$ProxyLazyValue]

    }

}
