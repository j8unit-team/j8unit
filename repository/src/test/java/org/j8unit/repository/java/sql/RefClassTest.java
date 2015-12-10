package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefClassTest
implements org.j8unit.repository.java.sql.RefClassTests<java.sql.Ref> {

    @Override
    public Class<java.sql.Ref> createNewSUT() {
        return java.sql.Ref.class;
    }

}
