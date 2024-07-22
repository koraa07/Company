public class Company {
   static String companyName = "Apple";

   public static String printCompanyName(){
       return companyName;
   }

   public String changeCompanyName(String newName){
       companyName = newName;
       return newName;
   }


    @Override
    public String toString() {
        return printCompanyName();
    }
}
