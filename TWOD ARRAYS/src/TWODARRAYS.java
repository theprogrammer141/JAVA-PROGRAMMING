public class TWODARRAYS {
    public static void main(String[] args)
    {
        String[][] cars ={
                        {"CAMRAO","CORVETTE","SILVERADO"},
                        {"MUSTANG","RANGER","F-150"},
                        {"FERRARI","LAMBO","TESLA"}
                        };

        for(int i=0;i< cars.length;i++)
        {
            System.out.println();
            for(int j=0;j<cars[i].length;j++)
            {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
