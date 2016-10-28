package org.j8unit.repository.javax.sql.rowset.spi;

import static org.junit.Assert.fail;
import javax.sql.rowset.spi.SyncProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncProviderClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncProviderClassTests<SyncProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.SyncProvider]

    @Override
    public Class<SyncProvider> createNewSUT() {
        return SyncProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SyncProvider#SyncProvider() public
     * javax.sql.rowset.spi.SyncProvider()}.
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
    public void create_SyncProvider()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.SyncProvider]

}
