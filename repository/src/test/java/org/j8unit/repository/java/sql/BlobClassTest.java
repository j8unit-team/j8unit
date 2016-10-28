package org.j8unit.repository.java.sql;

import java.sql.Blob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BlobClassTest
implements org.j8unit.repository.java.sql.BlobClassTests<Blob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Blob]

    @Override
    public Class<Blob> createNewSUT() {
        return Blob.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Blob]

}
