package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrapperClassTest
implements org.j8unit.repository.java.sql.WrapperClassTests<java.sql.Wrapper> {

    @Override
    public Class<java.sql.Wrapper> createNewSUT() {
        return java.sql.Wrapper.class;
    }

}
