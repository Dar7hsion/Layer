	//Imports
	import java.util.Random;
	import java.util.Scanner;
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	public class Layer {
	//Game backbone, Combat, Turn Order, Room Function calls
	//Game backbone, monster, and loot room navigation
	public static void main(String[] args) 
	{	
		intro();
		
		while(global.Health>0 || global.Imortality==true)
		{
		//Map();
			if(global.Level==1)
			{
				if(global.Room==1)
				{
					if(global.clearLV1R1!=true && (global.rand.nextInt(8-global.level1Count)>0)&& global.Door!=0)
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level1Count--;
						}
						if((global.clearLV1R1 == true && (global.level1Chance==1)) || ((global.level1Count==1 || global.level1Count==2) && global.clearLV1R1==true))
						{
							if(global.Key1==true && global.Key2==false)
							{
								global.Key2 = true;
								System.out.println("\n			You gained one small key shapped like a moon, must go to a door somewhere");
							}
							if(global.Key1==false)
							{
								global.Key1 = true;
								System.out.println("\n			You gained one small key shapped like a sun, must go to a door somewhere");
							}
						}
					}
					LV1R1();
				}
				else if(global.Room==2)
				{
					if(global.clearLV1R2!=true && (global.rand.nextInt(8-global.level1Count)>0))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level1Count--;
						}
						if((global.clearLV1R2 == true && (global.level1Chance==1)) || ((global.level1Count==1 ||global.level1Count==2) && global.clearLV1R2==true))
						{
							if(global.Key1==true && global.Key2==false)
							{
								global.Key2 = true;
								System.out.println("\n			You gained one small key shapped like a moon, must go to a door somewhere");
							}
							if(global.Key1==false)
							{
								global.Key1 = true;
								System.out.println("\n			You gained one small key shapped like a sun, must go to a door somewhere");
							}
						}
					}
					LV1R2();
				}
				else if(global.Room==3)
				{
					if(global.clearLV1R3 != true && (global.rand.nextInt(8-global.level1Count)>0))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level1Count--;
						}
						if((global.clearLV1R3 == true && (global.level1Chance==1)) || ((global.level1Count==1 || global.level1Count==2) && global.clearLV1R3==true))
						{
							if(global.Key1==true && global.Key2==false)
							{
								global.Key2 = true;
								System.out.println("\n				You gained one small key shapped like a moon, must go to a door somewhere");
							}
							if(global.Key1==false)
							{
								global.Key1 = true;
								System.out.println("\n			You gained one small key shapped like a sun, must go to a door somewhere");
							}
						}
					}
					LV1R3();
				}
				else if(global.Room==4)
				{
					if(global.clearLV1R4 != true && (global.rand.nextInt(8-global.level1Count)>0))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level1Count--;
						}
						if((global.clearLV1R4 == true && (global.level1Chance==1)) || ((global.level1Count==1 || global.level1Count==2) && global.clearLV1R4==true))
						{
							
							if(global.Key1==true && global.Key2==false)
							{
								global.Key2 = true;
								System.out.println("\n			You gained one small key shapped like a moon, must go to a door somewhere");
							}
							if(global.Key1==false)
							{
								global.Key1 = true;
								System.out.println("\n			You gained one small key shapped like a sun, must go to a door somewhere");
							}
						}
					}
					LV1R4();
				}
				else if(global.Room==5)
				{
					if(global.clearLV1R5 != true && (global.rand.nextInt(8-global.level1Count)>0))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level1Count--;
						}
						if((global.clearLV1R5 == true && (global.level1Chance==1)) || ((global.level1Count==1 || global.level1Count==2) && global.clearLV1R5==true))
						{
							if(global.Key1==true && global.Key2==false)
							{
								global.Key2 = true;
								System.out.println("\n			You gained one small key shapped like a moon, must go to a door somewhere");
							}
							if(global.Key1==false)
							{
								global.Key1 = true;
								System.out.println("\n			You gained one small key shapped like a sun, must go to a door somewhere");
							}
						}
					}
					LV1R5();
				}
			}
			else if(global.Level==2)
			{
				if(global.Room==1)
				{
					if(global.clearLV2R1 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level2Count--;
						}
						if((global.clearLV2R1 == true && (global.level2Chance==1) && global.stone != true) || (global.clearLV2R1 == true && global.level2Count==1 && global.stone!=true))
						{
							global.stone = true;
							System.out.println("\n			The monster drops a glowing stone");
							//loot();
						}
					}
					LV2R1();
				}
				else if(global.Room==2)
				{
					if(global.clearLV2R2 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level2Count--;
						}
						if((global.clearLV2R2 == true && (global.level2Chance==1) && global.stone != true) || (global.clearLV2R2 == true && global.level2Count==1 && global.stone!=true))
						{
							global.stone = true;
							System.out.println("\n			The monster drops a glowing stone");
							//loot();
						}
					}
					LV2R2();
				}
				else if(global.Room==3)
				{
					if(global.clearLV2R3 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level2Count--;
						}
						if((global.clearLV2R3==true && (global.level2Chance==1) && global.stone!=true) || (global.clearLV2R3 == true && global.level2Count==1 && global.stone!=true))
						{
							global.stone = true;
							System.out.println("\n			The monster drops a glowing stone");
						}
					}
					LV2R3();
				}
				else if(global.Room==4)
				{
					if(global.clearLV2R4 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level2Count--;
						}
						if((global.clearLV2R4 == true && (global.level2Chance==1) && global.stone != true) || (global.clearLV2R4 == true && global.level2Count==1 && global.stone!=true))
						{
							global.stone = true;
							System.out.println("\n			The monster drops a glowing stone");
							//loot();
						}
					}
					LV2R4();
				}
				else if(global.Room==5)
				{
					if(global.clearLV2R5 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level2Count--;
						}
						if((global.clearLV2R5 == true && (global.level2Chance==1) && global.stone != true) || (global.clearLV2R5 == true && global.level2Count==1 && global.stone!=true))
						{
							global.stone = true;
							System.out.println("\n			The monster drops a glowing stone");
							//loot();
						}
					}
					LV2R5();
				}
			}
			
			else if(global.Level==3)
			{
				if(global.Room==1)
				{
					if(global.clearLV3R1 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level3Count--;
						}
						if((global.clearLV3R1 == true && (global.level3Chance==1)) || ((global.level3Count==1 || global.level3Count==2) && global.clearLV3R1==true))
						{
							if(global.Key4==true && global.Key5==false)
							{
								global.Key5 = true;
								System.out.println("\n			You gained one small key shapped like a Frog, must go to a door somewhere");
							}
							if(global.Key4==false)
							{
								global.Key4 = true;
								System.out.println("\n			You gained one small key shapped like a Spider, must go to a door somewhere");
							}
						}
					}
					LV3R1();
				}
				else if(global.Room==2)
				{
					if(global.clearLV3R2 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level3Count--;
						}
						if((global.clearLV3R2 == true && (global.level3Chance==1)) || ((global.level3Count==1 || global.level3Count==2) && global.clearLV3R2==true))
						{
							if(global.Key4==true && global.Key5==true)
							{
								global.Key5 = true;
								System.out.println("\n			You gained one small key shapped like a Frog, must go to a door somewhere");
							}
							if(global.Key4==false)
							{
								global.Key4 = true;
								System.out.println("\n			You gained one small key shapped like a Spider, must go to a door somewhere");
							}
						}
					}
					LV3R2();
				}
				else if(global.Room==3)
				{
					if(global.clearLV3R3 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level3Count--;
						}
						if((global.clearLV3R3 == true && (global.level3Chance==1)) || ((global.level3Count==1 || global.level3Count==2) && global.clearLV3R3==true))
						{
							if(global.Key4==true && global.Key5==false)
							{
								global.Key5 = true;
								System.out.println("\n			You gained one small key shapped like a Frog, must go to a door somewhere");
							}
							if(global.Key4==false)
							{
								global.Key4 = true;
								System.out.println("\n			You gained one small key shapped like a Spider, must go to a door somewhere");
							}
						}
					}
					LV3R3();
				}
				else if(global.Room==4)
				{
					if(global.clearLV3R4 != true && (global.rand.nextInt(2)+1==1))
					{
						System.out.println("\n			As you walk into the room you encounter a monster");
						Combat();
						if(global.run==false)
						{
							global.level3Count--;
						}
						if((global.clearLV3R4 == true && (global.level3Chance==1)) || ((global.level3Count==1 || global.level3Count==2) && global.clearLV3R4==true))
						{
							if(global.Key4==true && global.Key5==false)
							{
								global.Key5 = true;
								System.out.println("\n			You gained one small key shapped like a Frog, must go to a door somewhere");
							}
							if(global.Key4==false)
							{
								global.Key4 = true;
								System.out.println("\n			You gained one small key shapped like a Spider, must go to a door somewhere");
							}
						}
					}
					LV3R4();
				}
				else if(global.Room==5)
				{
					if(global.clearLV3R5 != true)
					{
						System.out.println("\n "
								+ "\n			You walk into the room, you see gold as fair as the eye and see piled up to the top of the room"
								+ "\n			at the rooms center you see an great pile of gold, you move closer"
								+ "\n			as you reach out to touch the shinning jems laying at the rooms center "
								+ "\n			the pile move and leps up"
								+ "\n"
								+ "\n			Drefend you self!!"
								+ ""
								+ "\n			This is the Dragons horde....");
						
						Combat();
						if(global.clearLV3R5 == true)
						{
							//loot();
						}
					}
					LV3R5();
				}
			}
			
		}
