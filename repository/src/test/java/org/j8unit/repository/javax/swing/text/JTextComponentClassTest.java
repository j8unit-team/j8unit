package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.JTextComponent;
import javax.swing.text.JTextComponent.AccessibleJTextComponent;
import javax.swing.text.JTextComponent.DropLocation;
import javax.swing.text.JTextComponent.KeyBinding;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JTextComponent} (by simply reusing the
 * J8Unit test interface {@link JTextComponentClassTests}).
 */

@RunWith(J8Unit4.class)
public class JTextComponentClassTest
implements JTextComponentClassTests<JTextComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.JTextComponent]

    @Override
    public Class<JTextComponent> createNewSUT() {
        return JTextComponent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.JTextComponent#JTextComponent() public javax.swing.text.JTextComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_JTextComponent()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.JTextComponent#loadKeymap(javax.swing.text.Keymap, javax.swing.text.JTextComponent.KeyBinding[], javax.swing.Action[])
     * public static void
     * javax.swing.text.JTextComponent.loadKeymap(javax.swing.text.Keymap,javax.swing.text.JTextComponent$KeyBinding[],javax.swing.Action[])}.
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
    public void test_loadKeymap_Keymap_KeyBindingArray_ActionArray()
    throws Exception {
        // write some test for {@link javax.swing.text.JTextComponent#loadKeymap(javax.swing.text.Keymap,
        // javax.swing.text.JTextComponent.KeyBinding[], javax.swing.Action[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.JTextComponent#addKeymap(String, javax.swing.text.Keymap) public static
     * javax.swing.text.Keymap javax.swing.text.JTextComponent.addKeymap(java.lang.String,javax.swing.text.Keymap)}.
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
    public void test_addKeymap_String_Keymap()
    throws Exception {
        // write some test for {@link javax.swing.text.JTextComponent#addKeymap(String, javax.swing.text.Keymap)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.JTextComponent#removeKeymap(String)
     * public static javax.swing.text.Keymap javax.swing.text.JTextComponent.removeKeymap(java.lang.String)}.
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
    public void test_removeKeymap_String()
    throws Exception {
        // write some test for {@link javax.swing.text.JTextComponent#removeKeymap(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.JTextComponent#getKeymap(String)
     * public static javax.swing.text.Keymap javax.swing.text.JTextComponent.getKeymap(java.lang.String)}.
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
    public void test_getKeymap_String()
    throws Exception {
        // write some test for {@link javax.swing.text.JTextComponent#getKeymap(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.JTextComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.JTextComponent]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DropLocation} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.JTextComponentClassTests.DropLocationClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentClassTests.DropLocationClassTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.JTextComponent$DropLocation]

        @Override
        public Class<DropLocation> createNewSUT() {
            return DropLocation.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.JTextComponent$DropLocation]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.JTextComponent$DropLocation]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeyBinding} (by simply reusing the
     * J8Unit test interface {@link KeyBindingClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyBindingClassTest
    implements KeyBindingClassTests<KeyBinding> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.JTextComponent$KeyBinding]

        @Override
        public Class<KeyBinding> createNewSUT() {
            return KeyBinding.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.JTextComponent.KeyBinding#KeyBinding(javax.swing.KeyStroke, String) public
         * javax.swing.text.JTextComponent$KeyBinding(javax.swing.KeyStroke,java.lang.String)}.
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
        public void create_KeyBinding_KeyStroke_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final KeyBinding sut = null; // = new KeyBinding(javax.swing.KeyStroke, String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.JTextComponent$KeyBinding]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.JTextComponent$KeyBinding]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleJTextComponent} (by simply
     * reusing the J8Unit test interface {@link AccessibleJTextComponentClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AccessibleJTextComponentClassTest
    implements AccessibleJTextComponentClassTests<AccessibleJTextComponent> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

        @Override
        public Class<AccessibleJTextComponent> createNewSUT() {
            return AccessibleJTextComponent.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.JTextComponent.AccessibleJTextComponent#AccessibleJTextComponent(javax.swing.text.JTextComponent)
         * public javax.swing.text.JTextComponent$AccessibleJTextComponent(javax.swing.text.JTextComponent)}.
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
        public void create_AccessibleJTextComponent_JTextComponent()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final AccessibleJTextComponent sut = null; // = new
                                                       // AccessibleJTextComponent(javax.swing.text.JTextComponent);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

    }

}
