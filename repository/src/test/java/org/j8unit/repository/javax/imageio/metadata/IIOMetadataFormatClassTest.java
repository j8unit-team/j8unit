package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadataFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOMetadataFormat} (by simply reusing the
 * J8Unit test interface {@link IIOMetadataFormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOMetadataFormatClassTest
implements IIOMetadataFormatClassTests<IIOMetadataFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormat]

    @Override
    public Class<IIOMetadataFormat> createNewSUT() {
        return IIOMetadataFormat.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormat]

}
