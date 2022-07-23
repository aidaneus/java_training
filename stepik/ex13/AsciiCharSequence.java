import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
	private byte[] value;

	public AsciiCharSequence(byte[] value){
		this.value = value;
	}

	@Override
	public int length(){
		return value.length;
	}

	@Override
	public char charAt(int index){
		return (char) value[index];
	}

	@Override
	public String toString(){
		return new String(value);
	}

	@Override
	public CharSequence subSequence(int start, int end){
		return new AsciiCharSequence(Arrays.copyOfRange(value, start, end));
	}
}
