package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Location} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.stream.LocationClassTests}).
 */

@RunWith(J8Unit4.class)
public class LocationClassTest
implements org.j8unit.repository.javax.xml.stream.LocationClassTests<Location> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.Location]

    @Override
    public Class<Location> createNewSUT() {
        return Location.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.Location]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.Location]

}
