package com.accenture;

public class CurrentAccount implements Account {
	private Card CreditCard;
	

	public Card getCreditCard() {
		return CreditCard;
	}

	public void setCreditCard(Card creditCard) {
		CreditCard = creditCard;
	}

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Current account created successfully";
	}

	@Override
	public String cardType() {
		// TODO Auto-generated method stub
		return "credit card given";
	}
	

}
