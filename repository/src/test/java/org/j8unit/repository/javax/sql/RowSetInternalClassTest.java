package org.j8unit.repository.javax.sql;

import javax.sql.RowSetInternal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetInternalClassTest
implements org.j8unit.repository.javax.sql.RowSetInternalClassTests<RowSetInternal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetInternal]

    @Override
    public Class<RowSetInternal> createNewSUT() {
        return RowSetInternal.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetInternal]

}
