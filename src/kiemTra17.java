public class kiemTra17 {
    public static void main(String[] args) {
            int [] arrayNumber={1,3,4,5};
            int sum=0;
            int congthem=1;
            for (int i=0; i< arrayNumber.length; i++){
                sum+= arrayNumber[i];
                congthem *= arrayNumber[i];
            }
            System.out.println(sum+ "   ");
            System.out.println(congthem+" ");

        }
}
