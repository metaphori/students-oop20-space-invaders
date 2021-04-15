package model;

public interface Player {
	
	int getHealth();
	
	void setHealth(int lifePoints);
	
	int getCoolDown();
	
	void setCoolDown(int coolDown);
	
	int getShield();
	
	void setSHield(int shieldLife);
	
	int getShotReady();
	
	void setShotready(int time);
	
	void resetPosition();
	
}