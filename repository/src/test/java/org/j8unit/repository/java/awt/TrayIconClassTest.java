package org.j8unit.repository.java.awt;

import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TrayIcon} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.TrayIconClassTests}).
 */
@RunWith(J8Unit4.class)
public class TrayIconClassTest
implements TrayIconClassTests<TrayIcon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.TrayIcon]

    @Override
    public Class<TrayIcon> createNewSUT() {
        return TrayIcon.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.TrayIcon#TrayIcon(java.awt.Image, String, java.awt.PopupMenu) public
     * java.awt.TrayIcon(java.awt.Image,java.lang.String,java.awt.PopupMenu)}.
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
    public void create_TrayIcon_Image_String_PopupMenu()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrayIcon sut = null; // = new TrayIcon(java.awt.Image, String, java.awt.PopupMenu);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.TrayIcon#TrayIcon(java.awt.Image, String) public
     * java.awt.TrayIcon(java.awt.Image,java.lang.String)}.
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
    public void create_TrayIcon_Image_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrayIcon sut = null; // = new TrayIcon(java.awt.Image, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.TrayIcon#TrayIcon(java.awt.Image)
     * public java.awt.TrayIcon(java.awt.Image)}.
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
    public void create_TrayIcon_Image()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TrayIcon sut = null; // = new TrayIcon(java.awt.Image);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.TrayIcon]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.TrayIcon]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MessageType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.TrayIconClassTests.MessageTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class MessageTypeClassTest
    implements MessageTypeClassTests<MessageType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.TrayIcon$MessageType]

        @Override
        public Class<MessageType> createNewSUT() {
            return MessageType.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.awt.TrayIcon.MessageType#values() public
         * static java.awt.TrayIcon$MessageType[] java.awt.TrayIcon$MessageType.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link java.awt.TrayIcon.MessageType#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.awt.TrayIcon.MessageType#valueOf(String)
         * public static java.awt.TrayIcon$MessageType java.awt.TrayIcon$MessageType.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.awt.TrayIcon.MessageType#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.TrayIcon$MessageType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.TrayIcon$MessageType]

    }

}
