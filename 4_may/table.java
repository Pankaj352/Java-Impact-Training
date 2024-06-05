public class table {
    static void tableOfNumber(int x){
        int res=0;
        for(int i=1;i<=10;i++){
            res =i*x;
            System.out.println(x +"X"+i+"="+res);
        }
    }
    public static void main(String[] args) {
        table.tableOfNumber(5);
    }
}
