class variable{
	int data=43;//instance variable
	static int a=39;//static variable
	public void variables(){
	int b=42;//local variable
	System.out.println("local variable is : " + b);
    System.out.println("instance variable is : " + data);
    System.out.println("static variable is : " + a);
}
    public static void main(String[] args) {
    	variable obj = new variable();
    	obj.variables();
    }
}


Output:

local variable is : 42 instance variable is : 43 static variable is: 39
