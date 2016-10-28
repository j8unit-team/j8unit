package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DosFileAttributesClassTest
implements org.j8unit.repository.java.nio.file.attribute.DosFileAttributesClassTests<DosFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.DosFileAttributes]

    @Override
    public Class<DosFileAttributes> createNewSUT() {
        return DosFileAttributes.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.DosFileAttributes]

}
