package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.JoinRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JoinRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.JoinRowSetClassTests<JoinRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.JoinRowSet]

    @Override
    public Class<JoinRowSet> createNewSUT() {
        return JoinRowSet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.JoinRowSet]

}
