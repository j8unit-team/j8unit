package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathExpression;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExpressionTest
implements org.j8unit.repository.javax.xml.xpath.XPathExpressionTests<XPathExpression> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPathExpression]

    @Override
    public XPathExpression createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.xpath.XPathExpression], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPathExpression]

}
