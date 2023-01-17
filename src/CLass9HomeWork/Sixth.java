package CLass9HomeWork;

public class Sixth {
    public static void main(String[] args) {
        /*  Create an array of countries.
        While retrieving all values from an array
        print capital for each country choose any five countries.
         */
        String Countries[]=new String[6];
        Countries[0]="USA";
        Countries[1]="CANADA";
        Countries[2]="INDIA";
        Countries[3]="CHINA";
        Countries[4]="JAPAN";
        for(int i=0;i<Countries.length;i++){
            switch (Countries[i]) {
                case "USA":
                    System.out.println("USA Capital:Washington DC");
                    break;
                case "CANADA":
                    System.out.println("CANADA Capital:Ottava");
                    break;
                case "INDIA":
                    System.out.println("INDIA Capital:Delhi");
                    break;
                case "CHINA":
                    System.out.println("CHINA Capital:Beijing ");
                    break;
                case "JAPAN":
                    System.out.println("JAPAN Capital:Tokyo");
                    break;
            }
        }

    }
}
