package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EraClassTest
implements org.j8unit.repository.java.time.chrono.EraClassTests<java.time.chrono.Era> {

    @Override
    public Class<java.time.chrono.Era> createNewSUT() {
        return java.time.chrono.Era.class;
    }

}
