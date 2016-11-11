package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.IIOByteBuffer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOByteBuffer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.stream.IIOByteBufferClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOByteBufferClassTest
implements IIOByteBufferClassTests<IIOByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.IIOByteBuffer]

    @Override
    public Class<IIOByteBuffer> createNewSUT() {
        return IIOByteBuffer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.IIOByteBuffer#IIOByteBuffer(byte[], int, int) public
     * javax.imageio.stream.IIOByteBuffer(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_IIOByteBuffer_byteArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOByteBuffer sut = null; // = new IIOByteBuffer(byte[], int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.IIOByteBuffer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.IIOByteBuffer]

}
