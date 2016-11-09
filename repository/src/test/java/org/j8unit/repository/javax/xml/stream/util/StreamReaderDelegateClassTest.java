package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.StreamReaderDelegate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamReaderDelegate} (by simply reusing
 * the J8Unit test interface {@link StreamReaderDelegateClassTests}).
 */

@RunWith(J8Unit4.class)
public class StreamReaderDelegateClassTest
implements StreamReaderDelegateClassTests<StreamReaderDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.util.StreamReaderDelegate]

    @Override
    public Class<StreamReaderDelegate> createNewSUT() {
        return StreamReaderDelegate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.stream.util.StreamReaderDelegate#StreamReaderDelegate() public
     * javax.xml.stream.util.StreamReaderDelegate()}.
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
    public void create_StreamReaderDelegate()
    throws Exception {
        // create new instance
        final StreamReaderDelegate sut = new StreamReaderDelegate();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.stream.util.StreamReaderDelegate#StreamReaderDelegate(javax.xml.stream.XMLStreamReader) public
     * javax.xml.stream.util.StreamReaderDelegate(javax.xml.stream.XMLStreamReader)}.
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
    public void create_StreamReaderDelegate_XMLStreamReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StreamReaderDelegate sut = null; // = new StreamReaderDelegate(javax.xml.stream.XMLStreamReader);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.util.StreamReaderDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.util.StreamReaderDelegate]

}
