package game;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya eklendi.");
		
	}

	@Override
	public void upDate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya silindi.");
	}

	public void discount(Campaign campaign) {
		System.out.println("%" + campaign.getDiscount() + " indirim uyguland�.");
	}
}
