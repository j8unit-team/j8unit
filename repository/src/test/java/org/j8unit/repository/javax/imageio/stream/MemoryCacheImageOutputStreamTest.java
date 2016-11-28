package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.MemoryCacheImageOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MemoryCacheImageOutputStream} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.imageio.stream.MemoryCacheImageOutputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryCacheImageOutputStreamTest
implements MemoryCacheImageOutputStreamTests<MemoryCacheImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.MemoryCacheImageOutputStream]

    @Override
    public MemoryCacheImageOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.stream.MemoryCacheImageOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.stream.MemoryCacheImageOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.stream.MemoryCacheImageOutputStream]

}
