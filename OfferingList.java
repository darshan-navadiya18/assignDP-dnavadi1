
public class OfferingList extends ArrayList {

	private OfferingIterator offeringIterator;

	protected Trading trading;

	private Offering[] offering;

	@Override
	public ListIterator createIterator(ListIterator iterator) {
		return new OfferingIterator();
	}
}
