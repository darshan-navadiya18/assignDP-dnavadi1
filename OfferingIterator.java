import java.util.List;

public class OfferingIterator implements ListIterator {

	private OfferingList offeringList;
	private List<Offering> offerings;
	private int position=0;

	public OfferingIterator(List<Offering> offerings){
		this.offerings = offerings;
	}


	@Override
	public boolean hasNext() {
		return position < offerings.size() && offerings.get(position) != null;

	}

	@Override
	public Offering Next() {
		Offering offering= offerings.get(position);
		position += 1;
		return offering;
	}

	@Override
	public void MoveToHead() {
		position=0;
	}

	@Override
	public void Remove() {

	}

}