//		if(global.Health<0 && global.Imortality==false)
//		{
//			System.out.println("Death");
//		}
//		else
//		{
//			System.out.println("Win");
//		}
		

	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	public class global//saves game and player data
	{
		public static Scanner scan = new Scanner(System.in);
		
		public static Random rand = new Random();
		
		/* Character Traits */
		public static String Name ="";
		public static int Health = 0;
		public static int maxHealth = 0;
		public static int Mana = 0;
		public static int maxMana = 0;
		public static int legs = 2;
		public static int Arms = 2;
		public static boolean counter=false;
		public static boolean Imortality=false;
		public static boolean Rogue = false;
		public static boolean Paladin = false;
		public static boolean Wizard = false;

		
		/* Map */
		public static int Level =1;
		public static int Room = 1;
		public static int Door =0;
		
		
		
		/* Inventory */
		public static boolean Key1 = false;
		public static boolean Key2 = false;
		public static boolean Key3 = false;
		public static boolean Key4 = false;
		public static boolean Key5 = false;
		public static boolean Staff = false;
		public static boolean Lantern = false;
		public static boolean Dagger = false;
		public static boolean Bow = false;
		public static boolean Shield = false;
		public static boolean Sword = false;
		public static int healthPotion = 0;
		public static int manaPotion = 0;
	
		
		/* clear room/ clear chest/ clear barrel/ clear puzzle */
		public static boolean clearLV1R1=false;
		public static boolean clearLV1R2=false;
		public static boolean clearLV1R3= false;
		public static boolean clearLV1R4= false;
		public static boolean clearLV1R5= false;
		public static boolean clearLV2R1= false;
		public static boolean clearLV2R2= false;
		public static boolean clearLV2R3= false;
		public static boolean clearLV2R4= false;
		public static boolean clearLV2R5= false;
		public static boolean clearLV3R1= false;
		public static boolean clearLV3R2= false;
		public static boolean clearLV3R3= false;
		public static boolean clearLV3R4= false;
		public static boolean clearLV3R5= false;
		public static boolean barrel1= true;
		public static boolean barrel2= true;
		public static boolean barrel3= true;
		public static boolean barrel4= true;
		public static boolean barrel5= true;
		public static boolean barrel6= true;
		public static boolean barrel7= true;
		public static boolean barrel8= true;
		public static boolean barrel9= true;
		public static boolean barrel10= true;
		public static boolean barrel11= true;
		public static boolean chest1= true;
		public static boolean chest2= true;
		public static boolean chest3= true;
		public static boolean chest4= true;
		public static boolean puzzle1=true;
		public static boolean puzzle2=true;
		public static boolean puzzle3=true;
		public static boolean puzzle4=true;
		public static boolean puzzle5=true;
		public static boolean evil=false;
		public static int level1Count=6;
		public static int level2Count=5;
		public static int level3Count=5;
		public static int level1Chance = global.rand.nextInt(global.level1Count)+1;
		public static int level2Chance = global.rand.nextInt(global.level2Count)+1;
		public static int level3Chance = global.rand.nextInt(global.level3Count)+1;
		public static String E="";
		public static int Damage=0;
		public static boolean run = false;
		public static boolean monCount = false;
		public static boolean pCounter = false;
		public static int Charge=1;
		public static boolean Sneak = false;
		public static int Swords=0;
		public static boolean Flicker=false;
		public static int MH=0;
		public static boolean boss=true;
		public static boolean stone = false;
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls the Room functions based on Level, Room and Door index
	
	public static void LV1R1()//Level 1 Room 1
	{
		if(global.Door==0) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("stright") || !global.E.equals("right") || !global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Stright, Right and Left are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=2;
					global.Door=1;
					//LV1R2()
					return;
				}
				else if(global.E.equals("stright"))
				{ 
					global.Room=4;
					global.Door=2;
					//LV1R4();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=3;
					global.Door=3;
					//LV1R3();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel1 ==true)
					{
						global.barrel1 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		else if(global.Door==1) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("stright") || !global.E.equals("back") || !global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Stright, Back and Left are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=4;
					global.Door=2;
					//LV1R4();
					return;
					
				}
				else if(global.E.equals("stright"))
				{
					global.Room=3;
					global.Door=3;
					//LV1R3();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=2;
					global.Door=1;
					//LV1R2();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel1 ==true)
					{
						global.barrel1 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		
		else if(global.Door==3) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright") || !global.E.equals("right") || !global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Stright, Right and Back are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=3;
					global.Door=3;
					//LV1R3();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=2;
					global.Door=1;
					//LV1R2();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=4;
					global.Door=2;
					//LV1R4();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel1 ==true)
					{
						global.barrel1 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		
		else if(global.Door==2) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("back") || !global.E.equals("right") || !global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Left, Right and Back are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=3;
					global.Door=3;
					//LV1R3();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=4;
					global.Door=2;
					//LV1R4();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=2;
					global.Door=1;
					//LV1R2();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel1 ==true)
					{
						global.barrel1 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV1R2()//Level 1 Room 2
	{
		if(global.Door==1) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a dead end room, Back is the only path that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					//Combat();
					global.Room=1;
					global.Door=1;
					//LV1R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel2 ==true)
					{
						global.barrel2 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		
	}
	public static void LV1R3()//Level 1 Room 3
	{
		if(global.Door==3) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a dead end room, Back is the only path that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=1;  
					global.Door=3;
					//LV1R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel3 ==true)
					{
						global.barrel3 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
	}
	public static void LV1R4()//Level 1 Room 4
	{
		if(global.Door==2) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("right")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.puzzle1==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a room, Right and Back are the paths that lay before you, "
								+ "\n			some old Barrels lay in one corner of the room \n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=2;
					//LV1R1();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=5;
					global.Door=4;
					//LV1R5();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel4 ==true)
					{
						global.barrel4 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		else if(global.Door==4) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			System.out.println(global.E);
			while(!global.E.equals("left") || !global.E.equals("stright") || !global.E.equals("back")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Left and Back are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=5;
					global.Door=4;
					//LV1R5();
					return;
				}
				else if(global.E.equals("left"))
				{
					global.Room=1;
					global.Door=2;
					//LV1R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel3 ==true)
					{
						global.barrel3 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
	}
	public static void LV1R5()//Level 1 Room 5
	{
		if(global.Door==4) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("down")|| !global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Down the dark stairs and Back are the paths that lay before you, "
							+ "\n			a Chest sits in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=4;
					global.Door=4;
					//LV1R4();
					return;
				}
				else if(global.E.equals("down") && global.Key1==true && global.Key2==true)
				{
					global.Level=2;
					global.Room=1;
					global.Door=5;
					//LV2R1();
					return;
				}
				else if(global.E.equals("down") && (global.Key1!=true || global.Key2!=true))
				{
					System.out.println("\n			door is locked, You see key holes shapped like a sun and moon.");
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest1 ==true)
					{
						global.chest1 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		else if(global.Door==5) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("down") || !global.E.equals("right")|| !global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Down the dark stairs and Right are the paths that lay before you, "
							+ "\n			a Chest sits in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("down"))
				{
					global.Level=2;
					global.Room=1;
					global.Door=5;
					//LV2R1();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=4;
					global.Door=4;
					//LV1R4();
					return;
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest1 ==true)
					{
						global.chest1 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
	}
	public static void LV2R1()//Level 2 Room 1
	{
		if(global.Door==5) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("up") || !global.E.equals("stright") || !global.E.equals("left")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Up the dark stairs, Stright and Left are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("up"))
				{
					global.Level=1;
					global.Room=5;
					global.Door=5;
					//LV1R5();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=2;
					global.Door=7;
					//LV2R2();
					return;
				}
				else if(global.E.equals("left"))
				{
					global.Room=4;
					global.Door=6;
					//LV2R4();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel5 ==true)
					{
						global.barrel5 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==6) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("up") || !global.E.equals("back") || !global.E.equals("left")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Up the dark stairs, Back and Left are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("up"))
				{
					global.Level=1;
					global.Room=5;
					global.Door=5;
					//LV1R5();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=4;
					global.Door=6;
					//LV2R4();
					return;
				}
				else if(global.E.equals("left"))
				{
					global.Room=2;
					global.Door=7;
					//LV2R2();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel5 ==true)
					{
						global.barrel5 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==7) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("up") || !global.E.equals("back") || !global.E.equals("right")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a room, Up the dark stairs, Back and Right are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("up"))
				{
					global.Level=1;
					global.Room=5;
					global.Door=5;
					//LV1R5();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=2;
					global.Door=7;
					//LV2R2();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=4;
					global.Door=6;
					//LV2R4();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel5 ==true)
					{
						global.barrel5 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV2R2()//Level 2 Room 2
	{
		if(global.Door==7)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.puzzle2==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a room, Back and Stright are the paths that lay before you, "
								+ "\n			some old Barrels lay in one corner of the room \n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=7;
					//LV2R1();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=3;
					global.Door=8;
					//LV2R3();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel8 ==true)
					{
						global.barrel8 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==8)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.puzzle1==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a room, Back and Stright are the paths that lay before you, "
								+ "\n			some old Barrels lay in one corner of the room \n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=3;
					global.Door=8;
					//LV2R3();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=1;
					global.Door=7;
					//LV2R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel8 ==true)
					{
						global.barrel8 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV2R3()//Level 2 Room 3
	{
		if(global.run != true)
		{
			global.E="";
		}
		while(!global.E.equals("back") || !global.E.equals("menu") || !global.E.equals("stone"))
		{
			if(global.run == true)
			{
				global.run=false;
			}
			else
			{
				System.out.println("\n			You enter a dead end room, Back is the only path that lay before you \n");
				if(global.Key3==false)
				{
					System.out.println("\n			at the center for the room you see a Stone alter with a rounded hole in the center \n");
				}
				global.E = global.scan.nextLine();
			}
			global.E = global.E.toLowerCase();
			if(global.E.equals("back"))
			{
				global.Room=2;
				global.Door=8;
				//LV2R2();
				return;
			}
			else if(global.E.equals("menu"))
			{
				menu();
			}
			else if(global.E.equals("stone") && global.stone==true)
			{
				if(global.Key3==false)
				{
				System.out.println("\n			You fit the stone in side the hole, and a small rusted key falls from the alter");
				global.Key3=true;
				}
				else
				{
					System.out.println("\n			Stone has been placed");
				}
			}
			
			
		}
	}
	public static void LV2R4()//Level 2 Room 4
	{
		if(global.Door==6)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.puzzle3==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a room, Back and Stright are the paths that lay before you, "
								+ "\n			some old Barrels lay in one corner of the room \n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=6;
					//LV2R1();
					return;
				}
				else if(global.E.equals("stright")&& global.Key3==true)
				{
					global.Room=5;
					global.Door=9;
					//LV2R5();
					return;
				}
				else if(global.E.equals("stright") && (global.Key3!=true))
				{
					System.out.println("\n			door is locked");
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel6 ==true)
					{
						global.barrel6 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==9)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.puzzle1==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a room, Back and Stright are the paths that lay before you, "
								+ "\n			some old Barrels lay in one corner of the room \n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=5;
					global.Door=9;
					//LV2R5();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=1;
					global.Door=6;
					//LV2R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel6 ==true)
					{
						global.barrel6 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV2R5()//Level 2 Room 5
	{
		if(global.Door==9)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("down")||!global.E.equals("barrels")||!global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, Back and Down the dark stairs are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room and a chest lays in another corner\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=4;
					global.Door=9;
					//LV2R4();
					return;
				}
				else if(global.E.equals("down"))
				{
					global.Level=3;
					global.Room=1;
					global.Door=10;
					//LV3R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel7 ==true)
					{
						global.barrel7 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest2 ==true)
					{
						global.chest2 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==10)
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("stright") || !global.E.equals("down")||!global.E.equals("barrels")||!global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, Back and Down the dark stairs are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room \n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("down"))
				{
					global.Room=1;
					global.Door=10;
					//LV3R1();
					return;
				}
				else if(global.E.equals("stright")&& (global.Key3==true))
				{
					global.Room=4;
					global.Door=9;
					//LV2R4();
					return;
				}
				else if(global.E.equals("down") && (global.Key3!=true))
				{
					System.out.println("\n			door is locked");
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel7 ==true)
					{
						global.barrel7 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest2 ==true)
					{
						global.chest2 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV3R1()//Level 3 Room 1
	{
		if(global.Door==10) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("stright") || !global.E.equals("right") || !global.E.equals("up")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, Up, Left, Right and Stright are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=2;
					global.Door=11;
					//LV3R2();
					return;
				}
				else if(global.E.equals("stright"))
				{   
					global.Room=4;
					global.Door=12;
					//LV3R4();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=3;
					global.Door=13;
					//LV3R3();
					return;
				}
				else if(global.E.equals("up"))
				{
					global.Level=2;
					global.Room=5;
					global.Door=10;
					//LV2R5();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel9 ==true)
					{
						global.barrel9 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
		else if(global.Door==11) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("stright") || !global.E.equals("back") || !global.E.equals("up")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, Up, Left, Back and Stright are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=4;
					global.Door=12;
					//LV3R4();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=3;
					global.Door=13;
					//LV3R3();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=2;
					global.Door=11;
					//LV3R2();
					return;
				}
				else if(global.E.equals("up"))
				{
					global.Level=2;
					global.Room=5;
					global.Door=10;
					//LV2R5();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel9 ==true)
					{
						global.barrel9 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
				
			}
			
		}
		
		else if(global.Door==13) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("stright") || !global.E.equals("right") || !global.E.equals("up")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, Up, Right, Back and Stright are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=3;
					global.Door=13;
					//LV3R3();
					return;
				}
				else if(global.E.equals("stright"))
				{
					global.Room=2;
					global.Door=11;
					//LV3R2();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=4;
					global.Door=12;
					//LV3R4();
					return;
				}
				else if(global.E.equals("up"))
				{
					global.Level=2;
					global.Room=5;
					global.Door=10;
					//LV2R5();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel9 ==true)
					{
						global.barrel9 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==12) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("left") || !global.E.equals("back") || !global.E.equals("right") || !global.E.equals("up")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			you enter a room, up, Left, Back and Right are the paths that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("left"))
				{
					global.Room=3;
					global.Door=13;
					//LV3R3();
					return;
				}
				else if(global.E.equals("back"))
				{
					global.Room=4;
					global.Door=12;
					//LV3R4();
					return;
				}
				else if(global.E.equals("right"))
				{
					global.Room=2;
					global.Door=11;
					//LV3R2();	
					return;
				}
				else if(global.E.equals("up"))
				{
					global.Level=2;
					global.Room=5;
					global.Door=10;
					//LV2R5();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel9 ==true)
					{
						global.barrel9 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
			
		}
	}
	public static void LV3R2()//Level 3 Room 2
	{
		if(global.Door==11) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back")||!global.E.equals("barrels")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println(""
							+ "\n			You enter a dead end room, Back is the only path that lay before you, "
							+ "\n			some old Barrels lay in one corner of the room\n");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=11;
					//LV3R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel10 ==true)
					{
						global.barrel10 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV3R3()//Level 3 Room 3
	{
		if(global.Door==13) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("left")||!global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.puzzle5==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			you enter a room, Left and Back are the paths that lay before you, "
								+ "\n			a Chest sit in one corner of the room\n");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=13;
					//LV3R1();
					return;
				}
				else if(global.E.equals("left") && global.Key4==true && global.Key5==true)
				{   
					global.Room=5;
					global.Door=14;
					//LV3R5();
					return;
				}
				else if(global.E.equals("left") && global.Key4!=true && global.Key5!=true)
				{
					System.out.println("\n			door is locked");
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest3 ==true)
					{
						global.chest3 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
		else if(global.Door==14) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back") || !global.E.equals("right")||!global.E.equals("chest")|| !global.E.equals("menu"))
			{
				if(global.puzzle5==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			you enter a room, up, Right and Back are the paths that lay before you, "
								+ "\n			a Chest sit in one corner of the room");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=5;
					global.Door=14;
					//LV3R1();
					return;
				}
				else if(global.E.equals("right"))
				{   
					global.Room=1;
					global.Door=13;
					//LV3R5();
					return;
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest3 ==true)
					{
						global.chest3 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV3R4()//Level 3 Room 4
	{
		if(global.Door==12) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back")||!global.E.equals("barrels")|| !global.E.equals("menu") ||!global.E.equals("chest"))
			{
				if(global.puzzle4==true)
				{
					puzzle();
				}
				else
				{
					if(global.run == true)
					{
						global.run=false;
					}
					else
					{
						System.out.println(""
								+ "\n			You enter a dead end room, Back is the only path that lay before you, "
								+ "\n			some old Barrels and a Chest lay in the left and right corner of the room"
								+ "\n			Bones from unlucky heros lay on the floor");
						global.E = global.scan.nextLine();
					}
					global.E = global.E.toLowerCase();
				}
				if(global.E.equals("back"))
				{
					global.Room=1;
					global.Door=12;
					//LV3R1();
					return;
				}
				else if(global.E.equals("barrels"))
				{
					if(global.barrel11 ==true)
					{
						global.barrel11 =false;
						System.out.println("\n			You look inside the barrels");
						loot();
					}
					else
					{
						System.out.println("\n			Barrels are sadly empty");
					}
				}
				else if(global.E.equals("chest"))
				{
					if(global.chest4 ==true)
					{
						global.chest4 =false;
						System.out.println("\n			You try to open the chest");
						treasure();
					}
					else
					{
						System.out.println("\n			chest is sadly empty");
					}
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}
			}
		}
	}
	public static void LV3R5()//Level 3 Room 5
	{
		if(global.Door==14) 
		{
			if(global.run != true)
			{
				global.E="";
			}
			while(!global.E.equals("back")|| !global.E.equals("menu"))
			{
				if(global.run == true)
				{
					global.run=false;
				}
				else
				{
					System.out.println("\n			You enter a dead end room, Back is the only path that lay before you");
					global.E = global.scan.nextLine();
				}
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.Room=3;
					global.Door=14;
					//LV3R3();
					return;
				}
				else if(global.E.equals("menu"))
				{
					menu();
				}

			}
		}
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls miscellaneous game mechanics 
	public static void menu()//Prints menu 
	{
		System.out.println();
		System.out.println("\n			LEVEL: " + global.Level + "  " + "ROOM: " + global.Room + "  " + "DOOR: " + global.Door);
		if(global.Wizard || global.Paladin)
		{
			System.out.println("\n			Health: " + global.Health + "/" + global.maxHealth + "  " + "Mana: " + global.Mana);
		}
		else if (global.Rogue)
		{
			System.out.println("\n			Health: " + global.Health + "/" + global.maxHealth + "  " + "Arrows: " + global.Mana);
		}
		System.out.println("\n			HealthPotions: " + global.healthPotion + "  " + "ManaPotions: " + global.manaPotion);
		System.out.println();
		//System.out.println("\n			Arms: " + global.Arms + "/2");
		//System.out.println("\n			Legs: " + global.legs + "/2");
		int keys =0;
		if(global.Key1)
		{
			keys=1;
		}
		if(global.Key2)
		{
			keys=2;
		}
		if(global.Key3)
		{
			keys=3;
		}
		if(global.Key4)
		{
			keys=4;
		}
		if(global.Key5)
		{
			keys=5;
		}
		System.out.println("\n			Keys: " + keys + "/5");
		if(global.Paladin)
		{
			System.out.println("\n			Sword/Shield");
		}
		if(global.Wizard)
		{
			System.out.println("\n			Lantern/Staff");
		}
		if(global.Rogue)
		{
			System.out.println("\n			Dagger/Bow");
		}
		String D="";
		while(!D.equals("health") || !D.equals("return") || !D.equals("End?") || !D.equals("Ex"))
		{
			System.out.println("\n			Restore?, Ex?, Return? and End? \n");
			D = global.scan.nextLine();
			D = D.toLowerCase();
			if(D.equals("restore"))
			{
				Restore();
				return;
			}
			else if(D.equals("return"))
			{
				return;
			}
			else if(D.equals("ex"))
			{
				System.out.println("\n \n			Paladin Combat"
						+ "\n 			Paladin class has the most health and can deal the most damage in one hit over any other class and can health with spells and mana"
						+ "\n 			this class gets a bonus to defence when defending"
						+ "\n 			type sword to hit the monster with your sword, nothing crazy"
						+ "\n 			type mana, or channel to channel mana into your sword, for every one mana ued your next attack gets a times X1 multiplyer"
						+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken");	
				System.out.println("\n \n			Rogue Combat"
						+ "\n 			Rogues start with a smaller amount of life and just a few arrows but do the most damage out of any class per hit"
						+ "\n 			type dagger for a low power attack."
						+ "\n 			type bow for your power attack you can use 1 to 3 arrows at a time each arrow will have a chance of missing but deals full damage they use no spells"
						+ "\n 			type sneak for the rogue super move, he can make him self unseen and there for safe from attack during combat"
						+ "\n 			sneaking will give you large bonuses to hit Chance and Damage"
						+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken"
						+ "\n			use mana potion to craft arrows");
				System.out.println("\n \n			Wizard Combat"
						+ "\n 			Wizards have strong magic but week health and melee attack, can heal using potions and magic"
						+ "\n 			type spear for a strong single hit attack, this spell is one mana, its hit chance go's up the more health you have."
						+ "\n 			type missile for a multi hit attack, this spell costs 2 mana but will hit more than once "
						+ "\n 			type wall to cast a between you and your enemy, will last one turn for each charge"
						+ "\n 			your staff is your last resort or a finishing move"
						+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken");
			}
			else if(D.equals("end")) 
			{
				D="";
				while(!D.equals("yes") || !D.equals("no"))
				{
					System.out.println("\n			are you sure? Yes/No \n");
					D = global.scan.nextLine();
					D = D.toLowerCase();
					if(D.equals("yes"))
					{
						System.exit(0);
					}
					else if(D.equals("no"))
					{
						return;
					}
				
				}
			}
		}
	}
	public static void Map()//Prints map//Currently unused
	{
		System.out.println();
		System.out.println("\n			LEVEL: " + global.Level + "  " + "ROOM: " + global.Room + "  " + "DOOR: " + global.Door);
		if(global.Wizard || global.Paladin)
		{
			System.out.println("\n			Health: " + global.Health + "/" + global.maxHealth + "  " + "Mana: " + global.Mana);
		}
		else
		{
			System.out.println("\n			Health: " + global.Health + "/" + global.maxHealth + "  " + "Arrows: " + global.Mana);
		}
		System.out.println("\n			HealthPotions: " + global.healthPotion + "  " + "ManaPotions: " + global.manaPotion);
		System.out.println();
	}
	public static void ex()//prints combat work up
	{
		System.out.println("\n \n			Paladin Combat"
				+ "\n 			Paladin class has the most health and can deal the most damage in one hit over any other class and can health with spells and mana"
				+ "\n 			this class gets a bonus to defence when defending"
				+ "\n 			type sword to hit the monster with your sword, nothing crazy"
				+ "\n 			type mana, or channel to channel mana into your sword, for every one mana ued your next attack gets a times X1 multiplyer"
				+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken");	
		System.out.println("\n \n			Rogue Combat"
				+ "\n 			Rogues start with a smaller amount of life and just a few arrows but do the most damage out of any class per hit"
				+ "\n 			type dagger for a low power attack."
				+ "\n 			type bow for your power attack you can use 1 to 3 arrows at a time each arrow will have a chance of missing but deals full damage they use no spells"
				+ "\n 			type sneak for the rogue super move, he can make him self unseen and there for safe from attack during combat"
				+ "\n 			sneaking will give you large bonuses to hit Chance and Damage"
				+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken"
				+ "\n			use mana potion to craft arrows");
		System.out.println("\n \n			Wizard Combat"
				+ "\n 			Wizards have strong magic but week health and melee attack, can heal using potions and magic"
				+ "\n 			type spear for a strong single hit attack, this spell is one mana, its hit chance go's up the more health you have."
				+ "\n 			type missile for a multi hit attack, this spell costs 2 mana but will hit more than once "
				+ "\n 			type wall to cast a between you and your enemy, will last one turn for each charge"
				+ "\n 			your staff is your last resort or a finishing move"
				+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an attack bonues your you next attack if your footing isnt broken");
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	
	//Controls over all combat, Player, Monster and Boss
	public static void ghostCombat(int MH)//Not active, no current calls
	{
		if(global.rand.nextInt(6)+1>2 && global.Flicker==false)
		{
			global.Flicker=true;
			System.out.println("\n			You run for your life back the way you came");
		}
		
		System.out.println("\b			Monster health: " + MH);
		MH = MH - global.Damage;
		int chance = global.rand.nextInt(10)+1;
		if(MH>0 && global.Sneak!=true && global.Swords==0)
		{
			if(chance<4 && global.monCount!=true)
			{
				if((global.rand.nextInt(100)+1)>0)
				{
					global.Damage=global.rand.nextInt(5)+1;
					global.Health = global.Health - global.Damage;
					System.out.println("\n			The monster attacks, its claws rip at you dealing " + global.Damage + " Damage");
					if(global.Health<=0 && !global.Imortality==true)
					{
						Death();						
					}
					global.Flicker=false;
				}
				else
				{
					System.out.println("n			The monster swings wildly and misses its attack");
					global.Flicker=false;
				}
			}
			else if(chance>3 && chance<6 && global.monCount!=true)
			{
				
				for(int i = 0; i<5 && global.rand.nextInt(4)+1>2; i++)
				{
					if((global.rand.nextInt(5)+1)>2)
					{
						System.out.println("\n			The monster attacks!!");
						global.Damage=global.rand.nextInt(2)+1;
						global.Health = global.Health - global.Damage;
						if(i==0) 
						{
							System.out.println("\n			The monster makes several fast attacks!!");
						}
						System.out.println("\n			The monster strikes! dealing " + global.Damage + " Damage!");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
						global.Flicker=false;
					}
					else
					{
						System.out.println("\n			The monster attacks!!");
						if(global.rand.nextInt(2)+1%2==0)
						{
							System.out.println("\n			The monster swings wildly and misses...");
						}
						else
						{
							System.out.println("\n			You roll out of the way!");
						}
						global.Flicker=false;
					}
				}
			}
			else if(chance>5 && chance<10 || global.monCount==true)
			{
				if(global.monCount==true)
				{
					if((global.rand.nextInt(10)+1)>3)
					{
						System.out.println("\n			The monster attacks!!");
						global.Damage=global.rand.nextInt(4)+2 + global.rand.nextInt(4)+2;
						global.Health = global.Health - global.Damage;
						System.out.println("\n			The monster throws its weight into you dealing " + global.Damage + " Damage!");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
						global.monCount=false;
						global.Flicker=false;
					}
					else
					{
						global.monCount=false;
						global.Flicker=false;
						System.out.println("\n			The ground shakes, the barely get out if the way....");
					}
				}
				else
				{
					global.monCount=true;
					global.Flicker=false;
					System.out.println("\n			The monster readys for a powerful attack watch out!!!!");
				}
			}
			else if(chance==10 || global.monCount!=true)
			{
				System.out.println("\n			The monster heals its self....");
				MH = MH + global.rand.nextInt(3)+1;
				System.out.println("\n			Monster health: " + MH);
			}
		}
		else if(MH>0 && global.Sneak)
		{
			System.out.println("\n			The monster is unaware of you");
		}
		else if(MH>0 && global.Swords>0)
		{
			System.out.println("\n			The monster is unable to move due to swords");
			global.Swords--;
		}
		else
		{
			System.out.println("\n			The Monster falls to the ground and turns to dust before "
					+ "\n			yout eyes, you check the ashes for loot");
			loot();
		}
		//global.counter=false;
		clear();
		if(MH<=0)
		{
			Restore();
		}
		global.E="";
		if(MH<=0)
		{
			return;
		}		
	}
	public static void bossCombat()
	{
		if(global.boss==true)
		{
			global.MH = global.MH + ((global.rand.nextInt(5)+20) + (global.rand.nextInt(5)+20))*4;
			global.boss=false;
		}
		global.MH = global.MH - global.Damage;
		if(global.MH<0)
		{
			global.MH=0;
		System.out.println("\n			Dragon health: " + global.MH + "\n" );
		}
		else
		{
			System.out.println("\n			Dragon health: " + global.MH + "\n" );
		}
		
		int chance = global.rand.nextInt(10)+1;
		if(global.MH>0 && global.Sneak!=true && global.Swords==0)
		{
			if(chance<4 && global.monCount!=true)
			{
				if((global.rand.nextInt(100)+1)>80)
				{
					global.Damage=global.rand.nextInt(4)+7;
					global.Health = global.Health - global.Damage;
					System.out.println(""
							+ "\n			The monster attacks, its large claws rip at you "
							+ "\n			dealing " + global.Damage + " Damage");
					if(global.Health<=0 && !global.Imortality==true)
					{
						Death();						
					}
				}
				else
				{
					System.out.println("\n			The monster swings wildly and misses its attack");
				}
			}
			else if(chance>3 && chance<6 && global.monCount!=true)
			{
				
				for(int i = 0; i<5 && global.rand.nextInt(4)+1>2; i++)
				{
					if((global.rand.nextInt(7)+1)>2)
					{
						System.out.println("\n			The monster attacks!!");
						global.Damage=global.rand.nextInt(2)+2;
						global.Health = global.Health - global.Damage;
						if(i==0) 
						{
							System.out.println("\n			The Dragon slams his tail into the gold!! waves ripple out!!!");
						}
						System.out.println("\n			you hit by a wave of gold! dealing " + global.Damage + " Damage!");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
					}
					else
					{
						System.out.println("\n			The monster attacks!!");
						if(global.rand.nextInt(2)+1%2==0)
						{
							System.out.println("\n			The wave misses you");
						}
						else
						{
							System.out.println("\n			You roll out of the way!");
						}
					}
				}
			}
			else if(chance>5 && chance<10 || global.monCount==true)
			{
				if(global.monCount==true)
				{
					if((global.rand.nextInt(10)+1)>7)
					{
						System.out.println("\n 			The Dragon attacks!!");
						global.Damage=global.rand.nextInt(4)+2 + global.rand.nextInt(4)+2;
						global.Health = global.Health - global.Damage;
						System.out.println("\n			The the dragon fires is flames at you dealing " + global.Damage + " Damage!");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
						global.monCount=false;
					}
					else
					{
						global.monCount=false;
						System.out.println("\n			The ground shakes, the barely get out if the way....");
					}
				}
				else
				{
					global.monCount=true;
					System.out.println("\n			The monster readys for a powerful attack watch out!!!!");
				}
			}
			else if(chance==10 || global.monCount!=true)
			{
				System.out.println("\n			The monster heals its self....");
				global.MH = global.MH + global.rand.nextInt(2)+1;
				System.out.println("\n			Monster health: " + global.MH);
			}
		}
		else if(global.MH>0 && global.Sneak)
		{
			System.out.println("\n			The monster is unaware of you");
		}
		else if(global.MH>0 && global.Swords>0)
		{
			System.out.println("\n			Your walls block the dragons path");
			global.Swords--;
		}
		else
		{
			System.out.println("\n			The Dragon falls to the ground and turns to dust before your eyes you feel a chill in the air");
			Win();
		}
		//global.counter=false;
		clear();
		if(global.MH<=0)
		{
			Restore();
		}
		global.E="";
		if(global.MH<=0)
		{
			return;
		}
	}
	public static void monCombat()
	{
		global.MH = global.MH - global.Damage;
		global.Damage = 0;
		if(global.MH<0)
		{
			global.MH=0;
		System.out.println("\n			Monster health: " + global.MH + "\n" );
		}
		else
		{
			System.out.println("\n			Monster health: " + global.MH + "\n" );
		}
		int chance = global.rand.nextInt(10)+1;
		if(global.MH==0)
		{
			global.monCount=false;
		}
		if(global.MH>0 && global.Sneak!=true && global.Swords==0)
		{
			if(chance<4 && global.monCount!=true)
			{
				if((global.rand.nextInt(100)+1)>0)
				{
					global.Damage=global.rand.nextInt(5)+1;
					global.Health = global.Health - global.Damage;
					System.out.println("\n			The monster attacks, its claws rip at you dealing " + global.Damage + " Damage \n");
					if(global.Health<=0 && !global.Imortality==true)
					{
						Death();						
					}
				}
				else
				{
					System.out.println("\n			The monster swings wildly and misses its attack \n");
				}
			}
			else if(chance>3 && chance<6 && global.monCount!=true)
			{
				
				for(int i = 0; i<5 && global.rand.nextInt(4)+1>2; i++)
				{
					if((global.rand.nextInt(5)+1)>2)
					{
						System.out.println("\n			The monster attacks!!");
						global.Damage=global.rand.nextInt(2)+1;
						global.Health = global.Health - global.Damage;
						if(i==0) 
						{
							System.out.println("\n			The monster makes several fast attacks at you!! \n");
						}
						System.out.println("\n			The monster strikes! dealing " + global.Damage + " Damage! \n");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
					}
					else
					{
						System.out.println("\n			The monster attacks!!\n");
						if(global.rand.nextInt(2)+1%2==0)
						{
							System.out.println("\n			The monster swings wildly and misses...\n");
						}
						else
						{
							System.out.println("\n			You roll out of the way!\n");
						}
					}
				}
			}
			else if((chance>5 && chance<10) || global.monCount==true)
			{
				if(global.monCount==true)
				{
					if((global.rand.nextInt(10)+1)>3)
					{
						System.out.println("\n			The monster attacks!!\n ");
						global.Damage=global.rand.nextInt(4)+2 + global.rand.nextInt(4)+2;
						global.Health = global.Health - global.Damage;
						System.out.println("\n			The monster throws its weight into you dealing " + global.Damage + " Damage!\n");
						if(global.Health<=0 && !global.Imortality==true)
						{
							Death();						
						}
						global.monCount=false;
					}
					else
					{
						global.monCount=false;
						System.out.println("\n			The ground shakes, the barely get out if the way in time....\n");
					}
				}
				else
				{
					global.monCount=true;
					System.out.println("\n			The monster readys for a powerful attack watch out!!!!\n");
				}
			}
			else if(chance==10 || global.monCount!=true)
			{
				System.out.println("\n			The monster heals its self....\n");
				global.MH = global.MH + global.rand.nextInt(3)+1;
				System.out.println("\n			Monster health: " + global.MH +  "\n");
			}
		}
		else if(global.MH>0 && global.Sneak)
		{
			System.out.println("\n			The monster is unaware of you\n");
		}
		else if(global.MH>0 && global.Swords>0)
		{
			System.out.println("\n			The monster is unable to move due to your walls\n");
			global.Swords--;
		}
		else
		{
			System.out.println("\n			The Monster falls to the ground and turns to dust before yout eyes, you check the ashes for loot\n");
			global.MH =0;
			loot();
			
		}
		//global.counter=false;
		clear();
		if(global.MH<=0)
		{
			Restore();
		}
		global.E="";
		if(global.MH<=0)
		{
			
			return;
		}
	}
	public static void Defend()
	{
		if(global.monCount==false)
		{
			if((global.rand.nextInt(3)+1)>=2)
			{
				if(global.Shield)
				{
				System.out.println("\n			You hold your shield and ready yourself for the attack");
				System.out.println("\n			The monsters claws strike! you take damage from recoil dealing 1 damage");
				global.Health--;
				System.out.println("\n			Health: " + global.Health);
					if(global.pCounter==true)
					{
						global.pCounter=false;
						global.Mana=(global.Charge-1) + global.Mana;
						if(global.Charge>1)
						{
							System.out.println("\n			some of the mana in your sword returns to you");
							System.out.println("\n			Mana: " + global.Mana);
						}
						global.Charge=1;
					}
				}
				else if(global.Sneak==true)
				{
					if(global.rand.nextInt(2)==1)
					{
						System.out.println("\n			your found!!");
						System.out.println("\n			you ready yourself for the attack");	
						System.out.println("\n			The monster swings wildly and hits");
						global.Health = global.Health - 2;
						System.out.println("\n			Health: " + global.Health);
						global.Sneak=false;
					}
					else
					{
						System.out.println("\n			you remain unseen");
					}
				}
				else
				{
					System.out.println("\n			you ready yourself for the attack");	
					System.out.println("\n			The monsters claws strike! you take damage from recoildealing 2 damage");
					global.Health=global.Health-2;
					System.out.println("\n			Health: " + global.Health);
				}
				
				global.counter=true;
				System.out.println(global.counter);
				return;	
			}
			else
			{
				if(global.Shield)
				{
				System.out.println("\n			You hold your shield and ready yourself for the attack");
				System.out.println("\n			The monster swings wildly and misses its attack");
					if(global.pCounter==true)
					{
						global.pCounter=false;
						global.Mana=(global.Charge-1) + global.Mana;
						if(global.Charge>1)
						{
							System.out.println("\n			some of the mana in your sword returns to you");
							System.out.println("\n			Mana: " + global.Mana);
						}
						global.Charge=1;
					}
					global.counter=true;
				}
				else if(global.Sneak==true)
				{
					if(global.rand.nextInt(2)==1)
					{
						System.out.println("\n			your found!!");
						System.out.println("\n			you ready yourself for the attack");	
						System.out.println("\n			The monster swings wildly and misses");
						global.Sneak=false;
					}
					else
					{
						System.out.println("\n			you remain unseen");
					}
				}
				else
				{
				System.out.println("\n			you ready yourself for the attack");	
				System.out.println("\n			The monster swings wildly and misses its attack");	
				global.Health=global.Health-2;
				}
				global.counter=true;
				
				return;
			}
		}
		else if(global.monCount==true)
		{
			if((global.rand.nextInt(6)+1)<=2)
			{
				if(global.Shield)
				{
					global.Damage=global.rand.nextInt(3)+1;
					System.out.println("\n			You hold your shield and ready yourself for the attack");
					System.out.println("\n			The monsters throws its weight into you at full force! you take damage from recoil dealing " + global.Damage + " damage, you loss your balance");
					global.Health = global.Health - global.Damage;
					System.out.println("\n			Health: " + global.Damage);
					if(global.pCounter==true)
					{
						global.pCounter=false;
						global.Mana=(global.Charge-1) + global.Mana;
						if(global.Charge>1)
						{
							System.out.println("\n			some of the mana in your sword returns to you");
							System.out.println("\n			Mana: " + global.Mana);
						}
						global.Charge=1;
					}
				}
				else if(global.Sneak==true)
				{
					if(global.rand.nextInt(3)==1)
					{
						System.out.println("\n			your found!!");
						System.out.println("\n			you ready yourself for the attack");	
						System.out.println("\n			The monster swings wildly and hits, you loss your footing");
						global.Health = global.Health - global.rand.nextInt(4)+1;
						System.out.println("\n			Health: " + global.Health);
						global.Sneak=false;
					}
					else
					{
						System.out.println("\n			you remain unseen");
					}
				}
				else
				{
					global.Damage=global.rand.nextInt(4)+1;	
					System.out.println("\n			you ready yourself for the attack");	
					System.out.println("\n			The monsters throws its weight into you at full force! you take "
							+ "\n			damage from recoil dealing" + global.Damage + " damage, you loss your balance");
					global.Health = global.Health - global.Damage;
					System.out.println("\n			Health: " + global.Health);
				}
				global.monCount=false;
				return;
			}
			else
			{
				if(global.Shield)
				{
				System.out.println("\n			The monster swings wildly and misses its attack");
					if(global.pCounter==true)
					{
						global.pCounter=false;
						global.Mana=(global.Charge-1) + global.Mana;
						if(global.Charge>1)
						{
							System.out.println("\n			some of the mana in your sword returns to you");
							System.out.println("\n			Mana: " + global.Mana);
						}
						global.Charge=1;
					}
				}
				else if(global.Sneak==true)
				{
					if(global.rand.nextInt(3)==1)
					{
						System.out.println("\n			your found!!");
						System.out.println("\n			you ready yourself for the attack");	
						System.out.println("\n			The monster swings wildly and misses");
						global.Sneak=false;
					}
					else
					{
						System.out.println("\n you remain unseen");
					}
				}
				else
				{
					System.out.println("\n			you ready yourself for the attack");	
					System.out.println("\n			The monster swings wildly and misses its attack");	
				}
				global.monCount=false;
				global.counter=true;
				return;
			}
		}
	}
	public static void Combat()
	{
		global.MH = (global.rand.nextInt(9)+global.rand.nextInt(9));
		if(global.Door==14)
		{
			System.out.println("\n			Before you stands a great Dragon, skin a bright red and eyes black as night");
		}
		while(global.MH>0)
		{
			String C = "";
			while(!C.equals("defend") || !C.equals("attack") || !C.equals("run") || !C.equals("menu"))
			{
				System.out.println("\n			Defend, Attack, Run or Menu \n");
				C = global.scan.nextLine();
				C = C.toLowerCase();
				if(C.equals("defend"))
				{
					Defend();
				}
				else if(C.equals("attack"))
				{
					if(global.Flicker==false)
					{
						global.Damage =0;
							
						if(global.Sword)
						{
							PaladinCombat();
						}
						else if(global.Staff)
						{
							WizardCombat();
						}
						else if(global.Bow)
						{
							RogueCombat();
						}
					}
//					monCombat();
					if(global.Door==14)
					{
						bossCombat();
					}
					else
					{
						monCombat();
					}
				//C="";
				break;
				}
				else if(C.equals("run"))
				{
					System.out.println("\n			You Run for your life back the way you came");
					global.E="back";
					global.run=true;
					//Restore();
					return;
				}
				else if(C.equals("menu"))
				{
					menu();
				}
			}
		}
		return;
	}
	public static void PaladinCombat()
	{
		String B = "";
		while(!B.equals("sword") || !B.equals("Smite") || !B.equals("ex"))
		{
			System.out.println("\n			Will you attack with your Sword, or charge your Smite? \n");
			B = global.scan.nextLine();
			B = B.toLowerCase();
			if(B.equals("sword"))
			{
				if((global.rand.nextInt(100)+1)+global.Health>25)
				{
					global.Damage = global.rand.nextInt(6)+5;
					if(global.pCounter==true)
					{	
						global.Damage = global.Damage*global.Charge;
						global.Charge=1;
						
						System.out.println("\n			your blade glows with holy light");
						global.pCounter=false;
					}
					if(global.counter==true)
					{
						global.Damage=global.Damage*2;
						System.out.println("\n			You strike the monster with a powerfull blow");
						global.counter=false;
					}
					System.out.println("\n			Your sword crashes into the monster dealing " + global.Damage + " damage");
				}
				else
				{
					System.out.println("\n			your blade misses");
					global.Damage=0;
					global.pCounter=false;
					global.Charge=1;
					global.counter=false;
				}
			break;
			}
			else if(B.equals("smite"))
			{
				if(global.pCounter==false)
				{
					
					while(!B.equals("mana") || !B.equals("channel") ||!B.equals("return"))
					{
						System.out.println("\n			Will you Channel Mana to your sword or Return? \n");
						B = global.scan.nextLine();
						B = B.toLowerCase();
						if(B.equals("return"))
						{
							System.out.println("\n			your blade glows with divine light, your next attack will be stronger");
							global.pCounter=true;
							return;
						}
						else if(B.equals("mana")|| B.equals("channel"))
						{
							if(global.Mana>0)
							{
							System.out.println("\n			You use mana to harden your blade");
							global.Charge++;
							global.Mana--;
							}
							else
							{
								System.out.println("\n			Out of Mana");
							}
						}
					}
				}
			}
			else if(B.equals("ex"))
			{
				ex();
			}
		}
	}
	public static void WizardCombat()
	{
		String B = "";
		while(!B.equals("staff") || !B.equals("magic"))
		{
			System.out.println("\n			Will you attack with your Magic or Staff? \n");
			B = global.scan.nextLine();
			B = B.toLowerCase();
			if(B.equals("staff"))
			{
				if((global.rand.nextInt(100)+1)>30)
				{
					global.Damage = global.rand.nextInt(2)+1;
					if(global.counter)
					{
						global.Damage=global.Damage+2;
						System.out.println("\n			Your ready your staff");
						global.counter=false;
					}
					System.out.println("\n			Your staff strickes into the monster dealing " + global.Damage + " damage");
				}
				else
				{
					System.out.println("\n			Your swing misses");
					global.Damage=0;
					global.counter=false;
				}
				return;
			}
			else if(B.equals("magic"))
			{
				if(global.Mana>0)
				{
					B = "";
					while(!B.equals("light") || !B.equals("missile") || !B.equals("wall"))
					{
						System.out.println("\n			what spell Light, Missile or Wall \n");
						B = global.scan.nextLine();
						B = B.toLowerCase();
						if(B.equals("light"))
						{
							global.Damage = global.rand.nextInt(7)+7;
							if((global.rand.nextInt(100)+1)-global.Health>25)
							{
								if(global.counter)
								{
									global.Damage=global.Damage*3;
								}
								System.out.println("\n			You summon a column of light down from above and it "
										+ "\n			crashes into the monster dealing " + global.Damage + " damage");
								global.Mana--;
								global.counter=false;
							}
							else
							{
								System.out.println("\n			The Monster avoids the attack");
								global.Damage=0;
								global.counter=false;
								global.Mana--;
							}
							return;
						}
						else if(B.equals("missile"))
						{
							global.Damage = global.rand.nextInt(3)+3;
							if(global.Mana>1)
							{
								global.Damage=0;
								int mul =4;
								if(global.counter)
								{
									mul=8;
								}
								if((global.rand.nextInt(100)+1)>0)
								{
									for(int i =0; i<mul; i++)
									{
										if(global.rand.nextInt(6)+1>2)
										{
											global.Damage = global.Damage + global.rand.nextInt(2)+2;
											System.out.println(""
													+ "\n			Your magic missile spell crashes into the monster"
													+ "\n			dealing a total of " + global.Damage + " damage");
										}
										else
										{
											System.out.println("\n			The Monster avoids the attack");
										}
									}
									global.Mana=global.Mana-2;
									global.counter=false;
									return;
								}
								break;
							}
							else
							{
								System.out.println("\n			you dont have enough mana");
							}
						}
						else if(B.equals("wall"))
						{
							B="";
							while(!B.equals("mana") || !B.equals("channel") ||!B.equals("return"))
							{
								System.out.println("\n			Will you channel mana to your staff or return? \n");
								global.Mana--;
								B = global.scan.nextLine();
								B = B.toLowerCase();
								if(B.equals("return"))
								{
									if((global.rand.nextInt(100)+1)>20)
									{
										System.out.println("\n			your staff glows bright");
										global.pCounter=true;
										global.Swords = global.Charge;
										global.Charge=0;
										System.out.println(""
												+ "\n			you cast swords of revealing light!! great swords of light fall between "
												+ "\n			you and your foe like a wall between you \n");
										return;
									}
									else
									{
										System.out.println("\n			The Monster avoids the attack");
										global.counter=false;
										global.Charge = 0;
										global.Damage=0;
										return;
									}
								}
								else if(B.equals("mana")|| B.equals("channel"))
								{
									if(global.Mana>0)
									{
										System.out.println("\n			you draw on the mana within \n ");
										global.Mana--;
										global.Charge++;
									}
									else
									{
										System.out.println("\n			you dont have enough mana \n");
									}
								}
							}
							return;
						}
					}
				}
				else if(global.Mana<=0)
				{
					System.out.println("\n			out of mana \n");
				}
			}
			else if(B.equals("magic"))
			{
				ex();
			}
		}
	}
	public static void RogueCombat()
	{
		String B = "";
		while(!B.equals("bow") || !B.equals("dagger") || !B.equals("sneak") || !B.equals("ex"))
		{
			System.out.println("\n			what will you do Bow, Dagger or Sneak?\n");
			B = global.scan.nextLine();
			B = B.toLowerCase();
			if(B.equals("dagger"))
			{
				if((global.rand.nextInt(100)+1)>10)
				{
					global.Damage = global.rand.nextInt(3)+2;
					if(global.counter)
					{
						global.Damage=global.Damage*2;
						System.out.println("\n			You ready to strike!");
					}
					if(global.Sneak)
					{
						global.Damage = global.Damage*2;
						System.out.println("\n			You go for the throat");
					}
					System.out.println("\n			Your dagger strikes dealing " + global.Damage + " damage");
					if(global.Sneak)
					{
						global.Sneak=false;
						System.out.println("\n			Your no longer hidden");
					}
					global.counter=false;
				}
				else
				{
					System.out.println("\n			Your dagger misses its mark");
					global.Damage=0;
					if(global.Sneak)
					{
						global.Sneak=false;
						System.out.println("\n			Your no longer hidden");
					}
					global.counter=false;
				}
				break;
			}
			else if(B.equals("bow"))
			{
				global.Charge=1;
				while(!B.equals("1") || !B.equals("2") || !B.equals("3"))
				{
					System.out.println(""
							+ "\n			How many arrows will you use? "
							+ "\n			you can use up to 3 at a time \n");
					B = global.scan.nextLine();
					if(B.equals("1"))
					{
						global.Charge=1;
						global.Mana--;
					}
					else if(B.equals("2"))
					{
						global.Charge=2;
						global.Mana-=2;
					}
					else if(B.equals("3"))
					{
						global.Charge=3;
						global.Mana-=3;
					}
					if(global.Charge>1)
					{
						System.out.println("\n			you ready " + global.Charge + " arrows");
					}
					else
					{
						System.out.println("\n			you ready 1 arrow");
					}
					global.Damage=0;
					for(int i =1; i<=global.Charge; i++)
					{
						if((global.rand.nextInt(100)+1)>34)
						{	
							global.Damage = global.rand.nextInt(5)+4;
							if(global.counter)
							{
								global.Damage = global.Damage*2;
								System.out.println("\n			you ready your bow!");
							}
							if(global.Sneak)
							{
								global.Damage = global.Damage*3;
								System.out.println("\n			you wait for the target to show its weak spot");
							}
							System.out.println(""
									+ "\n			Your arrow crashes into the monster "
									+ "\n			dealing " + global.Damage + " damage");
							if(global.Sneak)
							{
								global.Sneak=false;
								System.out.println("\n			Your no longer hidden");
							}
							global.counter=false;
						}
						else
						{
							System.out.println("\n			you arrows miss the target");
							global.Damage+=0;
							if(global.Sneak)
							{
								global.Sneak=false;
								System.out.println("\n			Your no longer hidden");
								global.counter=false;
							}
						}
					}
					global.Charge=1;
					return;
				}
			}
			else if(B.equals("sneak"))
			{
				if((global.rand.nextInt(100)+1)>30)
				{
					System.out.println("\n			your now undetected");
					global.Sneak=true;
					return;
				}
				else
				{
					System.out.println("\n			Sneak failed");
					global.counter=false;
					return;
				}
			}
			else if(B.equals("ex"))
			{
				ex();
			}
		}
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls puzzle function calls
	
	public static void puzzle()//Directs path based on room
	{
		if(global.Level==1 & global.Room==4)//global.Level==1 && global.Room==4
		{
			global.E = "";
			while(!global.E.equals("back") || !global.E.equals("try"))
			{
				System.out.println(""
						+ "\n			before you and enter this you must solve the puzzle, "
						+ "\n			will you Try? or turn Back?");
				global.E = global.scan.nextLine();
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.E="back";
					return;
				}
				else if(global.E.equals("try"))
				{
					puzzle1();
					return;
				}
			}
		}
		else if(global.Level==2 && global.Room==2)//global.Level==2 && global.Room==2
		{
			global.E = "";
			while(!global.E.equals("back") || !global.E.equals("try"))
			{
				System.out.println(""
						+ "\n			before you and enter this you must solve the puzzle, "
						+ "\n			will you Try? or turn Back?");
				global.E = global.scan.nextLine();
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.E="back";
					return;
				}
				else if(global.E.equals("try"))
				{
					puzzle2();
					return;
				}
			}
		}
		else if(global.Level==2 && global.Room==4)//global.Level==2 && global.Room==4 && global.puzzle3==true
		{
			global.E = "";
			while(!global.E.equals("back") || !global.E.equals("try"))
			{
				System.out.println(""
						+ "\n			before you and enter this you must solve the puzzle, "
						+ "\n			will you Try? or turn Back?");
				global.E = global.scan.nextLine();
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.E="back";
				}
				else if(global.E.equals("try"))
				{
					puzzle3();
					return;
				}
			}
		}
		else if(global.Level==3 && global.Room==3)//global.Level==3 && global.Room==3 && global.puzzle4==true
		{
			global.E = "";
			while(!global.E.equals("back") || !global.E.equals("try"))
			{
				System.out.println(""
						+ "\n			before you and enter this you must solve the puzzle, "
						+ "\n			will you Try? or turn Back?");
				global.E = global.scan.nextLine();
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.E="back";
					return;
				}
				else if(global.E.equals("try"))
				{
					puzzle5();
					return;
				}
			}
		}
		else if(global.Level==3 && global.Room==4)//global.Level==3 && global.Room==4 && global.puzzle5==true
		{
			global.E = "";
			while(!global.E.equals("back") || !global.E.equals("try"))
			{
				System.out.println(""
						+ "\n			before you and enter this you must solve the puzzle, "
						+ "\n			will you Try? or turn Back?");
				global.E = global.scan.nextLine();
				global.E = global.E.toLowerCase();
				if(global.E.equals("back"))
				{
					global.E="back";
					return;
				}
				else if(global.E.equals("try"))
				{
					puzzle4();
					return;
				}
			}
		}
	}
	public static void puzzle1()//level 1 Room 4
	{
		switch(global.rand.nextInt(5)+1)
		{
		case 1:
			System.out.println("\n			your able to go Back at any point");
			String C = "";
			while(!C.equals("towel") || !C.equals("back"))
			{
				System.out.println("\n			What gets wet while drying?");
				C = global.scan.nextLine();
				C = C.toLowerCase();
				if(C.equals("towel"))
				{
					global.puzzle1=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(C.equals("back"))
				{
					global.E="back";
					break;
				}
				System.out.println("\n			Incorrect!");
			}
			break;
		case 2:
			System.out.println("\n			your able to go Back at any point");
			String D = "";
			while(!D.equals("fire") || !D.equals("back"))
			{
				System.out.println("\n			I eat, I grow, I breathe, I reproduce, but i do not live, What am I?");
				D = global.scan.nextLine();
				D = D.toLowerCase();
				if(D.equals("fire"))
				{
					global.puzzle1=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(D.equals("back"))
				{
					global.E="back";
					break;
				}
				System.out.println("\n			Incorrect!");
			}
			break;
		case 3:
			System.out.println("\n			your able to go Back at any point");
			String E = "";
			while(!E.equals("potato") || !E.equals("back"))
			{
				System.out.println("\n			What has lots of eyes, but can’t see?");
				E = global.scan.nextLine();
				E = E.toLowerCase();
				if(E.equals("potato"))
				{
					global.puzzle1=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(E.equals("back"))
				{
					global.E="back";
					break;
				}
				System.out.println("\n			Incorrect!");
			}
			break;
		case 4:
			System.out.println("\n			your able to go Back at any point");
			String F = "";
			while(!F.equals("halfway") || !F.equals("back"))
			{
				System.out.println("\n			How far can you walk into the woods?");
				F = global.scan.nextLine();
				F = F.toLowerCase();
				if(F.equals("halfway"))
				{
					global.puzzle1=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(F.equals("back"))
				{
					global.E="back";
					break;
				}
				System.out.println("\n			Incorrect!");
			}
			break;
		case 5:
			System.out.println("\n			your able to go Back at any point");
			String G = "";
			while(!G.equals("live") || !G.equals("back")|| !G.equals("evil"))
			{
				System.out.println("\n			Spelled forwards I’m what you do every day, "
						+ "\n			spelled backward I’m what lays ahead of you. What am I?");
				G = global.scan.nextLine();
				G = G.toLowerCase();
				if(G.equals("live"))
				{
					global.puzzle1=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(G.equals("back"))
				{
					global.E="back";
					break;
				}
				else if(G.equals("evil"))
				{
					global.puzzle1=false;
					global.evil=true;
					System.out.println("\n			you feel a chill");
					break;
				}
				System.out.println("\n			Incorrect!");
			}
			break;
		}
	}
	public static void puzzle2()//level 2 Room 2
	{
		System.out.println(""
				+ "\n			your able to go Back at any point, as you walk down the long hallway, "
				+ "\n			the lights grow dimmer as you near the stone door, its locked with two buttons on it, "
				+ "\n			a Sun and a Moon"
				+ "\n			you look for clues around you");
		
		boolean correct =true;
		int moon =0;
		int sun =0;
		boolean [] arr = new boolean [5];
		boolean [] arr2 = new boolean [5];
		
		for(int i = 0; i<arr.length; i++)
		{
			if((global.rand.nextInt(2)+1)%2==0)
			{
			arr[i]=true;
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==true)
			{
				moon++;
			}
			else
			{
				sun++;
			}
		}
		System.out.println(""
				+ "\n			The number "+ moon + " is writen in blood on the wall "
				+ "\n			and the number " + sun + " is writen on the floor in blood");
		System.out.println("\n			hit the moon or sun buttons\n");
		do
		{
			for(int i = 0; i<arr2.length; i++)
			{
				String B = "";
				while(!B.equals("moon") || !B.equals("sun") || !B.equals("back"))
				{
					B = global.scan.nextLine();
					B = B.toLowerCase();
					if(B.equals("moon"))
					{
						arr2[i]=true;
						break;
					}
					else if(B.equals("sun"))
					{
						arr2[i]=false;
						break;
					}
					else if(B.equals("back"))
					{
						System.out.println("\n			as you set away you hear the gears reset");
						global.E="back";
						return;
					}
				}
			}
			for(int i = 0; i<arr2.length; i++)
			{
				if(arr[i]!=arr2[i])
				{
					correct=false;
				}
			}
			if(correct==true)
			{
				System.out.println("\n			correct, you hear the old gears move, the door opens");
				global.puzzle2=false;
				correct=false;
			}
			else if(correct==false)
			{
				System.out.println("\n			Incorrect, the can hear old gears reset behind the wall");
				correct=true;
			}
		}while(correct==true);
	}
	public static void puzzle3()//level 2 Room 4
	{
		switch(global.rand.nextInt(5)+1)
		{
		case 1:
			System.out.println("\n			your able to go Back at any point\n");
			String C = "";
			while(!C.equals("back") || !C.equals("2"))
			{
				System.out.println(""
						+ "\n			A farmer says: “I only ever keep sheep, goats, and horses. In fact, "
						+ "\n			at the moment they are all sheep bar three, all goats bar four, "
						+ "\n			and all horses bar five.” How many goats does he have?");
				
				C = global.scan.nextLine();
				C = C.toLowerCase();
				if(C.equals("2"))
				{
					global.puzzle3=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(C.equals("back"))
				{
					global.E="back";
					System.out.println(global.E);
					break;
				}
				else
				{
				System.out.println("\n			Incorrect!");
				}
			}
			break;
		case 2:
			System.out.println("\n			your able to go Back at any point");
			String D = "";
			while(!D.equals("7") || !D.equals("back"))
			{
				System.out.println(""
						+ "\n			One brother says of his younger brother: Two years ago, I was three times as old as my brother was. "
						+ "\n			In three years’ time, I will be twice as old as my brother.? how old is the younger brother");
				
				D = global.scan.nextLine();
				D = D.toLowerCase();
				if(D.equals("7"))
				{
					global.puzzle3=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(D.equals("back"))
				{
					global.E="back";
					break;
				}
				else
				{
					System.out.println("\n			Incorrect!");
				}
			}
			break;
		case 3:
			System.out.println("\n			your able to go back at any point");
			String E = "";
			while(!E.equals("12000")|| !E.equals("12,000") || !E.equals("back"))
			{
				System.out.println(""
						+ "\n			A trader left half his money to his granddaughter and half that amount to his grandson. "
						+ "\n			he left a sixth to his brother, and the remainder, $1,000 to the bank. "
						+ "\n			How much did he leave altogether?");
				
				E = global.scan.nextLine();
				E = E.toLowerCase();
				if(E.equals("12000") || E.equals("12,000"))
				{
					global.puzzle3=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(E.equals("back"))
				{
					global.E="back";
					break;
				}
				else
				{
					System.out.println("\n			Incorrect!");
				}
			}
			break;
		case 4:
			System.out.println("\n			your able to go back at any point");
			String F = "";
			while(!F.equals("24") || !F.equals("Two dozen") || !F.equals("back"))
			{
				System.out.println(""
						+ "\n			If a hen and a half lay an egg and a half in a day and a half, "
						+ "\n			how many eggs will half a dozen hens lay in half a dozen days?");
				
				F = global.scan.nextLine();
				F = F.toLowerCase();
				if(F.equals("24") || F.equals("Two dozen"))
				{
					global.puzzle3=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(F.equals("back"))
				{
					global.E="back";
					break;
				}
				else
				{
					System.out.println("\n			Incorrect!");
				}
			}
			break;
		case 5:
			System.out.println("\n			your able to go back at any point");
			String G = "";
			while(!G.equals("live") || !G.equals("back"))
			{
				System.out.println("\n			What word in the dictionary is spelled incorrectly?");
				G = global.scan.nextLine();
				G = G.toLowerCase();
				if(G.equals("incorrectly"))
				{
					global.puzzle3=false;
					System.out.println("\n			Correct!");
					break;
				}
				else if(G.equals("back"))
				{
					global.E="back";
					break;
				}
				else
				{
					System.out.println("\n			Incorrect!");
				}
			}
			break;
		}
	}
	public static void puzzle4()//level 3 Room 4
	{
		System.out.println("\n			your able to go back at any point\n ");
		String G = "";
		int hit = 7;
		int total = 0;
		if(global.Wizard)
		{
			hit = 14;
		}
		System.out.println(""
				+ "\n			A glowing gem is set in the door, its magic seems to be holding it shut, "
				+ "\n			I may have to force my way past");
		
		while(!G.equals("#") ||!G.equals("pound") || !G.equals("strike")|| !G.equals("back"))
		{
			G = global.scan.nextLine();
			G = G.toLowerCase();
			if(G.equals("#") || G.equals("pound") || G.equals("strike"))
			{
				total++;
				System.out.println("\n			You strike the gem");
				if(total>2 && total<5)
				{
					System.out.println("\n			cracks grow");
				}
				if(total>7)
				{
					System.out.println("\n			the cracks grow larger");
				}
				if(total==hit)
				{
					System.out.println("\n			The gem shatters at last and the door opens");
					global.puzzle4=false;
					break;
				}
			}
			else if(G.equals("back"))
			{
				global.E="back";
				return;
			}
		}
	}
	public static void puzzle5()//level 3 Room 3
	{
		String[] path = new String [5];
		for(int i = 0; i<path.length; i++)
		{
			int pathChoice = global.rand.nextInt(3)+1;
			if(pathChoice==1)
			{
				path[i]="left";
			}
			if(pathChoice==2)
			{
				path[i]="right";
			}
			if(pathChoice==3)
			{
				path[i]="stright";
			}
		}
		
		String D = "";
		System.out.println(""
				+ "\n			Your able to go back at any point"
				+ "\n			as you walk down the hall the lights dim until you cant see, you take a "
				+ "\n			step and your foot slips you nearly fall off the path into the deep darkness"
				+ "\n			you now understand that the path before you has been replaced by a very narrow "
				+ "\n			path over a dark hole, you cant see the path but you will have to guess as to witch "
				+ "\n			way to take.");
		
		if(global.Lantern==false)
		{
			for(int i = 0; i<path.length; i++)
			{
				while(!D.equals("left") || !D.equals("right") || !D.equals("stright")|| !D.equals("back"))
				{
					System.out.println("\n			Left?, Right?, Stright? or go Back the way you came\n");
					D = global.scan.nextLine();
					D = D.toLowerCase();
					if(D.equals("left"))
					{
						if(path[i].equals("left"))
						{
							break;
						}
						else
						{
							i=0;
							System.out.println(""
									+ "\n			You choose poorly, you fall for what feels like a "
									+ "\n			life time and to wake at the start of the path");
						}
					}
					else if(D.equals("right"))
					{
						if(path[i].equals("right"))
						{
							break;
						}
						else
						{
							i=0;
							System.out.println(""
									+ "\n			You choose poorly, you fall for what feels like a "
									+ "\n			life time and to wake at the start of the path");
						}
					}
					else if(D.equals("stright"))
					{
						if(path[i].equals("stright"))
						{
							break;
						}
						else
						{
							i=0;
							System.out.println(""
									+ "\n			You choose poorly, you fall for what feels like a "
									+ "\n			life time and to wake at the start of the path");
						}
					}
					else if(D.equals("back"))
					{
						global.E="back";
						
						return;
					}
				}
			}
		}
		global.puzzle5=false;
		if(global.Lantern)
		{
			System.out.println(""
					+ "\n			you light your lantern and it shows you the true path"
					+ "\n			and you make it to the other side safely");
		}
		else
		{
			System.out.println("\n			you make it to the other side safely");
			return;
		}
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls loot drops and Chest drops

	public static void treasure()
	{
		if((global.rand.nextInt(3)+1)%3==0)
		{
			System.out.println(""
					+ "\n			As you try to open the chest it lets a blood chilling cry, "
					+ "\n			you fell for the mimic's trick, ready your self");
			Combat();
			
		}
		else 
		{
			if((global.rand.nextInt(2)+1)%2==0)
			{
				if((global.rand.nextInt(2)+1)%2==0)
				{
					global.healthPotion+=(global.rand.nextInt(3)+1);
					System.out.println("\n			Health Potions: " + global.healthPotion);
				}
				else
				{
					global.manaPotion+=(global.rand.nextInt(3)+1);
					System.out.println("\n			Mana Potions: " + global.manaPotion);
				}
				return;
			}
			else
			{
				System.out.println("\n			empty");
				return;
			}
		}
	}
	public static void loot()
	{
		if((global.rand.nextInt(2)+1)%2==0)
		{
			if((global.rand.nextInt(2)+1)%2==0)
			{
				global.healthPotion++;
				System.out.println("\n			health Potion found, you have " + global.healthPotion);
			}
			else
			{
				global.manaPotion++;
				System.out.println("\n			mana Potion found, you have " + global.manaPotion);
			}
			return;
		}
		else
		{
			System.out.println("\n			no loot found");
			return;
		}
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls Restore ability over classes

	public static void Restore()
	{
		if(global.Wizard)
		{
			WizardRestore();
		}
		else if(global.Paladin)
		{
			PaladinRestore();
		}
		else if(global.Rogue)
		{
			RogueRestore();
		}
	}
	public static void PaladinRestore()
	{
		String D = "";
		while(!D.equals("health") || !D.equals("mana") || !D.equals("return"))
		{
			System.out.println("\n			Restore Health, Mana or Return what will you do? \n");
			D = global.scan.nextLine();
			D = D.toLowerCase();
			if(D.equals("health"))
			{
				while(!D.equals("potion") || !D.equals("spell"))
				{
					System.out.println("\n			How will you restore your health, Spell or Potion");
					D = global.scan.nextLine();
					D = D.toLowerCase();
					if(D.equals("spell"))
					{
						if(global.Mana>0)
						{
							global.Mana--;
							global.Health=global.Health + global.rand.nextInt(4)+1;
							if(global.Health>global.maxHealth)
							{
								global.Health=global.maxHealth;
								System.out.println("\n			Health: " + global.Health);
								System.out.println("\n			Health at Max");
							}
							else
							{
								System.out.println("			"+global.Health);
							}
						}
						else
						{
							System.out.println("\n			Out of Mana");
						}
					}
					else if(D.equals("potion"))
					{
						if(global.healthPotion>0)
						{
							global.healthPotion--;
							global.Health=global.Health + 3;
							if(global.Health>global.maxHealth)
							{
								global.Health=global.maxHealth;
								System.out.println("\n			Health:" + global.Health);
								System.out.println("\n			Health at Max");
							}
							else
							{
								System.out.println("			Health: " + global.Health);
							}
						}
						else
						{
							System.out.println("\n			Out of health potions");
						}
					}
					break;
				}
			}
			else if(D.equals("mana"))
			{
				if(global.manaPotion>0)
				{
					global.manaPotion--;
					global.Mana=global.Mana + 2;
					System.out.println("\n			Mana: " + global.Mana);
				}
				else
				{
					System.out.println("\n			Out of mana potions");
				}
			}
			else if(D.equals("return"))
			{
				return;
			}
		}	
	}
	public static void RogueRestore()
	{
		String B = "";
		while(!B.equals("health") || !B.equals("arrows") || !B.equals("return"))
		{
			System.out.println("\n			Restore Health, Arrows or Return what will you do? \n");
			B = global.scan.nextLine();
			B = B.toLowerCase();
			if(B.equals("health"))
			{
//				while(!B.equals("potion"))
//				{
//					System.out.println("\n			How will you restore health, Potion? \n");
//					B = global.scan.nextLine();
//					B = B.toLowerCase();
//					if(B.equals("potion"))
//					{
						if(global.healthPotion>0)
						{
							global.healthPotion--;
							global.Health=global.Health + 3;
							if(global.Health>global.maxHealth)
							{
								global.Health=global.maxHealth;
								System.out.println("\n			" + global.Health);
								System.out.println("\n 			Health is at Max");
							}
							else
							{
								System.out.println("\n			" + global.Health);
							}
						}
						else
						{
							System.out.println("\n			Out of health potions");
						}
//					}
//					break;
//				}
			}
			else if(B.equals("arrows"))
			{
				if(global.manaPotion>0)
				{
					global.manaPotion--;
					global.Mana=global.Mana + 3;
					System.out.println("\n			You use the Mana to craft 3 arrows");
					System.out.println("\n			Arrows: " + global.Mana);
				}
				else
				{
					System.out.println("\n			Out of mana potions");
				}
			}
			else if(B.equals("return"))
			{
				return;
			}
		}
	}
	public static void WizardRestore()
	{
		String D = "";
		while(!D.equals("health") || !D.equals("mana") || !D.equals("return"))
		{
			System.out.println("\n			Restore Health, Mana or Return what will you do? \n");
			D = global.scan.nextLine();
			D = D.toLowerCase();
			if(D.equals("health"))
			{
				while(!D.equals("potion") || !D.equals("spell"))
				{
					System.out.println("\n			How will you restore your health, Spell or Potion \n");
					D = global.scan.nextLine();
					D = D.toLowerCase();
					if(D.equals("spell"))
					{
						if(global.Mana>0)
						{
							global.Mana--;
							global.Health=global.Health + global.rand.nextInt(4)+1;
							if(global.Health>global.maxHealth)
							{
								global.Health=global.maxHealth;
								System.out.println(global.Health);
							}
							else
							{
								System.out.println(global.Health);
							}
						}
						else
						{
							System.out.println("\n			Out of Mana");
						}
					}
					else if(D.equals("potion"))
					{
						if(global.healthPotion>0)
						{
							global.healthPotion--;
							global.Health=global.Health + 2;
							if(global.Health>global.maxHealth)
							{
								global.Health=global.maxHealth;
								System.out.println("\n			"+ global.Health);
								System.out.println("\n			Health is at max");
							}
							else
							{
								System.out.println("\n			" + global.Health);
							}
						}
						else
						{
							System.out.println("\n			Out of health potions");
						}
					}
					break;
				}
			}
			else if(D.equals("mana"))
			{
				if(global.manaPotion>0)
				{
					global.manaPotion--;
					global.Mana=global.Mana + 3;
					System.out.println("\n			" + global.Mana);
				}
				else
				{
					System.out.println("\n				Out of mana potions");
				}
			}
			else if(D.equals("return"))
			{
				return;
			}
		}
	}
	//<--------------------------------------------------------------------------------------------------------------------------------------------->
	//Controls Game setup, data and progression 

	public static void intro()
	{
		System.out.println(""
				+ "\n			Foot steps on a cold morning, water collecting on you shoes "
				+ "\n			as you walk the path to your destination. "
				+ "\n			As you make your way down the path you see a towering figure taking shape. As you near the "
				+ "\n			traveler you see it’s a very tall and burly orc barbarian, he yells to you. ");
		System.out.println();
		System.out.println(""
				+ "\n			Alabama Rick: Hello traveler, not safe to travel these roads alone, "
				+ "\n			there are many strong monsters hiding here and there, "
				+ "\n			their coming from the Dungen down the path, "
				+ "\n			I would recommend to turning back.");
		System.out.println();
		System.out.println("\n			?????: that’s where I’m going.");
		System.out.println();
		System.out.println("\n			Alabama Rick: Whats your name traveler?");
		System.out.println();
		global.Name=global.scan.nextLine();
		System.out.println(""
				+ "\n			Alabama Rick: "+global.Name + " what an odd name,  "
				+ "\n			well " + global.Name + " class are you maybe I cant give you?");
		System.out.println();
		Class();
		if(global.Wizard==true)
		{
			System.out.println(""
					+ "\n			Alabama Rick: Wizard I see, you'll have to watch your health, "
					+ "\n			Wizards arn't know for taking alot of hits, "
					+ "\n			your magic will be your most powerful tool but if you run out of mana your done for");
			System.out.println();
			System.out.println(""
					+ "\n			Alabama Rick:I would say just by looking at you, "
					+ "\n			you cant take more than " + global.Health + " pionts of damage");
			System.out.println();
			System.out.println("\n			Alabama Rick: you have good bit of mana too i'd say " + global.Mana + " total");
			System.out.println();
		}
		else if(global.Paladin==true)
		{
			System.out.println(""
					+ "\n			Alabama Rick: Paladin you say, your heavy armor will help you in combat, "
					+ "\n			you also have limited mana you can use to heal with to use it wisly");
			System.out.println();
			System.out.println(""
					+ "\n			Alabama Rick:I would say just by looking at you, "
					+ "\n			you cant take more than " + global.Health + "pionts of damage");
			System.out.println();
			System.out.println(""
					+ "\n			Alabama Rick:you have little bit of mana too i'd say " + global.Mana + " total");
			System.out.println();
		}
		else if(global.Rogue==true)
		{
			System.out.println(""
					+ "\n			Alabama Rick:Whats your name traveler?");
			System.out.println();
			System.out.println(""
					+ "\n			Alabama Rick:I would say just by looking at you, "
					+ "\n			you cant take more than " + global.Health + " pionts of damage");
			System.out.println();
			System.out.println(""
					+ "\n			Alabama Rick:Rogues have no mana but your arrows have limited use, "
					+ "\n			you have "+ global.Mana + " arrows");
			System.out.println();
		}
		
		System.out.println(""
				+ "\n			You part from your new friend and walk down the path to the mouth of a dark cave, "
				+ "\n			you march into the dark, the water driping down around you until.......... ");
		System.out.println();
	}
	public static void clear()
	{
		if(global.MH<=0)
		{
			if(global.Level==1 && global.Room==1)
			{
				global.clearLV1R1=true;	
			}
			else if(global.Level==1 && global.Room==2)
			{
				global.clearLV1R2=true;	
			}
			else if(global.Level==1 && global.Room==3)
			{
				global.clearLV1R3=true;	
			}
			else if(global.Level==1 && global.Room==4)
			{
				global.clearLV1R4=true;	
			}
			else if(global.Level==1 && global.Room==5)
			{
				global.clearLV1R5=true;	
			}
			else if(global.Level==2 && global.Room==1)
			{
				global.clearLV2R1=true;	
			}
			else if(global.Level==2 && global.Room==2)
			{
				global.clearLV2R2=true;	
			}
			else if(global.Level==2 && global.Room==3)
			{
				global.clearLV2R3=true;	
			}
			else if(global.Level==2 && global.Room==4)
			{
				global.clearLV2R4=true;	
			}
			else if(global.Level==2 && global.Room==5)
			{
				global.clearLV2R5=true;	
			}
			else if(global.Level==3 && global.Room==1)
			{
				global.clearLV3R1=true;	
			}
			else if(global.Level==3 && global.Room==2)
			{
				global.clearLV3R2=true;	
			}
			else if(global.Level==3 && global.Room==3)
			{
				global.clearLV3R3=true;	
			}
			else if(global.Level==3 && global.Room==4)
			{
				global.clearLV3R4=true;	
			}
			else if(global.Level==3 && global.Room==5)
			{
				global.clearLV3R5=true;	
			}
		}

	}

 	public static void Class()
	{
		String C ="";
		while(!C.equals("paladin") || !C.equals("rogue") || !C.equals("wizard")|| !C.equals("ex"))
		{
			System.out.println("\n			Paladin, Wizard or Rogue? \n");
			C = global.scan.nextLine();
			C = C.toLowerCase();
			if(C.equals("paladin"))
			{
				global.Health=25;
				global.Sword = true;
				global.Shield = true;
				global.Paladin = true;
				global.Mana=15;
				break;
				
			}
			else if(C.equals("wizard"))
			{
				global.Health=15;
				global.Lantern = true;
				global.Staff = true;
				global.Mana=25;
				global.Wizard = true;
				break;
			}
			else if(C.equals("rogue"))
			{
				global.Health=15;
				global.Mana=20;
				global.Bow = true;
				global.Dagger = true;
				global.Rogue = true;
				break;
			}
			else if(C.equals("ex"))
			{
				System.out.println("\n \n			Paladin Combat"
						+ "\n 			Paladin class has the most health and can deal the most "
						+ "\n			damage in one hit of any class and can health with spells and mana"
						+ "\n 			this class gets a bonus to defence when defending"
						+ "\n 			type sword to hit the monster with your sword, nothing crazy"
						+ "\n 			type mana, or channel to channel mana into your sword, for every one mana "
						+ "\n			your next attack gets a times X1 multiplyer"
						+ "\n 			type defend to ready your self, you tak less damage from the next attack and "
						+ "\n			you get an attack bonues your you next attack as your guard isnt broken");	
				System.out.println("\n \n			Rogue Combat"
						+ "\n 			Rogues start with a smaller amount of life and just a few arrows "
						+ "\n			but do the most damage out of any class"
						+ "\n 			type dagger for a low power malee attack."
						+ "\n 			type bow for your power attack you can use 1 to 3 arrows "
						+ "\n			at a time each arrow will have a chance of missing"
						+ "\n 			type sneak for the rogue super move, he can make him self unseen "
						+ "\n			and there for safe from attack during combat"
						+ "\n 			sneaking will give you large bonuses to hit Chance and Damage"
						+ "\n 			type defend to ready your self, you tak less damage from the next attack and you get an "
						+ "\n			attack bonues your you next attack as your guard isnt broken");
				System.out.println("\n \n			Wizard Combat"
						+ "\n 			Wizards have strong magic but week health and melee attack, can heal using potions and magic"
						+ "\n 			type spear for a strong single hit attack, this spell is one mana, "
						+ "\n			its hit chance go's up the more health you have."
						+ "\n 			type missile for a multi hit attack, this spell costs 2 mana but will hit more than once "
						+ "\n 			type wall to cast a between you and your enemy, will last one turn for each charge"
						+ "\n			your staff is your last resort or a finishing move"
						+ "\n			type defend to ready your self, you tak less damage from the next attack and "
						+ "\n			you get an attack bonues your you next attack as your guard isnt broken");
			}
		}
		global.maxHealth=global.Health;
		global.maxMana=global.Mana;
	}
	public static void Death()
	{
		System.out.println("\n			Was it worth the cost......, these thoughts fill your mind as "
				+ "\n			the light fades.....Death takes you.....................");
		System.exit(0);
	}
	public static void Win()
	{
		System.out.println("\n			Your trials are over, and the spoils are yours "
				+ "\n			along with the glory! congratulations!!!!!!");
		System.exit(0);
	}
}
