package org.j8unit.repository.java.beans.beancontext;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.beancontext.BeanContextSupport;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@SuppressWarnings("rawtypes")
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BeanContextSupportTest
implements FactoryBasedJ8UnitTest, BeanContextSupportTests<BeanContextSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextSupport]

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of the implemented j8unit
    // test interface (caused by the "rawtypes" nature of the type-under-test).
    @Override
    public BeanContextSupport createNewSUT() {
        final Object sut = FactoryBasedJ8UnitTest.super.createNewSUT();
        assert sut != null;
        assert sut instanceof BeanContextSupport;
        return (BeanContextSupport) sut;
    }

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BeanContextSupport::new);
    }

    @Parameter(0)
    public Callable<BeanContextSupport> sutFactory;

    @Override
    public Callable<BeanContextSupport> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextSupport]

}
