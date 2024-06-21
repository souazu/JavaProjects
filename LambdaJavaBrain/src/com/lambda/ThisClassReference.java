package com.lambda;
public class ThisClassReference {
	public void doProc(int i,Process p) {
		p.doProcess(i);;
		System.out.println(this);
	}
	public static void main(String[] args) {
		ThisClassReference example = new ThisClassReference();
		///*** Code block 1 begins ***
		example.doProc(100, new Process() {
			@Override
			public void doProcess(int i) {
				System.out.println("Value of i:"+i);
				System.out.println(this);
			}
			@Override
			public String toString() {
				return "I am in inner class";
			}
		});
		//****End of code block 1*/
		
		/** Code block 2 begins 
		example.doProc(100, i -> {
			System.out.println("Value of i:"+i);
			System.out.println(this);// this line will throw error.
		});
		** End of code block 2 **/
		
		
	}
}
