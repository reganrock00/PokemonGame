
public class Moves
	{
     String name;
     int damage;
     double accuracy;
     public Moves(String n, int d, double a)
        {
        name = n;
        damage = d;
        accuracy = a;
        }
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public int getDamage()
		{
			return damage;
		}
	public void setDamage(int damage)
		{
			this.damage = damage;
		}
	public double getAccuracy()
		{
			return accuracy;
		}
	public void setAccuracy(double accuracy)
		{
			this.accuracy = accuracy;
		}
	}
