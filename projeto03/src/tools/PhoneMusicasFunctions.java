package tools;

public class PhoneMusicasFunctions {

    private int numMenu;


    public PhoneMusicasFunctions(int numMenu) {
        if(numMenu == 1){
            tocar();
        } else if(numMenu == 2){
            pausar();
        } else if(numMenu == 3){
            selecionarMusica();
        }
    }

    private void tocar(){
        System.out.println("Chamada atendida.");
    }

    private void pausar(){
        System.out.println("A musica está pausada");
    }

    private void selecionarMusica(){
        System.out.println("A musica foi selecionada");
    }
    
    
}
