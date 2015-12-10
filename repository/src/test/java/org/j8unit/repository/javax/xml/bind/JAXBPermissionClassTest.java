package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBPermissionClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBPermissionClassTests<javax.xml.bind.JAXBPermission> {

    @Override
    public Class<javax.xml.bind.JAXBPermission> createNewSUT() {
        return javax.xml.bind.JAXBPermission.class;
    }

}
