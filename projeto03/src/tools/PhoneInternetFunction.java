package tools;

public class PhoneInternetFunction {
    private int numMenu;


    public PhoneInternetFunction(int numMenu) {
        if(numMenu == 1){
            exibirPagina();
        } else if(numMenu == 2){
            adicionarNovaAba();
        } else if(numMenu == 3){
            atualizarPagina();
        }
    }

    private void exibirPagina(){
        System.out.println("Exibindo a pagina.");
    }

    private void adicionarNovaAba(){
        System.out.println("Nova aba aberta.");
    }

    private void atualizarPagina(){
        System.out.println("A pagina foi atualizada.");
    }
}
