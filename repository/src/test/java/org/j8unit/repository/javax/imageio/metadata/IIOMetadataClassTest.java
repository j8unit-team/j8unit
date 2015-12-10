package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOMetadataClassTest
implements org.j8unit.repository.javax.imageio.metadata.IIOMetadataClassTests<javax.imageio.metadata.IIOMetadata> {

    @Override
    public Class<javax.imageio.metadata.IIOMetadata> createNewSUT() {
        return javax.imageio.metadata.IIOMetadata.class;
    }

}
