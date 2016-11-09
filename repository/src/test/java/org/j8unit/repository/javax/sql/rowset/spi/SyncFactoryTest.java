package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncFactory} (by simply reusing the
 * J8Unit test interface {@link SyncFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class SyncFactoryTest
implements SyncFactoryTests<SyncFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactory]

    @Override
    public SyncFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.rowset.spi.SyncFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.SyncFactory]

}
