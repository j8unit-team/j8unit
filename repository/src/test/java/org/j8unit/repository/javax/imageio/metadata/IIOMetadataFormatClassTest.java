package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOMetadataFormatClassTest
implements org.j8unit.repository.javax.imageio.metadata.IIOMetadataFormatClassTests<javax.imageio.metadata.IIOMetadataFormat> {

    @Override
    public Class<javax.imageio.metadata.IIOMetadataFormat> createNewSUT() {
        return javax.imageio.metadata.IIOMetadataFormat.class;
    }

}
