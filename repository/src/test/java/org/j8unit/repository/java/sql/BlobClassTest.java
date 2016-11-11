package org.j8unit.repository.java.sql;

import java.sql.Blob;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Blob} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.sql.BlobClassTests}).
 */

@RunWith(J8Unit4.class)
public class BlobClassTest
implements BlobClassTests<Blob> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Blob]

    @Override
    public Class<Blob> createNewSUT() {
        return Blob.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Blob]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Blob]

}
