import java.util.Objects;

public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}
	public double getRe() {
		return re;
	}
	public double getIm() {
		return im;
	}
	@Override
	public int hashCode() {
		return Objects.hash(getRe(), getIm());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ComplexNumber)) return false;
		ComplexNumber that = (ComplexNumber) o;
		return getRe() == that.getRe() &&
				getIm() == that.getIm() &&
				hashCode() == that.hashCode();
	}
}