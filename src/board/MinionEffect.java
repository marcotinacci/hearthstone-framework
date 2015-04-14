package board;

public abstract class MinionEffect extends Minion {
	protected Minion minion;
	protected String effectNote;
	
	public MinionEffect(Minion minion, String effectNote) {
		super();
		this.minion = minion;
		this.effectNote = effectNote;
	}
	

}
