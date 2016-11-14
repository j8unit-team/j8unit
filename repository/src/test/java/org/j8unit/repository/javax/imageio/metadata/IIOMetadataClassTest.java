package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadata;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOMetadata} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.metadata.IIOMetadataClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOMetadataClassTest
implements IIOMetadataClassTests<IIOMetadata> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.metadata.IIOMetadata]

    @Override
    public Class<IIOMetadata> createNewSUT() {
        return IIOMetadata.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.metadata.IIOMetadata]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.metadata.IIOMetadata]

}
