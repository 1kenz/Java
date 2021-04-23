package multiDimensionalArrayDemo;

public class Main {
    public static void main(String[] args) {
        

        // matrix
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Ankara";
        cities[0][2] = "İzmir";
        cities[1][0] = "Adana";
        cities[1][1] = "Samsun";
        cities[1][2] = "Malatya";
        cities[2][0] = "Muğla";
        cities[2][1] = "Aydın";
        cities[2][2] = "Antalya";

        for(int i=0; i<3;i++){
            System.out.println("--------------------");

            for(int j=0;j<3;j++){
                System.out.println(cities[i][j]);
            }
        }


    }
}
