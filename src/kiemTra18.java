public class kiemTra18 {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 78,};
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(" phan tu lon  nhat trong mang la:" + maxValue);
    }
    }

