import java.util.ArrayList;

/**
 * Created by dyenug001c on 12/10/2015.
 */
public class ArrayIntersection {


    public static ArrayList<Integer> getIntersection(int[] A, int[] B) {
        // Add interesting elements to this collection
        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;

        while (i != A.length && j != B.length) {
            if (A[i] == B[j]) {
                // If both are equal, add to intersection
                intersection.add(A[i]);
                ++i;
                ++j;
            } else if (A[i] > B[j]) {
                // Increment index to second array
                ++j;
            } else {
                // A[i] < B[j]
                // Increment index to first array
                ++i;
            }
        }

        return intersection;
    }

    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        int b[]={0,7,2,87,34,1};
        ArrayList al =  ArrayIntersection.getIntersection(a, b);

    }
}
