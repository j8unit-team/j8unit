package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PackageClassTest
implements org.j8unit.repository.java.lang.PackageClassTests<java.lang.Package> {

    @Override
    public Class<java.lang.Package> createNewSUT() {
        return java.lang.Package.class;
    }

}
