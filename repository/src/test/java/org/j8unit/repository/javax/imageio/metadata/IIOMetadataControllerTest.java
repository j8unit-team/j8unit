package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadataController;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOMetadataController} (by simply
 * reusing the J8Unit test interface {@link IIOMetadataControllerTests}).
 */

@RunWith(J8Unit4.class)
public class IIOMetadataControllerTest
implements IIOMetadataControllerTests<IIOMetadataController> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataController]

    @Override
    public IIOMetadataController createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.metadata.IIOMetadataController], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataController]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataController]

}
