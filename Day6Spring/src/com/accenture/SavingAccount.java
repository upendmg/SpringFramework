package com.accenture;

public class SavingAccount implements Account {
   private Card atmCard;
   public SavingAccount(Card atmCard){
	   this.atmCard=atmCard;
   }
   
	/*public Card getAtmCard() {
	return atmCard;
}

    public void setAtmCard(Card atmCard) {
	this.atmCard = atmCard;
}*/

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Saving Account Created successfully";
	}
	public String cardType() {
		return atmCard.cardType();
	}
	}
	


