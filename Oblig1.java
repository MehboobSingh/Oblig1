
package oblig1;


import javax.swing.*;

class Sirkel1{
   
    private double radius;
    public double diameter;
    public double areal;
    public double omkret;
    

public Sirkel1(double radius ){
    
    this.radius = radius;  
}


public double getradius(){
      return radius;
  }  
  
  
public void setradius (double radius){
    this.radius = radius;    
  }


public  double beregnDiameter(double diameter){
  
   diameter = 2*radius;
   
    return diameter;
 }


public double  beregnOmkret(double omkret) {
    
    omkret = 2*Math.PI*radius;
   
    return omkret;
}



public  double beregnAreal(double areal){
    
   areal = Math.PI* radius*radius;

    return areal;
 
}



 void skriveUt(){
  
this.radius= radius;
this.diameter = diameter;
this.areal =areal;
this.omkret = omkret;


    }
}
 


public class Oblig1{
    
    public static void main(String[] args) {
      
        Sirkel1 nysirkel1 = new Sirkel1(60);
        
        
   String innnysirkel1 = JOptionPane.showInputDialog("skriv inn radius1");
    double radius1 = Double.parseDouble(innnysirkel1);
  
  String ut1 = "  arealen til nysirkel2 er  " + nysirkel1.beregnAreal(radius1) + 
               " og " + "diameteren er  " + nysirkel1.beregnDiameter(radius1) +
          " \n " + "omkretsen blir " + nysirkel1.beregnOmkret(radius1);
  
        JOptionPane.showMessageDialog(null, ut1);
        
  
        System.out.println("Sirkel1 omkret er " +  nysirkel1.beregnOmkret(0));
        System.out.println("\n " +"Sirkel1 diameteren er " + 
                nysirkel1.beregnDiameter(0));
        System.out.println(  "Sirkel1 arealen er " +  nysirkel1.beregnAreal(0));
     
      
        Sirkel1 nysirkel2 = new Sirkel1(40);
        
        
        
        String innnysirkel2 = JOptionPane.showInputDialog("skriv inn radius2");
        
                              double radius2 = Double.parseDouble(innnysirkel2);
  
  String ut2 = "  arealen til nysirkel2 er  " + nysirkel2.beregnAreal(radius2) +
          
               " og " + "diameteren er  " + nysirkel2.beregnDiameter(radius2) +
          
                " \n " + "omkretsen blir " + nysirkel2.beregnOmkret(radius2);
  
  
    JOptionPane.showMessageDialog(null, ut2);
       
        System.out.println("sirkel2 omkret er "+  nysirkel2.beregnOmkret(0));
        System.out.println("\n" + " sirkel 2 diameteren er " + 
                nysirkel2.beregnDiameter(0));
         System.out.println("\n" + "sirkel2  arealen er " + 
                 nysirkel2.beregnAreal(0));
   
       
       
       
        Sirkel1 nysirkel3 = new Sirkel1(60);
        
       
        String innnysirkel3 = JOptionPane.showInputDialog("skriv inn radius3");
        double radius3 = Double.parseDouble(innnysirkel3);
  
      String ut3 = "arealen til nysirkel3 er" + nysirkel3.beregnAreal(radius3) + 
              
            "og " + "diameteren er " + nysirkel3.beregnDiameter(radius3) + "\n"+
              
          "omkretsen blir " + nysirkel3.beregnOmkret(radius3);
      
          JOptionPane.showMessageDialog(null, ut3);
        
    
        System.out.println("sirkel3 omkret are "+  nysirkel3.beregnOmkret(0));
        System.out.println("\n" + "sirkel3 diameteren er " +  
         nysirkel3.beregnDiameter(0));
        
        System.out.println("\n" + "sirkel3 arealen er " + 
        nysirkel3.beregnAreal(0));
    
        String innNyradius1 =JOptionPane.showInputDialog("skriv nyradius1");
        double nyradius1 =Double.parseDouble(innNyradius1);

         String innNyradius2 =JOptionPane.showInputDialog("skriv nyradius2");
         double nyradius2 =Double.parseDouble(innNyradius2);

        String innNyradius3 =JOptionPane.showInputDialog("skriv nyradius3");
        double nyradius3 =Double.parseDouble(innNyradius3);

         double gjennomSnitt  = (nyradius1+nyradius2+nyradius3)/3;
         String ut = "GejonnomSnitt radius for " + "nysirkel1 "  +" nysirkel2 " +
               " og " + " nysirkel3 " + " er  " + "\n"+ gjennomSnitt;
         
        
         JOptionPane.showMessageDialog(null, ut);

   
  }
  
}


