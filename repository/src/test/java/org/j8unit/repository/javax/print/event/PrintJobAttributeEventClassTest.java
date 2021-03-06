package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobAttributeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobAttributeEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.print.event.PrintJobAttributeEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintJobAttributeEventClassTest
implements PrintJobAttributeEventClassTests<PrintJobAttributeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobAttributeEvent]

    @Override
    public Class<PrintJobAttributeEvent> createNewSUT() {
        return PrintJobAttributeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.event.PrintJobAttributeEvent#PrintJobAttributeEvent(javax.print.DocPrintJob, javax.print.attribute.PrintJobAttributeSet)
     * public
     * javax.print.event.PrintJobAttributeEvent(javax.print.DocPrintJob,javax.print.attribute.PrintJobAttributeSet)}.
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
    public void create_PrintJobAttributeEvent_DocPrintJob_PrintJobAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintJobAttributeEvent sut = null; // = new PrintJobAttributeEvent(javax.print.DocPrintJob,
                                                 // javax.print.attribute.PrintJobAttributeSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobAttributeEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobAttributeEvent]

}
