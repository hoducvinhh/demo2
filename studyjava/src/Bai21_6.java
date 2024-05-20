public class Bai21_6 implements Bai21_4 {

    @Override
    public void sapXepTang(double arr[]) {
        int n = arr.length;
        int i, j, minindx;
        for (i = 0; i < n - 1; i++) {
            minindx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindx]) {
                    minindx = j;
                    double temp = arr[minindx];
                    arr[minindx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j, minindx;
        for (i = 0; i < n - 1; i++) {
            minindx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] > arr[minindx])
                    minindx = j;
            double temp = arr[minindx];
            arr[minindx] = arr[i];
            arr[i] = temp;
        }
    }
}
