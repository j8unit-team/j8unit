package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeTypeParseExceptionClassTest
implements org.j8unit.repository.javax.activation.MimeTypeParseExceptionClassTests<javax.activation.MimeTypeParseException> {

    @Override
    public Class<javax.activation.MimeTypeParseException> createNewSUT() {
        return javax.activation.MimeTypeParseException.class;
    }

}
