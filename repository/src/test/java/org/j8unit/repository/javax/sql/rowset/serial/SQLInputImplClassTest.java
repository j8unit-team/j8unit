package org.j8unit.repository.javax.sql.rowset.serial;

import java.util.Map;
import javax.sql.rowset.serial.SQLInputImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLInputImplClassTest
implements org.j8unit.repository.javax.sql.rowset.serial.SQLInputImplClassTests<SQLInputImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.serial.SQLInputImpl]

    @Override
    public Class<SQLInputImpl> createNewSUT() {
        return SQLInputImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SQLInputImpl#SQLInputImpl(Object[], Map) public
     * javax.sql.rowset.serial.SQLInputImpl(java.lang.Object[],java.util.Map<java.lang.String, java.lang.Class<?>>)
     * throws java.sql.SQLException}.
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
    public void create_SQLInputImpl_ObjectArray_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SQLInputImpl sut = null; // = new SQLInputImpl(Object[], Map);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.serial.SQLInputImpl]

}
