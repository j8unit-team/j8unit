package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HijrahEraClassTest
implements org.j8unit.repository.java.time.chrono.HijrahEraClassTests<java.time.chrono.HijrahEra> {

    @Override
    public Class<java.time.chrono.HijrahEra> createNewSUT() {
        return java.time.chrono.HijrahEra.class;
    }

}
