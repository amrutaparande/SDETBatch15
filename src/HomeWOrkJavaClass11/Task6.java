package HomeWOrkJavaClass11;

public class Task6 {
    public static void main(String[] args) {
        String[][] countries = {{"USA","Canada","Mexico"},
                {"Brazil","Argentina","Peru","Columbia","Chile"},
                {"Germany","United Kingdom","France","Spain"},
                {"China","India","Japan","Russia"},
                {"Egypt","Nigeria","South Africa","Ethiopia"}};
        System.out.println(countries.length);
        System.out.println(countries[0].length);
       int counter=0;
        for(int i=0;i<countries.length;i++){
            for(int j=0;j<countries[i].length;j++){
                System.out.println(countries[i][j]+" ");
                counter++;
            }
            System.out.println("Total countries"+countries);
        }
        //using enhanced for loop
        for (String[] country : countries) {
            for (int j = 0; j < country.length; j++) {
                System.out.println(country[j] + " ");
                counter++;
            }
            System.out.println("Total countries" + countries);
        }
    }
}
