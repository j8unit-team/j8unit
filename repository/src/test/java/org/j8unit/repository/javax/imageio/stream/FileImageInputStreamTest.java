package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.FileImageInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileImageInputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.stream.FileImageInputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class FileImageInputStreamTest
implements FileImageInputStreamTests<FileImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.FileImageInputStream]

    @Override
    public FileImageInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.stream.FileImageInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.stream.FileImageInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.stream.FileImageInputStream]

}
