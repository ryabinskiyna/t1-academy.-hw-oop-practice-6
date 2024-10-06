class Fraction extends Number {
    private final int num;
    private final int denum;

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = num;
        this.denum = denum;
    }

    @Override
    public int intValue() {
        return (int) (doubleValue());
    }

    @Override
    public long longValue() {
        return (long) (doubleValue());
    }

    @Override
    public float floatValue() {
        return (float) ((double) num / denum);
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}
