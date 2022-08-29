public class App {
	 public static void main(String[] args) {

	        // Character Class
	        Character knight = new Character();

	        knight.strength = 10;
	        knight.agility = 5;
	        knight.intelligence = 0;
	        knight.name = "Chen";
	        knight.sayMyName();

	        Character mage = new Character();

	        mage.strength = 0;
	        mage.agility = 5;
	        mage.intelligence = 10;
	        mage.name = "Akasha";
	        mage.sayMyName();

	        Character thief = new Character();

	        thief.strength = 5;
	        thief.agility = 10;
	        thief.intelligence = 0;
	        thief.name = "Gondar";
	        thief.sayMyName();

	        // Enemy Class
	        Enemy boss = new Enemy();

	        boss.damage = 50;
	        boss.health = 500;
	        boss.armor = 100;
	        boss.hasMagicImmunity = true;
	        boss.name = "Roshan";
	        boss.enemyDialogue();

	        Enemy skeleton = new Enemy();

	        skeleton.damage = 5;
	        skeleton.health = 10;
	        skeleton.armor = 5;
	        skeleton.hasMagicImmunity = false;
	        skeleton.name = "Common Skeleton Warrior";
	        skeleton.enemyDialogue();

	        Enemy dragon = new Enemy();

	        dragon.damage = 40;
	        dragon.health = 400;
	        dragon.armor = 75;
	        dragon.hasMagicImmunity = false;
	        dragon.name = "Ancient Wyvern";
	        dragon.enemyDialogue();
	        
	        //Weapon class
	        
	        Weapon Gun = new Weapon();
	       Gun.Name = "Dalisay's pistol";
	       Gun.Damage = 80;
	       Gun.Weight = 15.3;
	       Gun.Rarity = "SS+";
	       Gun.Description = " This is the Pistol of the one and only Ricardo Dalisay.";
	       Gun.WeaponDescription();
		 
	       Weapon Spear = new Weapon();
	       Spear.Name = "Gae Bolg";
	       Spear.Damage = 72;
	       Spear.Weight = 43.5;
	       Spear.Rarity = "A+";
	       Spear.Description = " Gae Bolg is the cursed spear of the lancer servant in the game fate grand order Cu Chulainn";
	       Spear.WeaponDescription();
		 
	       Weapon Knife = new Weapon();
	       Knife.Name = "Slaughter Demon";
	       Knife.Damage = 50;
	       Knife.Weight = 24.8;
	       Knife.Rarity = "A-";
	       Knife.Description = "Slaughter Demon is a wide-edged dagger used by Nanami Kento of Jujutsu Kaisen that is capable of slicing off cursed spirits' limbs with ease.";
	       Knife.WeaponDescription();
	 }
}
