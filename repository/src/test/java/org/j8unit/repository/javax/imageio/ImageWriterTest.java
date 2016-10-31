package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriterTest
implements org.j8unit.repository.javax.imageio.ImageWriterTests<ImageWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.ImageWriter]

    @Override
    public ImageWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.ImageWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.ImageWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.ImageWriter]

}
