package org.j8unit.repository.java.awt;

import java.awt.Adjustable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdjustableClassTest
implements org.j8unit.repository.java.awt.AdjustableClassTests<Adjustable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Adjustable]

    @Override
    public Class<Adjustable> createNewSUT() {
        return Adjustable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Adjustable]

}
