import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.platform.commons.util.StringUtils;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void sum() {
        MyMath math = new MyMath();
        assertEquals(4, math.sum(2, 2));
        System.out.println("sum4");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    void sum2() {
        MyMath math = new MyMath();
        Assertions.assertEquals(5, math.sum(2, 3));
        System.out.println("sum5");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    //@Disabled
    @DisplayName("Add operation test")
    @RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void sum3() {
        MyMath math = new MyMath();
        assertEquals(7, math.sum(3, 4));
        System.out.println("sum7");
    }

    @Test
    @Disabled("Do not run some test")
    void someTest() {
        System.out.println("Some test");
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testMethod(int x) {
        assertTrue(x > 0);
        System.out.println(x);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testMethodWithAutoboxing(Integer x) {
        assertTrue(x > 0);
        System.out.println(x);
    }

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @ParameterizedTest
    @EmptySource
    void testMethodEmptySource(String argument) {
        assertTrue(StringUtils.isBlank(argument));
        System.out.println("argument is " + "\" " + argument + " \"");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testMethodNullAndEmptySource(String argument) {
        assertTrue(StringUtils.isBlank(argument));
        System.out.println("argument is empty or null " + "\" " + argument + " \"");
    }

    enum Direction {
        EAST, WEST, NORTH, SOUTH
    }

    @ParameterizedTest
    @EnumSource(Direction.class)
    void testWithEnumSource(Direction d) {
        assertNotNull(d);
        System.out.println(d);
    }

    @ParameterizedTest
    @MethodSource("argsProviderFactory")
    void testWithMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> argsProviderFactory() {
        return Stream.of("alex", "brian");
    }
}
