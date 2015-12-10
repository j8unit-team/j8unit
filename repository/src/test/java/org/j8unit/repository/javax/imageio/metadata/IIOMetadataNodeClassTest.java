package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOMetadataNodeClassTest
implements org.j8unit.repository.javax.imageio.metadata.IIOMetadataNodeClassTests<javax.imageio.metadata.IIOMetadataNode> {

    @Override
    public Class<javax.imageio.metadata.IIOMetadataNode> createNewSUT() {
        return javax.imageio.metadata.IIOMetadataNode.class;
    }

}
