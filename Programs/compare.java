class compare{
    int boolCompInt(int a,int b){
        return booleanComp(a,b);
    }
    int boolStringComp(String a, String b){
        return boolStringCompare(a,b);
    }

    private int boolStringCompare(String a, String b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boolStringCompare'");
    }
    private int booleanComp(int a, int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'booleanComp'");
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        compare cmp=new compare();
        cmp.boolCompInt(a, b)
    }
}