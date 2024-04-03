package fk.examples.onlinecasino;

public class Player{

	private String name;
    private int credit;

    public Player(String namn, int credit) {
        this.name = namn;
        this.credit = credit;
    }
    
    public String getName() {
    	return name;
    }

    public int getCredit() {
		return credit;
	}
    
    public void setCredit(int credit) {
		this.credit = credit;
	}
}