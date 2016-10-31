package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.FileCacheImageInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileCacheImageInputStreamTest
implements org.j8unit.repository.javax.imageio.stream.FileCacheImageInputStreamTests<FileCacheImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.FileCacheImageInputStream]

    @Override
    public FileCacheImageInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.stream.FileCacheImageInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.stream.FileCacheImageInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.stream.FileCacheImageInputStream]

}
