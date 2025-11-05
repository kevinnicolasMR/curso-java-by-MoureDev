package Course.Bucles;

public class ControlDeBucles   {
    public static void main(String[] args){


        String[] names = {"Kevin", "Medina", "Robles", "Nicolas", "Pedro"};

        for(String name: names){
            if(name.equals("Nicolas")){
                break;
            }
            System.out.println(name);
        }
        //-- Continu

        for(int index = 0; index < 5; index++){
            System.out.println("Alooo");
        }
    }
}
