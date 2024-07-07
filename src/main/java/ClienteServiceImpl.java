
import org.springframework.beans,factory.annotation.Autowired;



public class ClienteServiceImpl {


    public Iterable <Cliente> buscarTodos(){
        return null;
    }

    public Cliente buscarPorId(Long id){
        optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    public static void inserir(Cliente cliente)
    {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() ->){
            Endereco  novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
    });
    cliente.setEndereco(endereco);
    clienteRepository.save(cliente);


    }
    public void atualizar (Long id, Cliente cliente)
    {
        optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent())
        {
            String cep = cliente.getEndereco().getCep();
            Endereco endereco = enderecoRepository.findById(cep).orElseGet(() ->){
            Endereco  novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;

        }
        
    }
    public void deletar (Long id)
    {
        clienteRepository.deleteById(id);
    }







}
