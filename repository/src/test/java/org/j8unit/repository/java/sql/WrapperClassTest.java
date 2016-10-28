package org.j8unit.repository.java.sql;

import java.sql.Wrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrapperClassTest
implements org.j8unit.repository.java.sql.WrapperClassTests<Wrapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Wrapper]

    @Override
    public Class<Wrapper> createNewSUT() {
        return Wrapper.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Wrapper]

}
