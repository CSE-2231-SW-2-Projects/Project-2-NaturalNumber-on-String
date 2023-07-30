import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author Put your name here
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    //Test cases for constructor, multiplyBy10, divideBy10, isZero
    /*
     * Test cases for NaturalNuimber3 constructor methods
     */
    /**
     * Test constructor method small cases(empty parameter).
     */
    @Test
    public final void testConstructorSmallCase() {
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(int 0 parameter).
     */
    @Test
    public final void testConstructorRoutineCase1() {
        NaturalNumber nn = this.constructorTest(0);
        NaturalNumber nnExpected = this.constructorRef(0);

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(String "0" parameter).
     */
    @Test
    public final void testConstructorRoutineCase2() {
        NaturalNumber nn = this.constructorTest("0");
        NaturalNumber nnExpected = this.constructorRef("0");

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(NatualNumber2 0 parameter).
     */
    @Test
    public final void testConstructorRoutineCase3() {
        NaturalNumber zero = new NaturalNumber2(0);
        NaturalNumber nn = this.constructorTest(zero);
        NaturalNumber nnExpected = this.constructorRef(zero);

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(int 123 parameter).
     */
    @Test
    public final void testConstructorRoutineCase4() {
        NaturalNumber nn = this.constructorTest(123);
        NaturalNumber nnExpected = this.constructorRef(123);

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(String "233" parameter).
     */
    @Test
    public final void testConstructorRoutineCase5() {
        NaturalNumber nn = this.constructorTest("233");
        NaturalNumber nnExpected = this.constructorRef("233");

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases(NatualNumber2 456 parameter).
     */
    @Test
    public final void testConstructorRoutineCase6() {
        NaturalNumber nn2 = new NaturalNumber2("456");
        NaturalNumber nn = this.constructorTest(nn2);
        NaturalNumber nnExpected = this.constructorRef(nn2);

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method routine cases (Integer and String) to see if they
     * are equal.
     */
    @Test
    public final void testConstructorRoutineCase7() {
        NaturalNumber nn = this.constructorTest(100);
        NaturalNumber nn2 = this.constructorTest("100");

        assertEquals(nn, nn2);
    }

    /**
     * Test constructor method routine cases (String and NaturalNumber) to see
     * if they are equal.
     */
    @Test
    public final void testConstructorRoutineCase8() {
        NaturalNumber nn2 = new NaturalNumber2("535");
        NaturalNumber nn = this.constructorTest("535");
        NaturalNumber nn3 = this.constructorTest(nn2);

        assertEquals(nn, nn3);
    }

    /**
     * Test constructor method routine cases (Integer and NaturalNumber) to see
     * if they are equal.
     */
    @Test
    public final void testConstructorRoutineCase9() {
        NaturalNumber nn2 = new NaturalNumber2("50");
        NaturalNumber nn = this.constructorTest(50);
        NaturalNumber nn3 = this.constructorTest(nn2);

        assertEquals(nn, nn3);
    }

    /**
     * Test constructor method large cases(int.MaxValue parameter).
     */
    @Test
    public final void testConstructorLargeCase1() {
        NaturalNumber nn = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nnExpected = this.constructorRef(Integer.MAX_VALUE);

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method large cases(String "1234567890987654321"
     * parameter).
     */
    @Test
    public final void testConstructorLargeCase2() {
        NaturalNumber nn = this.constructorTest("1234567890987654321");
        NaturalNumber nnExpected = this.constructorRef("1234567890987654321");

        assertEquals(nn, nnExpected);
    }

    /**
     * Test constructor method large cases(NatualNumber2 1234567890987654321
     * parameter).
     */
    @Test
    public final void testConstructorLargeCase3() {
        NaturalNumber nn2 = new NaturalNumber2("1234567890987654321");
        NaturalNumber nn = this.constructorTest(nn2);
        NaturalNumber nnExpected = this.constructorRef(nn2);

        assertEquals(nn, nnExpected);
    }

    /*
     * Test cases for NaturalNumber3 multiplyBy10 methods
     */
    /**
     * Test multiplyBy10 method small challenging case(initial value 0,
     * parameter 0).
     */
    @Test
    public final void testMultiplyBy10SmallChallengingCase() {
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();
        nn.multiplyBy10(0);
        nnExpected.multiplyBy10(0);
        assertEquals(nn, nnExpected);
    }

    /**
     * Test multiplyBy10 method routine case(initial value 0, parameter 2).
     */
    @Test
    public final void testMultiplyBy10RoutineCase1() {
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();
        nn.multiplyBy10(2);
        nnExpected.multiplyBy10(2);
        assertEquals(nn, nnExpected);
    }

    /**
     * Test multiplyBy10 method routine case(initial value 12, parameter 0).
     */
    @Test
    public final void testMultiplyBy10RoutineCase2() {
        NaturalNumber nn = this.constructorTest("12");
        NaturalNumber nnExpected = this.constructorRef("12");
        nn.multiplyBy10(0);
        nnExpected.multiplyBy10(0);
        assertEquals(nn, nnExpected);
    }

    /**
     * Test multiplyBy10 method routine case(initial value 103, parameter 1).
     */
    @Test
    public final void testMultiplyBy10RoutineCase3() {
        NaturalNumber nn = this.constructorTest("103");
        NaturalNumber nnExpected = this.constructorRef("103");
        nn.multiplyBy10(1);
        nnExpected.multiplyBy10(1);
        assertEquals(nn, nnExpected);
    }

    /**
     * Test multiplyBy10 method routine case(expected value is made from a test
     * constructor).
     */
    @Test
    public final void testMultiplyBy10RoutineCase4() {
        NaturalNumber nn = this.constructorTest("103");
        nn.multiplyBy10(1);
        NaturalNumber nnExpected = this.constructorTest("1031");
        assertEquals(nn, nnExpected);

    }

    /**
     * Test multiplyBy10 method large case(initial value Integer.MAX_VALUE,
     * parameter 2).
     */
    @Test
    public final void testMultiplyBy10largeCase() {
        NaturalNumber nn = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nnExpected = this.constructorRef(Integer.MAX_VALUE);
        nn.multiplyBy10(2);
        nnExpected.multiplyBy10(2);
        assertEquals(nn, nnExpected);
    }

    /*
     * Test cases for divideBy10 method
     */
    /**
     * Test for divideBy10 small challenging case(initial value 0).
     */
    @Test
    public final void testDivideBy10SmallChallengingCase() {
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /**
     * Test for divideBy10 routine case(initial value 1).
     */
    @Test
    public final void testDivideBy10RoutineCase1() {
        NaturalNumber nn = this.constructorTest(1);
        NaturalNumber nnExpected = this.constructorRef(1);
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /**
     * Test for divideBy10 routine case(initial value 123).
     */
    @Test
    public final void testDivideBy10RoutineCase2() {
        NaturalNumber nn = this.constructorTest("123");
        NaturalNumber nnExpected = this.constructorRef("123");
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /**
     * Test for divideBy10 routine case(initial value 321).
     */
    @Test
    public final void testDivideBy10RoutineCase3() {
        NaturalNumber nn = this.constructorTest("321");
        NaturalNumber nnExpected = this.constructorRef("321");
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /**
     * Test for divideBy10 routine case(expected value is made from a test
     * constructor).
     */
    @Test
    public final void testDivideBy10RoutineCase4() {
        NaturalNumber nn = this.constructorTest("321");
        NaturalNumber nnExpected = this.constructorRef("32");
        nn.divideBy10();
        assertEquals(nn, nnExpected);
    }

    /**
     * Test for divideBy10 challenging case(initial value 4321000).
     */
    @Test
    public final void testDivideBy10ChallengingCase() {
        NaturalNumber nn = this.constructorTest("4321000");
        NaturalNumber nnExpected = this.constructorRef("4321000");
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /**
     * Test for divideBy10 large case(initial value Integer.MAX_VALUE).
     */
    @Test
    public final void testDivideBy10LargeCase() {
        NaturalNumber nn = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nnExpected = this.constructorRef(Integer.MAX_VALUE);
        int i = nn.divideBy10();
        int iExpected = nnExpected.divideBy10();
        assertEquals(nn, nnExpected);
        assertEquals(i, iExpected);
    }

    /*
     * Test cases for isZero method
     */
    /**
     * Test for isZero small case(empty parameter).
     */
    @Test
    public final void testIsZeroSmallCase() {
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

    /**
     * Test for isZero routine case(initial value 0).
     */
    @Test
    public final void testIsZeroRoutineCase1() {
        NaturalNumber nn = this.constructorTest(0);
        NaturalNumber nnExpected = this.constructorRef(0);
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

    /**
     * Test for isZero routine case(initial value 0).
     */
    @Test
    public final void testIsZeroRoutineCase2() {
        NaturalNumber nn = this.constructorTest("0");
        NaturalNumber nnExpected = this.constructorRef("0");
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

    /**
     * Test for isZero routine case(initial value 0).
     */
    @Test
    public final void testIsZeroRoutineCase3() {
        NaturalNumber zero = new NaturalNumber2();
        NaturalNumber nn = this.constructorTest(zero);
        NaturalNumber nnExpected = this.constructorRef(zero);
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

    /**
     * Test for isZero routine case(initial value 123).
     */
    @Test
    public final void testIsZeroRoutineCase4() {
        NaturalNumber nn = this.constructorTest("123");
        NaturalNumber nnExpected = this.constructorRef("123");
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

    /**
     * Test for isZero large case(initial value Integer.MAX_VALUE).
     */
    @Test
    public final void testIsZeroLargeCase() {
        NaturalNumber nn = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nnExpected = this.constructorRef(Integer.MAX_VALUE);
        boolean b = nn.isZero();
        boolean bExpected = nnExpected.isZero();
        assertEquals(nn, nnExpected);
        assertEquals(b, bExpected);
    }

}
