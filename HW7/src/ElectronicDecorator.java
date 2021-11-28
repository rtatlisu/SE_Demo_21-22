
  class ElectronicDecorator extends  abstractDecorator{
	  Electronic temp;
	
	public ElectronicDecorator(HouseholdItem householditem) {
		super(householditem);
		temp = (Electronic) householditem;
	}


	public float movingCosts() {
		return super.movingCosts() + calculateCosts();
	}

	public float calculateCosts() {
		if(temp.fragile) {
			return ((float) (0.5*temp.weight));
		}
		else return (float) 1/3 * temp.weight;
	}

	
	public String packagingInstruction() {
		return super.packagingInstruction() + constructInstruction();
	}
	
	public String constructInstruction() {
		return (temp.lenght+1) +"x" + (temp.width+1) + "x" + (temp.height+1);
	
		
	}
	
	
	



}
