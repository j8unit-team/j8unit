package org.j8unit.repository.javax.print.event;

import javax.print.event.PrintServiceAttributeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeEventClassTest
implements org.j8unit.repository.javax.print.event.PrintServiceAttributeEventClassTests<PrintServiceAttributeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintServiceAttributeEvent]

    @Override
    public Class<PrintServiceAttributeEvent> createNewSUT() {
        return PrintServiceAttributeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.event.PrintServiceAttributeEvent#PrintServiceAttributeEvent(javax.print.PrintService, javax.print.attribute.PrintServiceAttributeSet)
     * public
     * javax.print.event.PrintServiceAttributeEvent(javax.print.PrintService,javax.print.attribute.PrintServiceAttributeSet)}.
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
    public void create_PrintServiceAttributeEvent_PrintService_PrintServiceAttributeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrintServiceAttributeEvent sut = null; // = new PrintServiceAttributeEvent(javax.print.PrintService,
                                                     // javax.print.attribute.PrintServiceAttributeSet);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintServiceAttributeEvent]

}
