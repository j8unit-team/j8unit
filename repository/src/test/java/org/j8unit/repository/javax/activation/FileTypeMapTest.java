package org.j8unit.repository.javax.activation;

import javax.activation.FileTypeMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileTypeMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.FileTypeMapTests}).
 */
@RunWith(J8Unit4.class)
public class FileTypeMapTest
implements FileTypeMapTests<FileTypeMap> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.FileTypeMap]

    @Override
    public FileTypeMap createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.activation.FileTypeMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.FileTypeMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.FileTypeMap]

}
