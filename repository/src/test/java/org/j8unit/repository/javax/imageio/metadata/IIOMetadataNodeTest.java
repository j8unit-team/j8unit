package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOMetadataNodeTest
implements org.j8unit.repository.javax.imageio.metadata.IIOMetadataNodeTests<javax.imageio.metadata.IIOMetadataNode> {

    @Override
    public javax.imageio.metadata.IIOMetadataNode createNewSUT() {
        return new javax.imageio.metadata.IIOMetadataNode();
    }

}
