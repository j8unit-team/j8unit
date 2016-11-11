package org.j8unit.repository.javax.sql;

import javax.sql.RowSetEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetEventClassTest
implements RowSetEventClassTests<RowSetEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetEvent]

    @Override
    public Class<RowSetEvent> createNewSUT() {
        return RowSetEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.RowSetEvent#RowSetEvent(javax.sql.RowSet) public javax.sql.RowSetEvent(javax.sql.RowSet)}.
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
    public void create_RowSetEvent_RowSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RowSetEvent sut = null; // = new RowSetEvent(javax.sql.RowSet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetEvent]

}
