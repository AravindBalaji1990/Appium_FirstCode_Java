package arraydemo;

public class multidimentionalarray {
    public static void main(String[] args) {
        //                  {{0,1},      {0,1},   {0,1}
        //	                { 0		,    1,            2}
        int[][] multidim = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println("to get a specific item : " + multidim[1][1]);

        // to get the total arrays inside the array
        for (int i = 0; i < multidim.length; i++) {
            // System.out.println("the total arrays : " + multidim[i]);
            // to get the total items from individual array
            for (int j = 0; j < multidim[i].length; j++) {
                System.out.println("the items inthe array :" + multidim[i][j]);
            }
        }
    }
}
