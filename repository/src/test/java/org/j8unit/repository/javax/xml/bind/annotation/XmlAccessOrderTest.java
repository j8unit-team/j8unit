package org.j8unit.repository.javax.xml.bind.annotation;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class XmlAccessOrderTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAccessOrderTests<javax.xml.bind.annotation.XmlAccessOrder> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(javax.xml.bind.annotation.XmlAccessOrder.class);
    }

    @Parameter(0)
    public javax.xml.bind.annotation.XmlAccessOrder sut;

    @Override
    public javax.xml.bind.annotation.XmlAccessOrder createNewSUT() {
        return this.sut;
    }

}
