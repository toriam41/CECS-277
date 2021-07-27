package lab9.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class CalculationCareTaker {

	private List<MementoCalculator> mementoList = new ArrayList<MementoCalculator>();
	
	public void add(MementoCalculator m) {
		mementoList.add(m);
	}
	
	public MementoCalculator get(int index) {
		return mementoList.get(index);
	}

}
