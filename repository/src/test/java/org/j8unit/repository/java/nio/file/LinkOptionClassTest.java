package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkOptionClassTest
implements org.j8unit.repository.java.nio.file.LinkOptionClassTests<java.nio.file.LinkOption> {

    @Override
    public Class<java.nio.file.LinkOption> createNewSUT() {
        return java.nio.file.LinkOption.class;
    }

}
