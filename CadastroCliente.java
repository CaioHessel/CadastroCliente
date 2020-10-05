
package cadastrocliente;

public class CadastroCliente {

    public static void main(String[] args) {
        
        UICadastro formulario = new UICadastro();
        Pessoa cliente = new Pessoa(1, formulario.nome, formulario.cpf,"Masculino", formulario.cidade, formulario.estado );
        
        
        
        
    }
    
}
