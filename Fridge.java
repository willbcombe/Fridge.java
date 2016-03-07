import java.util.Scanner;

public class Fridge{
		public static String[] menu = new String[8];
		public static String[] list = new String[40];
		public static String[] food = new String[40];
		public static Double[] quant = new Double[40];
		public static String[] unit = new String[40];
	public static void main(String args[]){
		int pos =0;
		
		Scanner sc = new Scanner(System.in);

		menu[0] = "1:  Display Content";
		menu[1] = "2:  Remove an Item";
		menu[2] = "3:  Add an Item";
		menu[3]= "4:  Close the fridge";
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
			System.out.println(menu[0]);
			System.out.println(menu[1]);
			System.out.println(menu[2]);
			System.out.println(menu[3]);
		    input = sc.nextInt();
			System.out.println(menu.toString());
		
			if (input == 1){ //invokes displayContent
				displayContent(pos);
			}
			else if (input==2){//invokes removeItem
				System.out.println("Enter item you want to add to, or 0 to create a new item");
				displayContent(pos);
				quant[pos]=removeItem(pos);
				//somehow remove this level of array 
				pos++;
			}
			if (input==3){//invokes addItem
			System.out.println("Enter 1 to increase quantity of an existing item");
			System.out.println("Enter 0 to add a new item to the fridge");
				int value = sc.nextInt();
				if (value == 0){
					list[pos]=addItemN(value);
					unit[pos] = addItemU();
					quant[pos]=addItemQ();
				}
				if(value==1){
				//change quantity somehow 
					displayContent(pos);
					System.out.println("Please select the value of ");
				}
			}
				pos++;
		}
			if (input==4)
				System.exit(4);
	}
	public static String addItemN(int input){
		Scanner bc = new Scanner(System.in);
		System.out.println("Please enter the name of the food");
		String name = bc.next();
		//convert(units)
		return name + /*quantity*/ " ";
	}
	public static Double addItemQ(){
		Scanner bc = new Scanner(System.in);
		System.out.println("Please enter the quantity"+" ");
		Double quant = bc.nextDouble();
		return quant;
	}
	public static String addItemU(){
		Scanner bc = new Scanner(System.in);
		System.out.println("Please enter the units (L, mL, oz,g, mg, lb, n/a)");
		String unit = bc.next();
		return unit;
	}
		
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
}