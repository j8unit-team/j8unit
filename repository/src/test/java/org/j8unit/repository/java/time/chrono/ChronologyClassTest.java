package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronologyClassTest
implements org.j8unit.repository.java.time.chrono.ChronologyClassTests<java.time.chrono.Chronology> {

    @Override
    public Class<java.time.chrono.Chronology> createNewSUT() {
        return java.time.chrono.Chronology.class;
    }

}
