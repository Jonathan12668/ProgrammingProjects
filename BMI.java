public class BMI {
	public static void main(String[] args) {
		
	double height = 1.52;
	double weight = 50;
    double BMI = (weight / (height * height));
    System.out.println("CALCULATING YOUR BMI");
   
    
    System.out.println("Height: " + height);
   System.out.println("Weight: " + weight);
   
    System.out.println("BMI: " + BMI);
   
    if(BMI<18.5){
        System.out.println("Underweight");
        }else if(18.5 <= BMI && BMI <25.0){
            System.out.println("Normal");
            }else if (25.0 <= BMI && BMI < 30.0 ){
                System.out.println("Overweight");
                }else if(30.0 <= BMI){
                    System.out.println("Obese");
                    }
	}
}