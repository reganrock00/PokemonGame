
public class Pokemon
	{
        String name;
        String type;
        int hitpoints;
        Moves move1;
        Moves move2;
        Moves move3;
        boolean alive;
//		public Pokemon(String n, String t, int h, Moves m1, Moves m2, Moves m3, boolean l)
//		{
//
//		}
		public Pokemon(String n, String t, int h, Moves m1, Moves m2, Moves m3, boolean l)
			{
				name = n;
				type = t;
				hitpoints = h;
				move1 = m1;
				move2 = m2;
				move3 = m3;
				alive = l;
			}
		public Moves getMove1()
			{
				return move1;
			}
		public void setMove1(Moves move1)
			{
				this.move1 = move1;
			}
		public Moves getMove2()
			{
				return move2;
			}
		public void setMove2(Moves move2)
			{
				this.move2 = move2;
			}
		public Moves getMove3()
			{
				return move3;
			}
		public void setMove3(Moves move3)
			{
				this.move3 = move3;
			}
		public boolean isAlive()
			{
				return alive;
			}
		public void setAlive(boolean alive)
			{
				this.alive = alive;
			}
		public int getHitpoints()
			{
				return hitpoints;
			}
		public void setHitpoints(int hitpoints)
			{
				this.hitpoints = hitpoints;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getType()
			{
				return type;
			}
		public void setType(String type)
			{
				this.type = type;
			}
		
	}