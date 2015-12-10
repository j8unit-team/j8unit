package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeViewClassTest
implements org.j8unit.repository.java.nio.file.attribute.AttributeViewClassTests<java.nio.file.attribute.AttributeView> {

    @Override
    public Class<java.nio.file.attribute.AttributeView> createNewSUT() {
        return java.nio.file.attribute.AttributeView.class;
    }

}
