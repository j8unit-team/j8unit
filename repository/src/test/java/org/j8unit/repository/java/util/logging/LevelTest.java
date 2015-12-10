package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LevelTest
implements org.j8unit.repository.java.util.logging.LevelTests<java.util.logging.Level> {

    @Override
    public java.util.logging.Level createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.logging.Level] available.");
    }

}
