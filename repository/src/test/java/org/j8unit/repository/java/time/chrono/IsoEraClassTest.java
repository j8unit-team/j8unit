package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IsoEraClassTest
implements org.j8unit.repository.java.time.chrono.IsoEraClassTests<java.time.chrono.IsoEra> {

    @Override
    public Class<java.time.chrono.IsoEra> createNewSUT() {
        return java.time.chrono.IsoEra.class;
    }

}
