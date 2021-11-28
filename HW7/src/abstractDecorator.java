
public abstract class abstractDecorator implements HouseholdItem {
	protected HouseholdItem householditem;
	

		public abstractDecorator(HouseholdItem householditem) {
		this.householditem = householditem;
	}

	public float movingCosts() {
		return householditem.movingCosts();
		
	}
	public String packagingInstruction() {
		return householditem.packagingInstruction();
		
	}


}
