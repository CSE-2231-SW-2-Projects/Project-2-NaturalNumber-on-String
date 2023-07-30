import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumberSecondary;

/**
 * {@code NaturalNumber} represented as a {@code String} with implementations of
 * primary methods.
 *
 * @convention <pre>
 * [all characters of $this.rep are '0' through '9']  and
 * [$this.rep does not start with '0']
 * </pre>
 * @correspondence <pre>
 * this = [if $this.rep = "" then 0
 *         else the decimal number whose ordinary depiction is $this.rep]
 * </pre>
 *
 * @author Zheyuan Gao
 * @author Cedric Fausey
 *
 */
public class NaturalNumber3 extends NaturalNumberSecondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private String rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        /*
         * The default initial value of this.rep should be an empty string.
         */
        this.rep = "";

    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public NaturalNumber3() {

        this.createNewRep();

    }

    /**
     * Constructor from {@code int}.
     *
     * @param i
     *            {@code int} to initialize from
     */
    public NaturalNumber3(int i) {
        assert i >= 0 : "Violation of: i >= 0";

        this.createNewRep();
        /*
         * If the int i is zero, this.rep should just be an empty string. Else,
         * it will just as same as int i as a string.
         */
        if (i != 0) {
            this.rep = Integer.toString(i);
        }

    }

    /**
     * Constructor from {@code String}.
     *
     * @param s
     *            {@code String} to initialize from
     */
    public NaturalNumber3(String s) {
        assert s != null : "Violation of: s is not null";
        assert s.matches("0|[1-9]\\d*") : ""
                + "Violation of: there exists n: NATURAL (s = TO_STRING(n))";

        this.createNewRep();
        /*
         * If the string is zero, this.rep should just be an empty string. Else,
         * it will just as same as String s.
         */
        if (!s.equals("0")) {
            this.rep = s;
        }

    }

    /**
     * Constructor from {@code NaturalNumber}.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     */
    public NaturalNumber3(NaturalNumber n) {
        assert n != null : "Violation of: n is not null";

        this.createNewRep();
        /*
         * Because this.rep should be a string. First use
         * NaturalNumber.toString() method to change the n to a string.
         */
        String nToString = n.toString();
        /*
         * If the string is zero, this.rep should just be an empty string. Else,
         * it will just as same as String nToString.
         */
        if (!nToString.equals("0")) {
            this.rep = nToString;
        }

    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @Override
    public final NaturalNumber newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(NaturalNumber source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof NaturalNumber3 : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        NaturalNumber3 localSource = (NaturalNumber3) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final void multiplyBy10(int k) {
        assert 0 <= k : "Violation of: 0 <= k";
        assert k < RADIX : "Violation of: k < 10";
        /*
         * If the this.rep is 0 and int k is also zero, we can't just k at the
         * end of this.rep. This will cause the NatualNUmber zero been represent
         * by "0" instead of an empty string. this.rep should still be an empty
         * string in this case.
         */
        if (!(this.rep.length() == 0 && k == 0)) {
            this.rep = this.rep + k;
        }

    }

    @Override
    public final int divideBy10() {

        int lastDigit = 0;
        /*
         * First check if this NatualNumber is zero. In the other word, if
         * this.rep is an empty string. If that is the case, the value to return
         * should be 0.
         */
        if (this.rep.length() == 0) {
            lastDigit = 0;
        } else {
            /*
             * If the NatualNumber is not zero, return the last index of the
             * string. And update this.rep and delete the last index.
             */
            String lastIndex = this.rep.substring(this.rep.length() - 1);
            /*
             * Since the last digit is is only one digit long. Calling
             * Integer.parseInt() will not cause the integer be out of bound.
             */
            lastDigit = Integer.parseInt(lastIndex);
            /*
             * Update the this.rep.
             */
            this.rep = this.rep.substring(0, this.rep.length() - 1);
        }
        return lastDigit;
    }

    @Override
    public final boolean isZero() {

        /*
         * The representation of zero in natural number is just an empty entry.
         * Therefore just check if this.rep is an empty string.
         */
        return this.rep.equals("");
    }

}
