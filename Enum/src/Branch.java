enum Branch{
	MATH( 56),
	PHYSICS(42),
	CS( 100),
	ENG(100);
private int score;
Branch(int score){
	this.score=score;
}
public int getScore() {
	return score;
}
}