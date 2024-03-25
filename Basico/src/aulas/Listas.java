package aulas;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,4,6,7,8,9,6,7,3,56,8};
		
		for(int index = 0; index <= nums.length;index++) {
			try {
				System.out.println(nums[index]);
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("EI DOIDÂO VAI VER SEU FOR...");
				System.out.println(e);
			}
			
						
		}

		
		
		
		
	}

}
