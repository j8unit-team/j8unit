package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScannerClassTest
implements org.j8unit.repository.java.util.ScannerClassTests<java.util.Scanner> {

    @Override
    public Class<java.util.Scanner> createNewSUT() {
        return java.util.Scanner.class;
    }

}
