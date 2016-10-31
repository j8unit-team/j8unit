package org.j8unit.repository.java.util;

import java.util.List;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ListClassTest
implements org.j8unit.repository.java.util.ListClassTests<List> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.List]

    @Override
    public Class<List> createNewSUT() {
        return List.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.List]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.List]

}
