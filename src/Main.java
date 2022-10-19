import java.io.File;
import java.util.Scanner;

public class Main {

    public static void makeDir(String dept){

        File directory = new File("ApplicantCvs\\"+dept);


        if (directory.mkdirs()) {
            System.out.println("Directory home/kelvin/Desktop/ApplicantCvs/"+dept +" successfully created");
        }
        else  {
            System.out.println("Directory creation unsuccessful for home/kelvin/Desktop/ApplicantCvs/"+dept );
        }
    }

    public static void retrieveFile(){

    }

    public static void calculate(String dept,boolean communication,boolean degree,boolean self_motivation, boolean confidence,boolean problem_solving,boolean creativity, int experience){

        double total_Rating = 0.0;
        if(degree){
            total_Rating += 0.3;
        }
        if(dept=="DEV"){
            if(communication){
                total_Rating+=0.1;
            }
            if(self_motivation){
                total_Rating+=0.1;
            }

            if(problem_solving){
                total_Rating+=0.3;
            }
            if(creativity){
                total_Rating+=0.2;
            }
        }
            if(experience>=3){
                total_Rating+=0.1;
            }
    }

    public static String questioner(String department){
        Scanner questioner = new Scanner(System.in);
        boolean degree,commSkills,problem_S_T,creativity,self_M,confidence;
        int experience;
        switch (department){
            case "DEV":
                //TECH DEGREE
                System.out.println("Do you have a relevant technology degree: ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                 int education = questioner.nextInt();
                 if(education == 1){
                      degree = true ;
                 }
                 else{
                     degree = false;
                 }
                 //COMMUNICATION SKILLS
                System.out.println("Do you have great Communication skills? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int comm = questioner.nextInt();
                if(comm == 1){
                    commSkills = true;
                }
                else{
                    commSkills = false;
                }

                //CREATIVITY
                System.out.println("Are you highly creative? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int creative = questioner.nextInt();
                if(creative == 1){
                    creativity = true;
                }
                else{
                    creativity = false;
                }
                //Self Motivation
                System.out.println("Are self motivated? ");
                System.out.println("1: YES \t 2:NO \n Any other input will be regarded as a NO");
                int selfMotive = questioner.nextInt();
                if(selfMotive == 1){
                    self_M = true;
                }
                else{
                    self_M = false;
                }
                //PROBLEM SOLVER
                System.out.println("Are you a problem solver? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int problem_solver = questioner.nextInt();
                if(problem_solver==1){
                    problem_S_T =true;
                }
                else{
                    problem_S_T = false;
                }
                //Experience
                System.out.print("Enter years of experience:  ");

                experience = questioner.nextInt();

                break;

                //Marketing questions

            case "MAR":
                //Sale and Marketing DEGREE
                System.out.println("Do you have a relevant Marketing and Sale degree: ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int marketing_degree = questioner.nextInt();
                if(marketing_degree == 1){
                    degree = true ;
                }
                else{
                    degree = false;
                }
                //CREATIVITY
                System.out.println("Are you highly creative? ");
                System.out.print("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int marketing_creative = questioner.nextInt();
                if(marketing_creative == 1){
                    creativity = true;
                }
                else{
                    creativity = false;
                }
                //Self Motivation
                System.out.println("Are self motivated? ");
                System.out.println("1: YES \t 2:NO \n Any other input will be regarded as a NO");
                int marketing_selfMotive = questioner.nextInt();
                if(marketing_selfMotive == 1){
                    self_M = true;
                }
                else{
                    self_M = false;
                }
                //CONFIDENCE
                System.out.println("Are you highly confident in yourself? ");
                System.out.println("1: YES \t 2:NO \n Any other input will be regarded as a NO");
                int marketing_confidence = questioner.nextInt();
                if(marketing_confidence == 1){
                    confidence = true;
                }
                else{
                    confidence = false;
                }
                //PROBLEM SOLVER
                System.out.println("Are you a problem solver? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int marketing_problem_solver = questioner.nextInt();
                if(marketing_problem_solver==1){
                    problem_S_T =true;
                }
                else{
                    problem_S_T = false;
                }
                //Experience
                System.out.print("Enter years of experience:  ");

                experience = questioner.nextInt();

                break;

                //SALES QUESTIONS
            case "SAL":
                // Marketing and Sales DEGREE
                System.out.println("Do you have a relevant Marketing and Sale degree: ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int sales_degree = questioner.nextInt();
                if(sales_degree == 1){
                    degree = true ;
                }
                else{
                    degree = false;
                }
                //COMMUNICATION SKILLS
                System.out.println("Do you have great Communication skills? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int sales_comm = questioner.nextInt();
                if(sales_comm == 1){
                    commSkills = true;
                }
                else{
                    commSkills = false;
                }
                //CREATIVITY
                System.out.println("Are you highly creative? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int sales_creative = questioner.nextInt();
                if(sales_creative == 1){
                    creativity = true;
                }
                else{
                    creativity = false;
                }
                //CONFIDENCE
                System.out.println("Are you highly confident in yourself? ");
                System.out.println("1: YES \t 2:NO \n Any other input will be regarded as a NO");
                int sales_confidence = questioner.nextInt();
                if(sales_confidence == 1){
                    confidence = true;
                }
                else{
                    confidence = false;
                }
                //PROBLEM SOLVER
                System.out.println("Are you a problem solver? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int sales_problem_solver = questioner.nextInt();
                if(sales_problem_solver==1){
                    problem_S_T =true;
                }
                else{
                    problem_S_T = false;
                }
                //Experience
                System.out.print("Enter years of experience:  ");

                experience = questioner.nextInt();

                break;

                //HELP DESK QUESTIONS
            case "HEL":
                System.out.println("Do you have a relevant degree in any technology field of study: ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int help_degree = questioner.nextInt();
                if(help_degree == 1){
                    degree = true ;
                }
                else{
                    degree = false;
                }
                //PROBLEM SOLVER
                System.out.println("Are you a problem solver? ");
                System.out.println("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int help_problem_solver = questioner.nextInt();
                if(help_problem_solver==1){
                    problem_S_T =true;
                }
                else{
                    problem_S_T = false;
                }
                //COMM Skills
                System.out.println("Do you have great Communication skills? ");
                System.out.print("1: YES \t 2:NO  \n Any other input will be regarded as a NO");
                int help_comm = questioner.nextInt();
                if(help_comm == 1){
                    commSkills = true;
                }
                else{
                    commSkills = false;
                }
                //CONFIDENCE
                System.out.println("Are you highly confident in yourself? ");
                System.out.println("1: YES \t 2:NO \n Any other input will be regarded as a NO");
                int help_confidence = questioner.nextInt();
                if(help_confidence == 1){
                    confidence = true;
                }
                else{
                    confidence = false;
                }
                System.out.print("Enter years of experience:  ");

                experience = questioner.nextInt();
                break;
            default:
                System.out.println("No department like that.");
        }
        return "ty";
    }
     enum Dept  {
        DEV,
        SAL,
        MAR,
        HEL
    }

    public static void main(String[] args) {

         String department;
         Scanner deptIn = new Scanner(System.in);
         System.out.println("Welcome To Axis Solutions!");
         System.out.println("Please choose your department from below:");
         System.out.println("\tDevelopment: "+ Dept.DEV+"\n\tHelp desk: "+Dept.HEL+"\n\tMarketing: "+Dept.MAR+"\n\tSales: "+ Dept.SAL+"\n");
         System.out.print("Please Enter your department abbreviation: ");
         department = deptIn.nextLine();
        File f = new File("ApplicantCvs");
         switch(department){

             case "DEV":
                 System.out.println("In Developer");
                 makeDir("DEV");
                 questioner("DEV");
                 break;

             case "HEL":
                 System.out.println("In Help");
                 makeDir("HEL");
                 questioner("HEL");
                 break;

             case "SAL":
                 System.out.println("In Sales");
                 makeDir("SAL");
                 questioner("SAL");
                 break;

             case "MAR":
                 System.out.println("In Marketing");
                 makeDir("MAR");
                 questioner("MAR");
                 break;
             default:
                 System.out.println("INVALID DEPARTMENT!");


         }

    }
}