class MedicalShop {

 // Datatypes ref = value ; 
   static  String   name  = "Sri Venkateshwara Chemist & Drugist";
   
   static  String  tabletNames[] = {"Dolowin Plus"  , "Haloset" ,  "Okacet L" , "Imol Plus"};
 
 public static void main(String medi[]){
 System.out.println("Main started");


  System.out.println("Welcome to "+ name);
  System.out.println("Available Tablets are : ") ; 
     for( String tableName :   tabletNames ) {
		 System.out.println( tableName );
	 }
 
 System.out.println("Main ended");
  }


}