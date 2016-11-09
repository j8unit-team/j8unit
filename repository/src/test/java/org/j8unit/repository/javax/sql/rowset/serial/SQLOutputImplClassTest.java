package org.j8unit.repository.javax.sql.rowset.serial;

import javax.sql.rowset.serial.SQLOutputImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SQLOutputImpl} (by simply reusing the
 * J8Unit test interface {@link SQLOutputImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class SQLOutputImplClassTest
implements SQLOutputImplClassTests<SQLOutputImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SQLOutputImpl]

    @Override
    public Class<SQLOutputImpl> createNewSUT() {
        return SQLOutputImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.serial.SQLOutputImpl#SQLOutputImpl(java.util.Vector, java.util.Map) public
     * javax.sql.rowset.serial.SQLOutputImpl(java.util.Vector<?>,java.util.Map<java.lang.String, ?>) throws
     * java.sql.SQLException}.
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
    public void create_SQLOutputImpl_Vector_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SQLOutputImpl sut = null; // = new SQLOutputImpl(java.util.Vector, java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.serial.SQLOutputImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SQLOutputImpl]

}
