import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		
		Location ofFlowers;
		int x = 0;
		int y = 0;
		while (x<=9) {
			while (y<=9){
				ofFlowers = new Location(x, y);
				Flower flowers = new Flower(Color.red);
				w.add(ofFlowers, flowers);
				y++;
			}
		y=0;
		x+=2;
		}
		Location ofwightFlowers;
		int x2 = 1;
		int y2 = 0;
		while (x2<=9) {
			while (y2<=9){
				ofwightFlowers = new Location(x2, y2);
				Flower wightflowers = new Flower(Color.white);
				w.add(ofwightFlowers, wightflowers);
				y2++;
			}
		y2=0;
		x2+=2;
		}
		Location ofBlueFlowers;
		int x1 = 0;
		int y1 = 0;
		while (x1<=3) {
			while (y1<=4){
				ofBlueFlowers = new Location(x1, y1);
				Flower blueFlowers = new Flower(Color.blue);
				w.add(ofBlueFlowers, blueFlowers);
				y1++;
			}
		y1=0;
		x1++;
		}
	}
}