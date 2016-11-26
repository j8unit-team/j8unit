package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneRulesProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZoneRulesProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.zone.ZoneRulesProviderTests}).
 */
@RunWith(J8Unit4.class)
public class ZoneRulesProviderTest
implements ZoneRulesProviderTests<ZoneRulesProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneRulesProvider]

    @Override
    public ZoneRulesProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.zone.ZoneRulesProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.zone.ZoneRulesProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.zone.ZoneRulesProvider]

}
