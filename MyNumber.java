
public class MyNumber {

	int num;
	
	public MyNumber() {
		this.num = 0;
	}
	
	public MyNumber(int num) {
		this.num = num;
	}
	
	public int getNumber() {
		return num;
	}
	
	public void setNumber(int num) {
		this.num = num;
	}
	
	public MyNumber add(MyNumber rhs) {
		this.num += rhs.num;
		return this;
	}
	
	public MyNumber div(MyNumber rhs) {
		if (rhs.num == 0)
			throw new IllegalArgumentException("Cannot divide by 0!");
		this.num /= rhs.num;
		return this;
	}
}
