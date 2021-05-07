package JCDay4HW3;

public class Campaign extends Entities{
	
	private String campaignName;
	private int discountPer;
	
	

	public Campaign(int id, String campaignName, int discountPer) {
		super(id);
		this.campaignName = campaignName;
		this.discountPer = discountPer;
	}



	public String getCampaignName() {
		return campaignName;
	}



	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}



	public int getDiscountPer() {
		return discountPer;
	}



	public void setDiscountPer(int discountPer) {
		this.discountPer = discountPer;
	}


	
	
	
	

}
