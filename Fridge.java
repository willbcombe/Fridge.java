import java.util.Scanner;
//
public class Fridge{
		//public static String[] menu = new String[8];
		//public static String[] list = new String[40];
		//public static String[] food = new String[40];
		//public static Double[] quant = new Double[40];
		//public static String[] unit = new String[40];
	public static void main(String args[]){
		String[] menu = new String[40];
		String[] food = new String[40];
		Double[] quant = new Double[40];
		String[] unit = new String[40];
		int pos =0;
		String[] options = new String[8];
		Scanner sc = new Scanner(System.in);

		options[0] = "1:  Display Content";
		options[1] = "2:  Remove an Item";
		options[2] = "3:  Add an Item";
		options[3]= "4:  Close the fridge";
		/*System.out.println("Please Select an option");
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		String input = sc.next();
		System.out.println(menu.toString());*/
		int input=0;

		while(input!=4){
			System.out.println("Please Select an option");
			System.out.println(options[0]);
			System.out.println(options[1]);
			System.out.println(options[2]);
			System.out.println(options[3]);
		    input = sc.nextInt();
			System.out.println(options.toString());

			if (input == 1){
			for(int i=0; i<menu.length;i++){
				System.out.println(menu[i]);
			}
			}
			//else if (input==2){//invokes removeItem
				//System.out.println("Enter item you want to add to, or 0 to create a new item");
				//displayContent(pos);
				//quant[pos]=removeItem(pos);
				//somehow remove this level of array
				//pos++;
			//}
			if (input==3){//invokes addItem
				menu[pos]=addItem(pos,food,quant,unit);
				pos++;

			}
				pos++;
		}
			if (input==4)
				System.exit(4);
	}
	/*public static String addItemN(int input){
		Scanner bc = new Scanner(System.in);
		System.out.println("Please enter the name of the food");
		String name = bc.next();
		//convert(units)
		return name + /*quantity*/

	public static String addItem(int pos,String[] food, Double[] quant, String[] unit){
		Scanner bc = new Scanner(System.in);
		System.out.println("Please enter the name of the food");
		String name = bc.next();
		System.out.println("Please enter the quantity"+" ");
		Double quantity = bc.nextDouble();
		System.out.println("Please enter the units (L, mL, oz,g, mg, lb, n/a)");
		String units = bc.next();


			food[pos] = name;

			quant[pos] = quantity;
			unit[pos] = convertUnits(pos, food, quantity, units, unit,quant,name);
			return 	name +" " + unit[pos];
	}

	public static String convertUnits(int pos, String[] food, Double quantity, String units,String unit[],Double[] quant, String name){
		String[] cFood =food;
		String[] cUnits = unit;
		Double[] cQuant = quant;
		Double value =0.00;
		Double converted =0.00;
		String newUnits="";
		for(int i=0; i<39;i++){
			if(food[i]==name){
				if(units!=unit[i]){
					String uni1 =unit[i];
					String uni2 =units;
					if(uni1=="l" && uni2=="ml"){ //must chaange these all to case
						converted = quantity * 1000;
						value = converted +quant[i];
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}
					if(uni1=="ml" && uni2=="l"){
						converted = quantity / 1000 + quantity % 1000;
						value = converted +quant[i] ;
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}
					if(uni1=="g" && uni2=="mg"){
						converted = quantity * 1000;
						value = converted +quant[i];
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}
					if(uni1=="mg" && uni2=="g"){
						converted = quantity / 1000 + quantity % 1000;
						value = converted +quant[i];
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}
					if(uni1=="lbs" && uni2=="oz"){
						converted = quantity * 16;
						value = converted +quant[i];
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}
					if(uni1=="oz" && uni2=="lbs"){
						converted = quantity /16 + quantity%16;
						value = converted +quant[i];
						newUnits = swapUnits(i,uni2,cQuant);
						cUnits[i]=newUnits;
					}

					else if(uni1 == uni2){
						value = 2*quantity;
						newUnits = uni1;
					}


				}
			}
		}
		String almost = String.valueOf(value);
		String conversionY= almost +" " + newUnits;
		return conversionY;
	}
	public static String swapUnits(int i,String uni2,Double[] cQuant){
		String[] newUnits = new String[40];
		if(uni2=="ml")
			newUnits[i]="l";
		if(uni2=="l")
			newUnits[i]="ml";
		if(uni2=="mg")
			newUnits[i]="g";
		if(uni2=="g")
			newUnits[i]="mg";
		if(uni2=="oz")
			newUnits[i]="lbs";
		if(uni2=="lbs")
			newUnits[i]="oz";

		 return newUnits[i];

	}

	/*
	public static Double removeItem(int input){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the number of the item to remove");
		 int in= sc.nextInt();
		System.out.println("Please select a quantity to remove");
		Double inp = sc.nextDouble();
		Double val = quant[in];
		Double quant= val-inp;
		if(quant>0)
			return quant;
		else if(quant==0)
			return quant;
		return quant;
	}
	public static void displayContent(int pos){
		for (int cot =0; cot<pos;cot++)
				System.out.println((cot+1) +" "+list[cot]+" "+ quant[cot]+" "+unit[cot]);
	}
	*/
}
