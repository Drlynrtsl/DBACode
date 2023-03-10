import java.util.*;
import java.io.*;

public class Employee{
    public static void main(String [] args){
        int nh_female, nh_male, pp_female, pp_male, r_female, r_male;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of newly hired males: ");
        nh_male = in.nextInt();
        System.out.println("Enter the number of newly hired females: ");
        nh_female = in.nextInt();
        System.out.println("Enter the number of permanent position males: ");
        pp_male = in.nextInt();
        System.out.println("Enter the number of permanent position females: ");
        pp_female = in.nextInt();
        System.out.println("Enter the number of resigned males: ");
        r_male = in.nextInt();
        System.out.println("Enter the number of resigned females: ");
        r_female = in.nextInt();
        
        int total_new_hire = nh_female + nh_male;
        int total_perma_pos = pp_female + pp_male;
        int total_resigned = r_female + r_male;
        int nh_percent_male = (nh_male * 100) / total_new_hire;
        int nh_percent_female = (nh_female * 100) / total_new_hire;
        double pp_percent_male = (pp_male * 100) / total_perma_pos ;
        double pp_percent_female = (pp_female * 100) / total_perma_pos;
        double r_percent_male = (r_male * 100) / total_resigned ;
        double r_percent_female = (r_female * 100 )/ total_resigned;
        
        System.out.println("Number of hired employees " + total_new_hire);
        System.out.println("Male:" +  nh_percent_male + " %");
        System.out.println("Female:" +  nh_percent_female + " %");
        System.out.println("Number of Permanent employees " + total_perma_pos);
        System.out.println("Male:" +  pp_percent_male + " %");
        System.out.println("Female:" +  pp_percent_female + " %");
        System.out.println("Number of Permanent employees " + total_resigned);
        System.out.println("Male:" +  r_percent_male + " %");
        System.out.println("Female:" +  r_percent_female + " %");
    }
}
