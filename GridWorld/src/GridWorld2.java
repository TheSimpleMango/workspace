import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class GridWorld2 {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		int BL2x = new Random().nextInt(9);
		int BL2y = new Random().nextInt(9);
		Location FL1 = new Location(BL2x, BL2y - 1);
		Location FL2 = new Location(BL2x, BL2y + 1);
		Flower F1 = new Flower();
		Flower F2 = new Flower();
		Bug b2 = new Bug();
		b2.setColor(Color.blue);
		b2.setDirection(90);
		Location BL2 = new Location(BL2x,BL2y);
		w.add(BL2, b2);
		w.add(FL2, F1);
		w.add(FL1, F2);
		
	}
}
