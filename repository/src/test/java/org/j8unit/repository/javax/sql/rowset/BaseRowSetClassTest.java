package org.j8unit.repository.javax.sql.rowset;

import static org.junit.Assert.fail;
import javax.sql.rowset.BaseRowSet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BaseRowSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.BaseRowSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class BaseRowSetClassTest
implements BaseRowSetClassTests<BaseRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.BaseRowSet]

    @Override
    public Class<BaseRowSet> createNewSUT() {
        return BaseRowSet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sql.rowset.BaseRowSet#BaseRowSet() public
     * javax.sql.rowset.BaseRowSet()}.
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
    public void create_BaseRowSet()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.BaseRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.BaseRowSet]

}
