package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileNameMapClassTest
implements org.j8unit.repository.java.net.FileNameMapClassTests<java.net.FileNameMap> {

    @Override
    public Class<java.net.FileNameMap> createNewSUT() {
        return java.net.FileNameMap.class;
    }

}
