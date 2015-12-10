package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BlobClassTest
implements org.j8unit.repository.java.sql.BlobClassTests<java.sql.Blob> {

    @Override
    public Class<java.sql.Blob> createNewSUT() {
        return java.sql.Blob.class;
    }

}
