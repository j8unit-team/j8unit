package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XPathFilter2ParameterSpec} (by simply
 * reusing the J8Unit test interface {@link XPathFilter2ParameterSpecTests}).
 */

@RunWith(J8Unit4.class)
public class XPathFilter2ParameterSpecTest
implements XPathFilter2ParameterSpecTests<XPathFilter2ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

    @Override
    public XPathFilter2ParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

}
