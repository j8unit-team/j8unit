package org.j8unit.repository.java.util;

import java.util.AbstractSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractSetClassTest
implements org.j8unit.repository.java.util.AbstractSetClassTests<AbstractSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractSet]

    @Override
    public Class<AbstractSet> createNewSUT() {
        return AbstractSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractSet]

}
