package chapter5.card;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();	// ½Ì±ÛÅæ ÆĞÅÏ

		Card myCard = company.createCard();
		Card yourCard = company.createCard();

		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());

	}

}
