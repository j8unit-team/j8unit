package org.j8unit.runners.conformance;

import java.time.DayOfWeek;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.j8unit.runners.conformance.APIConformance.APIConformanceCandidates;
import org.j8unit.runners.conformance.APIConformance.ClassTestsDiscovery;
import org.j8unit.runners.conformance.APIConformance.InstanceTestsDiscovery;
import org.j8unit.util.Reflection;
import org.junit.runner.RunWith;

@RunWith(APIConformance.class)
@APIConformanceCandidates({ Cloneable.class, Reflection.class, Boolean.class, AbstractSet.class, String.class, ArrayList.class, HashMap.class, DayOfWeek.class,
                            SomeAbstractClass.class, ClassWithoutDefaultConstructor.class })
@ClassTestsDiscovery(args = { "some.reusable.j8unit.test.repository.", "ClassTests" })
@InstanceTestsDiscovery(args = { "some.reusable.j8unit.test.repository.", "Tests" })
public class APIConformanceTestSuite {
}
