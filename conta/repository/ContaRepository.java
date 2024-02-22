package conta.repository;

import conta.model.Conta;
public interface ContaRepository {
    void adicionarConta(Conta conta);
    void removerConta(Conta conta);
    Conta buscarConta(String numero);
}
