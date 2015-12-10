package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReverbTypeTest
implements org.j8unit.repository.javax.sound.sampled.ReverbTypeTests<javax.sound.sampled.ReverbType> {

    @Override
    public javax.sound.sampled.ReverbType createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.ReverbType] available.");
    }

}
