package org.j8unit.repository.javax.swing.border;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EmptyBorderTest
implements org.j8unit.repository.javax.swing.border.EmptyBorderTests<javax.swing.border.EmptyBorder> {

    @Override
    public javax.swing.border.EmptyBorder createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.border.EmptyBorder] available.");
    }

}
