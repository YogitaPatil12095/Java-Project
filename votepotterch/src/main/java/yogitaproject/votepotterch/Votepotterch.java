/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package yogitaproject.votepotterch;
import java.io.*;
import java.util.*;

/**
 *
 * @author yogit
 */
public class Votepotterch {
    
    public
            
            int vid[]=new int[20];
            String charc[]={"Harry Potter","Hermione Granger","Ron Weasley","Albus Dumbledore","Minerva Mcgonagall","Severus Snape","Dobby"};
            int voterid,voteridcount=0;
            static int h = 0,g=0,r=0,a=0,m=0,s=0,d=0;
            int choice;
            Scanner sc =new Scanner(System.in);
            void mainmenu()
            {
                System.out.println("\t\t\t Welcome Potterhead Vote your Favourite Harry Potter Series Character \t\t\t\n");
                System.out.println("Enter Your ID: \t");
                voterid=sc.nextInt();
                System.out.println("\n\t\t\t\t ********Menu******** \t\t\t\t\n");
                System.out.println("\t\t1.Vote\n\t\t2.Show Score\n\t\t3.Show Voter Details\n");
                System.out.println("Enter your Choice\n");
                int c=0;
                c=sc.nextInt();
                switch(c)
                {
                    case 1:
                            vote();
                            break;
                    case 2:
                            score();
                            break;
                    case 3:
                            show();
                            break;
                
                }
                
           }
            void nextorend()
            {
                System.out.println("\nEnter 1 to go to Main Menu OR 2 to exit \n");
                int ne=sc.nextInt();
                if(ne==1)
                    mainmenu();
                                
            }
            void show()
            {
                int i;
                for(i=0;i<voteridcount;i++)
                {
                    System.out.println("\t\t\t ID Of Voter " + vid[i] );
                }
                nextorend();
              
            }
            void score()
            {
                System.out.println("\t\t Score \t\t\n");
                System.out.println("\t\t\t Harry \t\t Hermione \t\t Ron \t\t Albus \t\t Mcgonagall \t\t Snape \t\t Dobby \t\t\n");
                System.out.println("\t\t\t   "+h+"   \t\t    "+g+"     \t\t  "+r+"  \t\t   "+a+"   \t\t      "+m+"     \t\t   "+a+"   \t\t   "+d+"   \t\t\n");
                nextorend();
            }
            boolean hasvoted(int voterid)
            {
                int i;
                for(i=0;i<voteridcount;i++)
                {
                    if(vid[i]==(voterid))
                    {
                        return true;
                    }
                }
                return false;
            }
            void vote()
            {
                if(hasvoted(voterid))
                {
                    System.out.println("\nYou have already voted, You are not allowed to vote further\n");
                    nextorend();
                    return;
                }
                
                System.out.println("\t\t Potter Characters \t\t\n");
                System.out.println("1.Harry Potter\n2.Hermione Granger\n3.Ron Weasley\n4.Albus Dumbledore\n5.Minerva Mcgonagall\n6.Severus Snape\n7.Dobby\n");
                System.out.println("\n\t\t\t\t\t\tLet us find out who's more favourite out of all\t\t\t\t\t\t\n");
                System.out.println("Enter Your Fav Charachter No: \t\t\t");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("\t\t\t Harry Potter \t\t");
                ++h;
                break;
            case 2:
                System.out.println("\t\t\t Hermione Granger \t\t");
                ++g;
                break;
            case 3:
                System.out.println("\t\t\t Ron Weasley \t\t");
                ++r;
                break;
            case 4:
                System.out.println("\t\t\t Albus Dumbledore \t\t");
                ++a;
                break;
            case 5:
                System.out.println("\t\t\t Minerva Mcgonagallr \t\t");
                ++m;
                break;
            case 6:
                System.out.println("\t\t\t severus Snape \t\t");
                ++s;
                break;
            case 7:
                System.out.println("\t\t\t Dobby \t\t");
                ++d;
                break;
            }
        vid[voteridcount]=voterid;
        voteridcount++;
        nextorend();
        }

    public static void main(String[] args) throws IOException 
    {
        Votepotterch obj = new Votepotterch();
        
        obj.mainmenu();
          
    }
  
}
