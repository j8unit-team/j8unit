package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintEventClassTest
implements org.j8unit.repository.javax.print.event.PrintEventClassTests<PrintEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintEvent]

    @Override
    public Class<PrintEvent> createNewSUT() {
        return PrintEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PrintEvent#PrintEvent(Object) public
     * javax.print.event.PrintEvent(java.lang.Object)}.
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
    public void create_PrintEvent_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintEvent sut = null; // = new PrintEvent(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintEvent]

}
