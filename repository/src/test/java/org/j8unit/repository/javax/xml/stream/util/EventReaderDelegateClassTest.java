package org.j8unit.repository.javax.xml.stream.util;

import javax.xml.stream.util.EventReaderDelegate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventReaderDelegate} (by simply reusing
 * the J8Unit test interface {@link EventReaderDelegateClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class EventReaderDelegateClassTest
implements EventReaderDelegateClassTests<EventReaderDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.util.EventReaderDelegate]

    @Override
    public Class<EventReaderDelegate> createNewSUT() {
        return EventReaderDelegate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.stream.util.EventReaderDelegate#EventReaderDelegate() public
     * javax.xml.stream.util.EventReaderDelegate()}.
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
    public void create_EventReaderDelegate()
    throws Exception {
        // create new instance
        final EventReaderDelegate sut = new EventReaderDelegate();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.stream.util.EventReaderDelegate#EventReaderDelegate(javax.xml.stream.XMLEventReader) public
     * javax.xml.stream.util.EventReaderDelegate(javax.xml.stream.XMLEventReader)}.
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
    public void create_EventReaderDelegate_XMLEventReader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EventReaderDelegate sut = null; // = new EventReaderDelegate(javax.xml.stream.XMLEventReader);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.util.EventReaderDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.util.EventReaderDelegate]

}
