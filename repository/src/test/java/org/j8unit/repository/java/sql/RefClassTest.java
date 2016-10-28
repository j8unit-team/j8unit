package org.j8unit.repository.java.sql;

import java.sql.Ref;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefClassTest
implements org.j8unit.repository.java.sql.RefClassTests<Ref> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Ref]

    @Override
    public Class<Ref> createNewSUT() {
        return Ref.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Ref]

}
