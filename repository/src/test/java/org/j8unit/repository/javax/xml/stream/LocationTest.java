package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Location} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.LocationTests}).
 */

@RunWith(J8Unit4.class)
public class LocationTest
implements org.j8unit.repository.javax.xml.stream.LocationTests<Location> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.Location]

    @Override
    public Location createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.Location], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.Location]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.Location]

}
