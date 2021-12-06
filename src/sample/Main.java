package sample;


public class Main {




    public static void main(String[] args) {
        String x = "ATG";
        String y = "TCA";

        String[] strain = x.split("",0);
        String[] newStrain = new String[5];

        for(int i=0; i< x.length();i++){
            System.out.println(strain[i]);
        }
    }
}
