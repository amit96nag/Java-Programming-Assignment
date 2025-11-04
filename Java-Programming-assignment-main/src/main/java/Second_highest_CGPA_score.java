public class Second_highest_CGPA_score {
    public static void main(String[] args) {
        double[] arr = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        double max =arr[0],  second =arr[1];
        if (max > second)
        {
            max = arr[0];
            second=arr[1];
        }
        else {
            second = arr[0];
            max = arr[1];
             }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max)
            {

                second = max;
                max = arr[i];
            }
            else if (arr[i] > second && arr[i] < max)
            {
                second = arr[i];
            }
        }

        System.out.println("2nd highest score " + second);
    }
}
