package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JoinableClassTest
implements org.j8unit.repository.javax.sql.rowset.JoinableClassTests<javax.sql.rowset.Joinable> {

    @Override
    public Class<javax.sql.rowset.Joinable> createNewSUT() {
        return javax.sql.rowset.Joinable.class;
    }

}
