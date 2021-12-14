public class UnitedStates{
    public static void main(String args[]){
        
        States blankState = new States();
        States Texas = new States("Texas", "mockingbird", "bluebonnet","Texas, Our Texas",
                                    "friendship","pecan");
        States Oklahoma = new States("Oklahoma", "scissor-tailed flycatcher", "Okalahoma Rose",
                                     "Oklahoma", "labor omnia vincit (labor conquers all things)",
                                     "redbud");
        System.out.println("****************************");
        System.out.println(" Test Default Constructor");
        System.out.println("****************************");
        System.out.println(blankState); // call toString method
        System.out.println();
        System.out.println("****************************");
        System.out.println(" Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(Texas); // call toString method
        System.out.println();
        System.out.println("****************************");
        System.out.println(" Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(Oklahoma); // call toString method
        System.out.println();
                
        
    }
}