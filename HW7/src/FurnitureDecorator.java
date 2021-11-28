
  class FurnitureDecorator extends  abstractDecorator{
	  Furniture temp;
	
	public FurnitureDecorator(HouseholdItem householditem) {
		super(householditem);
		temp = (Furniture) householditem;
	}


	public float movingCosts() {
		return super.movingCosts() + calculateCosts();
	}

	public float calculateCosts() {
		return (float) (0.25*temp.weight);
	}

	
	public String packagingInstruction() {
		return super.packagingInstruction() + constructInstruction();
	}
	
	public String constructInstruction() {
		return (temp.lenght) +"x" + (temp.width) + "x" + (temp.height);
	
		
	}
	
	
	



}
