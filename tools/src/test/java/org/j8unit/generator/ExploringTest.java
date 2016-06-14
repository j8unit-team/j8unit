package org.j8unit.generator;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.toMap;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.api.J8UnitRepositoryGeneratorApp.INSTANCE_TESTS_SETUP;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestDeclaringParents;
import static org.j8unit.generator.util.TypeAnalysis.getDeclaredMethod;
import static org.j8unit.generator.util.TypeAnalysis.getMethod;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.j8unit.generator.api.GeneratorSetup;
import org.junit.Test;

public class ExploringTest {

    private final Map<Method, ? extends Map<Class<?>, Set<Class<?>>>> exploreMethodsUnderTest(final Class<?> type, final GeneratorSetup setup) {
        // query all declared, relevant methods
        final Stream<Method> methods = Arrays.stream(type.getDeclaredMethods())
                                             // must be usable
                                             .filter(setup::useMethod)
                                             // must match this access-scope
                                             .filter(INSTANCE::matches)
                                             // must be non-synthetic
                                             .filter(m -> m.isBridge() || !m.isSynthetic());
        // overridden methods are identified by the declaring parent nodes
        final UnaryOperator<Method> keyMapper = identity();
        final Function<? super Method, ? extends Map<Class<?>, Set<Class<?>>>> valueMapper = m -> calculateNearestDeclaringParents(type, m, setup::useType);
        final Map<Method, ? extends Map<Class<?>, Set<Class<?>>>> result = methods.collect(toMap(keyMapper, valueMapper));
        // finish
        return result;
    }

    @Test
    public void testExploringMUTs()
    throws Exception {
        final GeneratorSetup instanceRepoSetup = INSTANCE_TESTS_SETUP;
        final Map<Method, ? extends Map<Class<?>, Set<Class<?>>>> methods = this.exploreMethodsUnderTest(DelayQueue.class, instanceRepoSetup);
        {
            final Method method = DelayQueue.class.getMethod("toArray", Object[].class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
            // also inherited from {@link Collection} via parent node {@link BlockingQueue} but (!) is less specific due
            // inheritance tree
        }
        {
            final Method method = DelayQueue.class.getMethod("toArray");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
            // also inherited from {@link Collection} via parent node {@link BlockingQueue} but (!) is less specific due
            // inheritance tree
        }
        {
            final Method method = DelayQueue.class.getMethod("remainingCapacity");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("offer", Delayed.class, long.class, TimeUnit.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(0, methods.get(method).size());
        }
        {
            final Method method = DelayQueue.class.getMethod("offer", Delayed.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(0, methods.get(method).size());
        }
        {
            final Method method = DelayQueue.class.getMethod("take");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("iterator");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
            // also inherited from {@link Collection} via parent node {@link BlockingQueue} but (!) is less specific due
        }
        {
            final Method method = DelayQueue.class.getMethod("size");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
            // also inherited from {@link Collection} via parent node {@link BlockingQueue} but (!) is less specific due
            // inheritance tree
        }
        {
            final Method method = DelayQueue.class.getMethod("clear");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
            // also inherited from {@link Collection} via parent node {@link BlockingQueue} but (!) is less specific due
        }
        {
            final Method method = DelayQueue.class.getMethod("poll");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(new HashSet<>(asList(BlockingQueue.class, AbstractQueue.class)), methods.get(method).get(Queue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("poll", long.class, TimeUnit.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("drainTo", Collection.class, int.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("drainTo", Collection.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("put", Delayed.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(0, methods.get(method).size());
        }
        {
            final Method method = DelayQueue.class.getMethod("remove", Object.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(2, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("peek");
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(1, methods.get(method).size());
            assertEquals(new HashSet<>(asList(BlockingQueue.class, AbstractQueue.class)), methods.get(method).get(Queue.class));
        }
        {
            final Method method = DelayQueue.class.getMethod("add", Delayed.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(0, methods.get(method).size());
        }
    }

    private final Map<Method, Map<Class<?>, Set<Class<?>>>> exploreMergeMethods(final Class<?> type, final GeneratorSetup setup) {
        // query all inherited, relevant methods (that is, methods that are not specified by this {@code type})
        // (Note: {@link Class#getMethods()} returns only public methods; but, this is OK because there is
        // no merging problem for non-public methods; non-public methods cannot be inherited multiple times)
        final Stream<Method> methods = Arrays.stream(type.getMethods())
                                             // must be usable
                                             .filter(setup::useMethod)
                                             // must match this access-scope
                                             .filter(INSTANCE::matches)
                                             // must be non-synthetic
                                             .filter(m -> m.isBridge() || !m.isSynthetic())
                                             // keep in mind inherited methods might be overridden by closer
                                             // parent nodes; thus, map to the closest declaration
                                             .map(m -> getMethod(type, m)).peek(o -> assertTrue(o.isPresent())).map(Optional::get).distinct()
                                             // must be not declared by current {@code type}
                                             .filter(m -> m.isBridge() || !getDeclaredMethod(type, m).isPresent());
        // overridden methods are identified by the declaring parent nodes
        final UnaryOperator<Method> keyMapper = identity();
        final Predicate<Class<?>> useType = setup::useType;
        final Predicate<Class<?>> logSkipped = c -> {
            System.out.println("Skip: " + c);
            return true;
        };
        final Function<Method, Map<Class<?>, Set<Class<?>>>> valueMapper = m -> calculateNearestDeclaringParents(type, m, useType.or(logSkipped));
        final Map<Method, Map<Class<?>, Set<Class<?>>>> result = methods.collect(toMap(keyMapper, valueMapper));
        // however, only multiple times inherited methods must be considered
        result.values().removeIf(parents -> parents.size() < 2);
        // finish
        return result;
    }

    @Test
    public void testExploringMergings()
    throws Exception {
        final GeneratorSetup instanceRepoSetup = INSTANCE_TESTS_SETUP;
        final Map<Method, Map<Class<?>, Set<Class<?>>>> methods = this.exploreMergeMethods(DelayQueue.class, instanceRepoSetup);
        {
            final Method method = AbstractCollection.class.getMethod("removeAll", Collection.class);
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractCollection.class.getMethod("contains", Object.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(2, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
        }
        {
            final Method method = AbstractQueue.class.getMethod("remove");
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = Object.class.getMethod("hashCode");
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = Object.class.getMethod("equals", Object.class);
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractCollection.class.getMethod("retainAll", Collection.class);
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractCollection.class.getMethod("containsAll", Collection.class);
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractQueue.class.getMethod("element");
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractCollection.class.getMethod("isEmpty");
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = AbstractQueue.class.getMethod("addAll", Collection.class);
            assertNotNull(method);
            assertFalse(methods.containsKey(method));
        }
        {
            final Method method = DelayQueue.class.getMethod("add", Object.class);
            assertNotNull(method);
            assertTrue(methods.containsKey(method));
            assertEquals(2, methods.get(method).size());
            assertEquals(singleton(BlockingQueue.class), methods.get(method).get(BlockingQueue.class));
            assertEquals(singleton(AbstractQueue.class), methods.get(method).get(AbstractQueue.class));
        }
    }

}
