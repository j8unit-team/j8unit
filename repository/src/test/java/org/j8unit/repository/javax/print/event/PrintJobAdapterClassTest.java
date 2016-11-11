package org.j8unit.repository.javax.print.event;

import static org.junit.Assert.fail;
import javax.print.event.PrintJobAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.event.PrintJobAdapterClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAdapterClassTest
implements PrintJobAdapterClassTests<PrintJobAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.event.PrintJobAdapter]

    @Override
    public Class<PrintJobAdapter> createNewSUT() {
        return PrintJobAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.event.PrintJobAdapter#PrintJobAdapter() public javax.print.event.PrintJobAdapter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_PrintJobAdapter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.event.PrintJobAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.event.PrintJobAdapter]

}
