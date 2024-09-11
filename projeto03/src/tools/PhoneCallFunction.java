package tools;

public class PhoneCallFunction {
    
    private int numMenu;

    
    public PhoneCallFunction(int numMenu) {
        if(numMenu == 1){
            ligar();
        } else if(numMenu == 2){
            atender();
        } else if(numMenu == 3){
            correioDeVoz();
        }
    }

    private void ligar(){
        System.out.println("Ligando.");
    }

    private void atender(){
        System.out.println("Chamada atendida.");
    }

    private void correioDeVoz(){
        System.out.println("Escutando correio de voz.");
    }

    


}
