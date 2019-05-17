
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Guilherme de Souza, Guilherme luzzi e Luiz Dorval
 */
public class Main {
    public static void main(String[] args) {

     //intanciar a classe do cadrasto
     Cadastro c1 = new Cadastro(); 
        System.out.println("_________        .__          __                .__     \n" +
"\\_   ___ \\  ____ |  |  __ ___/  |_  ____   ____ |  |__  \n" +
"/    \\  \\/_/ __ \\|  | |  |  \\   __\\/ __ \\_/ ___\\|  |  \\ \n" +
"\\     \\___\\  ___/|  |_|  |  /|  | \\  ___/\\  \\___|   Y  \\\n" +
" \\______  /\\___  >____/____/ |__|  \\___  >\\___  >___|  /\n" +
"        \\/     \\/                      \\/     \\/     \\/ \n" +
"             .__        .__                               \n" +
"  ____  ____ |  |  __ __|  | _____ _______   ____   ______\n" +
"_/ ___\\/ __ \\|  | |  |  \\  | \\__  \\\\_  __ \\_/ __ \\ /  ___/\n" +
"\\  \\__\\  ___/|  |_|  |  /  |__/ __ \\|  | \\/\\  ___/ \\___ \\ \n" +
" \\___  >___  >____/____/|____(____  /__|    \\___  >____  >\n" +
"     \\/    \\/                     \\/            \\/     \\/ "); 
    byte op;

                do{ //Menu
                    op=(Byte.parseByte(JOptionPane.showInputDialog("MENU\n"
                     +"1 - Cadrastar celular\n"
                     +"2 - Listar os celulares cadastrados\n"
                     +"3 - Ver Quantidade de celulares\n"
                     +"4 - Excluir um celular\n"
                     +"5 - Pesquisar celular pelo código\n"
                     +"6 - Pesquisar celular de um fornecedor especificado\n"
                     +"7 - Pesquisar celular por preço\n"
                     +"8 - Pesquisar celular por modelo\n"
                     +"9 - Pesquisar fornecedor de um celular\n"
                     +"10 - Pesquisar telefone de um fornecedor\n"
                     +"11 - Editar\n"
                     +"0 - SAIR")));
                    switch(op){//Switch case 
                        case 1:

                            Celular ce = new Celular();

                            int codigo;
                            if(c1.getLista().isEmpty()){
                                codigo = 1;
                            }else{
                                int ultimoCodigo = c1.getLista().get(c1.getLista().size()-1).getCodigo();
                                codigo = ultimoCodigo +1;
                            }
                            ce.setCodigo(codigo);

                            do{
                            ce.setMarca(JOptionPane.showInputDialog("Digite a marca:"));
                            if(ce.getMarca().length()<2){
                                JOptionPane.showMessageDialog(null, "Erro! Celular precisa de uma marca");
                            }
                           }while(ce.getMarca().length()<2);  

                           do{
                            ce.setModelo(JOptionPane.showInputDialog("Digite o modelo:"));
                            if(ce.getModelo().length()<2){
                                JOptionPane.showMessageDialog(null, "Erro! Celular precisa de um modelo:");
                            }
                           }while(ce.getModelo().length()<2);

                           do{
                            ce.setCor(JOptionPane.showInputDialog("Digite a cor do celular:"));
                            if(ce.getCor().length()<1){
                               JOptionPane.showMessageDialog(null,"Erro!");
                            }
                           }while(ce.getCor().length()<1);

                           do{
                            ce.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do celular:")));
                            if(ce.getPreco()<0){
                                JOptionPane.showMessageDialog(null,"Erro!");
                            }
                           }while(ce.getPreco()<0);
                            Fornecedor f1 = new Fornecedor();
                            do{
                            f1.setNome(JOptionPane.showInputDialog("Digite o nome do fornecedor"));
                            if(f1.getNome().length()<2){
                                JOptionPane.showMessageDialog(null,"Erro!");
                            }
                            }while(f1.getNome().length()<2);

                            do{
                            f1.setTelefone(JOptionPane.showInputDialog("Digite o telefone do fornecedor"));
                            if(f1.getTelefone().length()<8){
                               JOptionPane.showMessageDialog(null,"Erro!");
                            }
                            }while(f1.getTelefone().length()<8);

                            do{
                            f1.setEmail(JOptionPane.showInputDialog("Digite o e-mail do fornecedor:"));
                            if(f1.getEmail().length()<0){
                                JOptionPane.showMessageDialog(null,"Erro!");
                            }
                            }while(f1.getEmail().length()<0);
                            Endereco e1 = new Endereco();

                            do{
                            e1.setRua(JOptionPane.showInputDialog("Digite a rua do fornecedor:"));
                            if(e1.getRua().length()<0){
                               JOptionPane.showMessageDialog(null,"Erro");
                            }
                            }while(e1.getRua().length()<0);

                            do{
                            e1.setNumero(JOptionPane.showInputDialog("Digite o número do endereço:"));
                            if(e1.getNumero().length()<0){
                              JOptionPane.showMessageDialog(null,"Erro");
                            }
                            }while(e1.getNumero().length()<0);

                            do{
                            e1.setCidade(JOptionPane.showInputDialog("Digite a cidade do fornecedor:"));
                            if(e1.getCidade().length()<2){
                               JOptionPane.showMessageDialog(null,"Erro");
                            }
                            }while(e1.getCidade().length()<2);

                            do{
                            e1.setEstado(JOptionPane.showInputDialog("Digite o estado do fornecedor:"));
                            if(e1.getEstado().length()<0){
                               JOptionPane.showMessageDialog(null,"Erro");
                            }
                            }while(e1.getEstado().length()<0);

                            do{
                            e1.setCep(JOptionPane.showInputDialog("Digite o CEP do fornecedor:"));
                            if(e1.getCep().length()!=8){
                               JOptionPane.showMessageDialog(null,"Erro");
                            }
                            }while(e1.getCep().length()!=8);
                            Data d1 = new Data();

                            boolean erroData;
                            do{
                            d1.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia de estoque do celular")));


                            d1.setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mes de estoque do celular")));


                            d1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de cadastro do celular")));

                            erroData = d1.verificarErro();
                            if(erroData){
                            JOptionPane.showMessageDialog(null, "Data inválida");
                            }

                            }while(erroData);



                            System.out.println("------------------");
                            System.out.println(d1);
                            f1.setEndereco(e1);
                            ce.setData(d1);
                            ce.setFornecedor(f1);
                            c1.cadastrar(ce);
                            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                            break;
                        case 2://Listar os celulares cadastrados

                            if(c1.getLista().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Não há cadastros");
                            }else{
                            JOptionPane.showMessageDialog(null, c1);
                            }
                            break;
                        case 3://Mostrar quantidade de cadastros

                            if(c1.getLista().isEmpty()){
                                JOptionPane.showMessageDialog(null, "Não há cadastros!");
                            }else{
                                if(c1.verQuantidadeCelular()==1){
                                JOptionPane.showMessageDialog(null, "Há um cadastro!");
                            }else{
                                    JOptionPane.showMessageDialog(null, "Há "+c1.verQuantidadeCelular() +"cadastros");    
                            }
                            }
                            break;
                            case 4://Excluir

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há cadastros!");
                                }else{
                                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código de quem deseja remover"));
                                    Celular achei = c1.pesquisarPorCodigo(codigo);
                                    if(achei==null){
                                        JOptionPane.showMessageDialog(null, "Não há celulares com este código");
                                    }else{
                                        byte op2 = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza que deseja remover o produto?\n1-Sim\n2-Não"));
                                        switch(op2){
                                            case 1:
                                                c1.removerCelular(achei);
                                                JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null, "Operação cancelada");
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null, "ERRO!");
                                                break;
                                        }
                                        JOptionPane.showMessageDialog(null, achei);
                                    }
                                }
                            break;
                            case 5://Pesquisar celular pelo código

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há celulares com este código");
                                }else{
                                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do celular"));
                                    Celular achei = c1.pesquisarPorCodigo(codigo);
                                    if(achei==null){
                                        JOptionPane.showMessageDialog(null, "Não há celulares com este código");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achei);
                                    }
                                }
                            break;
                            case 6://Pesquisar por celular por fornecedor

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há celulares deste fornecedor");
                                }else{
                                    String fornecedor = JOptionPane.showInputDialog("Digite o fornecedor desejado");
                                    Celular achei = c1.pesquisarPorFornecedor(fornecedor);
                                    if(achei==null){
                                        JOptionPane.showMessageDialog(null, "Não há celulares deste fornecedor");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achei);
                                    }
                                }
                            break;
                            case 7://Pesquisar celular por preço

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há cadastros");
                                }else{
                                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
                                    ArrayList<Celular> celularesAchados = c1.pesquisarPorPreco(preco);
                                    if(celularesAchados.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Não há celulares com este preço");
                                    }else{
                                        JOptionPane.showMessageDialog(null, celularesAchados);
                                    }
                                }
                            break;
                            case 8://Pesquisar celular por modelo

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há celulares deste modelo");
                                }else{
                                    String modelo = JOptionPane.showInputDialog("Digite o modelo do celular");
                                    ArrayList<Celular> achados = c1.pesquisarPorModelo(modelo);
                                    if(achados.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Não há celulares deste modelo");
                                    }else{
                                        JOptionPane.showMessageDialog(null, achados);
                                    }
                                }
                            break;
                            case 9://Pesquisar fornecedor de um celular

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há cadastros!");
                                }else{
                                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do celular para encontrar o vendedor"));
                                    Fornecedor encontrado = c1.pesquisarFornecedorPorCelular(codigo);
                                    if(encontrado == null){
                                        JOptionPane.showMessageDialog(null, "Não há cadastro deste celular");
                                    }else{
                                        JOptionPane.showMessageDialog(null, encontrado);
                                    }
                                }
                            break;
                            case 10://Pesquisar telefone de um fornecedor

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há cadastros");
                                }else{
                                    System.out.println("Digite o nome do fornecedor");
                                    String nome =  JOptionPane.showInputDialog("Digite o nome do fornecedor");
                                    String encontrado = c1.pesquisarTelefonePorFornecedor(nome);
                                    if(encontrado==null){
                                        JOptionPane.showMessageDialog(null, "Não fornecedores com este nome");
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Nome do fornecedor: "+nome+"\nTelefone do fornecedor: "+encontrado);
                                    }
                                }
                            break;
                            case 11://Editar

                                if(c1.getLista().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Não há cadastros");
                                }else{
                                    codigo = (Integer.parseInt(JOptionPane.showInputDialog("Digite o código de quem deseja editar:")));
                                    int indiceEncontrado = c1.pesquisarIndicePeloCodigo(codigo);
                                    if(indiceEncontrado==-1){
                                        JOptionPane.showMessageDialog(null, "Não há cadastros com esse código");
                                    }else{

                                        byte op3 = Byte.parseByte(JOptionPane.showInputDialog("O que deseja editar do celular? \n1-Modelo\n2-Nome do fornecedor\n3-Preço\n0-Cancelar edição "));
                                        switch(op3){//Switch para opção do editar
                                            case 1:
                                                c1.getLista().get(indiceEncontrado).setModelo(JOptionPane.showInputDialog("Digite o nome do novo modelo do celular:"));
                                                JOptionPane.showMessageDialog(null, "Modelo editado com sucesso");
                                                break;
                                            case 2:
                                                c1.getLista().get(indiceEncontrado).getFornecedor().setNome(JOptionPane.showInputDialog("Digite o nome do novo fornecedor:"));
                                                JOptionPane.showMessageDialog(null, "Nome do fornecedor editado com sucesso");
                                                break;
                                            case 3:
                                                c1.getLista().get(indiceEncontrado).setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do celular")));
                                                JOptionPane.showMessageDialog(null, "Preço editado com sucesso");
                                                break;
                                            case 0:
                                                JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso");
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null, "Opção inválida");

                                        }
                                    }
                                }
                                break;

                            case 0://Sair

                                op = Byte.parseByte(JOptionPane.showInputDialog("Deseja mesmo sair?\n1 - Continuar\n0 - Sair"));

                            break;
                            default:

                                JOptionPane.showMessageDialog(null, "Opção inválida");
                            }
                      }while(op!=0);
    }       
}