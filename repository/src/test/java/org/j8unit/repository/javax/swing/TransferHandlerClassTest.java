package org.j8unit.repository.javax.swing;

import java.awt.Component;
import java.awt.datatransfer.Transferable;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.TransferHandler.TransferSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferHandlerClassTest
implements org.j8unit.repository.javax.swing.TransferHandlerClassTests<TransferHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler]

    @Override
    public Class<TransferHandler> createNewSUT() {
        return TransferHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TransferHandler#TransferHandler(String) public
     * javax.swing.TransferHandler(java.lang.String)}.
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
     * Test method for the hereby targeted method-under-test {@link TransferHandler#getCutAction() public static
     * javax.swing.Action javax.swing.TransferHandler.getCutAction()}.
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
        // write some test for {@link TransferHandler#getCutAction()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TransferHandler#getCopyAction() public static
     * javax.swing.Action javax.swing.TransferHandler.getCopyAction()}.
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
        // write some test for {@link TransferHandler#getCopyAction()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TransferHandler#getPasteAction() public static
     * javax.swing.Action javax.swing.TransferHandler.getPasteAction()}.
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
        // write some test for {@link TransferHandler#getPasteAction()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler]

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler$DropLocation]

        @Override
        public Class<DropLocation> createNewSUT() {
            return DropLocation.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler$DropLocation]

    }

    @RunWith(J8Unit4.class)
    public static class TransferSupportClassTest
    implements org.j8unit.repository.javax.swing.TransferHandlerClassTests.TransferSupportClassTests<TransferSupport> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.TransferHandler$TransferSupport]

        @Override
        public Class<TransferSupport> createNewSUT() {
            return TransferSupport.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link TransferSupport#TransferSupport(Component, Transferable) public
         * javax.swing.TransferHandler$TransferSupport(java.awt.Component,java.awt.datatransfer.Transferable)}.
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
            final TransferSupport sut = null; // = new TransferSupport(Component, Transferable);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.TransferHandler$TransferSupport]

    }

}
