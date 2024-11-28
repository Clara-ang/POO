
public class TesteSwitch{
    public static int diasNoMesIf3(int mes){

        if (mes < 1 || mes > 12){
            return 0;
        }

        else if (mes == 2){
            return 28;
        }

        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }

        else{
            return 31;
        }
       
    }
    public static int diasNoMesIf4(int mes){
        return (mes)?

        if (mes < 1 || mes > 12){
            return 0;
        }

        else if (mes == 2){
            return 28;
        }

        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }

        else{
            return 31;
        }
       
    }

    public static void main(String[] arg) {
        System.out.print("Digite um valor inteiro entre um 1 e 12");
        int x = 2;
        int dias = switch(x) {
            case 1, 3, 5, 6, 8, 10, 12  -> 31;
            case 4, 6, 7, 9, 11         -> 30;
            default                     -> 28;
        };

        int dias;
        switch (x) {
            case 1, 3, 5, 6, 8, 10, 12  -> 31; break
            case 4, 6, 7, 9, 11         -> 30; break
            default                     -> 28;
                
        }

    }

}

   

