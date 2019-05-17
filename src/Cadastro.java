
/**
 * Write a description of class Cadastro here.
 * 
 * @author (Guilherme Luzzi e Luiz D) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Cadastro{
 //Atributo ArrayList privado - lista para cadastrar:
 private ArrayList<Celular> lista;
   
 //Método construtor:
  public Cadastro(){
       this.lista = new ArrayList<>();
 }
 //Sets e gets:
 public ArrayList<Celular> getLista(){
     return lista;
 }
 
 public void setLista(ArrayList<Celular> lista){
     this.lista = lista;
 }
 
 //Cadastrar celular:
  public void cadastrar(Celular c){
    this.lista.add(c);
 }
 //Ver quantidade de celulares:
 public int verQuantidadeCelular(){
     return this.lista.size();
 }
 //Remover os celulares:
 public void removerCelular(Celular c){
     this.lista.remove(c);
 
 }

 //Pesquisar celular por codigo - Busca especifica:
 public Celular pesquisarPorCodigo(int codigo){
     Celular celularEncontrado = null;
     for(int i=0; i<this.lista.size() && celularEncontrado==null; i++){
         if(this.lista.get(i).getCodigo()==codigo){
             celularEncontrado = this.lista.get(i);
     }
    }
    return celularEncontrado;
 }
 public Celular pesquisarPorFornecedor(String nome){
     Celular encontrado = null;
     for(int i=0;i<this.lista.size();i++){
         if(this.lista.get(i).getFornecedor().getNome().equalsIgnoreCase(nome)){
             encontrado = this.lista.get(i);
         }
     }
     return encontrado;
 }
 //Pesquisar por preço:
 public ArrayList<Celular> pesquisarPorPreco(double preco){
     ArrayList<Celular> listaCelulares = new ArrayList<>();
     for(int i=0;i<this.lista.size();i++){
         if(this.lista.get(i).getPreco()==preco){
             listaCelulares.add(this.lista.get(i));
         }
     }
     return listaCelulares;
 }
 //Pesquisar por modelo:
 public ArrayList<Celular> pesquisarPorModelo(String modelo){
     ArrayList<Celular> listaCelulares = new ArrayList<>();
     for(int i=0;i<this.lista.size();i++){
         if(this.lista.get(i).getModelo().equalsIgnoreCase(modelo)){
            listaCelulares.add(this.lista.get(i));
         }
     }
     return listaCelulares;
 }
 //Pesquisar fornecor por celular:
 public Fornecedor pesquisarFornecedorPorCelular(int codigo){
     Fornecedor fornecedorEncontrados = null;
     for(int i=0;i<this.lista.size();i++){
         if(this.lista.get(i).getCodigo()==codigo){
             fornecedorEncontrados = this.lista.get(i).getFornecedor();
         }
     }
     return fornecedorEncontrados;
 }
 //Pesquisar por telefone do fornecedor:
 public String pesquisarTelefonePorFornecedor(String nome){
    String telefone =null;
     for(int i=0;i<this.lista.size();i++){
         if(this.lista.get(i).getFornecedor().getNome().equalsIgnoreCase(nome)){
             telefone = (this.lista.get(i).getFornecedor().getTelefone());
         }
     }
    return telefone;
 }
 
 public int pesquisarIndicePeloCodigo(int codigo){
        int indiceEncontrado = -1;
         for(int i=0;i<this.lista.size() && indiceEncontrado==-1; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                indiceEncontrado = i;
            }
        }
        return indiceEncontrado;
    }

    @Override
    public String toString() {
        return "Cadastro:" + lista;
    }
 
 
}//Fim da classe