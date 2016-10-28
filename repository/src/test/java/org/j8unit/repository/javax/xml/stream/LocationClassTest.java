package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.Location;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocationClassTest
implements org.j8unit.repository.javax.xml.stream.LocationClassTests<Location> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.Location]

    @Override
    public Class<Location> createNewSUT() {
        return Location.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.Location]

}
