package org.j8unit.repository.java.util;

import java.util.Set;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SetClassTest
implements org.j8unit.repository.java.util.SetClassTests<Set> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Set]

    @Override
    public Class<Set> createNewSUT() {
        return Set.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Set]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Set]

}
