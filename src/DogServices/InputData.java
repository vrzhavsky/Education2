package DogServices;

import java.util.Scanner;
public class InputData {
	private String[] names;
	private int ñount;

	public void UserInput(Scanner s){
		boolean inputted = false;
		boolean intValue = false;
		System.out.println("Please input count of dogs and names of dogs.");
			while (inputted == false){
				String tempString = s.nextLine();
				String[] dataTemp = tempString.trim().split(" ");
				//Empty string verification
				if (tempString.isEmpty()) {
					System.out.println("String is empty. Please input integer value."); 
				}
				else
					// First argument Integer validation
				{
					try { 
						this.ñount = Integer.parseInt(dataTemp[0]);
						intValue = true;
						} catch (NumberFormatException e) {
							System.out.println("First argument should have integer type");
							} 
					if (intValue == true){
						names = new String [dataTemp.length-1];
						for (int i = 1 ; i < dataTemp.length; i++){
							this.names[i-1] = dataTemp[i];
						}
						inputted = true;
					}
				}
		}
		}
	public String[] names(){
		return names;
		}
	
	public int count(){
		return this.ñount;
	}
	}

