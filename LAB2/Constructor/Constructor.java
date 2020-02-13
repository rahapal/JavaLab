class Constructor {
    private int x;
    // constructor
    private Constructor(){
        System.out.println("Constructor Called");
        x = 5;
    }
    public static void main(String[] args){
        ConsMain obj = new ConsMain();
        System.out.println("Value of x = " + obj.x);
    }
}

Output:

Constructor Called
Value of x = 5
