package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MLetClassTest
implements org.j8unit.repository.javax.management.loading.MLetClassTests<javax.management.loading.MLet> {

    @Override
    public Class<javax.management.loading.MLet> createNewSUT() {
        return javax.management.loading.MLet.class;
    }

}
