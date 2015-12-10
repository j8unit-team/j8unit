package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeTypeClassTest
implements org.j8unit.repository.javax.activation.MimeTypeClassTests<javax.activation.MimeType> {

    @Override
    public Class<javax.activation.MimeType> createNewSUT() {
        return javax.activation.MimeType.class;
    }

}
