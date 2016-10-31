package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintJobEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobEventClassTest
implements org.j8unit.repository.javax.print.event.PrintJobEventClassTests<PrintJobEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobEvent]

    @Override
    public Class<PrintJobEvent> createNewSUT() {
        return PrintJobEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.event.PrintJobEvent#PrintJobEvent(javax.print.DocPrintJob, int) public
     * javax.print.event.PrintJobEvent(javax.print.DocPrintJob,int)}.
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
    public void create_PrintJobEvent_DocPrintJob_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintJobEvent sut = null; // = new PrintJobEvent(javax.print.DocPrintJob, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobEvent]

}
