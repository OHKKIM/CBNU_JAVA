
interface starcraft
{
	void attack(String s);
}
  
class terran implements starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Terran의  " + s + "Attack");
	}
}

class protoss implements starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Protoss의  " + s + "Attack");
	}
}

class zerg implements starcraft
{
	public void attack(String s) 
	{
		System.out.println("Zerg의  " + s + "Attack");
	}
}

class Output 
{
	public static void main(String args[]) 
	{
		starcraft obj;   
		obj = new terran();
 		obj.attack("마린 ");
		obj = new protoss();
		obj.attack("드라곤");
		obj = new zerg();
		obj.attack("히드라리스크");
	}
}
