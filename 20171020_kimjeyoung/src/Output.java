
interface starcraft
{
	void attack(String s);
}
  
class terran implements starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Terran��  " + s + "Attack");
	}
}

class protoss implements starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Protoss��  " + s + "Attack");
	}
}

class zerg implements starcraft
{
	public void attack(String s) 
	{
		System.out.println("Zerg��  " + s + "Attack");
	}
}

class Output 
{
	public static void main(String args[]) 
	{
		starcraft obj;   
		obj = new terran();
 		obj.attack("���� ");
		obj = new protoss();
		obj.attack("����");
		obj = new zerg();
		obj.attack("����󸮽�ũ");
	}
}
