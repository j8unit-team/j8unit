package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOMetadataFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOMetadataFormat} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.metadata.IIOMetadataFormatTests}).
 */

@RunWith(J8Unit4.class)
public class IIOMetadataFormatTest
implements IIOMetadataFormatTests<IIOMetadataFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataFormat]

    @Override
    public IIOMetadataFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.metadata.IIOMetadataFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.metadata.IIOMetadataFormat]

}
