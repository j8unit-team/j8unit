package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateMLetClassTest
implements org.j8unit.repository.javax.management.loading.PrivateMLetClassTests<javax.management.loading.PrivateMLet> {

    @Override
    public Class<javax.management.loading.PrivateMLet> createNewSUT() {
        return javax.management.loading.PrivateMLet.class;
    }

}
