package org.j8unit.repository.javax.swing;

import javax.swing.TransferHandler;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.TransferHandler.TransferSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransferHandler} (by simply reusing the
 * J8Unit test interface {@link TransferHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransferHandlerClassTest
implements TransferHandlerClassTests<TransferHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler]

    @Override
    public Class<TransferHandler> createNewSUT() {
        return TransferHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.TransferHandler#TransferHandler(String) public javax.swing.TransferHandler(java.lang.String)}.
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
    public void create_TransferHandler_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TransferHandler sut = null; // = new TransferHandler(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.TransferHandler#getCutAction() public
     * static javax.swing.Action javax.swing.TransferHandler.getCutAction()}.
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
    public void test_getCutAction()
    throws Exception {
        // write some test for {@link javax.swing.TransferHandler#getCutAction()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.TransferHandler#getCopyAction() public
     * static javax.swing.Action javax.swing.TransferHandler.getCopyAction()}.
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
    public void test_getCopyAction()
    throws Exception {
        // write some test for {@link javax.swing.TransferHandler#getCopyAction()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.TransferHandler#getPasteAction() public
     * static javax.swing.Action javax.swing.TransferHandler.getPasteAction()}.
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
    public void test_getPasteAction()
    throws Exception {
        // write some test for {@link javax.swing.TransferHandler#getPasteAction()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.TransferHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DropLocation} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler$DropLocation]

        @Override
        public Class<DropLocation> createNewSUT() {
            return DropLocation.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.TransferHandler$DropLocation]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler$DropLocation]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link TransferSupport} (by simply reusing
     * the J8Unit test interface {@link TransferSupportClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TransferSupportClassTest
    implements TransferSupportClassTests<TransferSupport> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler$TransferSupport]

        @Override
        public Class<TransferSupport> createNewSUT() {
            return TransferSupport.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.TransferHandler.TransferSupport#TransferSupport(java.awt.Component, java.awt.datatransfer.Transferable)
         * public javax.swing.TransferHandler$TransferSupport(java.awt.Component,java.awt.datatransfer.Transferable)}.
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
        public void create_TransferSupport_Component_Transferable()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final TransferSupport sut = null; // = new TransferSupport(java.awt.Component,
                                              // java.awt.datatransfer.Transferable);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.TransferHandler$TransferSupport]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler$TransferSupport]

    }

}
