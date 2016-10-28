package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadataNode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOMetadataNodeClassTest
implements org.j8unit.repository.javax.imageio.metadata.IIOMetadataNodeClassTests<IIOMetadataNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.metadata.IIOMetadataNode]

    @Override
    public Class<IIOMetadataNode> createNewSUT() {
        return IIOMetadataNode.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.metadata.IIOMetadataNode#IIOMetadataNode() public javax.imageio.metadata.IIOMetadataNode()}.
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
    public void create_IIOMetadataNode()
    throws Exception {
        // create new instance
        final IIOMetadataNode sut = new IIOMetadataNode();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.metadata.IIOMetadataNode#IIOMetadataNode(String) public
     * javax.imageio.metadata.IIOMetadataNode(java.lang.String)}.
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
    public void create_IIOMetadataNode_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOMetadataNode sut = null; // = new IIOMetadataNode(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.metadata.IIOMetadataNode]

}
