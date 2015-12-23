package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.metadata.IIOInvalidTreeException class
 * javax.imageio.metadata.IIOInvalidTreeException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.imageio.metadata.IIOInvalidTreeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.metadata.IIOInvalidTreeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.metadata.IIOInvalidTreeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOInvalidTreeExceptionTests<SUT extends javax.imageio.metadata.IIOInvalidTreeException>
extends org.j8unit.repository.javax.imageio.IIOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.metadata.IIOInvalidTreeException#getOffendingNode() public org.w3c.dom.Node
     * javax.imageio.metadata.IIOInvalidTreeException.getOffendingNode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.metadata.IIOInvalidTreeException#getOffendingNode()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffendingNode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
