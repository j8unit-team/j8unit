package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileOwnerAttributeView} (by simply
 * reusing the J8Unit test interface {@link FileOwnerAttributeViewTests}).
 */

@RunWith(J8Unit4.class)
public class FileOwnerAttributeViewTest
implements FileOwnerAttributeViewTests<FileOwnerAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileOwnerAttributeView]

    @Override
    public FileOwnerAttributeView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.attribute.FileOwnerAttributeView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.attribute.FileOwnerAttributeView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.attribute.FileOwnerAttributeView]

}
