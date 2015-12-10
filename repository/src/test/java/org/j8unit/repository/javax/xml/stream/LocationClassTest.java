package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocationClassTest
implements org.j8unit.repository.javax.xml.stream.LocationClassTests<javax.xml.stream.Location> {

    @Override
    public Class<javax.xml.stream.Location> createNewSUT() {
        return javax.xml.stream.Location.class;
    }

}
