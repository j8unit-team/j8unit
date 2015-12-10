package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataTruncationClassTest
implements org.j8unit.repository.java.sql.DataTruncationClassTests<java.sql.DataTruncation> {

    @Override
    public Class<java.sql.DataTruncation> createNewSUT() {
        return java.sql.DataTruncation.class;
    }

}
