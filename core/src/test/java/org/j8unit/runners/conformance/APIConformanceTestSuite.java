package org.j8unit.runners.conformance;

import java.time.DayOfWeek;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.j8unit.runners.conformance.APIConformance.APIConformanceCandidates;
import org.j8unit.util.Reflection;
import org.junit.runner.RunWith;

@RunWith(APIConformance.class)
@APIConformanceCandidates({ Cloneable.class, Reflection.class, Boolean.class, AbstractSet.class, String.class, ArrayList.class, HashMap.class, DayOfWeek.class,
                            SomeAbstractClass.class, ClassWithoutDefaultConstructor.class })
public class APIConformanceTestSuite {
}
