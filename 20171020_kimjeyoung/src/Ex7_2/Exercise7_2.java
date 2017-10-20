package Ex7_2;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i =0; i<20;i++) {
			int num = i%10 +1;
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		int cardsLength = cards.length;
		int A, B, C;
		
		for(int i=0; i<cardsLength*2;i++) {
			A = (int)(Math.random()*cardsLength);
			B = (int)(Math.random()*cardsLength);
			C = cards[A].num;
			cards[A].num = cards[B].num;
			cards[B].num = C;
		}
	}
	
	public SutdaCard pick(int index) {
		if(index<0||index>=CARD_NUM)
			return null;
			return cards[index];
	}
	
	public SutdaCard pick() {
		return cards[(int)(Math.random()*10)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}