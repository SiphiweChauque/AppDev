package ac.za.cput.appdev;

/**
 * team member name : Farai Malone Chawora
 *Student number: 220145547
 */
public class App 
{
    public static void main( String[] args )
    {
        Baseball sport=new Baseball("baseball",89,6,8);
        //sport.displayDetails();
        //sport.pointForTeam(8);
        System.out.println(sport.pointForTeam(8));
    }
    
}
