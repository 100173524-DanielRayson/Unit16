public class mainClass {
    public static void main(string[] argd){
        calculator c1 = new calculator();
        calculator c2 = new calculator();
        
        c1.name = "Awesome";
        c2.name = "Bacon";
        
        System.out.println(c1.name + "calculated"+ c1.add(3, 4));
        System.out.println(c1.name + "calculated"+ c1.modulus(3, 4)); 
        
        }
}