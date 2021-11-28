
  class GlassDecorator extends  abstractDecorator{
	  Glass temp;
	
	public GlassDecorator(HouseholdItem householditem) {
		super(householditem);
		temp = (Glass) householditem;
	}


	public float movingCosts() {
		return super.movingCosts() + calculateCosts();
	}

	public float calculateCosts() {
		if(temp.thickness==1) {
			return (2*temp.lenght);
		}
		else if(temp.thickness==2) {
			return (float) (1.2*temp.lenght);
		}
		else return (float) (0.7*temp.lenght);
	}

	
	public String packagingInstruction() {
		return super.packagingInstruction() + constructInstruction();
	}
	
	public String constructInstruction() {
		return (temp.lenght+1) +"x" + (temp.width+1) + "x" + (temp.height+1);
	
		
	}
	
	
	



}
