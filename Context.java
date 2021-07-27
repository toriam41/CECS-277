package lab8.statepattern;

public class Context implements Feeling {
	private Feeling f;

	public void setState(Feeling feels) {
		
		f = feels;
	}
	
	public Feeling getState() {
		
		return f;
	}
	
	@Override
	public void doAction() {
		
		f.doAction();
	}
}
