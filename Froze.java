import java.util.Scanner;

public class Froze{

	public static void main(String[] args){
		int choice =0; //initialize menu selection variable 
		int pos =0;
		Scanner sc = new Scanner(System.in);
		String[] options = new String[4]; //array for actions 
		String[] menu = new String[pos]; //array for food
		Double[] quantities = new Double[30]; //array for double value of quantities


		options[0] = "1: Whats in my fridge?";
		options[1] = "2: Add food to fridge!";
		options[2]= "3: Remove food from fridge";
		options[3]= "4: Close the fridge";

		while(choice!=4){ //will repeat until user choses to exit 
			System.out.println(options[0]);
			System.out.println(options[1]);
			System.out.println(options[2]);
			System.out.println(options[3]);
			System.out.println("Please enter the number of the action you would like to take");
			choice = sc.nextInt();

			if(choice == 1){ //Print menu
				for(int i=0;i<menu.length;i++){
					System.out.println(menu[i]);
				}
			}
			if (choice == 2){ //add food to fridge
				String food = addItem(menu, quantities);
				menu[pos]=food;
				System.out.println("Item had been added!");
				pos++;
			}
			if (choice == 3) //remove from fridge

			if (choice == 4) //exit program 
				System.exit(4);
		}
	}

	public static String addItem(String[] menu, Double[] quantities){
		String[] nMenu = menu;
		Scanner sc = new Scanner(System.in);
		String name;
		Double quant;
		String sQuant;
		String unit;
		String output="";
		boolean breakLoop = false;
		
	
		System.out.println("What is the name of the food?");
			name = sc.next();
		System.out.println("What is its quantity(without units)");
			quant = sc.nextDouble();
			sQuant = Double.toString(quant); //quant as a string
		System.out.println("What is the foods units? (L, mL, g, mg, oz, lb or n(no units)");
			unit = sc.next();
				if(unit=="n")
					unit=" ";

			//String unit = unitC.toLowerCase;
		
		
		while(breakLoop==false){
			if (nMenu == null){
				nMenu[0]=name +sQuant+unit;
				breakLoop=true;
			}
			for(int i=0; i<nMenu.length;i++){
				if (nMenu[i]==null&&quantities[i]==null){
					nMenu[i]=name + sQuant + " "+unit;
					output=nMenu[i];
					quantities[i]=quant;
					breakLoop =true;
				}
				if(menu[i].startsWith(name)){ //if food is already in fridge
					if (nMenu[i].endsWith(unit)){
						quantities[i] = quantities[i] + quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i] = name + " " + sQuant+ " " + unit;
						output=nMenu[i];
						breakLoop=true;
					}
					if (nMenu[i].endsWith("l") && unit=="ml"){
						quant = quant /1000;
						quantities[i] = quantities[i] + quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i] = name +" "+ sQuant + " l";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith("ml")&&unit=="l"){
						quant = quant * 1000;
						quantities[i]=quantities[i] + quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]= name +" "+sQuant+ " ml";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith("lb")&&unit=="oz"){
						quant = quant / 16;
						quantities[i] = quantities[i]+quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]=name+" "+sQuant+" lb";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith("oz")&&unit=="lb"){
						quant = quant * 16;
						quantities[i]=quantities[i] + quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]=name+" "+sQuant+" oz";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith("g")&&unit=="mg"){
						quant = quant /1000;
						quantities[i]=quantities[i]+quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]=name+" "+ sQuant+" g";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith("mg")&&unit=="g"){
						quant = quant * 1000;
						quantities[i]=quantities[i]+quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]=name+" "+ sQuant+" mg";
						output=nMenu[i];
						breakLoop=true;
					}
					if(nMenu[i].endsWith(" ")&&unit==" "){
						quantities[i]=quantities[i]+quant;
						sQuant = Double.toString(quantities[i]);
						nMenu[i]=name+" "+sQuant+" ";
						output=nMenu[i];
						breakLoop=true;
					}
					//else 
					//	System.out.println("You entered incorrect units. Action cannot be completed");
					//	breakLoop=true;
				}
				else{
					nMenu[i] = name+" " + sQuant+ " " + unit;
					quantities[nMenu.length] = quant;
					output=nMenu[i];
					breakLoop=true;
				}
			}	
		}
		return output;
	}


}