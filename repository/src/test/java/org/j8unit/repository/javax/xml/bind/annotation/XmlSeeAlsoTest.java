package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSeeAlso;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSeeAlsoTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSeeAlsoTests<XmlSeeAlso> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlSeeAlso]

    @Override
    public XmlSeeAlso createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlSeeAlso], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.XmlSeeAlso]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.XmlSeeAlso]

}
