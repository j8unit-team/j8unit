package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.Joinable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JoinableClassTest
implements org.j8unit.repository.javax.sql.rowset.JoinableClassTests<Joinable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.Joinable]

    @Override
    public Class<Joinable> createNewSUT() {
        return Joinable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.Joinable]

}
