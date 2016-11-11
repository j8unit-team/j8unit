package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.RowSetMetaDataImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetMetaDataImpl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.RowSetMetaDataImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetMetaDataImplClassTest
implements RowSetMetaDataImplClassTests<RowSetMetaDataImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.RowSetMetaDataImpl]

    @Override
    public Class<RowSetMetaDataImpl> createNewSUT() {
        return RowSetMetaDataImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.RowSetMetaDataImpl#RowSetMetaDataImpl() public javax.sql.rowset.RowSetMetaDataImpl()}.
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
    public void create_RowSetMetaDataImpl()
    throws Exception {
        // create new instance
        final RowSetMetaDataImpl sut = new RowSetMetaDataImpl();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.RowSetMetaDataImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.RowSetMetaDataImpl]

}
