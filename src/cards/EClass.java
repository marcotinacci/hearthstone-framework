package cards;

/**
 * This is a parametric enum that handle types of cards and players in the same structure, since the latter is a proper subset of the former.
 * @author Marco Tinacci
 */

public enum EClass {

	// classes for players and cards
	THIEF (Type.PLAYER),
	PALADIN (Type.PLAYER),
	SHAMAN (Type.PLAYER),
	WARLOCK (Type.PLAYER),
	HUNTER (Type.PLAYER),
	MAGE (Type.PLAYER),
	PRIEST (Type.PLAYER),
	WARRIOR (Type.PLAYER),
	DRUID (Type.PLAYER),

	// classes for cards only
	NEUTRAL (Type.CARD);
	
	private Type type;
	
	EClass(Type type) {
		this.type = type;
	}
	
	public boolean isType(Type type){
		return this.type.equals(type);
	}
	
	public enum Type{
		PLAYER,
		CARD
	}
	
}
