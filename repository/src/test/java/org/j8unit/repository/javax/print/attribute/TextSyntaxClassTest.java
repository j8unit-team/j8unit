package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextSyntaxClassTest
implements org.j8unit.repository.javax.print.attribute.TextSyntaxClassTests<javax.print.attribute.TextSyntax> {

    @Override
    public Class<javax.print.attribute.TextSyntax> createNewSUT() {
        return javax.print.attribute.TextSyntax.class;
    }

}
