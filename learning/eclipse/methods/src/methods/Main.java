package methods;

public class Main {

	public static void main(String[] args) {
		
		findNumber();
	
	}
		
		
		
		public static void findNumber() {
			int[] numbers = new int[] {1,2,3,4,5};
			int finding = 6;
			boolean isFind = false;
			
			for (int number: numbers) {
				if (number == finding) {
					isFind = true;
					break;
				}
				
			}
			
			if (isFind) {
				System.out.println("Number is included. " + finding);
			} else {
				System.out.println("Number is not included. " + finding);
			}
				
				
			}
			
		}
