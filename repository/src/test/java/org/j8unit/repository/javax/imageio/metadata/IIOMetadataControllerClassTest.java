package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadataController;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOMetadataController} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.metadata.IIOMetadataControllerClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOMetadataControllerClassTest
implements IIOMetadataControllerClassTests<IIOMetadataController> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.metadata.IIOMetadataController]

    @Override
    public Class<IIOMetadataController> createNewSUT() {
        return IIOMetadataController.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.metadata.IIOMetadataController]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.metadata.IIOMetadataController]

}
